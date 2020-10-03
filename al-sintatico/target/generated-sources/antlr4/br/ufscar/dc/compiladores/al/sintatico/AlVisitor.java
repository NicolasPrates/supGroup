// Generated from br/ufscar/dc/compiladores/al/sintatico/Al.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.al.sintatico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(AlParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(AlParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(AlParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(AlParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(AlParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(AlParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(AlParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(AlParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(AlParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(AlParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(AlParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(AlParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(AlParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(AlParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(AlParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(AlParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(AlParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_leia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_leia(AlParser.Cmd_leiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_escreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_escreva(AlParser.Cmd_escrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_se}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_se(AlParser.Cmd_seContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_caso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_caso(AlParser.Cmd_casoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_para(AlParser.Cmd_paraContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_enquanto(AlParser.Cmd_enquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_faca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_faca(AlParser.Cmd_facaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_atribuicao(AlParser.Cmd_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_chamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_chamada(AlParser.Cmd_chamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#cmd_retorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd_retorne(AlParser.Cmd_retorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(AlParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(AlParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(AlParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(AlParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(AlParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(AlParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(AlParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(AlParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(AlParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(AlParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(AlParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(AlParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(AlParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(AlParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(AlParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(AlParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(AlParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(AlParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(AlParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(AlParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(AlParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(AlParser.Op_logico_2Context ctx);
}