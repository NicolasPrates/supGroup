/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.al.sintatico;

import br.ufscar.dc.compiladores.al.sintatico.TabelaDeSimbolos.TipoAl;
import java.util.HashMap;

/**
 *
 * @author vitor
 */
public class AlSemantico extends AlBaseVisitor<Void>{
    
    // inicializar Escopos cria um escopo global
    
    Escopos escopos;
    
    @Override
    public Void visitPrograma(AlParser.ProgramaContext ctx) {        
        escopos = new Escopos();
        
        visitDeclaracoes(ctx.declaracoes());
        visitCorpo(ctx.corpo());
        return null; 
    }

    @Override
    public Void visitDeclaracao_local(AlParser.Declaracao_localContext ctx) {
        if(ctx.DECLARE() != null){
            TipoAl tipo = AlSemanticoUtils.verificarTipoDeTipoContext(escopos, ctx.variavel().tipo());
            
            for(var identificador: ctx.variavel().identificador()){
                for(var ident: identificador.IDENT()){
                    String nome = ident.getText();
                    System.out.println(nome + " será declarado");
                    if(escopos.existeNaTabelaAtual(nome)){
                        System.out.println(nome + " já exite na tabela");
                        ErrosSemanticos.identificadorExistente(nome, ident.getSymbol().getLine());
                    }else{
                        // se estou declarando um registro preciso inserí-lo na tabela de símbolos
                        if(tipo == TipoAl.REGISTRO){
                            System.out.println(nome + " foi classificado como registro");
                            AlParser.RegistroContext registroCtx = ctx.variavel().tipo().registro();
                            if(registroCtx != null){
                                System.out.println(nome + " não pode ser declarado como registro");
                                HashMap<String, TipoAl> atributos = getRegistroAtributos(registroCtx);
                                escopos.inserirNaTabelaAtual(nome, tipo, tipo, null, atributos);
                            }
                        }
                        else{
                            escopos.inserirNaTabelaAtual(nome, tipo);
                            System.err.println(nome + " foi declarado");
                            escopos.imprimirTabelaAtual();
                        }
                    }
                }
            }
        }
        else if(ctx.CONSTANTE() != null){
            String strTipo = ctx.tipo_basico().getText();
            TipoAl tipo = AlSemanticoUtils.convertStringToTipoAl(strTipo);
            String nome = ctx.IDENT().getText();
            if(escopos.existeNaTabelaAtual(nome)){
                ErrosSemanticos.identificadorExistente(nome, ctx.IDENT().getSymbol().getLine());
            }else{
                escopos.inserirNaTabelaAtual(nome, tipo);
            }
        }
        else{ //delcaração de tipo
            String nome = ctx.IDENT().getText();
            TipoAl tipo = AlSemanticoUtils.verificarTipoDeTipoContext(escopos, ctx.tipo());
            if(escopos.existeNaTabelaAtual(nome)){
                ErrosSemanticos.identificadorExistente(nome, ctx.IDENT().getSymbol().getLine());
            }else{
                if(tipo == TipoAl.REGISTRO){
                    AlParser.RegistroContext registroCtx = ctx.tipo().registro();
                    HashMap<String, TipoAl> atributos = getRegistroAtributos(registroCtx);
                    escopos.inserirNaTabelaAtual(nome, TipoAl.TIPO, tipo, null, atributos);
                }else{
                    escopos.inserirNaTabelaAtual(nome, TipoAl.TIPO, tipo, null, null);
                }
            }
          
        }
        return null;
    }

    @Override
    public Void visitDeclaracao_global(AlParser.Declaracao_globalContext ctx) {
        // procedimentos não retornam dados, isso é, basta verificar se o nome esta disponível
        if(ctx.PROCEDIMENTO() != null){
            String nome = ctx.IDENT().getText();
            
            //verifica se já existe alguma declaração com esse nome no escopo atual
            if(escopos.existeNaTabelaAtual(nome)){
                ErrosSemanticos.identificadorExistente(nome, ctx.IDENT().getSymbol().getLine());
            }
            else{
                escopos.inserirNaTabelaAtual(nome, TipoAl.PROCEDIMENTO);

                // se houver parâmetros precisamos salvar os tipos deles
                if(ctx.parametros() != null){
                    for(var p: ctx.parametros().parametro()){
                        String tipo = p.tipo_estendido().getText();
                        for(var id: p.identificador()){
//                            if(AlSemanticoUtils.identificadorExiste(escopos, id)){
//                                // não precisa adicionar erro semantico por que a função identificador existe já adiciona
//                            }
                        }
                    }
                }
            }
        }
        else{
            
        }
         
        
        return null;
    }
    
    @Override
    public Void visitCorpo(AlParser.CorpoContext ctx) {
        for (var decLocal: ctx.declaracao_local()) {
            visitDeclaracao_local(decLocal);
        }
        
        for (var cmd: ctx.cmd()) {
            visitCmd(cmd);
        } 
        return null;
    }

    @Override
    public Void visitExp_aritmetica(AlParser.Exp_aritmeticaContext ctx) {
        AlSemanticoUtils.verificarTipo(escopos, ctx);
        return super.visitExp_aritmetica(ctx);
    }  

    @Override
    public Void visitCmd_chamada(AlParser.Cmd_chamadaContext ctx) {
        String nome = ctx.IDENT().getText();
        if(escopos.existe(nome)){
            // é procedimento ou função ?
            if(escopos.verificar(nome) == TipoAl.PROCEDIMENTO){
                //parametros
                
            }
            else{
                // parametros e retorno
            }
        }
        else{
            AlSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), "procedimento ou função não declarado");
        }
        return null;
    }
    
    @Override
    public Void visitCmd_atribuicao(AlParser.Cmd_atribuicaoContext ctx) {
        TabelaDeSimbolos.TipoAl tipoLadoEsquerdo = null;
        TabelaDeSimbolos.TipoAl tipoLadoDireito;
        String nome = ctx.identificador().getText();
        
        tipoLadoEsquerdo = AlSemanticoUtils.tipoDoIdentificador(escopos, ctx.identificador());
      
        tipoLadoDireito = AlSemanticoUtils.verificarTipo(escopos, ctx.expressao());
        
        if(ctx.ESTENDIDO() != null){
            // assumo que meu tipo do lado esquerdo é um ponteiro e preciso
            // verificar se o lado direito corresponde à um endereço do tipo certo
            if(
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_INTEIRO && tipoLadoDireito != TipoAl.INTEIRO) ||
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_REAL && tipoLadoDireito != TipoAl.REAL) ||
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_REGISTRO && tipoLadoDireito != TipoAl.REGISTRO) ||
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_LITERAL && tipoLadoDireito != TipoAl.LITERAL) ||
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_LOGICO && tipoLadoDireito != TipoAl.LOGICO)
            ){
                ErrosSemanticos.atribuicaoIncompativel("^"+nome, ctx.expressao().start.getLine());
            }
            
        }
        else{
            // se for um ponteiro
            if(
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_INTEIRO) || 
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_REAL) || 
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_REGISTRO) || 
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_LITERAL) || 
                (tipoLadoEsquerdo == TipoAl.PONTEIRO_LOGICO)
            ){ 
                if(tipoLadoEsquerdo == TipoAl.PONTEIRO_INTEIRO && tipoLadoDireito != TipoAl.ENDERECO_INTEIRO){
                    // ponteiro para INTEIRO nao deve receber endereço de outro tipo de dado
                }
                else if(tipoLadoEsquerdo == TipoAl.PONTEIRO_REAL && tipoLadoDireito != TipoAl.ENDERECO_REAL){
                    // ponteiro para REAL nao deve receber endereço de outro tipo de dado
                }
                else if(tipoLadoEsquerdo == TipoAl.PONTEIRO_REGISTRO && tipoLadoDireito != TipoAl.ENDERECO_REGISTRO){
                    // ponteiro para REGISTRO nao deve receber endereço de outro tipo de dado
                }
                else if(tipoLadoEsquerdo == TipoAl.PONTEIRO_LITERAL && tipoLadoDireito != TipoAl.ENDERECO_LITERAL){
                    // ponteiro para LITERAL nao deve receber endereço de outro tipo de dado
                }
                else if(tipoLadoEsquerdo == TipoAl.PONTEIRO_LOGICO && tipoLadoDireito != TipoAl.ENDERECO_LOGICO){
                    // ponteiro para LOGIC nao deve receber endereço de outro tipo de dado
                }
            }
            
            // se não é um ponteiro
            else{
                if(tipoLadoDireito != tipoLadoEsquerdo ) {
                    if (tipoLadoEsquerdo == TabelaDeSimbolos.TipoAl.REAL && 
                            tipoLadoDireito == TabelaDeSimbolos.TipoAl.INTEIRO) {
                    } else {
                        // System.out.println("Esquerdo: " + tipoLadoEsquerdo + " Direito: " + tipoLadoDireito);
                        ErrosSemanticos.atribuicaoIncompativel(nome, ctx.expressao().start.getLine());
                    } 
                }
            }
        }
        
           
        return null;
    }
    
    @Override
    public Void visitCmd_leia(AlParser.Cmd_leiaContext ctx) {
        for (var identificador: ctx.identificador()) {
            TipoAl tipo = AlSemanticoUtils.tipoDoIdentificador(escopos, identificador);
        }  
        return null;
    }

    @Override
    public Void visitCmd_escreva(AlParser.Cmd_escrevaContext ctx) {
        for (var ex: ctx.expressao()) {
            AlSemanticoUtils.verificarTipo(escopos, ex);
        }
        return null;
    }

    @Override
    public Void visitCmd_se(AlParser.Cmd_seContext ctx) {
        AlSemanticoUtils.verificarTipo(escopos, ctx.expressao());
        for (var cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        return null;
    }

    @Override
    public Void visitCmd_caso(AlParser.Cmd_casoContext ctx) {
        TabelaDeSimbolos.TipoAl tipoExpAritmetica = AlSemanticoUtils.verificarTipo(escopos, ctx.exp_aritmetica());
        if(tipoExpAritmetica != TabelaDeSimbolos.TipoAl.INTEIRO) {
            ErrosSemanticos.atribuicaoIncompativel(ctx.exp_aritmetica().getText(), ctx.getStart().getLine());
        }
        for (var ItemSelecao: ctx.selecao().item_selecao()){
            for (var cmd : ItemSelecao.cmd()) {
                visitCmd(cmd);
            }
        }
        if(ctx.cmd() != null ) {
            visitCmd(ctx.cmd());
        }
        return null;
    }

    @Override
    public Void visitCmd_para(AlParser.Cmd_paraContext ctx) {
        if(!escopos.existe(ctx.IDENT().getText())){
            ErrosSemanticos.identificadorInexistente(ctx.IDENT().getText(), ctx.getStart().getLine());
        }
        for (var exp_aritmetica : ctx.exp_aritmetica()) {
            if(AlSemanticoUtils.verificarTipo(escopos, exp_aritmetica) != TabelaDeSimbolos.TipoAl.INTEIRO) {
                ErrosSemanticos.atribuicaoIncompativel(ctx.IDENT().getText(), ctx.getStart().getLine());
            }
        }
        
        for(var cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        return null;
    }

    @Override
    public Void visitCmd_enquanto(AlParser.Cmd_enquantoContext ctx) {
        AlSemanticoUtils.verificarTipo(escopos, ctx.expressao());
        
        for(var cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        return null;
    }

    @Override
    public Void visitCmd_faca(AlParser.Cmd_facaContext ctx) {
        for(var cmd : ctx.cmd()) {
            visitCmd(cmd);
        }
        
        AlSemanticoUtils.verificarTipo(escopos, ctx.expressao());
        return null;
    }

    private HashMap<String, TipoAl> getRegistroAtributos(AlParser.RegistroContext registroCtx) {
        HashMap<String, TipoAl> atributos = new HashMap<>();
        for(var v: registroCtx.variavel_do_registro()){
            TipoAl tipo_attr = AlSemanticoUtils.convertStringToTipoAl(v.tipo_basico().getText());
            for(var id: v.IDENT()){
                // temos o nome e o tipo, vamos adicionar esse atributo ao hashmap
                atributos.put(id.getText(), tipo_attr);
            }

        }
        return atributos;
    }
    
    
}
