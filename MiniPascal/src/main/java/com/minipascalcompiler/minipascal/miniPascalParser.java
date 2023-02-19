// Generated from java-escape by ANTLR 4.11.1

    package com.minipascalcompiler.minipascal;
    import com.minipascalcompiler.minipascal.tablaSimbolos;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class miniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IF=4, THEN=5, ELSE=6, WHILE=7, DO=8, BEGIN=9, 
		END=10, REPEAT=11, UNTIL=12, FOR=13, TO=14, VAR=15, PROGRAM=16, ASSIGN=17, 
		BOOL=18, OPREL=19, AND=20, OR=21, READ=22, WRITE=23, MULS=24, SUMS=25, 
		ID=26, NUM=27, CHAR=28, CONSTSTR=29, MULTICOMMENT=30, SINGLECOMMENT=31, 
		SPACE=32, SEMICOLON=33, COLON=34, COMMA=35, DOT=36, LPAREN=37, RPAREN=38;
	public static final int
		RULE_type = 0, RULE_assign = 1, RULE_prog = 2, RULE_header = 3, RULE_sentence = 4, 
		RULE_sentence_t = 5, RULE_sentenceUnica = 6, RULE_read = 7, RULE_write = 8, 
		RULE_op = 9, RULE_op_t = 10, RULE_op_f = 11, RULE_exp = 12, RULE_exp_t = 13, 
		RULE_exp_f = 14, RULE_bwhile = 15, RULE_bif = 16, RULE_bbif = 17, RULE_belse = 18, 
		RULE_repeat = 19, RULE_bfor = 20, RULE_var = 21, RULE_vars = 22, RULE_bid = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "assign", "prog", "header", "sentence", "sentence_t", "sentenceUnica", 
			"read", "write", "op", "op_t", "op_f", "exp", "exp_t", "exp_f", "bwhile", 
			"bif", "bbif", "belse", "repeat", "bfor", "var", "vars", "bid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'integer'", "'char'", "'boolean'", "'if'", "'then'", "'else'", 
			"'while'", "'do'", "'begin'", "'end'", "'repeat'", "'until'", "'for'", 
			"'to'", "'var'", "'program'", "':='", null, null, "'and'", "'or'", "'read'", 
			"'write'", null, null, null, null, null, null, null, null, null, "';'", 
			"':'", "','", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IF", "THEN", "ELSE", "WHILE", "DO", "BEGIN", 
			"END", "REPEAT", "UNTIL", "FOR", "TO", "VAR", "PROGRAM", "ASSIGN", "BOOL", 
			"OPREL", "AND", "OR", "READ", "WRITE", "MULS", "SUMS", "ID", "NUM", "CHAR", 
			"CONSTSTR", "MULTICOMMENT", "SINGLECOMMENT", "SPACE", "SEMICOLON", "COLON", 
			"COMMA", "DOT", "LPAREN", "RPAREN"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegertypeContext extends TypeContext {
		public IntegertypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterIntegertype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitIntegertype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitIntegertype(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleantypeContext extends TypeContext {
		public BooleantypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterBooleantype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitBooleantype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitBooleantype(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChartypeContext extends TypeContext {
		public ChartypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterChartype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitChartype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitChartype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new IntegertypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new ChartypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new BooleantypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miniPascalParser.ASSIGN, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ID);
			setState(54);
			match(ASSIGN);
			setState(55);
			op(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(miniPascalParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			header();
			setState(58);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(miniPascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(miniPascalParser.SEMICOLON, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public TerminalNode DOT() { return getToken(miniPascalParser.DOT, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(PROGRAM);
			setState(61);
			match(ID);
			setState(62);
			match(SEMICOLON);
			setState(63);
			var();
			setState(64);
			match(BEGIN);
			setState(65);
			sentence();
			setState(66);
			match(END);
			setState(67);
			match(DOT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	 
		public SentenceContext() { }
		public void copyFrom(SentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Sentence_primeroContext extends SentenceContext {
		public List<Sentence_tContext> sentence_t() {
			return getRuleContexts(Sentence_tContext.class);
		}
		public Sentence_tContext sentence_t(int i) {
			return getRuleContext(Sentence_tContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(miniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(miniPascalParser.SEMICOLON, i);
		}
		public Sentence_primeroContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterSentence_primero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitSentence_primero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitSentence_primero(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SentencesincomaContext extends SentenceContext {
		public Sentence_tContext sentence_t() {
			return getRuleContext(Sentence_tContext.class,0);
		}
		public SentencesincomaContext(SentenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterSentencesincoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitSentencesincoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitSentencesincoma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Sentence_primeroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 79702160L) != 0) {
					{
					{
					setState(69);
					sentence_t();
					setState(70);
					match(SEMICOLON);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new SentencesincomaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				sentence_t();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Sentence_tContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public BifContext bif() {
			return getRuleContext(BifContext.class,0);
		}
		public BwhileContext bwhile() {
			return getRuleContext(BwhileContext.class,0);
		}
		public BforContext bfor() {
			return getRuleContext(BforContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Sentence_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterSentence_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitSentence_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitSentence_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentence_tContext sentence_t() throws RecognitionException {
		Sentence_tContext _localctx = new Sentence_tContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentence_t);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				read();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				write();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				bif();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				bwhile();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				bfor();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				repeat();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				assign();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceUnicaContext extends ParserRuleContext {
		public Sentence_tContext sentence_t() {
			return getRuleContext(Sentence_tContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(miniPascalParser.SEMICOLON, 0); }
		public SentenceUnicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenceUnica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterSentenceUnica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitSentenceUnica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitSentenceUnica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceUnicaContext sentenceUnica() throws RecognitionException {
		SentenceUnicaContext _localctx = new SentenceUnicaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentenceUnica);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				sentence_t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				sentence_t();
				setState(91);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(miniPascalParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(miniPascalParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(miniPascalParser.RPAREN, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(READ);
			setState(96);
			match(LPAREN);
			setState(97);
			match(ID);
			setState(98);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(miniPascalParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(miniPascalParser.LPAREN, 0); }
		public TerminalNode CONSTSTR() { return getToken(miniPascalParser.CONSTSTR, 0); }
		public TerminalNode COMMA() { return getToken(miniPascalParser.COMMA, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniPascalParser.RPAREN, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_write);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(WRITE);
				setState(101);
				match(LPAREN);
				setState(102);
				match(CONSTSTR);
				setState(103);
				match(COMMA);
				setState(104);
				op(0);
				setState(105);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(WRITE);
				setState(108);
				match(LPAREN);
				setState(109);
				match(CONSTSTR);
				setState(110);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public Op_tContext op_t() {
			return getRuleContext(Op_tContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode SUMS() { return getToken(miniPascalParser.SUMS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		return op(0);
	}

	private OpContext op(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OpContext _localctx = new OpContext(_ctx, _parentState);
		OpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_op, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			op_t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op);
					setState(116);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(117);
					match(SUMS);
					setState(118);
					op_t(0);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_tContext extends ParserRuleContext {
		public Op_fContext op_f() {
			return getRuleContext(Op_fContext.class,0);
		}
		public Op_tContext op_t() {
			return getRuleContext(Op_tContext.class,0);
		}
		public TerminalNode MULS() { return getToken(miniPascalParser.MULS, 0); }
		public Op_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterOp_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitOp_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitOp_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_tContext op_t() throws RecognitionException {
		return op_t(0);
	}

	private Op_tContext op_t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_tContext _localctx = new Op_tContext(_ctx, _parentState);
		Op_tContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_op_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			op_f();
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_tContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_t);
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					match(MULS);
					setState(129);
					op_f();
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Op_fContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(miniPascalParser.LPAREN, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniPascalParser.RPAREN, 0); }
		public TerminalNode SUMS() { return getToken(miniPascalParser.SUMS, 0); }
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode NUM() { return getToken(miniPascalParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(miniPascalParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(miniPascalParser.CHAR, 0); }
		public Op_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterOp_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitOp_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitOp_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_fContext op_f() throws RecognitionException {
		Op_fContext _localctx = new Op_fContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_f);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(LPAREN);
				setState(136);
				op(0);
				setState(137);
				match(RPAREN);
				}
				break;
			case SUMS:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(SUMS);
				setState(140);
				op(0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(NUM);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(BOOL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(CHAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public Exp_tContext exp_t() {
			return getRuleContext(Exp_tContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OR() { return getToken(miniPascalParser.OR, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(148);
			exp_t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(150);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(151);
					match(OR);
					setState(152);
					exp_t(0);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_tContext extends ParserRuleContext {
		public Exp_fContext exp_f() {
			return getRuleContext(Exp_fContext.class,0);
		}
		public Exp_tContext exp_t() {
			return getRuleContext(Exp_tContext.class,0);
		}
		public TerminalNode AND() { return getToken(miniPascalParser.AND, 0); }
		public Exp_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterExp_t(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitExp_t(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitExp_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_tContext exp_t() throws RecognitionException {
		return exp_t(0);
	}

	private Exp_tContext exp_t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_tContext _localctx = new Exp_tContext(_ctx, _parentState);
		Exp_tContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159);
			exp_f();
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_tContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_t);
					setState(161);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(162);
					match(AND);
					setState(163);
					exp_f();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_fContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(miniPascalParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniPascalParser.RPAREN, 0); }
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(miniPascalParser.OPREL, 0); }
		public Exp_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterExp_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitExp_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitExp_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_fContext exp_f() throws RecognitionException {
		Exp_fContext _localctx = new Exp_fContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp_f);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(LPAREN);
				setState(170);
				exp(0);
				setState(171);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				op(0);
				setState(174);
				match(OPREL);
				setState(175);
				op(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				op(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(miniPascalParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(miniPascalParser.THEN, 0); }
		public SentenceUnicaContext sentenceUnica() {
			return getRuleContext(SentenceUnicaContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public BwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterBwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitBwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitBwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BwhileContext bwhile() throws RecognitionException {
		BwhileContext _localctx = new BwhileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bwhile);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(WHILE);
				setState(181);
				exp(0);
				setState(182);
				match(THEN);
				setState(183);
				sentenceUnica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(WHILE);
				setState(186);
				exp(0);
				setState(187);
				match(THEN);
				setState(188);
				match(BEGIN);
				setState(189);
				sentence();
				setState(190);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BifContext extends ParserRuleContext {
		public BbifContext bbif() {
			return getRuleContext(BbifContext.class,0);
		}
		public BelseContext belse() {
			return getRuleContext(BelseContext.class,0);
		}
		public BifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterBif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitBif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitBif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BifContext bif() throws RecognitionException {
		BifContext _localctx = new BifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bif);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				bbif();
				setState(195);
				belse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				bbif();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BbifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miniPascalParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(miniPascalParser.THEN, 0); }
		public SentenceUnicaContext sentenceUnica() {
			return getRuleContext(SentenceUnicaContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public BbifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterBbif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitBbif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitBbif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BbifContext bbif() throws RecognitionException {
		BbifContext _localctx = new BbifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bbif);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(IF);
				setState(201);
				exp(0);
				setState(202);
				match(THEN);
				setState(203);
				sentenceUnica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(IF);
				setState(206);
				exp(0);
				setState(207);
				match(THEN);
				setState(208);
				match(BEGIN);
				setState(209);
				sentence();
				setState(210);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BelseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(miniPascalParser.ELSE, 0); }
		public SentenceUnicaContext sentenceUnica() {
			return getRuleContext(SentenceUnicaContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public BelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterBelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitBelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitBelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BelseContext belse() throws RecognitionException {
		BelseContext _localctx = new BelseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_belse);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ELSE);
				setState(215);
				sentenceUnica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(ELSE);
				setState(217);
				match(BEGIN);
				setState(218);
				sentence();
				setState(219);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(miniPascalParser.REPEAT, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(miniPascalParser.UNTIL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(REPEAT);
			setState(224);
			sentence();
			setState(225);
			match(UNTIL);
			setState(226);
			exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(miniPascalParser.FOR, 0); }
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miniPascalParser.ASSIGN, 0); }
		public List<TerminalNode> NUM() { return getTokens(miniPascalParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(miniPascalParser.NUM, i);
		}
		public TerminalNode TO() { return getToken(miniPascalParser.TO, 0); }
		public TerminalNode DO() { return getToken(miniPascalParser.DO, 0); }
		public SentenceUnicaContext sentenceUnica() {
			return getRuleContext(SentenceUnicaContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public BforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterBfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitBfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitBfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BforContext bfor() throws RecognitionException {
		BforContext _localctx = new BforContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bfor);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(FOR);
				setState(229);
				match(ID);
				setState(230);
				match(ASSIGN);
				setState(231);
				match(NUM);
				setState(232);
				match(TO);
				setState(233);
				match(NUM);
				setState(234);
				match(DO);
				setState(235);
				sentenceUnica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(FOR);
				setState(237);
				match(ID);
				setState(238);
				match(ASSIGN);
				setState(239);
				match(NUM);
				setState(240);
				match(TO);
				setState(241);
				match(NUM);
				setState(242);
				match(DO);
				setState(243);
				match(BEGIN);
				setState(244);
				sentence();
				setState(245);
				match(END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniPascalParser.VAR, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(VAR);
			setState(250);
			vars();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarsContext extends ParserRuleContext {
		public BidContext bid() {
			return getRuleContext(BidContext.class,0);
		}
		public TerminalNode COLON() { return getToken(miniPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(miniPascalParser.SEMICOLON, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_vars);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				bid();
				setState(253);
				match(COLON);
				setState(254);
				type();
				setState(255);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				bid();
				setState(258);
				match(COLON);
				setState(259);
				type();
				setState(260);
				match(SEMICOLON);
				setState(261);
				vars();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(miniPascalParser.COMMA, 0); }
		public BidContext bid() {
			return getRuleContext(BidContext.class,0);
		}
		public BidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).enterBid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniPascalListener ) ((miniPascalListener)listener).exitBid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniPascalVisitor ) return ((miniPascalVisitor<? extends T>)visitor).visitBid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BidContext bid() throws RecognitionException {
		BidContext _localctx = new BidContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bid);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(ID);
				setState(266);
				match(COMMA);
				setState(267);
				bid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return op_sempred((OpContext)_localctx, predIndex);
		case 10:
			return op_t_sempred((Op_tContext)_localctx, predIndex);
		case 12:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 13:
			return exp_t_sempred((Exp_tContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean op_sempred(OpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_t_sempred(Op_tContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_t_sempred(Exp_tContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u0110\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u00004\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004I\b\u0004"+
		"\n\u0004\f\u0004L\t\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005X\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006^\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bp\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\tx\b\t\n\t\f\t{\t\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u0083\b\n\n\n\f\n\u0086\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0092\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u009a\b\f\n\f\f\f\u009d\t\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a5\b\r\n\r"+
		"\f\r\u00a8\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b3\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00c1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00c7\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00d5\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00de\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u00f8\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u0108\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u010e\b\u0017\u0001\u0017\u0000\u0004\u0012\u0014\u0018\u001a\u0018\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.\u0000\u0000\u0115\u00003\u0001\u0000\u0000\u0000\u0002"+
		"5\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006<\u0001"+
		"\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000"+
		"\f]\u0001\u0000\u0000\u0000\u000e_\u0001\u0000\u0000\u0000\u0010o\u0001"+
		"\u0000\u0000\u0000\u0012q\u0001\u0000\u0000\u0000\u0014|\u0001\u0000\u0000"+
		"\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000"+
		"\u0000\u001a\u009e\u0001\u0000\u0000\u0000\u001c\u00b2\u0001\u0000\u0000"+
		"\u0000\u001e\u00c0\u0001\u0000\u0000\u0000 \u00c6\u0001\u0000\u0000\u0000"+
		"\"\u00d4\u0001\u0000\u0000\u0000$\u00dd\u0001\u0000\u0000\u0000&\u00df"+
		"\u0001\u0000\u0000\u0000(\u00f7\u0001\u0000\u0000\u0000*\u00f9\u0001\u0000"+
		"\u0000\u0000,\u0107\u0001\u0000\u0000\u0000.\u010d\u0001\u0000\u0000\u0000"+
		"04\u0005\u0001\u0000\u000014\u0005\u0002\u0000\u000024\u0005\u0003\u0000"+
		"\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000"+
		"\u0000\u00004\u0001\u0001\u0000\u0000\u000056\u0005\u001a\u0000\u0000"+
		"67\u0005\u0011\u0000\u000078\u0003\u0012\t\u00008\u0003\u0001\u0000\u0000"+
		"\u00009:\u0003\u0006\u0003\u0000:;\u0005\u0000\u0000\u0001;\u0005\u0001"+
		"\u0000\u0000\u0000<=\u0005\u0010\u0000\u0000=>\u0005\u001a\u0000\u0000"+
		">?\u0005!\u0000\u0000?@\u0003*\u0015\u0000@A\u0005\t\u0000\u0000AB\u0003"+
		"\b\u0004\u0000BC\u0005\n\u0000\u0000CD\u0005$\u0000\u0000D\u0007\u0001"+
		"\u0000\u0000\u0000EF\u0003\n\u0005\u0000FG\u0005!\u0000\u0000GI\u0001"+
		"\u0000\u0000\u0000HE\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KO\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MO\u0003\n\u0005\u0000NJ\u0001\u0000\u0000"+
		"\u0000NM\u0001\u0000\u0000\u0000O\t\u0001\u0000\u0000\u0000PX\u0003\u000e"+
		"\u0007\u0000QX\u0003\u0010\b\u0000RX\u0003 \u0010\u0000SX\u0003\u001e"+
		"\u000f\u0000TX\u0003(\u0014\u0000UX\u0003&\u0013\u0000VX\u0003\u0002\u0001"+
		"\u0000WP\u0001\u0000\u0000\u0000WQ\u0001\u0000\u0000\u0000WR\u0001\u0000"+
		"\u0000\u0000WS\u0001\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X\u000b\u0001\u0000\u0000"+
		"\u0000Y^\u0003\n\u0005\u0000Z[\u0003\n\u0005\u0000[\\\u0005!\u0000\u0000"+
		"\\^\u0001\u0000\u0000\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000"+
		"\u0000^\r\u0001\u0000\u0000\u0000_`\u0005\u0016\u0000\u0000`a\u0005%\u0000"+
		"\u0000ab\u0005\u001a\u0000\u0000bc\u0005&\u0000\u0000c\u000f\u0001\u0000"+
		"\u0000\u0000de\u0005\u0017\u0000\u0000ef\u0005%\u0000\u0000fg\u0005\u001d"+
		"\u0000\u0000gh\u0005#\u0000\u0000hi\u0003\u0012\t\u0000ij\u0005&\u0000"+
		"\u0000jp\u0001\u0000\u0000\u0000kl\u0005\u0017\u0000\u0000lm\u0005%\u0000"+
		"\u0000mn\u0005\u001d\u0000\u0000np\u0005&\u0000\u0000od\u0001\u0000\u0000"+
		"\u0000ok\u0001\u0000\u0000\u0000p\u0011\u0001\u0000\u0000\u0000qr\u0006"+
		"\t\uffff\uffff\u0000rs\u0003\u0014\n\u0000sy\u0001\u0000\u0000\u0000t"+
		"u\n\u0002\u0000\u0000uv\u0005\u0019\u0000\u0000vx\u0003\u0014\n\u0000"+
		"wt\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z\u0013\u0001\u0000\u0000\u0000{y\u0001"+
		"\u0000\u0000\u0000|}\u0006\n\uffff\uffff\u0000}~\u0003\u0016\u000b\u0000"+
		"~\u0084\u0001\u0000\u0000\u0000\u007f\u0080\n\u0002\u0000\u0000\u0080"+
		"\u0081\u0005\u0018\u0000\u0000\u0081\u0083\u0003\u0016\u000b\u0000\u0082"+
		"\u007f\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0015\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005%\u0000\u0000\u0088\u0089\u0003\u0012\t\u0000\u0089\u008a"+
		"\u0005&\u0000\u0000\u008a\u0092\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"\u0019\u0000\u0000\u008c\u0092\u0003\u0012\t\u0000\u008d\u0092\u0005\u001a"+
		"\u0000\u0000\u008e\u0092\u0005\u001b\u0000\u0000\u008f\u0092\u0005\u0012"+
		"\u0000\u0000\u0090\u0092\u0005\u001c\u0000\u0000\u0091\u0087\u0001\u0000"+
		"\u0000\u0000\u0091\u008b\u0001\u0000\u0000\u0000\u0091\u008d\u0001\u0000"+
		"\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0017\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0006\f\uffff\uffff\u0000\u0094\u0095\u0003\u001a"+
		"\r\u0000\u0095\u009b\u0001\u0000\u0000\u0000\u0096\u0097\n\u0002\u0000"+
		"\u0000\u0097\u0098\u0005\u0015\u0000\u0000\u0098\u009a\u0003\u001a\r\u0000"+
		"\u0099\u0096\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u0019\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0006\r\uffff\uffff\u0000\u009f\u00a0\u0003\u001c\u000e\u0000"+
		"\u00a0\u00a6\u0001\u0000\u0000\u0000\u00a1\u00a2\n\u0002\u0000\u0000\u00a2"+
		"\u00a3\u0005\u0014\u0000\u0000\u00a3\u00a5\u0003\u001c\u000e\u0000\u00a4"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u001b\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0005%\u0000\u0000\u00aa\u00ab\u0003\u0018\f\u0000\u00ab\u00ac"+
		"\u0005&\u0000\u0000\u00ac\u00b3\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003"+
		"\u0012\t\u0000\u00ae\u00af\u0005\u0013\u0000\u0000\u00af\u00b0\u0003\u0012"+
		"\t\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00b3\u0003\u0012\t"+
		"\u0000\u00b2\u00a9\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u001d\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0005\u0007\u0000\u0000\u00b5\u00b6\u0003\u0018\f\u0000"+
		"\u00b6\u00b7\u0005\u0005\u0000\u0000\u00b7\u00b8\u0003\f\u0006\u0000\u00b8"+
		"\u00c1\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0007\u0000\u0000\u00ba"+
		"\u00bb\u0003\u0018\f\u0000\u00bb\u00bc\u0005\u0005\u0000\u0000\u00bc\u00bd"+
		"\u0005\t\u0000\u0000\u00bd\u00be\u0003\b\u0004\u0000\u00be\u00bf\u0005"+
		"\n\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00b4\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b9\u0001\u0000\u0000\u0000\u00c1\u001f\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0003\"\u0011\u0000\u00c3\u00c4\u0003$\u0012"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003\"\u0011\u0000"+
		"\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7!\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0004\u0000\u0000\u00c9"+
		"\u00ca\u0003\u0018\f\u0000\u00ca\u00cb\u0005\u0005\u0000\u0000\u00cb\u00cc"+
		"\u0003\f\u0006\u0000\u00cc\u00d5\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"\u0004\u0000\u0000\u00ce\u00cf\u0003\u0018\f\u0000\u00cf\u00d0\u0005\u0005"+
		"\u0000\u0000\u00d0\u00d1\u0005\t\u0000\u0000\u00d1\u00d2\u0003\b\u0004"+
		"\u0000\u00d2\u00d3\u0005\n\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d4\u00c8\u0001\u0000\u0000\u0000\u00d4\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d5#\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0006\u0000\u0000\u00d7"+
		"\u00de\u0003\f\u0006\u0000\u00d8\u00d9\u0005\u0006\u0000\u0000\u00d9\u00da"+
		"\u0005\t\u0000\u0000\u00da\u00db\u0003\b\u0004\u0000\u00db\u00dc\u0005"+
		"\n\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00d6\u0001\u0000"+
		"\u0000\u0000\u00dd\u00d8\u0001\u0000\u0000\u0000\u00de%\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0005\u000b\u0000\u0000\u00e0\u00e1\u0003\b\u0004\u0000"+
		"\u00e1\u00e2\u0005\f\u0000\u0000\u00e2\u00e3\u0003\u0018\f\u0000\u00e3"+
		"\'\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\r\u0000\u0000\u00e5\u00e6"+
		"\u0005\u001a\u0000\u0000\u00e6\u00e7\u0005\u0011\u0000\u0000\u00e7\u00e8"+
		"\u0005\u001b\u0000\u0000\u00e8\u00e9\u0005\u000e\u0000\u0000\u00e9\u00ea"+
		"\u0005\u001b\u0000\u0000\u00ea\u00eb\u0005\b\u0000\u0000\u00eb\u00f8\u0003"+
		"\f\u0006\u0000\u00ec\u00ed\u0005\r\u0000\u0000\u00ed\u00ee\u0005\u001a"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0011\u0000\u0000\u00ef\u00f0\u0005\u001b"+
		"\u0000\u0000\u00f0\u00f1\u0005\u000e\u0000\u0000\u00f1\u00f2\u0005\u001b"+
		"\u0000\u0000\u00f2\u00f3\u0005\b\u0000\u0000\u00f3\u00f4\u0005\t\u0000"+
		"\u0000\u00f4\u00f5\u0003\b\u0004\u0000\u00f5\u00f6\u0005\n\u0000\u0000"+
		"\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00e4\u0001\u0000\u0000\u0000"+
		"\u00f7\u00ec\u0001\u0000\u0000\u0000\u00f8)\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0005\u000f\u0000\u0000\u00fa\u00fb\u0003,\u0016\u0000\u00fb+\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0003.\u0017\u0000\u00fd\u00fe\u0005\""+
		"\u0000\u0000\u00fe\u00ff\u0003\u0000\u0000\u0000\u00ff\u0100\u0005!\u0000"+
		"\u0000\u0100\u0108\u0001\u0000\u0000\u0000\u0101\u0102\u0003.\u0017\u0000"+
		"\u0102\u0103\u0005\"\u0000\u0000\u0103\u0104\u0003\u0000\u0000\u0000\u0104"+
		"\u0105\u0005!\u0000\u0000\u0105\u0106\u0003,\u0016\u0000\u0106\u0108\u0001"+
		"\u0000\u0000\u0000\u0107\u00fc\u0001\u0000\u0000\u0000\u0107\u0101\u0001"+
		"\u0000\u0000\u0000\u0108-\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u001a"+
		"\u0000\u0000\u010a\u010b\u0005#\u0000\u0000\u010b\u010e\u0003.\u0017\u0000"+
		"\u010c\u010e\u0005\u001a\u0000\u0000\u010d\u0109\u0001\u0000\u0000\u0000"+
		"\u010d\u010c\u0001\u0000\u0000\u0000\u010e/\u0001\u0000\u0000\u0000\u0013"+
		"3JNW]oy\u0084\u0091\u009b\u00a6\u00b2\u00c0\u00c6\u00d4\u00dd\u00f7\u0107"+
		"\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}