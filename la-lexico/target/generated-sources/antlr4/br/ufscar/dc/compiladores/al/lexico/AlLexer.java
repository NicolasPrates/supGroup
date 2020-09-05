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
		PALAVRA_CHAVE=1, NUM_INT=2, NUM_REAL=3, IDENT=4, CADEIA=5, COMENTARIO=6, 
		WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "ESC_SEQ", 
			"COMENTARIO", "WS"
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
			null, "PALAVRA_CHAVE", "NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS"
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
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
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
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u010a"+
		"\n\2\3\3\6\3\u010d\n\3\r\3\16\3\u010e\3\4\6\4\u0112\n\4\r\4\16\4\u0113"+
		"\3\4\3\4\6\4\u0118\n\4\r\4\16\4\u0119\5\4\u011c\n\4\3\5\3\5\7\5\u0120"+
		"\n\5\f\5\16\5\u0123\13\5\3\6\3\6\3\6\7\6\u0128\n\6\f\6\16\6\u012b\13\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\b\u0134\n\b\f\b\16\b\u0137\13\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\t\3\2\n\6"+
		"\2\'(,-//\61\61\4\2@@gg\b\2*+..\60\60??]]__\5\2C\\aac|\6\2\62;C\\aac|"+
		"\4\2$$^^\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u0171\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3"+
		"\u0109\3\2\2\2\5\u010c\3\2\2\2\7\u0111\3\2\2\2\t\u011d\3\2\2\2\13\u0124"+
		"\3\2\2\2\r\u012e\3\2\2\2\17\u0131\3\2\2\2\21\u013c\3\2\2\2\23\24\7c\2"+
		"\2\24\25\7n\2\2\25\26\7i\2\2\26\27\7q\2\2\27\30\7t\2\2\30\31\7k\2\2\31"+
		"\32\7v\2\2\32\33\7o\2\2\33\u010a\7q\2\2\34\35\7h\2\2\35\36\7k\2\2\36\37"+
		"\7o\2\2\37 \7a\2\2 !\7c\2\2!\"\7n\2\2\"#\7i\2\2#$\7q\2\2$%\7t\2\2%&\7"+
		"k\2\2&\'\7v\2\2\'(\7o\2\2(\u010a\7q\2\2)*\7x\2\2*+\7c\2\2+\u010a\7t\2"+
		"\2,-\7f\2\2-.\7g\2\2./\7e\2\2/\60\7n\2\2\60\61\7c\2\2\61\62\7t\2\2\62"+
		"\u010a\7g\2\2\63\64\7g\2\2\64\65\7u\2\2\65\66\7e\2\2\66\67\7t\2\2\678"+
		"\7g\2\289\7x\2\29\u010a\7c\2\2:\u010a\7<\2\2;<\7h\2\2<=\7w\2\2=>\7p\2"+
		"\2>?\7e\2\2?@\7c\2\2@\u010a\7q\2\2AB\7h\2\2BC\7k\2\2CD\7o\2\2DE\7a\2\2"+
		"EF\7h\2\2FG\7w\2\2GH\7p\2\2HI\7e\2\2IJ\7c\2\2J\u010a\7q\2\2KL\7r\2\2L"+
		"M\7t\2\2MN\7q\2\2NO\7e\2\2OP\7g\2\2PQ\7f\2\2QR\7k\2\2RS\7o\2\2ST\7g\2"+
		"\2TU\7p\2\2UV\7v\2\2V\u010a\7q\2\2WX\7h\2\2XY\7k\2\2YZ\7o\2\2Z[\7a\2\2"+
		"[\\\7r\2\2\\]\7t\2\2]^\7q\2\2^_\7e\2\2_`\7g\2\2`a\7f\2\2ab\7k\2\2bc\7"+
		"o\2\2cd\7g\2\2de\7p\2\2ef\7v\2\2f\u010a\7q\2\2gh\7n\2\2hi\7k\2\2ij\7v"+
		"\2\2jk\7g\2\2kl\7t\2\2lm\7c\2\2m\u010a\7n\2\2no\7k\2\2op\7p\2\2pq\7v\2"+
		"\2qr\7g\2\2rs\7k\2\2st\7t\2\2t\u010a\7q\2\2uv\7t\2\2vw\7g\2\2wx\7c\2\2"+
		"x\u010a\7n\2\2yz\7n\2\2z{\7q\2\2{|\7i\2\2|}\7k\2\2}~\7e\2\2~\u010a\7q"+
		"\2\2\177\u0080\7e\2\2\u0080\u0081\7q\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7u\2\2\u0083\u0084\7v\2\2\u0084\u0085\7c\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u010a\7g\2\2\u0088\u0089\7x\2\2\u0089\u008a\7g\2\2"+
		"\u008a\u008b\7t\2\2\u008b\u008c\7f\2\2\u008c\u008d\7c\2\2\u008d\u008e"+
		"\7f\2\2\u008e\u008f\7g\2\2\u008f\u0090\7k\2\2\u0090\u0091\7t\2\2\u0091"+
		"\u010a\7q\2\2\u0092\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2"+
		"\u0095\u0096\7u\2\2\u0096\u010a\7q\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7g\2\2\u0099\u009a\7i\2\2\u009a\u009b\7k\2\2\u009b\u009c\7u\2\2\u009c"+
		"\u009d\7v\2\2\u009d\u009e\7t\2\2\u009e\u010a\7q\2\2\u009f\u00a0\7h\2\2"+
		"\u00a0\u00a1\7k\2\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7a\2\2\u00a3\u00a4"+
		"\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7i\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7t\2\2\u00aa\u010a\7q\2\2"+
		"\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7r\2\2\u00ae\u010a"+
		"\7q\2\2\u00af\u00b0\7n\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u010a\7c\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7e\2\2"+
		"\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7x\2\2\u00b9\u010a"+
		"\7c\2\2\u00ba\u00bb\7u\2\2\u00bb\u010a\7g\2\2\u00bc\u00bd\7g\2\2\u00bd"+
		"\u00be\7p\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7c\2\2\u00c0\u010a\7q\2\2"+
		"\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u010a\7q\2\2\u00c6\u00c7\7h\2\2\u00c7\u00c8\7k\2\2\u00c8"+
		"\u00c9\7o\2\2\u00c9\u00ca\7a\2\2\u00ca\u00cb\7u\2\2\u00cb\u010a\7g\2\2"+
		"\u00cc\u00cd\7e\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7u\2\2\u00cf\u010a"+
		"\7q\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7l\2\2\u00d3"+
		"\u010a\7c\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7o\2\2"+
		"\u00d7\u00d8\7a\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7c\2\2\u00da\u00db"+
		"\7u\2\2\u00db\u010a\7q\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de"+
		"\u00df\7v\2\2\u00df\u00e0\7q\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7p\2\2"+
		"\u00e2\u010a\7g\2\2\u00e3\u00e4\7r\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6"+
		"\7t\2\2\u00e6\u010a\7c\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\u010a\7g\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7e\2\2"+
		"\u00ed\u010a\7c\2\2\u00ee\u00ef\7h\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1"+
		"\7o\2\2\u00f1\u00f2\7a\2\2\u00f2\u00f3\7r\2\2\u00f3\u00f4\7c\2\2\u00f4"+
		"\u00f5\7t\2\2\u00f5\u010a\7c\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7v\2\2"+
		"\u00f8\u010a\7g\2\2\u00f9\u010a\t\2\2\2\u00fa\u00fb\7q\2\2\u00fb\u010a"+
		"\7w\2\2\u00fc\u010a\t\3\2\2\u00fd\u00fe\7@\2\2\u00fe\u010a\7?\2\2\u00ff"+
		"\u010a\7>\2\2\u0100\u0101\7>\2\2\u0101\u010a\7?\2\2\u0102\u0103\7>\2\2"+
		"\u0103\u010a\7@\2\2\u0104\u010a\t\4\2\2\u0105\u0106\7>\2\2\u0106\u010a"+
		"\7/\2\2\u0107\u0108\7/\2\2\u0108\u010a\7@\2\2\u0109\23\3\2\2\2\u0109\34"+
		"\3\2\2\2\u0109)\3\2\2\2\u0109,\3\2\2\2\u0109\63\3\2\2\2\u0109:\3\2\2\2"+
		"\u0109;\3\2\2\2\u0109A\3\2\2\2\u0109K\3\2\2\2\u0109W\3\2\2\2\u0109g\3"+
		"\2\2\2\u0109n\3\2\2\2\u0109u\3\2\2\2\u0109y\3\2\2\2\u0109\177\3\2\2\2"+
		"\u0109\u0088\3\2\2\2\u0109\u0092\3\2\2\2\u0109\u0097\3\2\2\2\u0109\u009f"+
		"\3\2\2\2\u0109\u00ab\3\2\2\2\u0109\u00af\3\2\2\2\u0109\u00b3\3\2\2\2\u0109"+
		"\u00ba\3\2\2\2\u0109\u00bc\3\2\2\2\u0109\u00c1\3\2\2\2\u0109\u00c6\3\2"+
		"\2\2\u0109\u00cc\3\2\2\2\u0109\u00d0\3\2\2\2\u0109\u00d4\3\2\2\2\u0109"+
		"\u00dc\3\2\2\2\u0109\u00e3\3\2\2\2\u0109\u00e7\3\2\2\2\u0109\u00ea\3\2"+
		"\2\2\u0109\u00ee\3\2\2\2\u0109\u00f6\3\2\2\2\u0109\u00f9\3\2\2\2\u0109"+
		"\u00fa\3\2\2\2\u0109\u00fc\3\2\2\2\u0109\u00fd\3\2\2\2\u0109\u00ff\3\2"+
		"\2\2\u0109\u0100\3\2\2\2\u0109\u0102\3\2\2\2\u0109\u0104\3\2\2\2\u0109"+
		"\u0105\3\2\2\2\u0109\u0107\3\2\2\2\u010a\4\3\2\2\2\u010b\u010d\4\62;\2"+
		"\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\6\3\2\2\2\u0110\u0112\4\62;\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u011b\3\2"+
		"\2\2\u0115\u0117\7\60\2\2\u0116\u0118\4\62;\2\u0117\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2"+
		"\2\2\u011b\u0115\3\2\2\2\u011b\u011c\3\2\2\2\u011c\b\3\2\2\2\u011d\u0121"+
		"\t\5\2\2\u011e\u0120\t\6\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\n\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0124\u0129\7$\2\2\u0125\u0128\5\r\7\2\u0126\u0128\n\7\2\2\u0127\u0125"+
		"\3\2\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7$"+
		"\2\2\u012d\f\3\2\2\2\u012e\u012f\7^\2\2\u012f\u0130\7$\2\2\u0130\16\3"+
		"\2\2\2\u0131\u0135\7}\2\2\u0132\u0134\n\b\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0138\u0139\7\177\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013b\b\b\2\2\u013b\20\3\2\2\2\u013c\u013d\t\t\2\2\u013d\u013e\b\t\3"+
		"\2\u013e\22\3\2\2\2\f\2\u0109\u010e\u0113\u0119\u011b\u0121\u0127\u0129"+
		"\u0135\4\b\2\2\3\t\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}