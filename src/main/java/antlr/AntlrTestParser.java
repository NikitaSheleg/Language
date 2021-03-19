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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, NUM=17, 
		UNARY_OPERATOR_SIDE=18, MULTIPLICATION=19, DIV=20, PLUS=21, MINUS=22, 
		LOGIC=23, COMPARE=24, UNARY_OPERATOR=25, MAIN_FUNCTION_ID=26, NAME=27, 
		TYPE=28, WHITESPACE=29;
	public static final int
		RULE_parameter = 0, RULE_expression = 1, RULE_identifier = 2, RULE_return_Rule = 3, 
		RULE_if_Rule = 4, RULE_while_Rule = 5, RULE_for_Rule = 6, RULE_break_Rule = 7, 
		RULE_continue_Rule = 8, RULE_statement_rules = 9, RULE_statement = 10, 
		RULE_function = 11, RULE_mainFunction = 12, RULE_cool = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"parameter", "expression", "identifier", "return_Rule", "if_Rule", "while_Rule", 
			"for_Rule", "break_Rule", "continue_Rule", "statement_rules", "statement", 
			"function", "mainFunction", "cool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'^'", "'!'", "'return'", "';'", "'if'", "'{'", 
			"'}'", "'else'", "'while'", "'for'", "'break;'", "'continue;'", "'auf'", 
			null, null, "'*'", "'/'", "'+'", "'-'", null, null, null, "'mainauf'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "NUM", "UNARY_OPERATOR_SIDE", "MULTIPLICATION", 
			"DIV", "PLUS", "MINUS", "LOGIC", "COMPARE", "UNARY_OPERATOR", "MAIN_FUNCTION_ID", 
			"NAME", "TYPE", "WHITESPACE"
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AntlrTestParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public TerminalNode NUM() { return getToken(AntlrTestParser.NUM, 0); }
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
		enterRule(_localctx, 0, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(28);
				match(TYPE);
				setState(29);
				match(NAME);
				}
				break;
			case NUM:
				{
				setState(30);
				match(NUM);
				}
				break;
			case NAME:
				{
				setState(31);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				match(UNARY_OPERATOR_SIDE);
				setState(36);
				match(UNARY_OPERATOR);
				setState(37);
				expression(12);
				}
				break;
			case 2:
				{
				_localctx = new DefineVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(TYPE);
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(39);
					match(NAME);
					setState(40);
					match(T__0);
					setState(41);
					expression(0);
					}
					break;
				case 2:
					{
					}
					break;
				}
				setState(45);
				identifier();
				}
				}
				break;
			case 3:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(46);
				match(T__1);
				setState(47);
				expression(0);
				setState(48);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(50);
				match(T__4);
				setState(51);
				expression(4);
				}
				break;
			case 5:
				{
				_localctx = new NameContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(NAME);
				}
				break;
			case 6:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(NUM);
				}
				break;
			case 7:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				identifier();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(57);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(58);
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
						setState(59);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new PlusMinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(60);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(61);
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
						setState(62);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new CompareContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(64);
						((CompareContext)_localctx).operation = match(COMPARE);
						setState(65);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new LogicContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(67);
						((LogicContext)_localctx).operation = match(LOGIC);
						setState(68);
						expression(7);
						}
						break;
					case 5:
						{
						_localctx = new IdkContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(69);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(70);
						match(T__3);
						setState(71);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(NAME);
			setState(78);
			match(T__0);
			setState(79);
			match(NUM);
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
		enterRule(_localctx, 6, RULE_return_Rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__5);
			setState(82);
			expression(0);
			setState(83);
			match(T__6);
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
		enterRule(_localctx, 8, RULE_if_Rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__7);
			setState(86);
			match(T__1);
			setState(87);
			expression(0);
			setState(88);
			match(T__2);
			setState(89);
			match(T__8);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0)) {
				{
				{
				setState(90);
				statement();
				setState(91);
				match(T__6);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__9);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(99);
				match(T__10);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(100);
					match(T__7);
					setState(101);
					match(T__1);
					setState(102);
					expression(0);
					setState(103);
					match(T__2);
					}
				}

				setState(107);
				match(T__8);
				setState(108);
				statement();
				setState(109);
				match(T__9);
				}
				}
				setState(115);
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
		enterRule(_localctx, 10, RULE_while_Rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__11);
			setState(117);
			match(T__1);
			setState(118);
			expression(0);
			setState(119);
			match(T__2);
			setState(120);
			match(T__8);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0)) {
				{
				{
				setState(121);
				statement();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(T__9);
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
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_for_Rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__12);
			setState(130);
			match(T__1);
			setState(131);
			parameter();
			setState(132);
			match(T__6);
			setState(133);
			expression(0);
			setState(134);
			match(T__6);
			setState(135);
			expression(0);
			setState(136);
			match(T__2);
			setState(137);
			match(T__8);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0)) {
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
			match(T__9);
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
		enterRule(_localctx, 14, RULE_break_Rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__13);
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
		enterRule(_localctx, 16, RULE_continue_Rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__14);
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
		public Return_RuleContext return_Rule() {
			return getRuleContext(Return_RuleContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_statement_rules);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(150);
				return_Rule();
				}
				break;
			case T__7:
				{
				setState(151);
				if_Rule();
				}
				break;
			case T__11:
				{
				setState(152);
				while_Rule();
				}
				break;
			case T__12:
				{
				setState(153);
				for_Rule();
				}
				break;
			case T__13:
				{
				setState(154);
				break_Rule();
				}
				break;
			case T__14:
				{
				setState(155);
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
				setState(157); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(156);
						expression(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(159); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 20, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(163);
					statement_rules();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(166); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(AntlrTestParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(AntlrTestParser.NAME, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 22, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__15);
			setState(169);
			match(TYPE);
			setState(170);
			match(NAME);
			setState(171);
			match(T__1);
			setState(172);
			parameter();
			setState(173);
			match(T__2);
			setState(174);
			match(T__8);
			setState(175);
			statement();
			setState(176);
			match(T__9);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		enterRule(_localctx, 24, RULE_mainFunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(MAIN_FUNCTION_ID);
			setState(179);
			match(T__8);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					statement();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0)) {
				{
				{
				setState(186);
				expression(0);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			match(T__9);
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
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
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
		enterRule(_localctx, 26, RULE_cool);
		int _la;
		try {
			int _alt;
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case T__5:
			case T__7:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case NUM:
			case UNARY_OPERATOR_SIDE:
			case NAME:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						setState(195); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(194);
								statement();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(197); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						setState(199);
						function();
						}
						break;
					case 3:
						{
						setState(201); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(200);
								expression(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(203); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					}
					setState(207); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << NUM) | (1L << UNARY_OPERATOR_SIDE) | (1L << NAME) | (1L << TYPE))) != 0) );
				}
				break;
			case MAIN_FUNCTION_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				mainFunction();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00d7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\5\2#\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3:\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16\b\u0091\13\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00a0\n\13\r\13\16"+
		"\13\u00a1\5\13\u00a4\n\13\3\f\6\f\u00a7\n\f\r\f\16\f\u00a8\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00b8\n\16\f\16\16\16"+
		"\u00bb\13\16\3\16\7\16\u00be\n\16\f\16\16\16\u00c1\13\16\3\16\3\16\3\17"+
		"\6\17\u00c6\n\17\r\17\16\17\u00c7\3\17\3\17\6\17\u00cc\n\17\r\17\16\17"+
		"\u00cd\6\17\u00d0\n\17\r\17\16\17\u00d1\3\17\5\17\u00d5\n\17\3\17\2\3"+
		"\4\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\25\26\3\2\27\30\2\u00ec"+
		"\2\"\3\2\2\2\49\3\2\2\2\6O\3\2\2\2\bS\3\2\2\2\nW\3\2\2\2\fv\3\2\2\2\16"+
		"\u0083\3\2\2\2\20\u0094\3\2\2\2\22\u0096\3\2\2\2\24\u00a3\3\2\2\2\26\u00a6"+
		"\3\2\2\2\30\u00aa\3\2\2\2\32\u00b4\3\2\2\2\34\u00d4\3\2\2\2\36\37\7\36"+
		"\2\2\37#\7\35\2\2 #\7\23\2\2!#\7\35\2\2\"\36\3\2\2\2\" \3\2\2\2\"!\3\2"+
		"\2\2\"#\3\2\2\2#\3\3\2\2\2$%\b\3\1\2%&\7\24\2\2&\'\7\33\2\2\':\5\4\3\16"+
		"(-\7\36\2\2)*\7\35\2\2*+\7\3\2\2+.\5\4\3\2,.\3\2\2\2-)\3\2\2\2-,\3\2\2"+
		"\2./\3\2\2\2/:\5\6\4\2\60\61\7\4\2\2\61\62\5\4\3\2\62\63\7\5\2\2\63:\3"+
		"\2\2\2\64\65\7\7\2\2\65:\5\4\3\6\66:\7\35\2\2\67:\7\23\2\28:\5\6\4\29"+
		"$\3\2\2\29(\3\2\2\29\60\3\2\2\29\64\3\2\2\29\66\3\2\2\29\67\3\2\2\298"+
		"\3\2\2\2:L\3\2\2\2;<\f\13\2\2<=\t\2\2\2=K\5\4\3\f>?\f\n\2\2?@\t\3\2\2"+
		"@K\5\4\3\13AB\f\t\2\2BC\7\32\2\2CK\5\4\3\nDE\f\b\2\2EF\7\31\2\2FK\5\4"+
		"\3\tGH\f\7\2\2HI\7\6\2\2IK\5\4\3\bJ;\3\2\2\2J>\3\2\2\2JA\3\2\2\2JD\3\2"+
		"\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OP\7"+
		"\35\2\2PQ\7\3\2\2QR\7\23\2\2R\7\3\2\2\2ST\7\b\2\2TU\5\4\3\2UV\7\t\2\2"+
		"V\t\3\2\2\2WX\7\n\2\2XY\7\4\2\2YZ\5\4\3\2Z[\7\5\2\2[a\7\13\2\2\\]\5\26"+
		"\f\2]^\7\t\2\2^`\3\2\2\2_\\\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3"+
		"\2\2\2ca\3\2\2\2ds\7\f\2\2ek\7\r\2\2fg\7\n\2\2gh\7\4\2\2hi\5\4\3\2ij\7"+
		"\5\2\2jl\3\2\2\2kf\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\13\2\2no\5\26\f\2o"+
		"p\7\f\2\2pr\3\2\2\2qe\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2"+
		"\2us\3\2\2\2vw\7\16\2\2wx\7\4\2\2xy\5\4\3\2yz\7\5\2\2z~\7\13\2\2{}\5\26"+
		"\f\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0082\7\f\2\2\u0082\r\3\2\2\2\u0083\u0084\7\17\2"+
		"\2\u0084\u0085\7\4\2\2\u0085\u0086\5\2\2\2\u0086\u0087\7\t\2\2\u0087\u0088"+
		"\5\4\3\2\u0088\u0089\7\t\2\2\u0089\u008a\5\4\3\2\u008a\u008b\7\5\2\2\u008b"+
		"\u008f\7\13\2\2\u008c\u008e\5\26\f\2\u008d\u008c\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7\f\2\2\u0093\17\3\2\2\2\u0094\u0095\7\20\2"+
		"\2\u0095\21\3\2\2\2\u0096\u0097\7\21\2\2\u0097\23\3\2\2\2\u0098\u00a4"+
		"\5\b\5\2\u0099\u00a4\5\n\6\2\u009a\u00a4\5\f\7\2\u009b\u00a4\5\16\b\2"+
		"\u009c\u00a4\5\20\t\2\u009d\u00a4\5\22\n\2\u009e\u00a0\5\4\3\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u0098\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u009a\3\2"+
		"\2\2\u00a3\u009b\3\2\2\2\u00a3\u009c\3\2\2\2\u00a3\u009d\3\2\2\2\u00a3"+
		"\u009f\3\2\2\2\u00a4\25\3\2\2\2\u00a5\u00a7\5\24\13\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\27\3\2\2\2\u00aa\u00ab\7\22\2\2\u00ab\u00ac\7\36\2\2\u00ac\u00ad\7\35"+
		"\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\5\2\2\2\u00af\u00b0\7\5\2\2\u00b0"+
		"\u00b1\7\13\2\2\u00b1\u00b2\5\26\f\2\u00b2\u00b3\7\f\2\2\u00b3\31\3\2"+
		"\2\2\u00b4\u00b5\7\34\2\2\u00b5\u00b9\7\13\2\2\u00b6\u00b8\5\26\f\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bf\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\5\4\3\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\f\2\2\u00c3"+
		"\33\3\2\2\2\u00c4\u00c6\5\26\f\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2"+
		"\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d0\3\2\2\2\u00c9\u00d0"+
		"\5\30\r\2\u00ca\u00cc\5\4\3\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c5"+
		"\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d5\5\32"+
		"\16\2\u00d4\u00cf\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\35\3\2\2\2\26\"-9"+
		"JLaks~\u008f\u00a1\u00a3\u00a8\u00b9\u00bf\u00c7\u00cd\u00cf\u00d1\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}