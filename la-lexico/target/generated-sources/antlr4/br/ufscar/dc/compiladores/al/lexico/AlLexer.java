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
		PALAVRA_CHAVE=1, IDENT=2, CADEIA=3, COMENTARIO=4, NUM_INT=5, NUM_REAL=6, 
		WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "IDENT", "ESC_SEQ", "CADEIA", "COMENTARIO", "NUM_INT", 
			"NUM_REAL", "WS"
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
			null, "PALAVRA_CHAVE", "IDENT", "CADEIA", "COMENTARIO", "NUM_INT", "NUM_REAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t\u014b\b\1\4\2\t"+
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
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u0116\n\2\3\3\3\3\7\3\u011a"+
		"\n\3\f\3\16\3\u011d\13\3\3\4\3\4\3\4\3\5\3\5\3\5\7\5\u0125\n\5\f\5\16"+
		"\5\u0128\13\5\3\5\3\5\3\6\3\6\7\6\u012e\n\6\f\6\16\6\u0131\13\6\3\6\3"+
		"\6\3\6\3\6\3\7\6\7\u0138\n\7\r\7\16\7\u0139\3\b\6\b\u013d\n\b\r\b\16\b"+
		"\u013e\3\b\3\b\6\b\u0143\n\b\r\b\16\b\u0144\5\b\u0147\n\b\3\t\3\t\3\t"+
		"\2\2\n\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21\t\3\2\n\b\2\'(,-//\61\61<<``\4"+
		"\2@@gg\b\2*+..\60\60??]]__\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\5\2\f\f\17"+
		"\17\177\177\5\2\13\f\17\17\"\"\2\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\u0115\3\2\2"+
		"\2\5\u0117\3\2\2\2\7\u011e\3\2\2\2\t\u0121\3\2\2\2\13\u012b\3\2\2\2\r"+
		"\u0137\3\2\2\2\17\u013c\3\2\2\2\21\u0148\3\2\2\2\23\24\7c\2\2\24\25\7"+
		"n\2\2\25\26\7i\2\2\26\27\7q\2\2\27\30\7t\2\2\30\31\7k\2\2\31\32\7v\2\2"+
		"\32\33\7o\2\2\33\u0116\7q\2\2\34\35\7h\2\2\35\36\7k\2\2\36\37\7o\2\2\37"+
		" \7a\2\2 !\7c\2\2!\"\7n\2\2\"#\7i\2\2#$\7q\2\2$%\7t\2\2%&\7k\2\2&\'\7"+
		"v\2\2\'(\7o\2\2(\u0116\7q\2\2)*\7f\2\2*+\7g\2\2+,\7e\2\2,-\7n\2\2-.\7"+
		"c\2\2./\7t\2\2/\u0116\7g\2\2\60\61\7e\2\2\61\62\7q\2\2\62\63\7p\2\2\63"+
		"\64\7u\2\2\64\65\7v\2\2\65\66\7c\2\2\66\67\7p\2\2\678\7v\2\28\u0116\7"+
		"g\2\29:\7v\2\2:;\7k\2\2;<\7r\2\2<\u0116\7q\2\2=>\7n\2\2>?\7k\2\2?@\7v"+
		"\2\2@A\7g\2\2AB\7t\2\2BC\7c\2\2C\u0116\7n\2\2DE\7k\2\2EF\7p\2\2FG\7v\2"+
		"\2GH\7g\2\2HI\7k\2\2IJ\7t\2\2J\u0116\7q\2\2KL\7t\2\2LM\7g\2\2MN\7c\2\2"+
		"N\u0116\7n\2\2OP\7n\2\2PQ\7q\2\2QR\7i\2\2RS\7k\2\2ST\7e\2\2T\u0116\7q"+
		"\2\2UV\7x\2\2VW\7g\2\2WX\7t\2\2XY\7f\2\2YZ\7c\2\2Z[\7f\2\2[\\\7g\2\2\\"+
		"]\7k\2\2]^\7t\2\2^\u0116\7q\2\2_`\7h\2\2`a\7c\2\2ab\7n\2\2bc\7u\2\2c\u0116"+
		"\7q\2\2de\7t\2\2ef\7g\2\2fg\7i\2\2gh\7k\2\2hi\7u\2\2ij\7v\2\2jk\7t\2\2"+
		"k\u0116\7q\2\2lm\7h\2\2mn\7k\2\2no\7o\2\2op\7a\2\2pq\7t\2\2qr\7g\2\2r"+
		"s\7i\2\2st\7k\2\2tu\7u\2\2uv\7v\2\2vw\7t\2\2w\u0116\7q\2\2xy\7r\2\2yz"+
		"\7t\2\2z{\7q\2\2{|\7e\2\2|}\7g\2\2}~\7f\2\2~\177\7k\2\2\177\u0080\7o\2"+
		"\2\u0080\u0081\7g\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\u0116"+
		"\7q\2\2\u0084\u0085\7h\2\2\u0085\u0086\7k\2\2\u0086\u0087\7o\2\2\u0087"+
		"\u0088\7a\2\2\u0088\u0089\7r\2\2\u0089\u008a\7t\2\2\u008a\u008b\7q\2\2"+
		"\u008b\u008c\7e\2\2\u008c\u008d\7g\2\2\u008d\u008e\7f\2\2\u008e\u008f"+
		"\7k\2\2\u008f\u0090\7o\2\2\u0090\u0091\7g\2\2\u0091\u0092\7p\2\2\u0092"+
		"\u0093\7v\2\2\u0093\u0116\7q\2\2\u0094\u0095\7h\2\2\u0095\u0096\7w\2\2"+
		"\u0096\u0097\7p\2\2\u0097\u0098\7e\2\2\u0098\u0099\7c\2\2\u0099\u0116"+
		"\7q\2\2\u009a\u009b\7h\2\2\u009b\u009c\7k\2\2\u009c\u009d\7o\2\2\u009d"+
		"\u009e\7a\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7p\2\2"+
		"\u00a1\u00a2\7e\2\2\u00a2\u00a3\7c\2\2\u00a3\u0116\7q\2\2\u00a4\u00a5"+
		"\7x\2\2\u00a5\u00a6\7c\2\2\u00a6\u0116\7t\2\2\u00a7\u00a8\7n\2\2\u00a8"+
		"\u00a9\7g\2\2\u00a9\u00aa\7k\2\2\u00aa\u0116\7c\2\2\u00ab\u00ac\7g\2\2"+
		"\u00ac\u00ad\7u\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7t\2\2\u00af\u00b0"+
		"\7g\2\2\u00b0\u00b1\7x\2\2\u00b1\u0116\7c\2\2\u00b2\u00b3\7u\2\2\u00b3"+
		"\u0116\7g\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7v\2\2"+
		"\u00b7\u00b8\7c\2\2\u00b8\u0116\7q\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb"+
		"\7g\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7c\2\2\u00bd\u0116\7q\2\2\u00be"+
		"\u00bf\7h\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7a\2\2"+
		"\u00c2\u00c3\7u\2\2\u00c3\u0116\7g\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6"+
		"\7c\2\2\u00c6\u00c7\7u\2\2\u00c7\u0116\7q\2\2\u00c8\u00c9\7u\2\2\u00c9"+
		"\u00ca\7g\2\2\u00ca\u00cb\7l\2\2\u00cb\u0116\7c\2\2\u00cc\u00cd\7h\2\2"+
		"\u00cd\u00ce\7k\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7a\2\2\u00d0\u00d1"+
		"\7e\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7u\2\2\u00d3\u0116\7q\2\2\u00d4"+
		"\u00d5\7r\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7t\2\2\u00d7\u0116\7c\2\2"+
		"\u00d8\u00d9\7>\2\2\u00d9\u0116\7/\2\2\u00da\u00db\7c\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u0116\7g\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7e\2\2\u00e0\u0116\7c\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7k\2\2"+
		"\u00e3\u00e4\7o\2\2\u00e4\u00e5\7a\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7"+
		"\7c\2\2\u00e7\u00e8\7t\2\2\u00e8\u0116\7c\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7p\2\2\u00eb\u00ec\7s\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7c\2\2"+
		"\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0\u0116\7q\2\2\u00f1\u00f2"+
		"\7h\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7o\2\2\u00f4\u00f5\7a\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7s\2\2\u00f8\u00f9\7w\2\2"+
		"\u00f9\u00fa\7c\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7v\2\2\u00fc\u0116"+
		"\7q\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7v\2\2\u0100"+
		"\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102\u0103\7p\2\2\u0103\u0116\7g\2\2"+
		"\u0104\u0105\7p\2\2\u0105\u0106\7c\2\2\u0106\u0116\7q\2\2\u0107\u0108"+
		"\7\60\2\2\u0108\u0116\7\60\2\2\u0109\u0116\t\2\2\2\u010a\u010b\7q\2\2"+
		"\u010b\u0116\7w\2\2\u010c\u0116\t\3\2\2\u010d\u010e\7@\2\2\u010e\u0116"+
		"\7?\2\2\u010f\u0116\7>\2\2\u0110\u0111\7>\2\2\u0111\u0116\7?\2\2\u0112"+
		"\u0113\7>\2\2\u0113\u0116\7@\2\2\u0114\u0116\t\4\2\2\u0115\23\3\2\2\2"+
		"\u0115\34\3\2\2\2\u0115)\3\2\2\2\u0115\60\3\2\2\2\u01159\3\2\2\2\u0115"+
		"=\3\2\2\2\u0115D\3\2\2\2\u0115K\3\2\2\2\u0115O\3\2\2\2\u0115U\3\2\2\2"+
		"\u0115_\3\2\2\2\u0115d\3\2\2\2\u0115l\3\2\2\2\u0115x\3\2\2\2\u0115\u0084"+
		"\3\2\2\2\u0115\u0094\3\2\2\2\u0115\u009a\3\2\2\2\u0115\u00a4\3\2\2\2\u0115"+
		"\u00a7\3\2\2\2\u0115\u00ab\3\2\2\2\u0115\u00b2\3\2\2\2\u0115\u00b4\3\2"+
		"\2\2\u0115\u00b9\3\2\2\2\u0115\u00be\3\2\2\2\u0115\u00c4\3\2\2\2\u0115"+
		"\u00c8\3\2\2\2\u0115\u00cc\3\2\2\2\u0115\u00d4\3\2\2\2\u0115\u00d8\3\2"+
		"\2\2\u0115\u00da\3\2\2\2\u0115\u00dd\3\2\2\2\u0115\u00e1\3\2\2\2\u0115"+
		"\u00e9\3\2\2\2\u0115\u00f1\3\2\2\2\u0115\u00fd\3\2\2\2\u0115\u0104\3\2"+
		"\2\2\u0115\u0107\3\2\2\2\u0115\u0109\3\2\2\2\u0115\u010a\3\2\2\2\u0115"+
		"\u010c\3\2\2\2\u0115\u010d\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0110\3\2"+
		"\2\2\u0115\u0112\3\2\2\2\u0115\u0114\3\2\2\2\u0116\4\3\2\2\2\u0117\u011b"+
		"\t\5\2\2\u0118\u011a\t\6\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\6\3\2\2\2\u011d\u011b\3\2\2\2"+
		"\u011e\u011f\7^\2\2\u011f\u0120\7$\2\2\u0120\b\3\2\2\2\u0121\u0126\7$"+
		"\2\2\u0122\u0125\5\7\4\2\u0123\u0125\n\7\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7$\2\2\u012a"+
		"\n\3\2\2\2\u012b\u012f\7}\2\2\u012c\u012e\n\b\2\2\u012d\u012c\3\2\2\2"+
		"\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\177\2\2\u0133\u0134\3\2\2\2"+
		"\u0134\u0135\b\6\2\2\u0135\f\3\2\2\2\u0136\u0138\4\62;\2\u0137\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\16\3\2\2\2\u013b\u013d\4\62;\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2"+
		"\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0146\3\2\2\2\u0140\u0142"+
		"\7\60\2\2\u0141\u0143\4\62;\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0140"+
		"\3\2\2\2\u0146\u0147\3\2\2\2\u0147\20\3\2\2\2\u0148\u0149\t\t\2\2\u0149"+
		"\u014a\b\t\3\2\u014a\22\3\2\2\2\f\2\u0115\u011b\u0124\u0126\u012f\u0139"+
		"\u013e\u0144\u0146\4\b\2\2\3\t\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}