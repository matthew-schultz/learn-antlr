// Generated from Chat.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ChatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SAYS=9, 
		SHOUTS=10, WORD=11, WHITESPACE=12, NEWLINE=13, TEXT=14, NUMBER=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "A", "S", 
		"Y", "H", "O", "U", "T", "LOWERCASE", "UPPERCASE", "SAYS", "SHOUTS", "WORD", 
		"WHITESPACE", "NEWLINE", "TEXT", "DIGIT", "NUMBER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "'-'", "')'", "'('", "'['", "']'", "'/'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "SAYS", "SHOUTS", 
		"WORD", "WHITESPACE", "NEWLINE", "TEXT", "NUMBER"
	};
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


	public ChatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chat.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\6\25g\n\25\r\25\16\25h\3\26\3\26\3\27\5"+
		"\27n\n\27\3\27\3\27\6\27r\n\27\r\27\16\27s\3\30\6\30w\n\30\r\30\16\30"+
		"x\3\31\3\31\3\32\6\32~\n\32\r\32\16\32\177\3\32\3\32\6\32\u0084\n\32\r"+
		"\32\16\32\u0085\5\32\u0088\n\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\13\'\f)\r+\16-\17/\20\61"+
		"\2\63\21\3\2\17\4\2CCcc\4\2UUuu\4\2[[{{\4\2JJjj\4\2QQqq\4\2WWww\4\2VV"+
		"vv\3\2c|\3\2C\\\4\2\"\"vv\4\2++__\3\2\62;\4\2..\60\60\2\u0088\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-"+
		"\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\79\3\2\2\2"+
		"\t;\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2"+
		"\25G\3\2\2\2\27I\3\2\2\2\31K\3\2\2\2\33M\3\2\2\2\35O\3\2\2\2\37Q\3\2\2"+
		"\2!S\3\2\2\2#U\3\2\2\2%W\3\2\2\2\'\\\3\2\2\2)f\3\2\2\2+j\3\2\2\2-q\3\2"+
		"\2\2/v\3\2\2\2\61z\3\2\2\2\63}\3\2\2\2\65\66\7<\2\2\66\4\3\2\2\2\678\7"+
		"/\2\28\6\3\2\2\29:\7+\2\2:\b\3\2\2\2;<\7*\2\2<\n\3\2\2\2=>\7]\2\2>\f\3"+
		"\2\2\2?@\7_\2\2@\16\3\2\2\2AB\7\61\2\2B\20\3\2\2\2CD\7B\2\2D\22\3\2\2"+
		"\2EF\t\2\2\2F\24\3\2\2\2GH\t\3\2\2H\26\3\2\2\2IJ\t\4\2\2J\30\3\2\2\2K"+
		"L\t\5\2\2L\32\3\2\2\2MN\t\6\2\2N\34\3\2\2\2OP\t\7\2\2P\36\3\2\2\2QR\t"+
		"\b\2\2R \3\2\2\2ST\t\t\2\2T\"\3\2\2\2UV\t\n\2\2V$\3\2\2\2WX\5\25\13\2"+
		"XY\5\23\n\2YZ\5\27\f\2Z[\5\25\13\2[&\3\2\2\2\\]\5\25\13\2]^\5\31\r\2^"+
		"_\5\33\16\2_`\5\35\17\2`a\5\37\20\2ab\5\25\13\2b(\3\2\2\2cg\5!\21\2dg"+
		"\5#\22\2eg\7a\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi"+
		"\3\2\2\2i*\3\2\2\2jk\t\13\2\2k,\3\2\2\2ln\7t\2\2ml\3\2\2\2mn\3\2\2\2n"+
		"o\3\2\2\2or\7p\2\2pr\7t\2\2qm\3\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st"+
		"\3\2\2\2t.\3\2\2\2uw\n\f\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y"+
		"\60\3\2\2\2z{\t\r\2\2{\62\3\2\2\2|~\5\61\31\2}|\3\2\2\2~\177\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0087\3\2\2\2\u0081\u0083\t\16\2\2\u0082"+
		"\u0084\5\61\31\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0081\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\64\3\2\2\2\f\2fhmqsx\177\u0085\u0087\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}