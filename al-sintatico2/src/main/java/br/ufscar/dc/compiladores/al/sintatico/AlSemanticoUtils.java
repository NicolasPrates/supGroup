
package br.ufscar.dc.compiladores.al.sintatico;

import br.ufscar.dc.compiladores.al.sintatico.TabelaDeSimbolos.TipoAl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class AlSemanticoUtils {
    // Armazena os erros semanticos encontrados
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String msg) {
        errosSemanticos.add(String.format("Erro %d:%d - %s", t.getLine(), t.getCharPositionInLine(), msg));
        System.out.println("Erro" + t.getLine() + ":" + t.getCharPositionInLine() + " " + msg);
    }
    
    static TipoAl verificarTipoDeTipoContext(Escopos esc, AlParser.TipoContext ctx){
        
        if(ctx.registro() != null){
            return TipoAl.REGISTRO;
        }
        else{
            if(ctx.tipo_estendido().ESTENDIDO() != null){
                // é um ponteiro
                return verificarTipoDeTipoBasicoIdentComEstendido(ctx.tipo_estendido().tipo_basico_ident());
            }
            else{
                // não é um ponteiro
                if(ctx.tipo_estendido().tipo_basico_ident().IDENT() != null){
                    // é pra ser um alias
                    String id = ctx.tipo_estendido().tipo_basico_ident().IDENT().getText();
                    if(!esc.existe(id)){
                        // alias não esta na tabela de símbolso
                        ErrosSemanticos.tipoInexistente(id, ctx.tipo_estendido().tipo_basico_ident().IDENT().getSymbol().getLine());
                    }else{
                        TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada = esc.pegarEntradaDaTabela(id);
                        if(entrada.tipo == TipoAl.TIPO){
                            // realmente é um alias
                            return entrada.tipo;
                        }
                        else{
                            ErrosSemanticos.tipoInexistente(id, ctx.tipo_estendido().tipo_basico_ident().IDENT().getSymbol().getLine());
                        }
                    }
                }
                else{
                    // é um tipo básico
                    return convertStringToTipoAl(ctx.tipo_estendido().tipo_basico_ident().getText());
                }
            }
        }
        return null;
    }
    
    public static TipoAl verificarTipoDeTipoBasicoIdentComEstendido(AlParser.Tipo_basico_identContext ctx){
        if(ctx.tipo_basico() != null){
            String str_tipo_do_ponteiro = ctx.tipo_basico().getText();
            TipoAl tipo_do_ponteiro = null;
            switch(str_tipo_do_ponteiro){
                case "inteiro": tipo_do_ponteiro = TipoAl.PONTEIRO_INTEIRO; break;
                case "literal": tipo_do_ponteiro = TipoAl.PONTEIRO_LITERAL; break;
                case "logico": tipo_do_ponteiro = TipoAl.PONTEIRO_LOGICO; break;
                case "real": tipo_do_ponteiro = TipoAl.PONTEIRO_REAL; break;
            }
            
            return tipo_do_ponteiro;
        }
        else{
            return TipoAl.PONTEIRO_REGISTRO;
        }
    }

    // função para identificar se o registro possui os atributos
    public static TipoAl tipoDoIdentificador(Escopos esc, AlParser.IdentificadorContext ctx){
        String idName = ctx.ident1.getText();
        
        // verificar se o primeiro nome do identificador existe
        if(esc.existe(idName)){
            // se houverem mais identificadores separados por ponto
            if(!ctx.ident2.isEmpty()){
                Token base = ctx.ident1;
                TipoAl tipo_final = null;
                
                
                for( var ident: ctx.ident2 ){
                    // pega os atributos da base
                    HashMap<String, TipoAl> atributos_da_base = esc.pegarAtributosDoRegistro(base.getText());
                    
                    // se atributos são nulos
                    if(atributos_da_base == null){
                        // esse registro não possui esse atributo
                        // ErrosSemanticos.identificadorInexistente(, tk.getSymbol().getLine());
                        return TipoAl.INVALIDO;
                    }
                    
                    // se base não tem esse atributo
                    else if(atributos_da_base.get(ident.getText()) != null){
                        base = ident;
                        tipo_final = atributos_da_base.get(ident.getText());
                    }
                    else{
                        // esse registro não possui esse atributo
                        // ErrosSemanticos.identificadorInexistente(, tk.getSymbol().getLine());
                        return TipoAl.INVALIDO;
                    }
                }
                return tipo_final;
            }
            else{
                
                return esc.verificar(idName);
            }
        }
        else{
            ErrosSemanticos.identificadorInexistente(idName, ctx.ident1.getLine());
            return TipoAl.INVALIDO;
        }
    }
    
    public static TabelaDeSimbolos.TipoAl convertStringToTipoAl(String s){
        TabelaDeSimbolos.TipoAl tipo;
        switch(s){
            case "literal": tipo = TabelaDeSimbolos.TipoAl.LITERAL; break;
            case "real": tipo = TabelaDeSimbolos.TipoAl.REAL; break;
            case "inteiro": tipo = TabelaDeSimbolos.TipoAl.INTEIRO; break;
            case "logico": tipo = TabelaDeSimbolos.TipoAl.LOGICO; break;
            default: tipo = TabelaDeSimbolos.TipoAl.INVALIDO; break;
        }
        
        return tipo;
    }
    
    // RETORNA O TIPO DE UMA EXPRESSAO ARITMETICA
    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var ta: ctx.termo()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, ta);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                if(ret == TabelaDeSimbolos.TipoAl.INTEIRO || ret == TabelaDeSimbolos.TipoAl.REAL) {
                    if(aux == TabelaDeSimbolos.TipoAl.INTEIRO || aux == TabelaDeSimbolos.TipoAl.REAL) {
                        ret = TabelaDeSimbolos.TipoAl.REAL;
                    } else {
                        ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                    }
                } else {
                    ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                }
            }
        }
        
        return ret;
    }

    // RETORNA O TIPO DE UM TERMO
    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var fa: ctx.fator()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, fa);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                // adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
                if(ret == TabelaDeSimbolos.TipoAl.INTEIRO || ret == TabelaDeSimbolos.TipoAl.REAL) {
                    if(aux == TabelaDeSimbolos.TipoAl.INTEIRO || aux == TabelaDeSimbolos.TipoAl.REAL) {
                        ret = TabelaDeSimbolos.TipoAl.REAL;
                    } else {
                        ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                    }
                } else {
                    ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                }
            }
        }
        return ret;
    }
    
    // RETORNA O TIPO DE UM FATOR
    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.FatorContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var pa: ctx.parcela()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, pa);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                // adicionarErroSemantico(ctx.start, "Fator " +ctx.getText() + "contém tipos incompativeis\n");
                if(ret == TabelaDeSimbolos.TipoAl.INTEIRO || ret == TabelaDeSimbolos.TipoAl.REAL) {
                    if(aux == TabelaDeSimbolos.TipoAl.INTEIRO || aux == TabelaDeSimbolos.TipoAl.REAL) {
                        ret = TabelaDeSimbolos.TipoAl.REAL;
                    } else {
                        ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                    }
                } else {
                    ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                }
            }
        }
        return ret;
    }

    // RETORNA O TIPO DE UMA PARCELA
    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.ParcelaContext ctx) {
        
        if(ctx.parcela_unario() != null){
            return verificarTipo(esc, ctx.parcela_unario());
        } else if (ctx.parcela_nao_unario() != null) {
            return verificarTipo(esc, ctx.parcela_nao_unario());
        } 
        // adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
        return TabelaDeSimbolos.TipoAl.INVALIDO;

    }

    // RETORNA O TIPO DE UMA PARCELA UNARIO
    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Parcela_unarioContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        
        if(ctx.NUM_INT() != null) {
            return TabelaDeSimbolos.TipoAl.INTEIRO;
        } else if(ctx.NUM_REAL()!= null) {
            return TabelaDeSimbolos.TipoAl.REAL;
        } else if (ctx.CADEIA() != null) {
            return TabelaDeSimbolos.TipoAl.LITERAL;
        } else if (ctx.identificador() != null) {
            for (var tk: ctx.identificador().IDENT()) {
                if (!esc.existe(tk.getText())) {
                    // adicionarErroSemantico(tk.getSymbol(), "Variável " +ctx.getText() + " nao declarada \n");
                    ErrosSemanticos.identificadorInexistente(tk.getText(), tk.getSymbol().getLine());
                    ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                } else {
                    ret = esc.verificar(tk.getText());
                }
            }
            return ret;
            
        } else if (ctx.expressao() != null) {
            for(var ex: ctx.expressao()){
                TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, ex);
                if(ret == null) {
                    ret = aux;
                } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                    // adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
                    ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                } 
            }
        }
        // adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
        return ret;
    }
    
    // RETORNA O TIPO DE UMA PARCELA NAO UNARIA
    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Parcela_nao_unarioContext ctx) {
        if(ctx.CADEIA() != null) {
            return TabelaDeSimbolos.TipoAl.CADEIA;
        } else if (ctx.identificador()!= null) {
            TabelaDeSimbolos.TipoAl ret = null;
            for (var tk: ctx.identificador().IDENT()) {
                if (!esc.existe(tk.getText())) {
                    adicionarErroSemantico(tk.getSymbol(), "Variável " +ctx.getText() + " nao declarada\n");
                    ErrosSemanticos.identificadorInexistente(tk.getText(), tk.getSymbol().getLine());
                    ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                } else {
                    String str_ret = tk.getText();
                    if(ctx.OP_E_COMERCIAL() != null){
                        switch (str_ret) {
                            case "inteiro":
                                ret = TipoAl.ENDERECO_INTEIRO;
                                break;
                            case "real":
                                ret = TipoAl.ENDERECO_REAL;
                                break;
                            case "logico":
                                ret = TipoAl.ENDERECO_LOGICO;
                                break;
                            case "literal":
                                ret = TipoAl.ENDERECO_LITERAL;
                                break;
                            case "registro":
                                ret = TipoAl.ENDERECO_REGISTRO;
                                break;
                            default:
                                break;
                        }

                    }
                    else{
                        return esc.verificar(str_ret);
                    }
                }
            }
            return ret;
        }
        // adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
        return TabelaDeSimbolos.TipoAl.INVALIDO;
    }

    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var tl: ctx.termo_logico()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, tl);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                // adicionarErroSemantico(ctx.start, "Expressão lógica " +ctx.getText() + "contém tipos incompativeis\n");
                ret = TabelaDeSimbolos.TipoAl.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Termo_logicoContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var fl: ctx.fator_logico()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, fl);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                // adicionarErroSemantico(ctx.start, "Termo lógico" +ctx.getText() + "contém tipos incompativeis\n");
                ret = TabelaDeSimbolos.TipoAl.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Fator_logicoContext ctx) {
        return verificarTipo(esc, ctx.parcela_logica());
    }

    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Parcela_logicaContext ctx) {
        if(ctx.FALSO() != null) {
            return TabelaDeSimbolos.TipoAl.LOGICO;
        } else if (ctx.VERDADEIRO()!= null) {
            return TabelaDeSimbolos.TipoAl.LOGICO;
        } else if (ctx.exp_relacional() != null) {
            return verificarTipo(esc, ctx.exp_relacional());
        }
        // adicionarErroSemantico(ctx.start, "Parcela lógica " +ctx.getText() + "contém tipos incompativeis\n");
        return TabelaDeSimbolos.TipoAl.INVALIDO;
    }
    
    public static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Exp_relacionalContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var ea: ctx.exp_aritmetica()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, ea);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                // adicionarErroSemantico(ctx.start, "Expressão relacional " +ctx.getText() + "contém tipos incompativeis\n");
                ret = TabelaDeSimbolos.TipoAl.INVALIDO;
            }
        }
        if(ctx.op_relacional() != null && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
            ret = TabelaDeSimbolos.TipoAl.LOGICO;
        }
        return ret;
    }
}
