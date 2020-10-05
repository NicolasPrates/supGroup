
package br.ufscar.dc.compiladores.al.sintatico;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class AlSemanticoUtils {
    // Armazena os erros semanticos encontrados
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String msg) {
        errosSemanticos.add(String.format("Erro %d:%d - %s", t.getLine(), t.getCharPositionInLine(), msg));
    }
    
    public static TabelaDeSimbolos.TipoAl convertStringToTipoAl(String s){
        TabelaDeSimbolos.TipoAl tipo;
        switch(s){
            case "literal": tipo = TabelaDeSimbolos.TipoAl.LITERAL; break;
            case "real": tipo = TabelaDeSimbolos.TipoAl.REAL; break;
            case "interio": tipo = TabelaDeSimbolos.TipoAl.INTEIRO; break;
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
                adicionarErroSemantico(ctx.start, "Expressao " +ctx.getText() + "contém tipos incompativeis\n");
                ret = TabelaDeSimbolos.TipoAl.INVALIDO;
            }
        }
        
        return ret;
    }

    // RETORNA O TIPO DE UM TERMO
    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var fa: ctx.fator()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, fa);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
                ret = TabelaDeSimbolos.TipoAl.INVALIDO;
            }
        }
        return ret;
    }
    
    // RETORNA O TIPO DE UM FATOR
    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.FatorContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var pa: ctx.parcela()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, pa);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Fator " +ctx.getText() + "contém tipos incompativeis\n");
                ret = TabelaDeSimbolos.TipoAl.INVALIDO;
            }
        }
        return ret;
    }

    // RETORNA O TIPO DE UMA PARCELA
    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.ParcelaContext ctx) {
        
        if(ctx.parcela_unario() != null){
            return verificarTipo(esc, ctx.parcela_unario());
        } else if (ctx.parcela_nao_unario() != null) {
            return verificarTipo(esc, ctx.parcela_nao_unario());
        } 
        adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
        return null;

    }

    // RETORNA O TIPO DE UMA PARCELA UNARIO
    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Parcela_unarioContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        
        if(ctx.NUM_INT() != null) {
            return TabelaDeSimbolos.TipoAl.INTEIRO;
        } else if(ctx.NUM_REAL()!= null) {
            return TabelaDeSimbolos.TipoAl.REAL;
        } else if(ctx.NUM_REAL()!= null) {
            return TabelaDeSimbolos.TipoAl.REAL;
        } else if (ctx.identificador() != null) {
            for (var tk: ctx.identificador().IDENT()) {
                if (!esc.existe(tk.getText())) {
                    adicionarErroSemantico(tk.getSymbol(), "Variável " +ctx.getText() + " nao declarada \n");
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
                    adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
                    ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                } 
            }
        }
        adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
        return ret;
    }
    
    // RETORNA O TIPO DE UMA PARCELA NAO UNARIA
    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Parcela_nao_unarioContext ctx) {
        if(ctx.CADEIA() != null) {
            return TabelaDeSimbolos.TipoAl.CADEIA;
        } else if (ctx.identificador() != null) {
             TabelaDeSimbolos.TipoAl ret = null;
            for (var tk: ctx.identificador().IDENT()) {
                if (!esc.existe(tk.getText())) {
                    adicionarErroSemantico(tk.getSymbol(), "Variável " +ctx.getText() + " nao declarada\n");
                    ret = TabelaDeSimbolos.TipoAl.INVALIDO;
                } else {
                    ret = esc.verificar(tk.getText());
                }
            }
            return ret;
        }
        adicionarErroSemantico(ctx.start, "Termo " +ctx.getText() + "contém tipos incompativeis\n");
        return TabelaDeSimbolos.TipoAl.INVALIDO;
    }

    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.ExpressaoContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var tl: ctx.termo_logico()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, tl);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão lógica " +ctx.getText() + "contém tipos incompativeis\n");
                ret = TabelaDeSimbolos.TipoAl.INVALIDO;
            }
        }
        return ret;
    }

    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Termo_logicoContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var fl: ctx.fator_logico()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, fl);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo lógico" +ctx.getText() + "contém tipos incompativeis\n");
                ret = TabelaDeSimbolos.TipoAl.INVALIDO;
            }
        }
        return ret;
    }

    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Fator_logicoContext ctx) {
        return verificarTipo(esc, ctx.parcela_logica());
    }

    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Parcela_logicaContext ctx) {
        if(ctx.FALSO() != null) {
            return TabelaDeSimbolos.TipoAl.LOGICO;
        } else if (ctx.VERDADEIRO()!= null) {
            return TabelaDeSimbolos.TipoAl.LOGICO;
        } else if (ctx.exp_relacional() != null) {
            return verificarTipo(esc, ctx.exp_relacional());
        }
        adicionarErroSemantico(ctx.start, "Parcela lógica " +ctx.getText() + "contém tipos incompativeis\n");
        return null;
    }
    
    private static TabelaDeSimbolos.TipoAl verificarTipo(Escopos esc, AlParser.Exp_relacionalContext ctx) {
        TabelaDeSimbolos.TipoAl ret = null;
        for(var ea: ctx.exp_aritmetica()) {
            TabelaDeSimbolos.TipoAl aux = verificarTipo(esc, ea);
            if(ret == null) {
                ret = aux;
            } else if (ret != aux && ret != TabelaDeSimbolos.TipoAl.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão relacional " +ctx.getText() + "contém tipos incompativeis\n");
                ret = TabelaDeSimbolos.TipoAl.INVALIDO;
            }
        }
        return ret;
    }
}
