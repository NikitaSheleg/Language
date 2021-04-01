// Generated from C:/Users/User/Desktop/€пис/FirstAntlr/src/main/java/antlr\AntlrTest.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AntlrTestParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, PT=19, NUM=20, UNARY_OPERATOR_SIDE=21, MULTIPLICATION=22, DIV=23, 
		PLUS=24, MINUS=25, LOGIC=26, COMPARE=27, UNARY_OPERATOR=28, MAIN_FUNCTION_ID=29, 
		NAME=30, TYPE=31, WHITESPACE=32;
	public static final int
		RULE_dbl = 0, RULE_parameter = 1, RULE_expression = 2, RULE_identifier = 3, 
		RULE_function = 4, RULE_mainFunction = 5, RULE_function_call = 6, RULE_return_Rule = 7, 
		RULE_else_rule = 8, RULE_if_Rule = 9, RULE_while_Rule = 10, RULE_for_Rule = 11, 
		RULE_break_Rule = 12, RULE_continue_Rule = 13, RULE_statement_rules = 14, 
		RULE_statement = 15, RULE_cool = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"dbl", "parameter", "expression", "identifier", "function", "mainFunction", 
			"function_call", "return_Rule", "else_rule", "if_Rule", "while_Rule", 
			"for_Rule", "break_Rule", "continue_Rule", "statement_rules", "statement", 
			"cool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'^'", "'!'", "'auf'", "','", "'{'", "'}'", 
			"'wuf'", "'return'", "';'", "'else'", "'if'", "'while'", "'for'", "'break'", 
			"'continue'", "'.'", null, null, "'*'", "'/'", "'+'", "'-'", null, null, 
			null, "'mainauf'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "PT", "NUM", "UNARY_OPERATOR_SIDE", 
			"MULTIPLICATION", "DIV", "PLUS", "MINUS", "LOGIC", "COMPARE", "UNARY_OPERATOR", 
			"MAIN_FUNCTION_ID", "NAME", "TYPE", "WHITESPACE"
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
	public String getGrammarFileName() { return "AntlrTest.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AntlrTestParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class DblContext extends ParserRuleContext {
		public TerminalNode PT() { return getToken(AntlrTestParser.PT, 0); }
		public List<TerminalNode> NUM() { return getTokens(AntlrTestParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(AntlrTestParser.NUM, i);
		}
		public DblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterDbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitDbl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitDbl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DblContext dbl() throws RecognitionException {
		DblContext _localctx = new DblContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dbl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				match(NUM);
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM );
			setState(39);
			match(PT);
			setState(41); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(40);
					match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(AntlrTestParser.NUM, 0); }
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public TerminalNode TYPE() { return getToken(AntlrTestParser.TYPE, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				{
				setState(45);
				match(TYPE);
				setState(46);
				match(NAME);
				}
				}
				break;
			case NUM:
				{
				setState(47);
				match(NUM);
				}
				break;
			case NAME:
				{
				setState(48);
				match(NAME);
				}
				break;
			case T__2:
			case T__6:
				break;
			default:
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefineVariableContext extends ExpressionContext {
		public TerminalNode TYPE() { return getToken(AntlrTestParser.TYPE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefineVariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterDefineVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitDefineVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitDefineVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusMinusContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(AntlrTestParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AntlrTestParser.MINUS, 0); }
		public PlusMinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(AntlrTestParser.COMPARE, 0); }
		public CompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOperatorContext extends ExpressionContext {
		public TerminalNode UNARY_OPERATOR_SIDE() { return getToken(AntlrTestParser.UNARY_OPERATOR_SIDE, 0); }
		public TerminalNode UNARY_OPERATOR() { return getToken(AntlrTestParser.UNARY_OPERATOR, 0); }
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public UnaryOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExpressionContext {
		public TerminalNode NUM() { return getToken(AntlrTestParser.NUM, 0); }
		public DblContext dbl() {
			return getRuleContext(DblContext.class,0);
		}
		public NumContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATION() { return getToken(AntlrTestParser.MULTIPLICATION, 0); }
		public TerminalNode DIV() { return getToken(AntlrTestParser.DIV, 0); }
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConverterContext extends ExpressionContext {
		public TerminalNode TYPE() { return getToken(AntlrTestParser.TYPE, 0); }
		public TerminalNode NUM() { return getToken(AntlrTestParser.NUM, 0); }
		public DblContext dbl() {
			return getRuleContext(DblContext.class,0);
		}
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public TypeConverterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterTypeConverter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitTypeConverter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitTypeConverter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdkContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdkContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterIdk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitIdk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitIdk(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarEqlsFuncContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public VarEqlsFuncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterVarEqlsFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitVarEqlsFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitVarEqlsFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameContext extends ExpressionContext {
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public NameContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicContext extends ExpressionContext {
		public Token operation;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGIC() { return getToken(AntlrTestParser.LOGIC, 0); }
		public LogicContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(52);
				match(UNARY_OPERATOR_SIDE);
				setState(53);
				match(UNARY_OPERATOR);
				setState(54);
				match(NAME);
				}
				break;
			case 2:
				{
				_localctx = new DefineVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(TYPE);
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(56);
					identifier();
					}
					break;
				case 2:
					{
					{
					setState(57);
					match(NAME);
					setState(58);
					match(T__0);
					setState(59);
					expression(0);
					}
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(T__1);
				setState(63);
				expression(0);
				setState(64);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(T__4);
				setState(67);
				expression(6);
				}
				break;
			case 5:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(NAME);
				}
				break;
			case 6:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(69);
					match(NUM);
					}
					break;
				case 2:
					{
					setState(70);
					dbl();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new TypeConverterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(T__1);
				setState(74);
				match(TYPE);
				setState(75);
				match(T__2);
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(76);
					match(NUM);
					}
					break;
				case 2:
					{
					setState(77);
					dbl();
					}
					break;
				case 3:
					{
					setState(78);
					match(NAME);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				identifier();
				}
				break;
			case 9:
				{
				_localctx = new VarEqlsFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(NAME);
				setState(83);
				match(T__0);
				setState(84);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(87);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(88);
						((MulDivContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLICATION || _la==DIV) ) {
							((MulDivContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(89);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(90);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(91);
						((PlusMinusContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((PlusMinusContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(92);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(93);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(94);
						((CompareContext)_localctx).operation = match(COMPARE);
						setState(95);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new LogicContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(96);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(97);
						((LogicContext)_localctx).operation = match(LOGIC);
						setState(98);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new IdkContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(99);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(100);
						match(T__3);
						setState(101);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(AntlrTestParser.NUM, 0); }
		public DblContext dbl() {
			return getRuleContext(DblContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(NAME);
				setState(108);
				match(T__0);
				setState(109);
				match(NUM);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				dbl();
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AntlrTestParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Return_RuleContext return_Rule() {
			return getRuleContext(Return_RuleContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__5);
			setState(114);
			match(TYPE);
			setState(115);
			match(NAME);
			setState(116);
			match(T__1);
			setState(117);
			parameter();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(118);
				match(T__6);
				setState(119);
				parameter();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__2);
			setState(126);
			match(T__7);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0)) {
				{
				{
				setState(127);
				statement();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			return_Rule();
			setState(134);
			match(T__8);
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

	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode MAIN_FUNCTION_ID() { return getToken(AntlrTestParser.MAIN_FUNCTION_ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(MAIN_FUNCTION_ID);
			setState(137);
			match(T__7);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0)) {
				{
				{
				setState(138);
				statement();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(T__8);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__9);
			setState(147);
			match(NAME);
			setState(148);
			match(T__1);
			{
			setState(149);
			parameter();
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(150);
				match(T__6);
				setState(151);
				parameter();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			match(T__2);
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

	public static class Return_RuleContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_Rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterReturn_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitReturn_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitReturn_Rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_RuleContext return_Rule() throws RecognitionException {
		Return_RuleContext _localctx = new Return_RuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_Rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__10);
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case NUM:
			case UNARY_OPERATOR_SIDE:
			case NAME:
			case TYPE:
				{
				{
				setState(160);
				expression(0);
				setState(161);
				match(T__11);
				}
				}
				break;
			case T__9:
				{
				setState(163);
				function_call();
				setState(164);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Else_ruleContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterElse_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitElse_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitElse_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ruleContext else_rule() throws RecognitionException {
		Else_ruleContext _localctx = new Else_ruleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(168);
			match(T__12);
			setState(169);
			match(T__7);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				statement();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0) );
			setState(175);
			match(T__8);
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

	public static class If_RuleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Else_ruleContext else_rule() {
			return getRuleContext(Else_ruleContext.class,0);
		}
		public If_RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_Rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterIf_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitIf_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitIf_Rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_RuleContext if_Rule() throws RecognitionException {
		If_RuleContext _localctx = new If_RuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_Rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__13);
			setState(178);
			match(T__1);
			setState(179);
			expression(0);
			setState(180);
			match(T__2);
			setState(181);
			match(T__7);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0)) {
				{
				{
				setState(182);
				statement();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__8);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(189);
				else_rule();
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

	public static class While_RuleContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_Rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterWhile_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitWhile_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitWhile_Rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_RuleContext while_Rule() throws RecognitionException {
		While_RuleContext _localctx = new While_RuleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_Rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__14);
			setState(193);
			match(T__1);
			setState(194);
			expression(0);
			setState(195);
			match(T__2);
			setState(196);
			match(T__7);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0)) {
				{
				{
				setState(197);
				statement();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(T__8);
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

	public static class For_RuleContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_Rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterFor_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitFor_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitFor_Rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_RuleContext for_Rule() throws RecognitionException {
		For_RuleContext _localctx = new For_RuleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_Rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__15);
			setState(206);
			match(T__1);
			setState(207);
			expression(0);
			setState(208);
			match(T__11);
			setState(209);
			expression(0);
			setState(210);
			match(T__11);
			setState(211);
			expression(0);
			setState(212);
			match(T__2);
			setState(213);
			match(T__7);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0)) {
				{
				{
				setState(214);
				statement();
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(T__8);
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

	public static class Break_RuleContext extends ParserRuleContext {
		public Break_RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_Rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterBreak_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitBreak_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitBreak_Rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_RuleContext break_Rule() throws RecognitionException {
		Break_RuleContext _localctx = new Break_RuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_break_Rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__16);
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

	public static class Continue_RuleContext extends ParserRuleContext {
		public Continue_RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_Rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterContinue_Rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitContinue_Rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitContinue_Rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_RuleContext continue_Rule() throws RecognitionException {
		Continue_RuleContext _localctx = new Continue_RuleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continue_Rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__17);
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

	public static class Statement_rulesContext extends ParserRuleContext {
		public If_RuleContext if_Rule() {
			return getRuleContext(If_RuleContext.class,0);
		}
		public While_RuleContext while_Rule() {
			return getRuleContext(While_RuleContext.class,0);
		}
		public For_RuleContext for_Rule() {
			return getRuleContext(For_RuleContext.class,0);
		}
		public Break_RuleContext break_Rule() {
			return getRuleContext(Break_RuleContext.class,0);
		}
		public Continue_RuleContext continue_Rule() {
			return getRuleContext(Continue_RuleContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Statement_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterStatement_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitStatement_rules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitStatement_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_rulesContext statement_rules() throws RecognitionException {
		Statement_rulesContext _localctx = new Statement_rulesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement_rules);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(226);
				if_Rule();
				}
				break;
			case T__14:
				{
				setState(227);
				while_Rule();
				}
				break;
			case T__15:
				{
				setState(228);
				for_Rule();
				}
				break;
			case T__16:
				{
				setState(229);
				break_Rule();
				}
				break;
			case T__17:
				{
				setState(230);
				continue_Rule();
				}
				break;
			case T__1:
			case T__4:
			case NUM:
			case UNARY_OPERATOR_SIDE:
			case NAME:
			case TYPE:
				{
				setState(232); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(231);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(234); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__9:
				{
				setState(236);
				function_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementContext extends ParserRuleContext {
		public List<Statement_rulesContext> statement_rules() {
			return getRuleContexts(Statement_rulesContext.class);
		}
		public Statement_rulesContext statement_rules(int i) {
			return getRuleContext(Statement_rulesContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(239);
					statement_rules();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(242); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class CoolContext extends ParserRuleContext {
		public List<MainFunctionContext> mainFunction() {
			return getRuleContexts(MainFunctionContext.class);
		}
		public MainFunctionContext mainFunction(int i) {
			return getRuleContext(MainFunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public CoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).enterCool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AntlrTestListener ) ((AntlrTestListener)listener).exitCool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AntlrTestVisitor ) return ((AntlrTestVisitor<? extends T>)visitor).visitCool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoolContext cool() throws RecognitionException {
		CoolContext _localctx = new CoolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cool);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==MAIN_FUNCTION_ID) {
				{
				setState(250);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
					{
					setState(245); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(244);
							function();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(247); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case MAIN_FUNCTION_ID:
					{
					setState(249);
					mainFunction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(254);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0102\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R\n\4\3\4\3\4"+
		"\3\4\3\4\5\4X\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\3\6\7\6\u0083\n\6\f\6"+
		"\16\6\u0086\13\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a9\n\t\3\n\3\n\3\n\6\n\u00ae"+
		"\n\n\r\n\16\n\u00af\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ba\n"+
		"\13\f\13\16\13\u00bd\13\13\3\13\3\13\5\13\u00c1\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00da\n\r\f\r\16\r\u00dd\13\r\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\6\20\u00eb\n\20\r\20\16\20\u00ec"+
		"\3\20\5\20\u00f0\n\20\3\21\6\21\u00f3\n\21\r\21\16\21\u00f4\3\22\6\22"+
		"\u00f8\n\22\r\22\16\22\u00f9\3\22\7\22\u00fd\n\22\f\22\16\22\u0100\13"+
		"\22\3\22\2\3\6\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\3\2\30"+
		"\31\3\2\32\33\2\u011c\2%\3\2\2\2\4\63\3\2\2\2\6W\3\2\2\2\bq\3\2\2\2\n"+
		"s\3\2\2\2\f\u008a\3\2\2\2\16\u0094\3\2\2\2\20\u00a1\3\2\2\2\22\u00aa\3"+
		"\2\2\2\24\u00b3\3\2\2\2\26\u00c2\3\2\2\2\30\u00cf\3\2\2\2\32\u00e0\3\2"+
		"\2\2\34\u00e2\3\2\2\2\36\u00ef\3\2\2\2 \u00f2\3\2\2\2\"\u00fe\3\2\2\2"+
		"$&\7\26\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)+\7\25"+
		"\2\2*,\7\26\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/\60"+
		"\7!\2\2\60\64\7 \2\2\61\64\7\26\2\2\62\64\7 \2\2\63/\3\2\2\2\63\61\3\2"+
		"\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\66\b\4\1\2\66\67\7\27"+
		"\2\2\678\7\36\2\28X\7 \2\29>\7!\2\2:?\5\b\5\2;<\7 \2\2<=\7\3\2\2=?\5\6"+
		"\4\2>:\3\2\2\2>;\3\2\2\2?X\3\2\2\2@A\7\4\2\2AB\5\6\4\2BC\7\5\2\2CX\3\2"+
		"\2\2DE\7\7\2\2EX\5\6\4\bFX\7 \2\2GJ\7\26\2\2HJ\5\2\2\2IG\3\2\2\2IH\3\2"+
		"\2\2JX\3\2\2\2KL\7\4\2\2LM\7!\2\2MQ\7\5\2\2NR\7\26\2\2OR\5\2\2\2PR\7 "+
		"\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2RX\3\2\2\2SX\5\b\5\2TU\7 \2\2UV\7\3"+
		"\2\2VX\5\16\b\2W\65\3\2\2\2W9\3\2\2\2W@\3\2\2\2WD\3\2\2\2WF\3\2\2\2WI"+
		"\3\2\2\2WK\3\2\2\2WS\3\2\2\2WT\3\2\2\2Xj\3\2\2\2YZ\f\r\2\2Z[\t\2\2\2["+
		"i\5\6\4\16\\]\f\f\2\2]^\t\3\2\2^i\5\6\4\r_`\f\13\2\2`a\7\35\2\2ai\5\6"+
		"\4\fbc\f\n\2\2cd\7\34\2\2di\5\6\4\13ef\f\t\2\2fg\7\6\2\2gi\5\6\4\nhY\3"+
		"\2\2\2h\\\3\2\2\2h_\3\2\2\2hb\3\2\2\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk"+
		"\3\2\2\2k\7\3\2\2\2lj\3\2\2\2mn\7 \2\2no\7\3\2\2or\7\26\2\2pr\5\2\2\2"+
		"qm\3\2\2\2qp\3\2\2\2r\t\3\2\2\2st\7\b\2\2tu\7!\2\2uv\7 \2\2vw\7\4\2\2"+
		"w|\5\4\3\2xy\7\t\2\2y{\5\4\3\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2"+
		"}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\5\2\2\u0080\u0084\7\n\2\2\u0081\u0083"+
		"\5 \21\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\5\20"+
		"\t\2\u0088\u0089\7\13\2\2\u0089\13\3\2\2\2\u008a\u008b\7\37\2\2\u008b"+
		"\u008f\7\n\2\2\u008c\u008e\5 \21\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7\13\2\2\u0093\r\3\2\2\2\u0094\u0095\7\f\2"+
		"\2\u0095\u0096\7 \2\2\u0096\u0097\7\4\2\2\u0097\u009c\5\4\3\2\u0098\u0099"+
		"\7\t\2\2\u0099\u009b\5\4\3\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\7\5\2\2\u00a0\17\3\2\2\2\u00a1\u00a8\7\r\2\2\u00a2\u00a3"+
		"\5\6\4\2\u00a3\u00a4\7\16\2\2\u00a4\u00a9\3\2\2\2\u00a5\u00a6\5\16\b\2"+
		"\u00a6\u00a7\7\16\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8\u00a5"+
		"\3\2\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab\u00ad\7\n\2\2\u00ac"+
		"\u00ae\5 \21\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\13\2\2\u00b2"+
		"\23\3\2\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5\7\4\2\2\u00b5\u00b6\5\6\4"+
		"\2\u00b6\u00b7\7\5\2\2\u00b7\u00bb\7\n\2\2\u00b8\u00ba\5 \21\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\7\13\2\2\u00bf\u00c1\5"+
		"\22\n\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\25\3\2\2\2\u00c2"+
		"\u00c3\7\21\2\2\u00c3\u00c4\7\4\2\2\u00c4\u00c5\5\6\4\2\u00c5\u00c6\7"+
		"\5\2\2\u00c6\u00ca\7\n\2\2\u00c7\u00c9\5 \21\2\u00c8\u00c7\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\13\2\2\u00ce\27\3\2\2\2\u00cf\u00d0"+
		"\7\22\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\5\6\4\2\u00d2\u00d3\7\16\2\2"+
		"\u00d3\u00d4\5\6\4\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\5\6\4\2\u00d6\u00d7"+
		"\7\5\2\2\u00d7\u00db\7\n\2\2\u00d8\u00da\5 \21\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7\13\2\2\u00df\31\3\2\2\2\u00e0\u00e1"+
		"\7\23\2\2\u00e1\33\3\2\2\2\u00e2\u00e3\7\24\2\2\u00e3\35\3\2\2\2\u00e4"+
		"\u00f0\5\24\13\2\u00e5\u00f0\5\26\f\2\u00e6\u00f0\5\30\r\2\u00e7\u00f0"+
		"\5\32\16\2\u00e8\u00f0\5\34\17\2\u00e9\u00eb\5\6\4\2\u00ea\u00e9\3\2\2"+
		"\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00f0\5\16\b\2\u00ef\u00e4\3\2\2\2\u00ef\u00e5\3\2\2\2"+
		"\u00ef\u00e6\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00ea"+
		"\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\37\3\2\2\2\u00f1\u00f3\5\36\20\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5!\3\2\2\2\u00f6\u00f8\5\n\6\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00fd\5\f\7\2\u00fc\u00f7\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff#\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\34\'-\63>IQWhjq|\u0084\u008f\u009c\u00a8\u00af\u00bb\u00c0\u00ca"+
		"\u00db\u00ec\u00ef\u00f4\u00f9\u00fc\u00fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}