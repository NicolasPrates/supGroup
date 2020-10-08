// Generated from br/ufscar/dc/compiladores/al/sintatico/Al.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.al.sintatico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", "TIPOW", "LITERAL", 
			"INTEIRO", "REAL", "LOGICO", "VERDADEIRO", "FALSO", "REGISTROW", "FIM_REGISTRO", 
			"PROCEDIMENTO", "FIM_PROCEDIMENTO", "FUNCAO", "FIM_FUNCAO", "VAR", "LEIA", 
			"ESCREVA", "SE", "ENTAO", "SENAO", "FIM_SE", "CASO", "SEJA", "FIM_CASO", 
			"PARA", "SETA", "ATE", "FACA", "FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", 
			"RETORNE", "NAO", "PONTOS", "DOIS_PONTOS", "OP_MAIS", "OP_MENOS", "OP_MUL", 
			"OP_DIV", "OP_PORCENTAGEM", "OP_E_COMERCIAL", "OP_OU", "OP_E", "OP_MAIOR", 
			"OP_MENOR", "OP_MAIOR_IGUAL", "OP_MENOR_IGUAL", "OP_DIFERENTE", "OP_IGUAL", 
			"ABRE_PARENTESE", "FECHA_PARENTESE", "VIRGULA", "PONTO", "ABRE_COLCHETE", 
			"FECHA_COLCHETE", "ESTENDIDO", "IDENT", "ESC_SEQ", "CADEIA", "CADEIA_NAO_FECHADA", 
			"COMENTARIO", "COMENTARIO_NAO_FECHADO", "NUM_INT", "NUM_REAL", "WS", 
			"UNDEFINED_CHAR"
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


	public AlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Al.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 67:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u0221\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\7=\u01db\n=\f=\16=\u01de\13=\3>\3>\3>\3?\3?\3?\7?\u01e6\n?"+
		"\f?\16?\u01e9\13?\3?\3?\3@\3@\3@\7@\u01f0\n@\f@\16@\u01f3\13@\3@\3@\3"+
		"A\3A\7A\u01f9\nA\fA\16A\u01fc\13A\3A\3A\3A\3A\3B\3B\7B\u0204\nB\fB\16"+
		"B\u0207\13B\3B\3B\3C\6C\u020c\nC\rC\16C\u020d\3D\6D\u0211\nD\rD\16D\u0212"+
		"\3D\3D\6D\u0217\nD\rD\16D\u0218\5D\u021b\nD\3E\3E\3E\3F\3F\2\2G\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{\2}?\177@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\3\2\b\5\2"+
		"C\\aac|\6\2\62;C\\aac|\4\2\f\f$$\3\2$$\5\2\f\f\17\17\177\177\5\2\13\f"+
		"\17\17\"\"\2\u022a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2"+
		"\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d"+
		"\3\2\2\2\5\u0097\3\2\2\2\7\u00a5\3\2\2\2\t\u00ad\3\2\2\2\13\u00b7\3\2"+
		"\2\2\r\u00bc\3\2\2\2\17\u00c4\3\2\2\2\21\u00cc\3\2\2\2\23\u00d1\3\2\2"+
		"\2\25\u00d8\3\2\2\2\27\u00e3\3\2\2\2\31\u00e9\3\2\2\2\33\u00f2\3\2\2\2"+
		"\35\u00ff\3\2\2\2\37\u010c\3\2\2\2!\u011d\3\2\2\2#\u0124\3\2\2\2%\u012f"+
		"\3\2\2\2\'\u0133\3\2\2\2)\u0138\3\2\2\2+\u0140\3\2\2\2-\u0143\3\2\2\2"+
		"/\u0149\3\2\2\2\61\u014f\3\2\2\2\63\u0156\3\2\2\2\65\u015b\3\2\2\2\67"+
		"\u0160\3\2\2\29\u0169\3\2\2\2;\u016e\3\2\2\2=\u0171\3\2\2\2?\u0175\3\2"+
		"\2\2A\u017a\3\2\2\2C\u0183\3\2\2\2E\u018c\3\2\2\2G\u0199\3\2\2\2I\u01a1"+
		"\3\2\2\2K\u01a5\3\2\2\2M\u01a8\3\2\2\2O\u01aa\3\2\2\2Q\u01ac\3\2\2\2S"+
		"\u01ae\3\2\2\2U\u01b0\3\2\2\2W\u01b2\3\2\2\2Y\u01b4\3\2\2\2[\u01b6\3\2"+
		"\2\2]\u01b9\3\2\2\2_\u01bb\3\2\2\2a\u01bd\3\2\2\2c\u01bf\3\2\2\2e\u01c2"+
		"\3\2\2\2g\u01c5\3\2\2\2i\u01c8\3\2\2\2k\u01ca\3\2\2\2m\u01cc\3\2\2\2o"+
		"\u01ce\3\2\2\2q\u01d0\3\2\2\2s\u01d2\3\2\2\2u\u01d4\3\2\2\2w\u01d6\3\2"+
		"\2\2y\u01d8\3\2\2\2{\u01df\3\2\2\2}\u01e2\3\2\2\2\177\u01ec\3\2\2\2\u0081"+
		"\u01f6\3\2\2\2\u0083\u0201\3\2\2\2\u0085\u020b\3\2\2\2\u0087\u0210\3\2"+
		"\2\2\u0089\u021c\3\2\2\2\u008b\u021f\3\2\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7n\2\2\u008f\u0090\7i\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t\2\2"+
		"\u0092\u0093\7k\2\2\u0093\u0094\7v\2\2\u0094\u0095\7o\2\2\u0095\u0096"+
		"\7q\2\2\u0096\4\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7o\2\2\u009a\u009b\7a\2\2\u009b\u009c\7c\2\2\u009c\u009d\7n\2\2\u009d"+
		"\u009e\7i\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7k\2\2"+
		"\u00a1\u00a2\7v\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7q\2\2\u00a4\6\3\2"+
		"\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9"+
		"\7n\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\b\3\2\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7q\2\2\u00af\u00b0\7p\2\2\u00b0"+
		"\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7p\2\2"+
		"\u00b4\u00b5\7v\2\2\u00b5\u00b6\7g\2\2\u00b6\n\3\2\2\2\u00b7\u00b8\7v"+
		"\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7r\2\2\u00ba\u00bb\7q\2\2\u00bb\f"+
		"\3\2\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2"+
		"\u00c3\16\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7"+
		"v\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb"+
		"\7q\2\2\u00cb\20\3\2\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7i\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7e\2\2\u00d6"+
		"\u00d7\7q\2\2\u00d7\24\3\2\2\2\u00d8\u00d9\7x\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7t\2\2\u00db\u00dc\7f\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7f\2\2"+
		"\u00de\u00df\7g\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2"+
		"\7q\2\2\u00e2\26\3\2\2\2\u00e3\u00e4\7h\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7n\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8\7q\2\2\u00e8\30\3\2\2\2\u00e9\u00ea"+
		"\7t\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed\7k\2\2\u00ed"+
		"\u00ee\7u\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7q\2\2"+
		"\u00f1\32\3\2\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7"+
		"o\2\2\u00f5\u00f6\7a\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9"+
		"\7i\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		"\u00fd\7t\2\2\u00fd\u00fe\7q\2\2\u00fe\34\3\2\2\2\u00ff\u0100\7r\2\2\u0100"+
		"\u0101\7t\2\2\u0101\u0102\7q\2\2\u0102\u0103\7e\2\2\u0103\u0104\7g\2\2"+
		"\u0104\u0105\7f\2\2\u0105\u0106\7k\2\2\u0106\u0107\7o\2\2\u0107\u0108"+
		"\7g\2\2\u0108\u0109\7p\2\2\u0109\u010a\7v\2\2\u010a\u010b\7q\2\2\u010b"+
		"\36\3\2\2\2\u010c\u010d\7h\2\2\u010d\u010e\7k\2\2\u010e\u010f\7o\2\2\u010f"+
		"\u0110\7a\2\2\u0110\u0111\7r\2\2\u0111\u0112\7t\2\2\u0112\u0113\7q\2\2"+
		"\u0113\u0114\7e\2\2\u0114\u0115\7g\2\2\u0115\u0116\7f\2\2\u0116\u0117"+
		"\7k\2\2\u0117\u0118\7o\2\2\u0118\u0119\7g\2\2\u0119\u011a\7p\2\2\u011a"+
		"\u011b\7v\2\2\u011b\u011c\7q\2\2\u011c \3\2\2\2\u011d\u011e\7h\2\2\u011e"+
		"\u011f\7w\2\2\u011f\u0120\7p\2\2\u0120\u0121\7e\2\2\u0121\u0122\7c\2\2"+
		"\u0122\u0123\7q\2\2\u0123\"\3\2\2\2\u0124\u0125\7h\2\2\u0125\u0126\7k"+
		"\2\2\u0126\u0127\7o\2\2\u0127\u0128\7a\2\2\u0128\u0129\7h\2\2\u0129\u012a"+
		"\7w\2\2\u012a\u012b\7p\2\2\u012b\u012c\7e\2\2\u012c\u012d\7c\2\2\u012d"+
		"\u012e\7q\2\2\u012e$\3\2\2\2\u012f\u0130\7x\2\2\u0130\u0131\7c\2\2\u0131"+
		"\u0132\7t\2\2\u0132&\3\2\2\2\u0133\u0134\7n\2\2\u0134\u0135\7g\2\2\u0135"+
		"\u0136\7k\2\2\u0136\u0137\7c\2\2\u0137(\3\2\2\2\u0138\u0139\7g\2\2\u0139"+
		"\u013a\7u\2\2\u013a\u013b\7e\2\2\u013b\u013c\7t\2\2\u013c\u013d\7g\2\2"+
		"\u013d\u013e\7x\2\2\u013e\u013f\7c\2\2\u013f*\3\2\2\2\u0140\u0141\7u\2"+
		"\2\u0141\u0142\7g\2\2\u0142,\3\2\2\2\u0143\u0144\7g\2\2\u0144\u0145\7"+
		"p\2\2\u0145\u0146\7v\2\2\u0146\u0147\7c\2\2\u0147\u0148\7q\2\2\u0148."+
		"\3\2\2\2\u0149\u014a\7u\2\2\u014a\u014b\7g\2\2\u014b\u014c\7p\2\2\u014c"+
		"\u014d\7c\2\2\u014d\u014e\7q\2\2\u014e\60\3\2\2\2\u014f\u0150\7h\2\2\u0150"+
		"\u0151\7k\2\2\u0151\u0152\7o\2\2\u0152\u0153\7a\2\2\u0153\u0154\7u\2\2"+
		"\u0154\u0155\7g\2\2\u0155\62\3\2\2\2\u0156\u0157\7e\2\2\u0157\u0158\7"+
		"c\2\2\u0158\u0159\7u\2\2\u0159\u015a\7q\2\2\u015a\64\3\2\2\2\u015b\u015c"+
		"\7u\2\2\u015c\u015d\7g\2\2\u015d\u015e\7l\2\2\u015e\u015f\7c\2\2\u015f"+
		"\66\3\2\2\2\u0160\u0161\7h\2\2\u0161\u0162\7k\2\2\u0162\u0163\7o\2\2\u0163"+
		"\u0164\7a\2\2\u0164\u0165\7e\2\2\u0165\u0166\7c\2\2\u0166\u0167\7u\2\2"+
		"\u0167\u0168\7q\2\2\u01688\3\2\2\2\u0169\u016a\7r\2\2\u016a\u016b\7c\2"+
		"\2\u016b\u016c\7t\2\2\u016c\u016d\7c\2\2\u016d:\3\2\2\2\u016e\u016f\7"+
		">\2\2\u016f\u0170\7/\2\2\u0170<\3\2\2\2\u0171\u0172\7c\2\2\u0172\u0173"+
		"\7v\2\2\u0173\u0174\7g\2\2\u0174>\3\2\2\2\u0175\u0176\7h\2\2\u0176\u0177"+
		"\7c\2\2\u0177\u0178\7e\2\2\u0178\u0179\7c\2\2\u0179@\3\2\2\2\u017a\u017b"+
		"\7h\2\2\u017b\u017c\7k\2\2\u017c\u017d\7o\2\2\u017d\u017e\7a\2\2\u017e"+
		"\u017f\7r\2\2\u017f\u0180\7c\2\2\u0180\u0181\7t\2\2\u0181\u0182\7c\2\2"+
		"\u0182B\3\2\2\2\u0183\u0184\7g\2\2\u0184\u0185\7p\2\2\u0185\u0186\7s\2"+
		"\2\u0186\u0187\7w\2\2\u0187\u0188\7c\2\2\u0188\u0189\7p\2\2\u0189\u018a"+
		"\7v\2\2\u018a\u018b\7q\2\2\u018bD\3\2\2\2\u018c\u018d\7h\2\2\u018d\u018e"+
		"\7k\2\2\u018e\u018f\7o\2\2\u018f\u0190\7a\2\2\u0190\u0191\7g\2\2\u0191"+
		"\u0192\7p\2\2\u0192\u0193\7s\2\2\u0193\u0194\7w\2\2\u0194\u0195\7c\2\2"+
		"\u0195\u0196\7p\2\2\u0196\u0197\7v\2\2\u0197\u0198\7q\2\2\u0198F\3\2\2"+
		"\2\u0199\u019a\7t\2\2\u019a\u019b\7g\2\2\u019b\u019c\7v\2\2\u019c\u019d"+
		"\7q\2\2\u019d\u019e\7t\2\2\u019e\u019f\7p\2\2\u019f\u01a0\7g\2\2\u01a0"+
		"H\3\2\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7q\2\2\u01a4"+
		"J\3\2\2\2\u01a5\u01a6\7\60\2\2\u01a6\u01a7\7\60\2\2\u01a7L\3\2\2\2\u01a8"+
		"\u01a9\7<\2\2\u01a9N\3\2\2\2\u01aa\u01ab\7-\2\2\u01abP\3\2\2\2\u01ac\u01ad"+
		"\7/\2\2\u01adR\3\2\2\2\u01ae\u01af\7,\2\2\u01afT\3\2\2\2\u01b0\u01b1\7"+
		"\61\2\2\u01b1V\3\2\2\2\u01b2\u01b3\7\'\2\2\u01b3X\3\2\2\2\u01b4\u01b5"+
		"\7(\2\2\u01b5Z\3\2\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8\7w\2\2\u01b8\\\3"+
		"\2\2\2\u01b9\u01ba\7g\2\2\u01ba^\3\2\2\2\u01bb\u01bc\7@\2\2\u01bc`\3\2"+
		"\2\2\u01bd\u01be\7>\2\2\u01beb\3\2\2\2\u01bf\u01c0\7@\2\2\u01c0\u01c1"+
		"\7?\2\2\u01c1d\3\2\2\2\u01c2\u01c3\7>\2\2\u01c3\u01c4\7?\2\2\u01c4f\3"+
		"\2\2\2\u01c5\u01c6\7>\2\2\u01c6\u01c7\7@\2\2\u01c7h\3\2\2\2\u01c8\u01c9"+
		"\7?\2\2\u01c9j\3\2\2\2\u01ca\u01cb\7*\2\2\u01cbl\3\2\2\2\u01cc\u01cd\7"+
		"+\2\2\u01cdn\3\2\2\2\u01ce\u01cf\7.\2\2\u01cfp\3\2\2\2\u01d0\u01d1\7\60"+
		"\2\2\u01d1r\3\2\2\2\u01d2\u01d3\7]\2\2\u01d3t\3\2\2\2\u01d4\u01d5\7_\2"+
		"\2\u01d5v\3\2\2\2\u01d6\u01d7\7`\2\2\u01d7x\3\2\2\2\u01d8\u01dc\t\2\2"+
		"\2\u01d9\u01db\t\3\2\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01ddz\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e0\7^\2\2\u01e0\u01e1\7$\2\2\u01e1|\3\2\2\2\u01e2\u01e7\7$\2\2\u01e3"+
		"\u01e6\5{>\2\u01e4\u01e6\n\4\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e4\3\2\2"+
		"\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea"+
		"\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\7$\2\2\u01eb~\3\2\2\2\u01ec\u01f1"+
		"\7$\2\2\u01ed\u01f0\5{>\2\u01ee\u01f0\n\5\2\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\7\f\2\2\u01f5"+
		"\u0080\3\2\2\2\u01f6\u01fa\7}\2\2\u01f7\u01f9\n\6\2\2\u01f8\u01f7\3\2"+
		"\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01fd\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u01fe\7\177\2\2\u01fe\u01ff\3"+
		"\2\2\2\u01ff\u0200\bA\2\2\u0200\u0082\3\2\2\2\u0201\u0205\7}\2\2\u0202"+
		"\u0204\n\6\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208"+
		"\u0209\7\f\2\2\u0209\u0084\3\2\2\2\u020a\u020c\4\62;\2\u020b\u020a\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u0086\3\2\2\2\u020f\u0211\4\62;\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u021a\3\2\2\2\u0214"+
		"\u0216\7\60\2\2\u0215\u0217\4\62;\2\u0216\u0215\3\2\2\2\u0217\u0218\3"+
		"\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a"+
		"\u0214\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0088\3\2\2\2\u021c\u021d\t\7"+
		"\2\2\u021d\u021e\bE\3\2\u021e\u008a\3\2\2\2\u021f\u0220\13\2\2\2\u0220"+
		"\u008c\3\2\2\2\16\2\u01dc\u01e5\u01e7\u01ef\u01f1\u01fa\u0205\u020d\u0212"+
		"\u0218\u021a\4\b\2\2\3E\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}