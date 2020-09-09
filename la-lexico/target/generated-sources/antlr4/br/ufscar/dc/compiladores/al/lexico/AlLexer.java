// Generated from br/ufscar/dc/compiladores/al/lexico/AlLexer.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.al.lexico;
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
		PALAVRA_CHAVE=1, IDENT=2, CADEIA=3, CADEIA_NAO_FECHADA=4, COMENTARIO=5, 
		COMENTARIO_NAO_FECHADO=6, NUM_INT=7, NUM_REAL=8, WS=9, UNDEFINED_CHAR=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "IDENT", "ESC_SEQ", "CADEIA", "CADEIA_NAO_FECHADA", 
			"COMENTARIO", "COMENTARIO_NAO_FECHADO", "NUM_INT", "NUM_REAL", "WS", 
			"UNDEFINED_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "IDENT", "CADEIA", "CADEIA_NAO_FECHADA", "COMENTARIO", 
			"COMENTARIO_NAO_FECHADO", "NUM_INT", "NUM_REAL", "WS", "UNDEFINED_CHAR"
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
	public String getGrammarFileName() { return "AlLexer.g4"; }

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
		case 9:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u0166\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\u011c\n\2\3\3\3\3\7\3\u0120\n\3\f\3\16\3\u0123\13\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\7\5\u012b\n\5\f\5\16\5\u012e\13\5\3\5\3\5\3\6\3\6\3\6\7\6\u0135"+
		"\n\6\f\6\16\6\u0138\13\6\3\6\3\6\3\7\3\7\7\7\u013e\n\7\f\7\16\7\u0141"+
		"\13\7\3\7\3\7\3\7\3\7\3\b\3\b\7\b\u0149\n\b\f\b\16\b\u014c\13\b\3\b\3"+
		"\b\3\t\6\t\u0151\n\t\r\t\16\t\u0152\3\n\6\n\u0156\n\n\r\n\16\n\u0157\3"+
		"\n\3\n\6\n\u015c\n\n\r\n\16\n\u015d\5\n\u0160\n\n\3\13\3\13\3\13\3\f\3"+
		"\f\2\2\r\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\3\2\13\b\2"+
		"\'(,-//\61\61<<``\4\2@@gg\b\2*+..\60\60??]]__\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\4\2\f\f$$\3\2$$\5\2\f\f\17\17\177\177\5\2\13\f\17\17\"\"\2\u019b\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\u011b\3\2\2\2"+
		"\5\u011d\3\2\2\2\7\u0124\3\2\2\2\t\u0127\3\2\2\2\13\u0131\3\2\2\2\r\u013b"+
		"\3\2\2\2\17\u0146\3\2\2\2\21\u0150\3\2\2\2\23\u0155\3\2\2\2\25\u0161\3"+
		"\2\2\2\27\u0164\3\2\2\2\31\32\7c\2\2\32\33\7n\2\2\33\34\7i\2\2\34\35\7"+
		"q\2\2\35\36\7t\2\2\36\37\7k\2\2\37 \7v\2\2 !\7o\2\2!\u011c\7q\2\2\"#\7"+
		"h\2\2#$\7k\2\2$%\7o\2\2%&\7a\2\2&\'\7c\2\2\'(\7n\2\2()\7i\2\2)*\7q\2\2"+
		"*+\7t\2\2+,\7k\2\2,-\7v\2\2-.\7o\2\2.\u011c\7q\2\2/\60\7f\2\2\60\61\7"+
		"g\2\2\61\62\7e\2\2\62\63\7n\2\2\63\64\7c\2\2\64\65\7t\2\2\65\u011c\7g"+
		"\2\2\66\67\7e\2\2\678\7q\2\289\7p\2\29:\7u\2\2:;\7v\2\2;<\7c\2\2<=\7p"+
		"\2\2=>\7v\2\2>\u011c\7g\2\2?@\7v\2\2@A\7k\2\2AB\7r\2\2B\u011c\7q\2\2C"+
		"D\7n\2\2DE\7k\2\2EF\7v\2\2FG\7g\2\2GH\7t\2\2HI\7c\2\2I\u011c\7n\2\2JK"+
		"\7k\2\2KL\7p\2\2LM\7v\2\2MN\7g\2\2NO\7k\2\2OP\7t\2\2P\u011c\7q\2\2QR\7"+
		"t\2\2RS\7g\2\2ST\7c\2\2T\u011c\7n\2\2UV\7n\2\2VW\7q\2\2WX\7i\2\2XY\7k"+
		"\2\2YZ\7e\2\2Z\u011c\7q\2\2[\\\7x\2\2\\]\7g\2\2]^\7t\2\2^_\7f\2\2_`\7"+
		"c\2\2`a\7f\2\2ab\7g\2\2bc\7k\2\2cd\7t\2\2d\u011c\7q\2\2ef\7h\2\2fg\7c"+
		"\2\2gh\7n\2\2hi\7u\2\2i\u011c\7q\2\2jk\7t\2\2kl\7g\2\2lm\7i\2\2mn\7k\2"+
		"\2no\7u\2\2op\7v\2\2pq\7t\2\2q\u011c\7q\2\2rs\7h\2\2st\7k\2\2tu\7o\2\2"+
		"uv\7a\2\2vw\7t\2\2wx\7g\2\2xy\7i\2\2yz\7k\2\2z{\7u\2\2{|\7v\2\2|}\7t\2"+
		"\2}\u011c\7q\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7e\2\2\u0082\u0083\7g\2\2\u0083\u0084\7f\2\2\u0084\u0085\7k\2\2"+
		"\u0085\u0086\7o\2\2\u0086\u0087\7g\2\2\u0087\u0088\7p\2\2\u0088\u0089"+
		"\7v\2\2\u0089\u011c\7q\2\2\u008a\u008b\7h\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7o\2\2\u008d\u008e\7a\2\2\u008e\u008f\7r\2\2\u008f\u0090\7t\2\2"+
		"\u0090\u0091\7q\2\2\u0091\u0092\7e\2\2\u0092\u0093\7g\2\2\u0093\u0094"+
		"\7f\2\2\u0094\u0095\7k\2\2\u0095\u0096\7o\2\2\u0096\u0097\7g\2\2\u0097"+
		"\u0098\7p\2\2\u0098\u0099\7v\2\2\u0099\u011c\7q\2\2\u009a\u009b\7h\2\2"+
		"\u009b\u009c\7w\2\2\u009c\u009d\7p\2\2\u009d\u009e\7e\2\2\u009e\u009f"+
		"\7c\2\2\u009f\u011c\7q\2\2\u00a0\u00a1\7h\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7o\2\2\u00a3\u00a4\7a\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7w\2\2"+
		"\u00a6\u00a7\7p\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7c\2\2\u00a9\u011c"+
		"\7q\2\2\u00aa\u00ab\7x\2\2\u00ab\u00ac\7c\2\2\u00ac\u011c\7t\2\2\u00ad"+
		"\u00ae\7n\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7k\2\2\u00b0\u011c\7c\2\2"+
		"\u00b1\u00b2\7g\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5"+
		"\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7x\2\2\u00b7\u011c\7c\2\2\u00b8"+
		"\u00b9\7u\2\2\u00b9\u011c\7g\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7p\2\2"+
		"\u00bc\u00bd\7v\2\2\u00bd\u00be\7c\2\2\u00be\u011c\7q\2\2\u00bf\u00c0"+
		"\7u\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7c\2\2\u00c3"+
		"\u011c\7q\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7o\2\2"+
		"\u00c7\u00c8\7a\2\2\u00c8\u00c9\7u\2\2\u00c9\u011c\7g\2\2\u00ca\u00cb"+
		"\7e\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7u\2\2\u00cd\u011c\7q\2\2\u00ce"+
		"\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7l\2\2\u00d1\u011c\7c\2\2"+
		"\u00d2\u00d3\7h\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7o\2\2\u00d5\u00d6"+
		"\7a\2\2\u00d6\u00d7\7e\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7u\2\2\u00d9"+
		"\u011c\7q\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7t\2\2"+
		"\u00dd\u011c\7c\2\2\u00de\u00df\7>\2\2\u00df\u011c\7/\2\2\u00e0\u00e1"+
		"\7c\2\2\u00e1\u00e2\7v\2\2\u00e2\u011c\7g\2\2\u00e3\u00e4\7h\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7e\2\2\u00e6\u011c\7c\2\2\u00e7\u00e8\7h\2\2"+
		"\u00e8\u00e9\7k\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb\7a\2\2\u00eb\u00ec"+
		"\7r\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7t\2\2\u00ee\u011c\7c\2\2\u00ef"+
		"\u00f0\7g\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7s\2\2\u00f2\u00f3\7w\2\2"+
		"\u00f3\u00f4\7c\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7v\2\2\u00f6\u011c"+
		"\7q\2\2\u00f7\u00f8\7h\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7o\2\2\u00fa"+
		"\u00fb\7a\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7s\2\2"+
		"\u00fe\u00ff\7w\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7p\2\2\u0101\u0102"+
		"\7v\2\2\u0102\u011c\7q\2\2\u0103\u0104\7t\2\2\u0104\u0105\7g\2\2\u0105"+
		"\u0106\7v\2\2\u0106\u0107\7q\2\2\u0107\u0108\7t\2\2\u0108\u0109\7p\2\2"+
		"\u0109\u011c\7g\2\2\u010a\u010b\7p\2\2\u010b\u010c\7c\2\2\u010c\u011c"+
		"\7q\2\2\u010d\u010e\7\60\2\2\u010e\u011c\7\60\2\2\u010f\u011c\t\2\2\2"+
		"\u0110\u0111\7q\2\2\u0111\u011c\7w\2\2\u0112\u011c\t\3\2\2\u0113\u0114"+
		"\7@\2\2\u0114\u011c\7?\2\2\u0115\u011c\7>\2\2\u0116\u0117\7>\2\2\u0117"+
		"\u011c\7?\2\2\u0118\u0119\7>\2\2\u0119\u011c\7@\2\2\u011a\u011c\t\4\2"+
		"\2\u011b\31\3\2\2\2\u011b\"\3\2\2\2\u011b/\3\2\2\2\u011b\66\3\2\2\2\u011b"+
		"?\3\2\2\2\u011bC\3\2\2\2\u011bJ\3\2\2\2\u011bQ\3\2\2\2\u011bU\3\2\2\2"+
		"\u011b[\3\2\2\2\u011be\3\2\2\2\u011bj\3\2\2\2\u011br\3\2\2\2\u011b~\3"+
		"\2\2\2\u011b\u008a\3\2\2\2\u011b\u009a\3\2\2\2\u011b\u00a0\3\2\2\2\u011b"+
		"\u00aa\3\2\2\2\u011b\u00ad\3\2\2\2\u011b\u00b1\3\2\2\2\u011b\u00b8\3\2"+
		"\2\2\u011b\u00ba\3\2\2\2\u011b\u00bf\3\2\2\2\u011b\u00c4\3\2\2\2\u011b"+
		"\u00ca\3\2\2\2\u011b\u00ce\3\2\2\2\u011b\u00d2\3\2\2\2\u011b\u00da\3\2"+
		"\2\2\u011b\u00de\3\2\2\2\u011b\u00e0\3\2\2\2\u011b\u00e3\3\2\2\2\u011b"+
		"\u00e7\3\2\2\2\u011b\u00ef\3\2\2\2\u011b\u00f7\3\2\2\2\u011b\u0103\3\2"+
		"\2\2\u011b\u010a\3\2\2\2\u011b\u010d\3\2\2\2\u011b\u010f\3\2\2\2\u011b"+
		"\u0110\3\2\2\2\u011b\u0112\3\2\2\2\u011b\u0113\3\2\2\2\u011b\u0115\3\2"+
		"\2\2\u011b\u0116\3\2\2\2\u011b\u0118\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\4\3\2\2\2\u011d\u0121\t\5\2\2\u011e\u0120\t\6\2\2\u011f\u011e\3\2\2\2"+
		"\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\6\3"+
		"\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7^\2\2\u0125\u0126\7$\2\2\u0126"+
		"\b\3\2\2\2\u0127\u012c\7$\2\2\u0128\u012b\5\7\4\2\u0129\u012b\n\7\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f"+
		"\u0130\7$\2\2\u0130\n\3\2\2\2\u0131\u0136\7$\2\2\u0132\u0135\5\7\4\2\u0133"+
		"\u0135\n\b\2\2\u0134\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\7\f\2\2\u013a\f\3\2\2\2\u013b\u013f\7}\2\2"+
		"\u013c\u013e\n\t\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0143\7\177\2\2\u0143\u0144\3\2\2\2\u0144\u0145\b\7\2\2\u0145\16\3\2"+
		"\2\2\u0146\u014a\7}\2\2\u0147\u0149\n\t\2\2\u0148\u0147\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\f\2\2\u014e\20\3\2\2\2\u014f\u0151"+
		"\4\62;\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\22\3\2\2\2\u0154\u0156\4\62;\2\u0155\u0154\3\2\2"+
		"\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015f"+
		"\3\2\2\2\u0159\u015b\7\60\2\2\u015a\u015c\4\62;\2\u015b\u015a\3\2\2\2"+
		"\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160"+
		"\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u0160\3\2\2\2\u0160\24\3\2\2\2\u0161"+
		"\u0162\t\n\2\2\u0162\u0163\b\13\3\2\u0163\26\3\2\2\2\u0164\u0165\13\2"+
		"\2\2\u0165\30\3\2\2\2\17\2\u011b\u0121\u012a\u012c\u0134\u0136\u013f\u014a"+
		"\u0152\u0157\u015d\u015f\4\b\2\2\3\13\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}