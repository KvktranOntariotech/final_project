// Generated from java-escape by ANTLR 4.11.1

import backend.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, STRING=14, BOOL=15, NUMBER=16, 
		ID=17, TRUE=18, FALSE=19, PLUS=20, MINUS=21, MULT=22, DIV=23, PPLUS=24, 
		LT=25, LE=26, GT=27, GE=28, EQ=29, NE=30, COMMENT=31, SEMI_COLON=32, WHITESPACE=33;
	public static final int
		RULE_program = 0, RULE_operator = 1, RULE_comparator = 2, RULE_value = 3, 
		RULE_expression = 4, RULE_invoke = 5, RULE_argumentList = 6, RULE_statement = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "operator", "comparator", "value", "expression", "invoke", 
			"argumentList", "statement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'='", "'print('", "'for('", "'in'", "'..'", 
			"'{'", "'}'", "'if'", "'else'", "'function'", null, null, null, null, 
			"'true'", "'false'", "'+'", "'-'", "'*'", "'/'", "'++'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "STRING", "BOOL", "NUMBER", "ID", "TRUE", "FALSE", "PLUS", 
			"MINUS", "MULT", "DIV", "PPLUS", "LT", "LE", "GT", "GE", "EQ", "NE", 
			"COMMENT", "SEMI_COLON", "WHITESPACE"
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



	public PLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Expr expr;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(PLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expr> statements = new ArrayList<Expr>();
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				((ProgramContext)_localctx).statement = statement();
				statements.add(((ProgramContext)_localctx).statement.expr);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 256098L) != 0 );
			setState(24);
			match(EOF);
			((ProgramContext)_localctx).expr =  new Block(statements);
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
	public static class OperatorContext extends ParserRuleContext {
		public Operator op;
		public TerminalNode PLUS() { return getToken(PLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PLParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(PLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(PLParser.DIV, 0); }
		public TerminalNode PPLUS() { return getToken(PLParser.PPLUS, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operator);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(PLUS);
				((OperatorContext)_localctx).op =  Operator.Add;
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(MINUS);
				((OperatorContext)_localctx).op =  Operator.Sub;
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				match(MULT);
				((OperatorContext)_localctx).op =  Operator.Mul;
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(DIV);
				((OperatorContext)_localctx).op =  Operator.Div;
				}
				break;
			case PPLUS:
				enterOuterAlt(_localctx, 5);
				{
				setState(35);
				match(PPLUS);
				((OperatorContext)_localctx).op =  Operator.Pplus;
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
	public static class ComparatorContext extends ParserRuleContext {
		public Comparator com;
		public TerminalNode LT() { return getToken(PLParser.LT, 0); }
		public TerminalNode LE() { return getToken(PLParser.LE, 0); }
		public TerminalNode GT() { return getToken(PLParser.GT, 0); }
		public TerminalNode GE() { return getToken(PLParser.GE, 0); }
		public TerminalNode EQ() { return getToken(PLParser.EQ, 0); }
		public TerminalNode NE() { return getToken(PLParser.NE, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comparator);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(LT);
				((ComparatorContext)_localctx).com =  Comparator.LT;
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(LE);
				((ComparatorContext)_localctx).com =  Comparator.LE;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				match(GT);
				((ComparatorContext)_localctx).com =  Comparator.GT;
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(GE);
				((ComparatorContext)_localctx).com =  Comparator.GE;
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(EQ);
				((ComparatorContext)_localctx).com =  Comparator.EQ;
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				match(NE);
				((ComparatorContext)_localctx).com =  Comparator.NE;
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
	public static class ValueContext extends ParserRuleContext {
		public Expr expr;
		public Token NUMBER;
		public Token BOOL;
		public Token STRING;
		public Token ID;
		public TerminalNode NUMBER() { return getToken(PLParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(PLParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(PLParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				((ValueContext)_localctx).NUMBER = match(NUMBER);
				 ((ValueContext)_localctx).expr =  new IntLiteral((((ValueContext)_localctx).NUMBER!=null?((ValueContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((ValueContext)_localctx).BOOL = match(BOOL);
				((ValueContext)_localctx).expr =  new BooleanLiteral((((ValueContext)_localctx).BOOL!=null?((ValueContext)_localctx).BOOL.getText():null)); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).expr =  new StringLiteral((((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				((ValueContext)_localctx).ID = match(ID);
				((ValueContext)_localctx).expr =  new Deref((((ValueContext)_localctx).ID!=null?((ValueContext)_localctx).ID.getText():null)); 
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext v1;
		public InvokeContext invoke;
		public ExpressionContext expression;
		public ValueContext value;
		public OperatorContext operator;
		public ExpressionContext v2;
		public ComparatorContext comparator;
		public InvokeContext invoke() {
			return getRuleContext(InvokeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(64);
				((ExpressionContext)_localctx).invoke = invoke();
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).invoke.expr;
				}
				break;
			case 2:
				{
				setState(67);
				match(T__0);
				setState(68);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(69);
				match(T__1);
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).expression.expr;
				}
				break;
			case 3:
				{
				setState(72);
				((ExpressionContext)_localctx).value = value();
				setState(73);
				((ExpressionContext)_localctx).operator = operator();
				setState(74);
				((ExpressionContext)_localctx).v2 = ((ExpressionContext)_localctx).expression = expression(3);
				((ExpressionContext)_localctx).expr =  new Arithmetics(((ExpressionContext)_localctx).operator.op, ((ExpressionContext)_localctx).value.expr, ((ExpressionContext)_localctx).v2.expr);
				}
				break;
			case 4:
				{
				setState(77);
				((ExpressionContext)_localctx).value = value();
				((ExpressionContext)_localctx).expr =  ((ExpressionContext)_localctx).value.expr;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.v1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(82);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(83);
					((ExpressionContext)_localctx).comparator = comparator();
					setState(84);
					((ExpressionContext)_localctx).v2 = ((ExpressionContext)_localctx).expression = expression(3);
					((ExpressionContext)_localctx).expr =  new Compare(((ExpressionContext)_localctx).comparator.com, ((ExpressionContext)_localctx).v1.expr, ((ExpressionContext)_localctx).v2.expr);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class InvokeContext extends ParserRuleContext {
		public Expr expr;
		public Token name;
		public ArgumentListContext argumentList;
		public TerminalNode ID() { return getToken(PLParser.ID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public InvokeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke; }
	}

	public final InvokeContext invoke() throws RecognitionException {
		InvokeContext _localctx = new InvokeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_invoke);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expr> elist = new ArrayList<Expr>();
			setState(93);
			((InvokeContext)_localctx).name = match(ID);
			setState(94);
			match(T__0);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 245762L) != 0) {
				{
				setState(95);
				((InvokeContext)_localctx).argumentList = argumentList();
				}
			}

			setState(98);
			match(T__1);
			((InvokeContext)_localctx).expr =  new Invoke((((InvokeContext)_localctx).name!=null?((InvokeContext)_localctx).name.getText():null), ((InvokeContext)_localctx).argumentList.calls);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<Expr> calls;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((ArgumentListContext)_localctx).e1 = expression(0);
			((ArgumentListContext)_localctx).calls =  new ArrayList<Expr>(); _localctx.calls.add(((ArgumentListContext)_localctx).e1.expr);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(103);
				match(T__2);
				setState(104);
				((ArgumentListContext)_localctx).e2 = expression(0);
				_localctx.calls.add(((ArgumentListContext)_localctx).e2.expr);
				}
				}
				setState(111);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Expr expr;
		public ExpressionContext expression;
		public Token ID;
		public StatementContext statement;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public StatementContext body;
		public ExpressionContext cond;
		public StatementContext s1;
		public StatementContext s2;
		public Token name;
		public Token arg;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLParser.ID, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).expr =  ((StatementContext)_localctx).expression.expr;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((StatementContext)_localctx).ID = match(ID);
				setState(116);
				match(T__3);
				setState(117);
				((StatementContext)_localctx).expression = expression(0);
				((StatementContext)_localctx).expr =  new Assign((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).expression.expr);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(T__4);
				setState(121);
				((StatementContext)_localctx).statement = statement();
				setState(122);
				match(T__1);
				((StatementContext)_localctx).expr =  new Print(((StatementContext)_localctx).statement.expr);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				List<Expr> statements = new ArrayList<Expr>();
				setState(126);
				match(T__5);
				setState(127);
				((StatementContext)_localctx).ID = match(ID);
				setState(128);
				match(T__6);
				setState(129);
				((StatementContext)_localctx).e1 = expression(0);
				setState(130);
				match(T__7);
				setState(131);
				((StatementContext)_localctx).e2 = expression(0);
				setState(132);
				match(T__1);
				setState(133);
				match(T__8);
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					((StatementContext)_localctx).body = statement();
					statements.add(((StatementContext)_localctx).body.expr);
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 256098L) != 0 );
				setState(141);
				match(T__9);
				((StatementContext)_localctx).expr =  new ForLoop((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).e1.expr, ((StatementContext)_localctx).e2.expr, new Block(statements));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{

				            List<Expr> statements1 = new ArrayList<Expr>();
				            List<Expr> statements2 = new ArrayList<Expr>();
				        
				setState(145);
				match(T__10);
				setState(146);
				match(T__0);
				setState(147);
				((StatementContext)_localctx).cond = expression(0);
				setState(148);
				match(T__1);
				setState(149);
				match(T__8);
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					((StatementContext)_localctx).s1 = statement();
					statements1.add(((StatementContext)_localctx).s1.expr);
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 256098L) != 0 );
				setState(157);
				match(T__9);
				setState(158);
				match(T__11);
				setState(159);
				match(T__8);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160);
					((StatementContext)_localctx).s2 = statement();
					statements2.add(((StatementContext)_localctx).s2.expr);
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 256098L) != 0 );
				setState(167);
				match(T__9);
				((StatementContext)_localctx).expr =  new Ifelse(((StatementContext)_localctx).cond.expr, new Block(statements1), new Block(statements2));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{

				            List<String> alist = new ArrayList<String>();
				            List<Expr> statements = new ArrayList<Expr>();
				        
				setState(171);
				match(T__12);
				setState(172);
				((StatementContext)_localctx).name = match(ID);
				setState(173);
				match(T__0);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(174);
					((StatementContext)_localctx).arg = match(ID);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(175);
						match(T__2);
						}
					}

					alist.add((((StatementContext)_localctx).arg!=null?((StatementContext)_localctx).arg.getText():null));
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(184);
				match(T__1);
				setState(185);
				match(T__8);
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(186);
					((StatementContext)_localctx).body = statement();
					statements.add(((StatementContext)_localctx).body.expr);
					}
					}
					setState(191); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 256098L) != 0 );
				setState(193);
				match(T__9);
				((StatementContext)_localctx).expr =  new Declare((((StatementContext)_localctx).name!=null?((StatementContext)_localctx).name.getText():null), alist, new Block(statements));
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
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b"+
		"\u0000\f\u0000\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001&\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00024\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004X\b"+
		"\u0004\n\u0004\f\u0004[\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005a\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006l\b\u0006\n\u0006\f\u0006o\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u008a"+
		"\b\u0007\u000b\u0007\f\u0007\u008b\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u009a\b\u0007\u000b\u0007"+
		"\f\u0007\u009b\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u00a4\b\u0007\u000b\u0007\f\u0007\u00a5\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b1\b\u0007\u0001\u0007\u0005"+
		"\u0007\u00b4\b\u0007\n\u0007\f\u0007\u00b7\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u00be\b\u0007\u000b\u0007"+
		"\f\u0007\u00bf\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c5\b"+
		"\u0007\u0001\u0007\u0000\u0001\b\b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0000\u0000\u00dc\u0000\u0010\u0001\u0000\u0000\u0000\u0002%\u0001\u0000"+
		"\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000"+
		"\bP\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\fe\u0001\u0000"+
		"\u0000\u0000\u000e\u00c4\u0001\u0000\u0000\u0000\u0010\u0014\u0006\u0000"+
		"\uffff\uffff\u0000\u0011\u0012\u0003\u000e\u0007\u0000\u0012\u0013\u0006"+
		"\u0000\uffff\uffff\u0000\u0013\u0015\u0001\u0000\u0000\u0000\u0014\u0011"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0000\u0000\u0001\u0019\u001a"+
		"\u0006\u0000\uffff\uffff\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005\u0014\u0000\u0000\u001c&\u0006\u0001\uffff\uffff\u0000\u001d"+
		"\u001e\u0005\u0015\u0000\u0000\u001e&\u0006\u0001\uffff\uffff\u0000\u001f"+
		" \u0005\u0016\u0000\u0000 &\u0006\u0001\uffff\uffff\u0000!\"\u0005\u0017"+
		"\u0000\u0000\"&\u0006\u0001\uffff\uffff\u0000#$\u0005\u0018\u0000\u0000"+
		"$&\u0006\u0001\uffff\uffff\u0000%\u001b\u0001\u0000\u0000\u0000%\u001d"+
		"\u0001\u0000\u0000\u0000%\u001f\u0001\u0000\u0000\u0000%!\u0001\u0000"+
		"\u0000\u0000%#\u0001\u0000\u0000\u0000&\u0003\u0001\u0000\u0000\u0000"+
		"\'(\u0005\u0019\u0000\u0000(4\u0006\u0002\uffff\uffff\u0000)*\u0005\u001a"+
		"\u0000\u0000*4\u0006\u0002\uffff\uffff\u0000+,\u0005\u001b\u0000\u0000"+
		",4\u0006\u0002\uffff\uffff\u0000-.\u0005\u001c\u0000\u0000.4\u0006\u0002"+
		"\uffff\uffff\u0000/0\u0005\u001d\u0000\u000004\u0006\u0002\uffff\uffff"+
		"\u000012\u0005\u001e\u0000\u000024\u0006\u0002\uffff\uffff\u00003\'\u0001"+
		"\u0000\u0000\u00003)\u0001\u0000\u0000\u00003+\u0001\u0000\u0000\u0000"+
		"3-\u0001\u0000\u0000\u00003/\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u00004\u0005\u0001\u0000\u0000\u000056\u0005\u0010\u0000\u00006>\u0006"+
		"\u0003\uffff\uffff\u000078\u0005\u000f\u0000\u00008>\u0006\u0003\uffff"+
		"\uffff\u00009:\u0005\u000e\u0000\u0000:>\u0006\u0003\uffff\uffff\u0000"+
		";<\u0005\u0011\u0000\u0000<>\u0006\u0003\uffff\uffff\u0000=5\u0001\u0000"+
		"\u0000\u0000=7\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?@\u0006\u0004\uffff"+
		"\uffff\u0000@A\u0003\n\u0005\u0000AB\u0006\u0004\uffff\uffff\u0000BQ\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0001\u0000\u0000DE\u0003\b\u0004\u0000EF\u0005"+
		"\u0002\u0000\u0000FG\u0006\u0004\uffff\uffff\u0000GQ\u0001\u0000\u0000"+
		"\u0000HI\u0003\u0006\u0003\u0000IJ\u0003\u0002\u0001\u0000JK\u0003\b\u0004"+
		"\u0003KL\u0006\u0004\uffff\uffff\u0000LQ\u0001\u0000\u0000\u0000MN\u0003"+
		"\u0006\u0003\u0000NO\u0006\u0004\uffff\uffff\u0000OQ\u0001\u0000\u0000"+
		"\u0000P?\u0001\u0000\u0000\u0000PC\u0001\u0000\u0000\u0000PH\u0001\u0000"+
		"\u0000\u0000PM\u0001\u0000\u0000\u0000QY\u0001\u0000\u0000\u0000RS\n\u0002"+
		"\u0000\u0000ST\u0003\u0004\u0002\u0000TU\u0003\b\u0004\u0003UV\u0006\u0004"+
		"\uffff\uffff\u0000VX\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000"+
		"X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\t\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0006\u0005"+
		"\uffff\uffff\u0000]^\u0005\u0011\u0000\u0000^`\u0005\u0001\u0000\u0000"+
		"_a\u0003\f\u0006\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0005\u0002\u0000\u0000cd\u0006\u0005\uffff"+
		"\uffff\u0000d\u000b\u0001\u0000\u0000\u0000ef\u0003\b\u0004\u0000fm\u0006"+
		"\u0006\uffff\uffff\u0000gh\u0005\u0003\u0000\u0000hi\u0003\b\u0004\u0000"+
		"ij\u0006\u0006\uffff\uffff\u0000jl\u0001\u0000\u0000\u0000kg\u0001\u0000"+
		"\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001"+
		"\u0000\u0000\u0000n\r\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"pq\u0003\b\u0004\u0000qr\u0006\u0007\uffff\uffff\u0000r\u00c5\u0001\u0000"+
		"\u0000\u0000st\u0005\u0011\u0000\u0000tu\u0005\u0004\u0000\u0000uv\u0003"+
		"\b\u0004\u0000vw\u0006\u0007\uffff\uffff\u0000w\u00c5\u0001\u0000\u0000"+
		"\u0000xy\u0005\u0005\u0000\u0000yz\u0003\u000e\u0007\u0000z{\u0005\u0002"+
		"\u0000\u0000{|\u0006\u0007\uffff\uffff\u0000|\u00c5\u0001\u0000\u0000"+
		"\u0000}~\u0006\u0007\uffff\uffff\u0000~\u007f\u0005\u0006\u0000\u0000"+
		"\u007f\u0080\u0005\u0011\u0000\u0000\u0080\u0081\u0005\u0007\u0000\u0000"+
		"\u0081\u0082\u0003\b\u0004\u0000\u0082\u0083\u0005\b\u0000\u0000\u0083"+
		"\u0084\u0003\b\u0004\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085\u0089"+
		"\u0005\t\u0000\u0000\u0086\u0087\u0003\u000e\u0007\u0000\u0087\u0088\u0006"+
		"\u0007\uffff\uffff\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0086"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0005\n\u0000\u0000\u008e\u008f\u0006"+
		"\u0007\uffff\uffff\u0000\u008f\u00c5\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0006\u0007\uffff\uffff\u0000\u0091\u0092\u0005\u000b\u0000\u0000\u0092"+
		"\u0093\u0005\u0001\u0000\u0000\u0093\u0094\u0003\b\u0004\u0000\u0094\u0095"+
		"\u0005\u0002\u0000\u0000\u0095\u0099\u0005\t\u0000\u0000\u0096\u0097\u0003"+
		"\u000e\u0007\u0000\u0097\u0098\u0006\u0007\uffff\uffff\u0000\u0098\u009a"+
		"\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005\n\u0000\u0000\u009e\u009f\u0005\f\u0000\u0000\u009f\u00a3\u0005"+
		"\t\u0000\u0000\u00a0\u00a1\u0003\u000e\u0007\u0000\u00a1\u00a2\u0006\u0007"+
		"\uffff\uffff\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\n\u0000\u0000\u00a8\u00a9\u0006\u0007"+
		"\uffff\uffff\u0000\u00a9\u00c5\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006"+
		"\u0007\uffff\uffff\u0000\u00ab\u00ac\u0005\r\u0000\u0000\u00ac\u00ad\u0005"+
		"\u0011\u0000\u0000\u00ad\u00b5\u0005\u0001\u0000\u0000\u00ae\u00b0\u0005"+
		"\u0011\u0000\u0000\u00af\u00b1\u0005\u0003\u0000\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0006\u0007\uffff\uffff\u0000\u00b3\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0002\u0000\u0000\u00b9\u00bd\u0005\t\u0000\u0000\u00ba\u00bb\u0003"+
		"\u000e\u0007\u0000\u00bb\u00bc\u0006\u0007\uffff\uffff\u0000\u00bc\u00be"+
		"\u0001\u0000\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0005\n\u0000\u0000\u00c2\u00c3\u0006\u0007\uffff\uffff\u0000\u00c3\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c4p\u0001\u0000\u0000\u0000\u00c4s\u0001\u0000"+
		"\u0000\u0000\u00c4x\u0001\u0000\u0000\u0000\u00c4}\u0001\u0000\u0000\u0000"+
		"\u00c4\u0090\u0001\u0000\u0000\u0000\u00c4\u00aa\u0001\u0000\u0000\u0000"+
		"\u00c5\u000f\u0001\u0000\u0000\u0000\u000f\u0016%3=PY`m\u008b\u009b\u00a5"+
		"\u00b0\u00b5\u00bf\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}