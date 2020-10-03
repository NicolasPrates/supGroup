/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufscar.dc.compiladores.al.sintatico;

/**
 *
 * @author vitor
 */
public class AlSemantico extends AlBaseVisitor<Void>{
    Escopos escopos = new Escopos();
    
    // TODO começar pelo visitPrograma e ir implementando as regras
    // OBS: sempre que precisar verificar tipos em expressao_aritmetica, exp_relacional ou expressao
    //      usar o AlSemanticoUtils.verificarTipo(escopos, ctx) ou os visit implementados abaixo
    // O AlSemanticoUtils guarda os erros semanticos na lista estatica AlSemanticoUtils.AlSemanticoUtils.errosSemanticos;
    
    @Override
    public Void visitExp_aritmetica(AlParser.Exp_aritmeticaContext ctx) {
        AlSemanticoUtils.verificarTipo(escopos, ctx);
        return super.visitExp_aritmetica(ctx);
    }
 
    
}
