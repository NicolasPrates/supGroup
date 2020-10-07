// Generated from br/ufscar/dc/compiladores/al/sintatico/Al.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.al.sintatico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, DECLARE=3, CONSTANTE=4, TIPOW=5, LITERAL=6, 
		INTEIRO=7, REAL=8, LOGICO=9, VERDADEIRO=10, FALSO=11, REGISTROW=12, FIM_REGISTRO=13, 
		PROCEDIMENTO=14, FIM_PROCEDIMENTO=15, FUNCAO=16, FIM_FUNCAO=17, VAR=18, 
		LEIA=19, ESCREVA=20, SE=21, ENTAO=22, SENAO=23, FIM_SE=24, CASO=25, SEJA=26, 
		FIM_CASO=27, PARA=28, SETA=29, ATE=30, FACA=31, FIM_PARA=32, ENQUANTO=33, 
		FIM_ENQUANTO=34, RETORNE=35, NAO=36, PONTOS=37, DOIS_PONTOS=38, OP_MAIS=39, 
		OP_MENOS=40, OP_MUL=41, OP_DIV=42, OP_PORCENTAGEM=43, OP_E_COMERCIAL=44, 
		OP_OU=45, OP_E=46, OP_MAIOR=47, OP_MENOR=48, OP_MAIOR_IGUAL=49, OP_MENOR_IGUAL=50, 
		OP_DIFERENTE=51, OP_IGUAL=52, ABRE_PARENTESE=53, FECHA_PARENTESE=54, VIRGULA=55, 
		PONTO=56, ABRE_COLCHETE=57, FECHA_COLCHETE=58, ESTENDIDO=59, IDENT=60, 
		CADEIA=61, CADEIA_NAO_FECHADA=62, COMENTARIO=63, COMENTARIO_NAO_FECHADO=64, 
		NUM_INT=65, NUM_REAL=66, WS=67, UNDEFINED_CHAR=68;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_identificador = 5, RULE_dimensao = 6, RULE_tipo = 7, 
		RULE_tipo_basico = 8, RULE_tipo_basico_ident = 9, RULE_tipo_estendido = 10, 
		RULE_valor_constante = 11, RULE_registro = 12, RULE_declaracao_global = 13, 
		RULE_parametro = 14, RULE_parametros = 15, RULE_corpo = 16, RULE_cmd = 17, 
		RULE_cmd_leia = 18, RULE_cmd_escreva = 19, RULE_cmd_se = 20, RULE_cmd_caso = 21, 
		RULE_cmd_para = 22, RULE_cmd_enquanto = 23, RULE_cmd_faca = 24, RULE_cmd_atribuicao = 25, 
		RULE_cmd_chamada = 26, RULE_cmd_retorne = 27, RULE_selecao = 28, RULE_item_selecao = 29, 
		RULE_constantes = 30, RULE_numero_intervalo = 31, RULE_op_unario = 32, 
		RULE_exp_aritmetica = 33, RULE_termo = 34, RULE_fator = 35, RULE_op1 = 36, 
		RULE_op2 = 37, RULE_op3 = 38, RULE_parcela = 39, RULE_parcela_unario = 40, 
		RULE_parcela_nao_unario = 41, RULE_exp_relacional = 42, RULE_op_relacional = 43, 
		RULE_expressao = 44, RULE_termo_logico = 45, RULE_fator_logico = 46, RULE_parcela_logica = 47, 
		RULE_op_logico_1 = 48, RULE_op_logico_2 = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
			"identificador", "dimensao", "tipo", "tipo_basico", "tipo_basico_ident", 
			"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
			"parametro", "parametros", "corpo", "cmd", "cmd_leia", "cmd_escreva", 
			"cmd_se", "cmd_caso", "cmd_para", "cmd_enquanto", "cmd_faca", "cmd_atribuicao", 
			"cmd_chamada", "cmd_retorne", "selecao", "item_selecao", "constantes", 
			"numero_intervalo", "op_unario", "exp_aritmetica", "termo", "fator", 
			"op1", "op2", "op3", "parcela", "parcela_unario", "parcela_nao_unario", 
			"exp_relacional", "op_relacional", "expressao", "termo_logico", "fator_logico", 
			"parcela_logica", "op_logico_1", "op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "'tipo'", 
			"'literal'", "'inteiro'", "'real'", "'logico'", "'verdadeiro'", "'falso'", 
			"'registro'", "'fim_registro'", "'procedimento'", "'fim_procedimento'", 
			"'funcao'", "'fim_funcao'", "'var'", "'leia'", "'escreva'", "'se'", "'entao'", 
			"'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", 
			"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", 
			"'nao'", "'..'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", "'ou'", 
			"'e'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'='", "'('", "')'", "','", 
			"'.'", "'['", "']'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", "TIPOW", 
			"LITERAL", "INTEIRO", "REAL", "LOGICO", "VERDADEIRO", "FALSO", "REGISTROW", 
			"FIM_REGISTRO", "PROCEDIMENTO", "FIM_PROCEDIMENTO", "FUNCAO", "FIM_FUNCAO", 
			"VAR", "LEIA", "ESCREVA", "SE", "ENTAO", "SENAO", "FIM_SE", "CASO", "SEJA", 
			"FIM_CASO", "PARA", "SETA", "ATE", "FACA", "FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", 
			"RETORNE", "NAO", "PONTOS", "DOIS_PONTOS", "OP_MAIS", "OP_MENOS", "OP_MUL", 
			"OP_DIV", "OP_PORCENTAGEM", "OP_E_COMERCIAL", "OP_OU", "OP_E", "OP_MAIOR", 
			"OP_MENOR", "OP_MAIOR_IGUAL", "OP_MENOR_IGUAL", "OP_DIFERENTE", "OP_IGUAL", 
			"ABRE_PARENTESE", "FECHA_PARENTESE", "VIRGULA", "PONTO", "ABRE_COLCHETE", 
			"FECHA_COLCHETE", "ESTENDIDO", "IDENT", "CADEIA", "CADEIA_NAO_FECHADA", 
			"COMENTARIO", "COMENTARIO_NAO_FECHADO", "NUM_INT", "NUM_REAL", "WS", 
			"UNDEFINED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Al.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(AlParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(AlParser.FIM_ALGORITMO, 0); }
		public TerminalNode EOF() { return getToken(AlParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				declaracoes();
				setState(101);
				match(ALGORITMO);
				setState(102);
				corpo();
				setState(103);
				match(FIM_ALGORITMO);
				setState(104);
				match(EOF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(ALGORITMO);
				setState(107);
				corpo();
				setState(108);
				match(FIM_ALGORITMO);
				setState(109);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPOW) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				{
				setState(113);
				decl_local_global();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitDecl_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitDecl_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case CONSTANTE:
			case TIPOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				declaracao_global();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_localContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(AlParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(AlParser.CONSTANTE, 0); }
		public TerminalNode IDENT() { return getToken(AlParser.IDENT, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(AlParser.DOIS_PONTOS, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode OP_IGUAL() { return getToken(AlParser.OP_IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode TIPOW() { return getToken(AlParser.TIPOW, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(DECLARE);
				setState(124);
				variavel();
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(CONSTANTE);
				setState(126);
				match(IDENT);
				setState(127);
				match(DOIS_PONTOS);
				setState(128);
				tipo_basico();
				setState(129);
				match(OP_IGUAL);
				setState(130);
				valor_constante();
				}
				break;
			case TIPOW:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(TIPOW);
				setState(133);
				match(IDENT);
				setState(134);
				match(DOIS_PONTOS);
				setState(135);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(AlParser.DOIS_PONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlParser.VIRGULA, i);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			identificador();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(139);
				match(VIRGULA);
				setState(140);
				identificador();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(DOIS_PONTOS);
			setState(147);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public Token ident1;
		public Token IDENT;
		public List<Token> ident2 = new ArrayList<Token>();
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(AlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(AlParser.IDENT, i);
		}
		public List<TerminalNode> PONTO() { return getTokens(AlParser.PONTO); }
		public TerminalNode PONTO(int i) {
			return getToken(AlParser.PONTO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((IdentificadorContext)_localctx).ident1 = match(IDENT);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PONTO) {
				{
				{
				setState(150);
				match(PONTO);
				setState(151);
				((IdentificadorContext)_localctx).IDENT = match(IDENT);
				((IdentificadorContext)_localctx).ident2.add(((IdentificadorContext)_localctx).IDENT);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			dimensao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensaoContext extends ParserRuleContext {
		public List<TerminalNode> ABRE_COLCHETE() { return getTokens(AlParser.ABRE_COLCHETE); }
		public TerminalNode ABRE_COLCHETE(int i) {
			return getToken(AlParser.ABRE_COLCHETE, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<TerminalNode> FECHA_COLCHETE() { return getTokens(AlParser.FECHA_COLCHETE); }
		public TerminalNode FECHA_COLCHETE(int i) {
			return getToken(AlParser.FECHA_COLCHETE, i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABRE_COLCHETE) {
				{
				{
				setState(159);
				match(ABRE_COLCHETE);
				setState(160);
				exp_aritmetica();
				setState(161);
				match(FECHA_COLCHETE);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				registro();
				}
				break;
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case ESTENDIDO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				tipo_estendido();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basicoContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(AlParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(AlParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(AlParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(AlParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LITERAL) | (1L << INTEIRO) | (1L << REAL) | (1L << LOGICO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(AlParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_basico_ident);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public TerminalNode ESTENDIDO() { return getToken(AlParser.ESTENDIDO, 0); }
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTENDIDO) {
				{
				setState(178);
				match(ESTENDIDO);
				}
			}

			setState(181);
			tipo_basico_ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(AlParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(AlParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(AlParser.NUM_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(AlParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(AlParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (VERDADEIRO - 10)) | (1L << (FALSO - 10)) | (1L << (CADEIA - 10)) | (1L << (NUM_INT - 10)) | (1L << (NUM_REAL - 10)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public TerminalNode REGISTROW() { return getToken(AlParser.REGISTROW, 0); }
		public TerminalNode FIM_REGISTRO() { return getToken(AlParser.FIM_REGISTRO, 0); }
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(REGISTROW);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(186);
				variavel();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(FIM_REGISTRO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode PROCEDIMENTO() { return getToken(AlParser.PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(AlParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(AlParser.ABRE_PARENTESE, 0); }
		public TerminalNode FECHA_PARENTESE() { return getToken(AlParser.FECHA_PARENTESE, 0); }
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(AlParser.FIM_PROCEDIMENTO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode FUNCAO() { return getToken(AlParser.FUNCAO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(AlParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode FIM_FUNCAO() { return getToken(AlParser.FIM_FUNCAO, 0); }
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declaracao_global);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(PROCEDIMENTO);
				setState(195);
				match(IDENT);
				setState(196);
				match(ABRE_PARENTESE);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(197);
					parametros();
					}
				}

				setState(200);
				match(FECHA_PARENTESE);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPOW))) != 0)) {
					{
					{
					setState(201);
					declaracao_local();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ESTENDIDO) | (1L << IDENT))) != 0)) {
					{
					{
					setState(207);
					cmd();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(FIM_PROCEDIMENTO);
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(FUNCAO);
				setState(215);
				match(IDENT);
				setState(216);
				match(ABRE_PARENTESE);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR || _la==IDENT) {
					{
					setState(217);
					parametros();
					}
				}

				setState(220);
				match(FECHA_PARENTESE);
				setState(221);
				match(DOIS_PONTOS);
				setState(222);
				tipo_estendido();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPOW))) != 0)) {
					{
					{
					setState(223);
					declaracao_local();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ESTENDIDO) | (1L << IDENT))) != 0)) {
					{
					{
					setState(229);
					cmd();
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(FIM_FUNCAO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(AlParser.DOIS_PONTOS, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(AlParser.VAR, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(AlParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlParser.VIRGULA, i);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(239);
				match(VAR);
				}
			}

			setState(242);
			identificador();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(243);
				match(VIRGULA);
				setState(244);
				identificador();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(DOIS_PONTOS);
			setState(251);
			tipo_estendido();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlParser.VIRGULA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			parametro();
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(254);
				match(VIRGULA);
				setState(255);
				parametro();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPOW))) != 0)) {
				{
				{
				setState(261);
				declaracao_local();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ESTENDIDO) | (1L << IDENT))) != 0)) {
				{
				{
				setState(267);
				cmd();
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public Cmd_leiaContext cmd_leia() {
			return getRuleContext(Cmd_leiaContext.class,0);
		}
		public Cmd_escrevaContext cmd_escreva() {
			return getRuleContext(Cmd_escrevaContext.class,0);
		}
		public Cmd_seContext cmd_se() {
			return getRuleContext(Cmd_seContext.class,0);
		}
		public Cmd_casoContext cmd_caso() {
			return getRuleContext(Cmd_casoContext.class,0);
		}
		public Cmd_paraContext cmd_para() {
			return getRuleContext(Cmd_paraContext.class,0);
		}
		public Cmd_enquantoContext cmd_enquanto() {
			return getRuleContext(Cmd_enquantoContext.class,0);
		}
		public Cmd_facaContext cmd_faca() {
			return getRuleContext(Cmd_facaContext.class,0);
		}
		public Cmd_atribuicaoContext cmd_atribuicao() {
			return getRuleContext(Cmd_atribuicaoContext.class,0);
		}
		public Cmd_chamadaContext cmd_chamada() {
			return getRuleContext(Cmd_chamadaContext.class,0);
		}
		public Cmd_retorneContext cmd_retorne() {
			return getRuleContext(Cmd_retorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmd);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				cmd_leia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				cmd_escreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				cmd_se();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				cmd_caso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				cmd_para();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				cmd_enquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
				cmd_faca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				cmd_atribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(281);
				cmd_chamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(282);
				cmd_retorne();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_leiaContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(AlParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(AlParser.ABRE_PARENTESE, 0); }
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(AlParser.FECHA_PARENTESE, 0); }
		public List<TerminalNode> ESTENDIDO() { return getTokens(AlParser.ESTENDIDO); }
		public TerminalNode ESTENDIDO(int i) {
			return getToken(AlParser.ESTENDIDO, i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlParser.VIRGULA, i);
		}
		public Cmd_leiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_leia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_leia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_leia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_leia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_leiaContext cmd_leia() throws RecognitionException {
		Cmd_leiaContext _localctx = new Cmd_leiaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmd_leia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(LEIA);
			setState(286);
			match(ABRE_PARENTESE);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTENDIDO) {
				{
				setState(287);
				match(ESTENDIDO);
				}
			}

			setState(290);
			identificador();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(291);
				match(VIRGULA);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTENDIDO) {
					{
					setState(292);
					match(ESTENDIDO);
					}
				}

				setState(295);
				identificador();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(FECHA_PARENTESE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_escrevaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(AlParser.ESCREVA, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(AlParser.ABRE_PARENTESE, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(AlParser.FECHA_PARENTESE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(AlParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlParser.VIRGULA, i);
		}
		public Cmd_escrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_escreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_escreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_escreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_escreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_escrevaContext cmd_escreva() throws RecognitionException {
		Cmd_escrevaContext _localctx = new Cmd_escrevaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmd_escreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(ESCREVA);
			setState(304);
			match(ABRE_PARENTESE);
			setState(305);
			expressao();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(306);
				match(VIRGULA);
				setState(307);
				expressao();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(FECHA_PARENTESE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_seContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(AlParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(AlParser.ENTAO, 0); }
		public TerminalNode FIM_SE() { return getToken(AlParser.FIM_SE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(AlParser.SENAO, 0); }
		public Cmd_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_se(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_se(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_seContext cmd_se() throws RecognitionException {
		Cmd_seContext _localctx = new Cmd_seContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmd_se);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(SE);
			setState(316);
			expressao();
			setState(317);
			match(ENTAO);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ESTENDIDO) | (1L << IDENT))) != 0)) {
				{
				{
				setState(318);
				cmd();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(324);
				match(SENAO);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ESTENDIDO) | (1L << IDENT))) != 0)) {
					{
					{
					setState(325);
					cmd();
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(333);
			match(FIM_SE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_casoContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(AlParser.CASO, 0); }
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public TerminalNode SEJA() { return getToken(AlParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(AlParser.FIM_CASO, 0); }
		public TerminalNode SENAO() { return getToken(AlParser.SENAO, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public Cmd_casoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_caso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_caso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_caso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_caso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_casoContext cmd_caso() throws RecognitionException {
		Cmd_casoContext _localctx = new Cmd_casoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmd_caso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(CASO);
			setState(336);
			exp_aritmetica();
			setState(337);
			match(SEJA);
			setState(338);
			selecao();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(339);
				match(SENAO);
				setState(340);
				cmd();
				}
			}

			setState(343);
			match(FIM_CASO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_paraContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(AlParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(AlParser.IDENT, 0); }
		public TerminalNode SETA() { return getToken(AlParser.SETA, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode ATE() { return getToken(AlParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(AlParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(AlParser.FIM_PARA, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Cmd_paraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_para(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_para(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_para(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_paraContext cmd_para() throws RecognitionException {
		Cmd_paraContext _localctx = new Cmd_paraContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmd_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(PARA);
			setState(346);
			match(IDENT);
			setState(347);
			match(SETA);
			setState(348);
			exp_aritmetica();
			setState(349);
			match(ATE);
			setState(350);
			exp_aritmetica();
			setState(351);
			match(FACA);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ESTENDIDO) | (1L << IDENT))) != 0)) {
				{
				{
				setState(352);
				cmd();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(FIM_PARA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_enquantoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(AlParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FACA() { return getToken(AlParser.FACA, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(AlParser.FIM_ENQUANTO, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Cmd_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_enquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_enquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_enquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_enquantoContext cmd_enquanto() throws RecognitionException {
		Cmd_enquantoContext _localctx = new Cmd_enquantoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmd_enquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(ENQUANTO);
			setState(361);
			expressao();
			setState(362);
			match(FACA);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ESTENDIDO) | (1L << IDENT))) != 0)) {
				{
				{
				setState(363);
				cmd();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(FIM_ENQUANTO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_facaContext extends ParserRuleContext {
		public TerminalNode FACA() { return getToken(AlParser.FACA, 0); }
		public TerminalNode ATE() { return getToken(AlParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Cmd_facaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_faca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_faca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_faca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_faca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_facaContext cmd_faca() throws RecognitionException {
		Cmd_facaContext _localctx = new Cmd_facaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmd_faca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(FACA);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ESTENDIDO) | (1L << IDENT))) != 0)) {
				{
				{
				setState(372);
				cmd();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(ATE);
			setState(379);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_atribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode SETA() { return getToken(AlParser.SETA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ESTENDIDO() { return getToken(AlParser.ESTENDIDO, 0); }
		public Cmd_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_atribuicaoContext cmd_atribuicao() throws RecognitionException {
		Cmd_atribuicaoContext _localctx = new Cmd_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmd_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ESTENDIDO) {
				{
				setState(381);
				match(ESTENDIDO);
				}
			}

			setState(384);
			identificador();
			setState(385);
			match(SETA);
			setState(386);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_chamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(AlParser.ABRE_PARENTESE, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(AlParser.FECHA_PARENTESE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(AlParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlParser.VIRGULA, i);
		}
		public Cmd_chamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_chamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_chamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_chamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_chamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_chamadaContext cmd_chamada() throws RecognitionException {
		Cmd_chamadaContext _localctx = new Cmd_chamadaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd_chamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(IDENT);
			setState(389);
			match(ABRE_PARENTESE);
			setState(390);
			expressao();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(391);
				match(VIRGULA);
				setState(392);
				expressao();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(FECHA_PARENTESE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmd_retorneContext extends ParserRuleContext {
		public TerminalNode RETORNE() { return getToken(AlParser.RETORNE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Cmd_retorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_retorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterCmd_retorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitCmd_retorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitCmd_retorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_retorneContext cmd_retorne() throws RecognitionException {
		Cmd_retorneContext _localctx = new Cmd_retorneContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cmd_retorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(RETORNE);
			setState(401);
			expressao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MENOS || _la==NUM_INT) {
				{
				{
				setState(403);
				item_selecao();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(AlParser.DOIS_PONTOS, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitItem_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitItem_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			constantes();
			setState(410);
			match(DOIS_PONTOS);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << ESTENDIDO) | (1L << IDENT))) != 0)) {
				{
				{
				setState(411);
				cmd();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(AlParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlParser.VIRGULA, i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			numero_intervalo();
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(418);
				match(VIRGULA);
				setState(419);
				numero_intervalo();
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(AlParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(AlParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public TerminalNode PONTOS() { return getToken(AlParser.PONTOS, 0); }
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_MENOS) {
				{
				setState(425);
				op_unario();
				}
			}

			setState(428);
			match(NUM_INT);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PONTOS) {
				{
				setState(429);
				match(PONTOS);
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_MENOS) {
					{
					setState(430);
					op_unario();
					}
				}

				setState(433);
				match(NUM_INT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode OP_MENOS() { return getToken(AlParser.OP_MENOS, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(OP_MENOS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			termo();
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(439);
					op1();
					setState(440);
					termo();
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			fator();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_MUL || _la==OP_DIV) {
				{
				{
				setState(448);
				op2();
				setState(449);
				fator();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			parcela();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_PORCENTAGEM) {
				{
				{
				setState(457);
				op3();
				setState(458);
				parcela();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op1Context extends ParserRuleContext {
		public TerminalNode OP_MAIS() { return getToken(AlParser.OP_MAIS, 0); }
		public TerminalNode OP_MENOS() { return getToken(AlParser.OP_MENOS, 0); }
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			_la = _input.LA(1);
			if ( !(_la==OP_MAIS || _la==OP_MENOS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op2Context extends ParserRuleContext {
		public TerminalNode OP_MUL() { return getToken(AlParser.OP_MUL, 0); }
		public TerminalNode OP_DIV() { return getToken(AlParser.OP_DIV, 0); }
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !(_la==OP_MUL || _la==OP_DIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op3Context extends ParserRuleContext {
		public TerminalNode OP_PORCENTAGEM() { return getToken(AlParser.OP_PORCENTAGEM, 0); }
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(OP_PORCENTAGEM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parcela);
		int _la;
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_MENOS:
			case ABRE_PARENTESE:
			case ESTENDIDO:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_MENOS) {
					{
					setState(471);
					op_unario();
					}
				}

				setState(474);
				parcela_unario();
				}
				break;
			case OP_E_COMERCIAL:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				parcela_nao_unario();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode ESTENDIDO() { return getToken(AlParser.ESTENDIDO, 0); }
		public TerminalNode IDENT() { return getToken(AlParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESE() { return getToken(AlParser.ABRE_PARENTESE, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESE() { return getToken(AlParser.FECHA_PARENTESE, 0); }
		public List<TerminalNode> VIRGULA() { return getTokens(AlParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(AlParser.VIRGULA, i);
		}
		public TerminalNode NUM_INT() { return getToken(AlParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(AlParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parcela_unario);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESTENDIDO) {
					{
					setState(478);
					match(ESTENDIDO);
					}
				}

				setState(481);
				identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				match(IDENT);
				setState(483);
				match(ABRE_PARENTESE);
				setState(484);
				expressao();
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(485);
					match(VIRGULA);
					setState(486);
					expressao();
					}
					}
					setState(491);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(492);
				match(FECHA_PARENTESE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(496);
				match(ABRE_PARENTESE);
				setState(497);
				expressao();
				setState(498);
				match(FECHA_PARENTESE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public TerminalNode OP_E_COMERCIAL() { return getToken(AlParser.OP_E_COMERCIAL, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(AlParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parcela_nao_unario);
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_E_COMERCIAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(OP_E_COMERCIAL);
				setState(503);
				identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(504);
				match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			exp_aritmetica();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAIOR) | (1L << OP_MENOR) | (1L << OP_MAIOR_IGUAL) | (1L << OP_MENOR_IGUAL) | (1L << OP_DIFERENTE) | (1L << OP_IGUAL))) != 0)) {
				{
				setState(508);
				op_relacional();
				setState(509);
				exp_aritmetica();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public TerminalNode OP_IGUAL() { return getToken(AlParser.OP_IGUAL, 0); }
		public TerminalNode OP_DIFERENTE() { return getToken(AlParser.OP_DIFERENTE, 0); }
		public TerminalNode OP_MAIOR_IGUAL() { return getToken(AlParser.OP_MAIOR_IGUAL, 0); }
		public TerminalNode OP_MENOR_IGUAL() { return getToken(AlParser.OP_MENOR_IGUAL, 0); }
		public TerminalNode OP_MAIOR() { return getToken(AlParser.OP_MAIOR, 0); }
		public TerminalNode OP_MENOR() { return getToken(AlParser.OP_MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MAIOR) | (1L << OP_MENOR) | (1L << OP_MAIOR_IGUAL) | (1L << OP_MENOR_IGUAL) | (1L << OP_DIFERENTE) | (1L << OP_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			termo_logico();
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_OU) {
				{
				{
				setState(516);
				op_logico_1();
				setState(517);
				termo_logico();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			fator_logico();
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_E) {
				{
				{
				setState(525);
				op_logico_2();
				setState(526);
				fator_logico();
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public TerminalNode NAO() { return getToken(AlParser.NAO, 0); }
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(533);
				match(NAO);
				}
			}

			setState(536);
			parcela_logica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_logicaContext extends ParserRuleContext {
		public TerminalNode VERDADEIRO() { return getToken(AlParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(AlParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_logica);
		int _la;
		try {
			setState(540);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				_la = _input.LA(1);
				if ( !(_la==VERDADEIRO || _la==FALSO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case OP_MENOS:
			case OP_E_COMERCIAL:
			case ABRE_PARENTESE:
			case ESTENDIDO:
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				exp_relacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_1Context extends ParserRuleContext {
		public TerminalNode OP_OU() { return getToken(AlParser.OP_OU, 0); }
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitOp_logico_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitOp_logico_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(OP_OU);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logico_2Context extends ParserRuleContext {
		public TerminalNode OP_E() { return getToken(AlParser.OP_E, 0); }
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlListener ) ((AlListener)listener).exitOp_logico_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlVisitor ) return ((AlVisitor<? extends T>)visitor).visitOp_logico_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 98, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(OP_E);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u0225\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2r\n\2\3\3\7\3u\n\3\f\3\16\3x\13"+
		"\3\3\4\3\4\5\4|\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u008b\n\5\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\t\3\t\5\t\u00ad\n\t\3\n\3\n\3"+
		"\13\3\13\5\13\u00b3\n\13\3\f\5\f\u00b6\n\f\3\f\3\f\3\r\3\r\3\16\3\16\7"+
		"\16\u00be\n\16\f\16\16\16\u00c1\13\16\3\16\3\16\3\17\3\17\3\17\3\17\5"+
		"\17\u00c9\n\17\3\17\3\17\7\17\u00cd\n\17\f\17\16\17\u00d0\13\17\3\17\7"+
		"\17\u00d3\n\17\f\17\16\17\u00d6\13\17\3\17\3\17\3\17\3\17\3\17\5\17\u00dd"+
		"\n\17\3\17\3\17\3\17\3\17\7\17\u00e3\n\17\f\17\16\17\u00e6\13\17\3\17"+
		"\7\17\u00e9\n\17\f\17\16\17\u00ec\13\17\3\17\3\17\5\17\u00f0\n\17\3\20"+
		"\5\20\u00f3\n\20\3\20\3\20\3\20\7\20\u00f8\n\20\f\20\16\20\u00fb\13\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0103\n\21\f\21\16\21\u0106\13\21"+
		"\3\22\7\22\u0109\n\22\f\22\16\22\u010c\13\22\3\22\7\22\u010f\n\22\f\22"+
		"\16\22\u0112\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23\u011e\n\23\3\24\3\24\3\24\5\24\u0123\n\24\3\24\3\24\3\24\5\24\u0128"+
		"\n\24\3\24\7\24\u012b\n\24\f\24\16\24\u012e\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0137\n\25\f\25\16\25\u013a\13\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\7\26\u0142\n\26\f\26\16\26\u0145\13\26\3\26\3\26\7\26"+
		"\u0149\n\26\f\26\16\26\u014c\13\26\5\26\u014e\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0158\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u0164\n\30\f\30\16\30\u0167\13\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\7\31\u016f\n\31\f\31\16\31\u0172\13\31\3\31\3\31\3\32"+
		"\3\32\7\32\u0178\n\32\f\32\16\32\u017b\13\32\3\32\3\32\3\32\3\33\5\33"+
		"\u0181\n\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u018c\n"+
		"\34\f\34\16\34\u018f\13\34\3\34\3\34\3\35\3\35\3\35\3\36\7\36\u0197\n"+
		"\36\f\36\16\36\u019a\13\36\3\37\3\37\3\37\7\37\u019f\n\37\f\37\16\37\u01a2"+
		"\13\37\3 \3 \3 \7 \u01a7\n \f \16 \u01aa\13 \3!\5!\u01ad\n!\3!\3!\3!\5"+
		"!\u01b2\n!\3!\5!\u01b5\n!\3\"\3\"\3#\3#\3#\3#\7#\u01bd\n#\f#\16#\u01c0"+
		"\13#\3$\3$\3$\3$\7$\u01c6\n$\f$\16$\u01c9\13$\3%\3%\3%\3%\7%\u01cf\n%"+
		"\f%\16%\u01d2\13%\3&\3&\3\'\3\'\3(\3(\3)\5)\u01db\n)\3)\3)\5)\u01df\n"+
		")\3*\5*\u01e2\n*\3*\3*\3*\3*\3*\3*\7*\u01ea\n*\f*\16*\u01ed\13*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\5*\u01f7\n*\3+\3+\3+\5+\u01fc\n+\3,\3,\3,\3,\5,\u0202"+
		"\n,\3-\3-\3.\3.\3.\3.\7.\u020a\n.\f.\16.\u020d\13.\3/\3/\3/\3/\7/\u0213"+
		"\n/\f/\16/\u0216\13/\3\60\5\60\u0219\n\60\3\60\3\60\3\61\3\61\5\61\u021f"+
		"\n\61\3\62\3\62\3\63\3\63\3\63\2\2\64\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\b\3\2\b\13\5\2\f"+
		"\r??CD\3\2)*\3\2+,\3\2\61\66\3\2\f\r\2\u0237\2q\3\2\2\2\4v\3\2\2\2\6{"+
		"\3\2\2\2\b\u008a\3\2\2\2\n\u008c\3\2\2\2\f\u0097\3\2\2\2\16\u00a7\3\2"+
		"\2\2\20\u00ac\3\2\2\2\22\u00ae\3\2\2\2\24\u00b2\3\2\2\2\26\u00b5\3\2\2"+
		"\2\30\u00b9\3\2\2\2\32\u00bb\3\2\2\2\34\u00ef\3\2\2\2\36\u00f2\3\2\2\2"+
		" \u00ff\3\2\2\2\"\u010a\3\2\2\2$\u011d\3\2\2\2&\u011f\3\2\2\2(\u0131\3"+
		"\2\2\2*\u013d\3\2\2\2,\u0151\3\2\2\2.\u015b\3\2\2\2\60\u016a\3\2\2\2\62"+
		"\u0175\3\2\2\2\64\u0180\3\2\2\2\66\u0186\3\2\2\28\u0192\3\2\2\2:\u0198"+
		"\3\2\2\2<\u019b\3\2\2\2>\u01a3\3\2\2\2@\u01ac\3\2\2\2B\u01b6\3\2\2\2D"+
		"\u01b8\3\2\2\2F\u01c1\3\2\2\2H\u01ca\3\2\2\2J\u01d3\3\2\2\2L\u01d5\3\2"+
		"\2\2N\u01d7\3\2\2\2P\u01de\3\2\2\2R\u01f6\3\2\2\2T\u01fb\3\2\2\2V\u01fd"+
		"\3\2\2\2X\u0203\3\2\2\2Z\u0205\3\2\2\2\\\u020e\3\2\2\2^\u0218\3\2\2\2"+
		"`\u021e\3\2\2\2b\u0220\3\2\2\2d\u0222\3\2\2\2fg\5\4\3\2gh\7\3\2\2hi\5"+
		"\"\22\2ij\7\4\2\2jk\7\2\2\3kr\3\2\2\2lm\7\3\2\2mn\5\"\22\2no\7\4\2\2o"+
		"p\7\2\2\3pr\3\2\2\2qf\3\2\2\2ql\3\2\2\2r\3\3\2\2\2su\5\6\4\2ts\3\2\2\2"+
		"ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\5\3\2\2\2xv\3\2\2\2y|\5\b\5\2z|\5\34\17"+
		"\2{y\3\2\2\2{z\3\2\2\2|\7\3\2\2\2}~\7\5\2\2~\u008b\5\n\6\2\177\u0080\7"+
		"\6\2\2\u0080\u0081\7>\2\2\u0081\u0082\7(\2\2\u0082\u0083\5\22\n\2\u0083"+
		"\u0084\7\66\2\2\u0084\u0085\5\30\r\2\u0085\u008b\3\2\2\2\u0086\u0087\7"+
		"\7\2\2\u0087\u0088\7>\2\2\u0088\u0089\7(\2\2\u0089\u008b\5\20\t\2\u008a"+
		"}\3\2\2\2\u008a\177\3\2\2\2\u008a\u0086\3\2\2\2\u008b\t\3\2\2\2\u008c"+
		"\u0091\5\f\7\2\u008d\u008e\79\2\2\u008e\u0090\5\f\7\2\u008f\u008d\3\2"+
		"\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7(\2\2\u0095\u0096\5\20"+
		"\t\2\u0096\13\3\2\2\2\u0097\u009c\7>\2\2\u0098\u0099\7:\2\2\u0099\u009b"+
		"\7>\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\16"+
		"\b\2\u00a0\r\3\2\2\2\u00a1\u00a2\7;\2\2\u00a2\u00a3\5D#\2\u00a3\u00a4"+
		"\7<\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00ad\5\32\16\2\u00ab\u00ad\5\26\f\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\23\3\2\2\2\u00b0"+
		"\u00b3\5\22\n\2\u00b1\u00b3\7>\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\25\3\2\2\2\u00b4\u00b6\7=\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\24\13\2\u00b8\27\3\2\2\2\u00b9"+
		"\u00ba\t\3\2\2\u00ba\31\3\2\2\2\u00bb\u00bf\7\16\2\2\u00bc\u00be\5\n\6"+
		"\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\17\2\2"+
		"\u00c3\33\3\2\2\2\u00c4\u00c5\7\20\2\2\u00c5\u00c6\7>\2\2\u00c6\u00c8"+
		"\7\67\2\2\u00c7\u00c9\5 \21\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00ce\78\2\2\u00cb\u00cd\5\b\5\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d4\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d3\5$\23\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00f0\7\21\2\2\u00d8\u00d9\7"+
		"\22\2\2\u00d9\u00da\7>\2\2\u00da\u00dc\7\67\2\2\u00db\u00dd\5 \21\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\78"+
		"\2\2\u00df\u00e0\7(\2\2\u00e0\u00e4\5\26\f\2\u00e1\u00e3\5\b\5\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00ea\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\5$\23\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\23\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00c4\3\2\2\2\u00ef\u00d8\3\2\2\2\u00f0\35\3\2\2"+
		"\2\u00f1\u00f3\7\24\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f9\5\f\7\2\u00f5\u00f6\79\2\2\u00f6\u00f8\5\f"+
		"\7\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7("+
		"\2\2\u00fd\u00fe\5\26\f\2\u00fe\37\3\2\2\2\u00ff\u0104\5\36\20\2\u0100"+
		"\u0101\79\2\2\u0101\u0103\5\36\20\2\u0102\u0100\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105!\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\u0109\5\b\5\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0110\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010f\5$\23\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111#\3\2\2\2\u0112\u0110\3\2\2\2"+
		"\u0113\u011e\5&\24\2\u0114\u011e\5(\25\2\u0115\u011e\5*\26\2\u0116\u011e"+
		"\5,\27\2\u0117\u011e\5.\30\2\u0118\u011e\5\60\31\2\u0119\u011e\5\62\32"+
		"\2\u011a\u011e\5\64\33\2\u011b\u011e\5\66\34\2\u011c\u011e\58\35\2\u011d"+
		"\u0113\3\2\2\2\u011d\u0114\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0116\3\2"+
		"\2\2\u011d\u0117\3\2\2\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d"+
		"\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e%\3\2\2\2"+
		"\u011f\u0120\7\25\2\2\u0120\u0122\7\67\2\2\u0121\u0123\7=\2\2\u0122\u0121"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012c\5\f\7\2\u0125"+
		"\u0127\79\2\2\u0126\u0128\7=\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2"+
		"\2\u0128\u0129\3\2\2\2\u0129\u012b\5\f\7\2\u012a\u0125\3\2\2\2\u012b\u012e"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\78\2\2\u0130\'\3\2\2\2\u0131\u0132\7\26\2\2"+
		"\u0132\u0133\7\67\2\2\u0133\u0138\5Z.\2\u0134\u0135\79\2\2\u0135\u0137"+
		"\5Z.\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\78"+
		"\2\2\u013c)\3\2\2\2\u013d\u013e\7\27\2\2\u013e\u013f\5Z.\2\u013f\u0143"+
		"\7\30\2\2\u0140\u0142\5$\23\2\u0141\u0140\3\2\2\2\u0142\u0145\3\2\2\2"+
		"\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014d\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u014a\7\31\2\2\u0147\u0149\5$\23\2\u0148\u0147\3\2\2\2"+
		"\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u0146\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\7\32\2\2\u0150+\3\2\2\2\u0151\u0152\7\33\2"+
		"\2\u0152\u0153\5D#\2\u0153\u0154\7\34\2\2\u0154\u0157\5:\36\2\u0155\u0156"+
		"\7\31\2\2\u0156\u0158\5$\23\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u015a\7\35\2\2\u015a-\3\2\2\2\u015b\u015c\7"+
		"\36\2\2\u015c\u015d\7>\2\2\u015d\u015e\7\37\2\2\u015e\u015f\5D#\2\u015f"+
		"\u0160\7 \2\2\u0160\u0161\5D#\2\u0161\u0165\7!\2\2\u0162\u0164\5$\23\2"+
		"\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\"\2\2\u0169"+
		"/\3\2\2\2\u016a\u016b\7#\2\2\u016b\u016c\5Z.\2\u016c\u0170\7!\2\2\u016d"+
		"\u016f\5$\23\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0174\7$\2\2\u0174\61\3\2\2\2\u0175\u0179\7!\2\2\u0176\u0178\5$\23\2"+
		"\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a"+
		"\3\2\2\2\u017a\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017d\7 \2\2\u017d"+
		"\u017e\5Z.\2\u017e\63\3\2\2\2\u017f\u0181\7=\2\2\u0180\u017f\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5\f\7\2\u0183\u0184\7\37"+
		"\2\2\u0184\u0185\5Z.\2\u0185\65\3\2\2\2\u0186\u0187\7>\2\2\u0187\u0188"+
		"\7\67\2\2\u0188\u018d\5Z.\2\u0189\u018a\79\2\2\u018a\u018c\5Z.\2\u018b"+
		"\u0189\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2"+
		"\2\2\u018e\u0190\3\2\2\2\u018f\u018d\3\2\2\2\u0190\u0191\78\2\2\u0191"+
		"\67\3\2\2\2\u0192\u0193\7%\2\2\u0193\u0194\5Z.\2\u01949\3\2\2\2\u0195"+
		"\u0197\5<\37\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199;\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c"+
		"\5> \2\u019c\u01a0\7(\2\2\u019d\u019f\5$\23\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1=\3\2\2\2"+
		"\u01a2\u01a0\3\2\2\2\u01a3\u01a8\5@!\2\u01a4\u01a5\79\2\2\u01a5\u01a7"+
		"\5@!\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9?\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ad\5B\"\2\u01ac"+
		"\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b4\7C"+
		"\2\2\u01af\u01b1\7\'\2\2\u01b0\u01b2\5B\"\2\u01b1\u01b0\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\7C\2\2\u01b4\u01af\3\2"+
		"\2\2\u01b4\u01b5\3\2\2\2\u01b5A\3\2\2\2\u01b6\u01b7\7*\2\2\u01b7C\3\2"+
		"\2\2\u01b8\u01be\5F$\2\u01b9\u01ba\5J&\2\u01ba\u01bb\5F$\2\u01bb\u01bd"+
		"\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bfE\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c7\5H%\2\u01c2"+
		"\u01c3\5L\'\2\u01c3\u01c4\5H%\2\u01c4\u01c6\3\2\2\2\u01c5\u01c2\3\2\2"+
		"\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8G"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01d0\5P)\2\u01cb\u01cc\5N(\2\u01cc"+
		"\u01cd\5P)\2\u01cd\u01cf\3\2\2\2\u01ce\u01cb\3\2\2\2\u01cf\u01d2\3\2\2"+
		"\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1I\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d3\u01d4\t\4\2\2\u01d4K\3\2\2\2\u01d5\u01d6\t\5\2\2\u01d6"+
		"M\3\2\2\2\u01d7\u01d8\7-\2\2\u01d8O\3\2\2\2\u01d9\u01db\5B\"\2\u01da\u01d9"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01df\5R*\2\u01dd"+
		"\u01df\5T+\2\u01de\u01da\3\2\2\2\u01de\u01dd\3\2\2\2\u01dfQ\3\2\2\2\u01e0"+
		"\u01e2\7=\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3\u01f7\5\f\7\2\u01e4\u01e5\7>\2\2\u01e5\u01e6\7\67\2\2\u01e6"+
		"\u01eb\5Z.\2\u01e7\u01e8\79\2\2\u01e8\u01ea\5Z.\2\u01e9\u01e7\3\2\2\2"+
		"\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee"+
		"\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\78\2\2\u01ef\u01f7\3\2\2\2\u01f0"+
		"\u01f7\7C\2\2\u01f1\u01f7\7D\2\2\u01f2\u01f3\7\67\2\2\u01f3\u01f4\5Z."+
		"\2\u01f4\u01f5\78\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01e1\3\2\2\2\u01f6\u01e4"+
		"\3\2\2\2\u01f6\u01f0\3\2\2\2\u01f6\u01f1\3\2\2\2\u01f6\u01f2\3\2\2\2\u01f7"+
		"S\3\2\2\2\u01f8\u01f9\7.\2\2\u01f9\u01fc\5\f\7\2\u01fa\u01fc\7?\2\2\u01fb"+
		"\u01f8\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fcU\3\2\2\2\u01fd\u0201\5D#\2\u01fe"+
		"\u01ff\5X-\2\u01ff\u0200\5D#\2\u0200\u0202\3\2\2\2\u0201\u01fe\3\2\2\2"+
		"\u0201\u0202\3\2\2\2\u0202W\3\2\2\2\u0203\u0204\t\6\2\2\u0204Y\3\2\2\2"+
		"\u0205\u020b\5\\/\2\u0206\u0207\5b\62\2\u0207\u0208\5\\/\2\u0208\u020a"+
		"\3\2\2\2\u0209\u0206\3\2\2\2\u020a\u020d\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c[\3\2\2\2\u020d\u020b\3\2\2\2\u020e\u0214\5^\60\2"+
		"\u020f\u0210\5d\63\2\u0210\u0211\5^\60\2\u0211\u0213\3\2\2\2\u0212\u020f"+
		"\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"]\3\2\2\2\u0216\u0214\3\2\2\2\u0217\u0219\7&\2\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\5`\61\2\u021b_\3\2\2\2"+
		"\u021c\u021f\t\7\2\2\u021d\u021f\5V,\2\u021e\u021c\3\2\2\2\u021e\u021d"+
		"\3\2\2\2\u021fa\3\2\2\2\u0220\u0221\7/\2\2\u0221c\3\2\2\2\u0222\u0223"+
		"\7\60\2\2\u0223e\3\2\2\2;qv{\u008a\u0091\u009c\u00a7\u00ac\u00b2\u00b5"+
		"\u00bf\u00c8\u00ce\u00d4\u00dc\u00e4\u00ea\u00ef\u00f2\u00f9\u0104\u010a"+
		"\u0110\u011d\u0122\u0127\u012c\u0138\u0143\u014a\u014d\u0157\u0165\u0170"+
		"\u0179\u0180\u018d\u0198\u01a0\u01a8\u01ac\u01b1\u01b4\u01be\u01c7\u01d0"+
		"\u01da\u01de\u01e1\u01eb\u01f6\u01fb\u0201\u020b\u0214\u0218\u021e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}