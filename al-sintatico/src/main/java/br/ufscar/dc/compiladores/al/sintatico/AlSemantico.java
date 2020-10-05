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
    String errorMessage = " já esta sendo usado no escopo atual";
    
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
                        AlSemanticoUtils.adicionarErroSemantico(ident.getSymbol(), nome+this.errorMessage);
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
                AlSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), nome+this.errorMessage);
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
                AlSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), nome+this.errorMessage);
            }else{
                escopos.inserirNaTabelaAtual(nome, TipoAl.PROCEDIMENTO);
            }
        }
        else{
            String nome = ctx.IDENT().getText();
            if(escopos.existeNaTabelaAtual(nome)){
                AlSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), nome+this.errorMessage);
            }else{
                TipoAl retorno = AlSemanticoUtils.convertStringToTipoAl(ctx.tipo_estendido().getText());
                escopos.inserirNaTabelaAtual(nome, TipoAl.FUNCAO, retorno);
            }
        }
        
        return null;
    }
    
    @Override
    public Void visitExp_aritmetica(AlParser.Exp_aritmeticaContext ctx) {
        AlSemanticoUtils.verificarTipo(escopos, ctx);
        return super.visitExp_aritmetica(ctx);
    }    
    
}
