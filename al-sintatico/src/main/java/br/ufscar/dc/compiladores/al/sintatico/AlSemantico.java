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
        else{
            String nome = ctx.IDENT().getText();
            
            TipoAl tipo = AlSemanticoUtils.verificarTipoDeTipoContext(ctx.tipo());
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
            
            //verifica se já existe alguma declaração com esse nome no escopo atual
            if(escopos.existeNaTabelaAtual(nome)){
                AlSemanticoUtils.adicionarErroSemantico(ctx.IDENT().getSymbol(), nome+this.errorMessage);
            }
            else{
                escopos.inserirNaTabelaAtual(nome, TipoAl.PROCEDIMENTO);

                // se houver parâmetros precisamos salvar os tipos deles
                if(ctx.parametros() != null){
                    for(var p: ctx.parametros().parametro()){
                        String tipo = p.tipo_estendido().getText();
                        for(var id: p.identificador()){
                            if(AlSemanticoUtils.identificadorExiste(escopos, id)){
                                // não precisa adicionar erro semantico por que a função identificador existe já adiciona
                            }
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
    public Void visitRegistro(AlParser.RegistroContext ctx) {
        HashMap<String, TipoAl> atributos = new HashMap<>();
        for(var v: ctx.variavel()){
            TipoAl tipo = AlSemanticoUtils.verificarTipoDeTipoContext(v.tipo());
            for(var id: v.identificador()){
                String nome = id.ident1.getText();
                // temos o nome e o tipo, vamos adicionar esse atributo ao hashmap
                atributos.put(nome, tipo);
            }
            
        }
        escopos.inserirNaTabelaAtual(nome, tipo, tipo, parametros, atributos);
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
    
    
}
