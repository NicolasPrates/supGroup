// Generated from br/ufscar/dc/compiladores/al/sintatico/Al.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.al.sintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlParser}.
 */
public interface AlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(AlParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(AlParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(AlParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(AlParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(AlParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(AlParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(AlParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(AlParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(AlParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(AlParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(AlParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(AlParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AlParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AlParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(AlParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(AlParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(AlParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(AlParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(AlParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(AlParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(AlParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(AlParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(AlParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(AlParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(AlParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(AlParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(AlParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(AlParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(AlParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(AlParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(AlParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(AlParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AlParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AlParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_leia}.
	 * @param ctx the parse tree
	 */
	void enterCmd_leia(AlParser.Cmd_leiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_leia}.
	 * @param ctx the parse tree
	 */
	void exitCmd_leia(AlParser.Cmd_leiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_escreva}.
	 * @param ctx the parse tree
	 */
	void enterCmd_escreva(AlParser.Cmd_escrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_escreva}.
	 * @param ctx the parse tree
	 */
	void exitCmd_escreva(AlParser.Cmd_escrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_se}.
	 * @param ctx the parse tree
	 */
	void enterCmd_se(AlParser.Cmd_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_se}.
	 * @param ctx the parse tree
	 */
	void exitCmd_se(AlParser.Cmd_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_caso}.
	 * @param ctx the parse tree
	 */
	void enterCmd_caso(AlParser.Cmd_casoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_caso}.
	 * @param ctx the parse tree
	 */
	void exitCmd_caso(AlParser.Cmd_casoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_para}.
	 * @param ctx the parse tree
	 */
	void enterCmd_para(AlParser.Cmd_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_para}.
	 * @param ctx the parse tree
	 */
	void exitCmd_para(AlParser.Cmd_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_enquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmd_enquanto(AlParser.Cmd_enquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_enquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmd_enquanto(AlParser.Cmd_enquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_faca}.
	 * @param ctx the parse tree
	 */
	void enterCmd_faca(AlParser.Cmd_facaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_faca}.
	 * @param ctx the parse tree
	 */
	void exitCmd_faca(AlParser.Cmd_facaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmd_atribuicao(AlParser.Cmd_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmd_atribuicao(AlParser.Cmd_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_chamada}.
	 * @param ctx the parse tree
	 */
	void enterCmd_chamada(AlParser.Cmd_chamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_chamada}.
	 * @param ctx the parse tree
	 */
	void exitCmd_chamada(AlParser.Cmd_chamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#cmd_retorne}.
	 * @param ctx the parse tree
	 */
	void enterCmd_retorne(AlParser.Cmd_retorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#cmd_retorne}.
	 * @param ctx the parse tree
	 */
	void exitCmd_retorne(AlParser.Cmd_retorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(AlParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(AlParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(AlParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(AlParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(AlParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(AlParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(AlParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(AlParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(AlParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(AlParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(AlParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(AlParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AlParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AlParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AlParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AlParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(AlParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(AlParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(AlParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(AlParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(AlParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(AlParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(AlParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(AlParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(AlParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(AlParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(AlParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(AlParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(AlParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(AlParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(AlParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(AlParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(AlParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(AlParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(AlParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(AlParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(AlParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(AlParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(AlParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(AlParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(AlParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(AlParser.Op_logico_1Context ctx);
}