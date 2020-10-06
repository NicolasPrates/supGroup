/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.al.sintatico;

import br.ufscar.dc.compiladores.al.sintatico.TabelaDeSimbolos.TipoAl;

/**
 *
 * @author vitor
 */
public class AlSemantico extends AlBaseVisitor<Void>{
    
    // inicializar Escopos cria um escopo global
    Escopos escopos;
    String errorMessage = "";
    
    @Override
    public Void visitPrograma(AlParser.ProgramaContext ctx) {        
        escopos = new Escopos();
        
        visitDeclaracoes(ctx.declaracoes());
        visitCorpo(ctx.corpo());
        return null; 
    }
    
    @Override
    public Void visitDeclaracao_local(AlParser.Declaracao_localContext ctx) {
        if(ctx.variavel() != null){
            String strTipo = ctx.variavel().tipo().getText();
            TipoAl tipo = AlSemanticoUtils.convertStringToTipoAl(strTipo);
            
            for(var id: ctx.variavel().identificador()){
                for(var ident: id.IDENT()){
                    String nome = ident.getText();
                    if(escopos.existeNaTabelaAtual(nome)){
                        ErrosSemanticos.identificadorExistente(nome, ident.getSymbol().getLine());
                    }else{
                        escopos.inserirNaTabelaAtual(nome, tipo);
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
        else if(ctx.TIPOW() != null){
            String strTipo = ctx.tipo().getText();
            TipoAl tipo = AlSemanticoUtils.convertStringToTipoAl(strTipo);
            String nome = ctx.IDENT().getText();
            if(escopos.existeNaTabelaAtual(nome)){
                AlSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), nome+this.errorMessage);
                ErrosSemanticos.identificadorExistente(nome, ctx.IDENT().getSymbol().getLine());
            }else{
                escopos.inserirNaTabelaAtual(nome, tipo);
            }
        }
        
        return null;
    }

    @Override
    public Void visitDeclaracao_global(AlParser.Declaracao_globalContext ctx) {
        // procedimentos não retornam dados, isso é, basta verificar se o nome esta disponível
        if(ctx.PROCEDIMENTO() != null){
            String nome = ctx.IDENT().getText();
            if(escopos.existeNaTabelaAtual(nome)){
                ErrosSemanticos.identificadorExistente(nome, ctx.IDENT().getSymbol().getLine());
            }else{
                escopos.inserirNaTabelaAtual(nome, TipoAl.PROCEDIMENTO);
            }
        }
        else{
            String nome = ctx.IDENT().getText();
            if(escopos.existeNaTabelaAtual(nome)){
                ErrosSemanticos.identificadorExistente(nome, ctx.IDENT().getSymbol().getLine());
            }else{
                TipoAl retorno = AlSemanticoUtils.convertStringToTipoAl(ctx.tipo_estendido().getText());
                escopos.inserirNaTabelaAtual(nome, TipoAl.FUNCAO, retorno);
            }
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
    public Void visitCmd(AlParser.CmdContext ctx) {
        visitCmd_atribuicao(ctx.cmd_atribuicao());
        return null;
    }
    
    

    @Override
    public Void visitExp_aritmetica(AlParser.Exp_aritmeticaContext ctx) {
        AlSemanticoUtils.verificarTipo(escopos, ctx);
        return null;
    }

    @Override
    public Void visitCmd_atribuicao(AlParser.Cmd_atribuicaoContext ctx) {
        TabelaDeSimbolos.TipoAl tipoLadoEsquerdo = null;
        TabelaDeSimbolos.TipoAl tipoLadoDireito;
        if(escopos.existe(ctx.identificador().getText())) {
            String nome;
            for(var ident: ctx.identificador().IDENT()){
                nome = ident.getText();
                if (!escopos.existe(nome)){
                    ErrosSemanticos.identificadorInexistente(nome, ident.getSymbol().getLine());
                    return null;
                } else {
                    tipoLadoEsquerdo = escopos.verificar(nome);
                }
            }   
        }
        
        tipoLadoDireito = AlSemanticoUtils.verificarTipo(escopos, ctx.expressao());
        
        if(tipoLadoDireito != tipoLadoEsquerdo) {
            // VERIFICAR COMO PASSAR ESSE ERRO
            AlSemanticoUtils.adicionarErroSemantico(ctx.SETA().getSymbol(), "Tipos incompativeis");
            return null;
        }
        return null;
    }

    
    
}
