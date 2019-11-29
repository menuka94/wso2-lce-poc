package org.wso2.antlr;

// Generated from ModelParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ModelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, COLON=2, DOT=3, COMMA=4, LEFT_BRACE=5, RIGHT_BRACE=6, LEFT_SQUARE_BRACKET=7, 
		RIGHT_SQUARE_BRACKET=8, SINGLE_QUOTE=9, DOUBLE_QUOTE=10, SINGLE_STRING=11, 
		DOUBLE_STRING=12, TRUE=13, FALSE=14, IDENTIFIER=15, HTTP_LISTENER=16, 
		LOG=17, METHOD=18, GET=19, POST=20, PUT=21, DELETE=22, OPTIONS=23, HEAD=24, 
		CONNECT=25, INFO=26, WARN=27, ERROR=28, NAME=29, ID=30, COMPONENTS=31, 
		TYPE=32, PROPERTIES=33, PATH=34, LOCATION=35, LEVEL=36, USERNAME=37, PASSWORD=38, 
		FILENAME=39;
	public static final int
		RULE_compilationUnit = 0, RULE_name = 1, RULE_id = 2, RULE_components = 3, 
		RULE_array = 4, RULE_component = 5, RULE_type = 6, RULE_properties = 7, 
		RULE_property = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "name", "id", "components", "array", "component", 
			"type", "properties", "property"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'.'", "','", "'{'", "'}'", "'['", "']'", "'''", 
			"'\"'", null, null, "'true'", "'false'", null, "'httpListener'", "'log'", 
			"'method'", "'get'", "'post'", "'put'", "'delete'", "'options'", "'head'", 
			"'connect'", "'info'", "'warn'", "'error'", "'name'", "'id'", "'components'", 
			"'type'", "'properties'", "'path'", "'location'", "'level'", "'username'", 
			"'password'", "'filename'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "COLON", "DOT", "COMMA", "LEFT_BRACE", "RIGHT_BRACE", 
			"LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "SINGLE_QUOTE", "DOUBLE_QUOTE", 
			"SINGLE_STRING", "DOUBLE_STRING", "TRUE", "FALSE", "IDENTIFIER", "HTTP_LISTENER", 
			"LOG", "METHOD", "GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "CONNECT", 
			"INFO", "WARN", "ERROR", "NAME", "ID", "COMPONENTS", "TYPE", "PROPERTIES", 
			"PATH", "LOCATION", "LEVEL", "USERNAME", "PASSWORD", "FILENAME"
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
	public String getGrammarFileName() { return "ModelParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ModelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ComponentsContext components() {
			return getRuleContext(ComponentsContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			name();
			setState(19);
			id();
			setState(20);
			components();
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

	public static class NameContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(ModelParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(ModelParser.DOUBLE_QUOTE, i);
		}
		public TerminalNode NAME() { return getToken(ModelParser.NAME, 0); }
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode DOUBLE_STRING() { return getToken(ModelParser.DOUBLE_STRING, 0); }
		public TerminalNode COMMA() { return getToken(ModelParser.COMMA, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(DOUBLE_QUOTE);
			setState(23);
			match(NAME);
			setState(24);
			match(DOUBLE_QUOTE);
			setState(25);
			match(COLON);
			setState(26);
			match(DOUBLE_STRING);
			setState(27);
			match(COMMA);
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

	public static class IdContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(ModelParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(ModelParser.DOUBLE_QUOTE, i);
		}
		public TerminalNode ID() { return getToken(ModelParser.ID, 0); }
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode DOUBLE_STRING() { return getToken(ModelParser.DOUBLE_STRING, 0); }
		public TerminalNode COMMA() { return getToken(ModelParser.COMMA, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(DOUBLE_QUOTE);
			setState(30);
			match(ID);
			setState(31);
			match(DOUBLE_QUOTE);
			setState(32);
			match(COLON);
			setState(33);
			match(DOUBLE_STRING);
			setState(34);
			match(COMMA);
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

	public static class ComponentsContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(ModelParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(ModelParser.DOUBLE_QUOTE, i);
		}
		public TerminalNode COMPONENTS() { return getToken(ModelParser.COMPONENTS, 0); }
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_components; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitComponents(this);
		}
	}

	public final ComponentsContext components() throws RecognitionException {
		ComponentsContext _localctx = new ComponentsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_components);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(DOUBLE_QUOTE);
			setState(37);
			match(COMPONENTS);
			setState(38);
			match(DOUBLE_QUOTE);
			setState(39);
			match(COLON);
			setState(40);
			array();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LEFT_SQUARE_BRACKET() { return getToken(ModelParser.LEFT_SQUARE_BRACKET, 0); }
		public TerminalNode RIGHT_SQUARE_BRACKET() { return getToken(ModelParser.RIGHT_SQUARE_BRACKET, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ModelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ModelParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(LEFT_SQUARE_BRACKET);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFT_BRACE) {
				{
				setState(43);
				component();
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(44);
					match(COMMA);
					setState(45);
					component();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(53);
			match(RIGHT_SQUARE_BRACKET);
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

	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(ModelParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(ModelParser.RIGHT_BRACE, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<PropertiesContext> properties() {
			return getRuleContexts(PropertiesContext.class);
		}
		public PropertiesContext properties(int i) {
			return getRuleContext(PropertiesContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ModelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ModelParser.COMMA, i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LEFT_BRACE);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE_QUOTE) {
				{
				{
				setState(56);
				type();
				setState(57);
				id();
				setState(58);
				properties();
				setState(59);
				match(COMMA);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(RIGHT_BRACE);
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

	public static class TypeContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(ModelParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(ModelParser.DOUBLE_QUOTE, i);
		}
		public TerminalNode TYPE() { return getToken(ModelParser.TYPE, 0); }
		public TerminalNode COLON() { return getToken(ModelParser.COLON, 0); }
		public TerminalNode DOUBLE_STRING() { return getToken(ModelParser.DOUBLE_STRING, 0); }
		public TerminalNode COMMA() { return getToken(ModelParser.COMMA, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(DOUBLE_QUOTE);
			setState(69);
			match(TYPE);
			setState(70);
			match(DOUBLE_QUOTE);
			setState(71);
			match(COLON);
			setState(72);
			match(DOUBLE_STRING);
			setState(73);
			match(COMMA);
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

	public static class PropertiesContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(ModelParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(ModelParser.RIGHT_BRACE, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitProperties(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LEFT_BRACE);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOUBLE_QUOTE) {
				{
				{
				setState(76);
				property();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(RIGHT_BRACE);
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

	public static class PropertyContext extends ParserRuleContext {
		public List<TerminalNode> DOUBLE_QUOTE() { return getTokens(ModelParser.DOUBLE_QUOTE); }
		public TerminalNode DOUBLE_QUOTE(int i) {
			return getToken(ModelParser.DOUBLE_QUOTE, i);
		}
		public TerminalNode METHOD() { return getToken(ModelParser.METHOD, 0); }
		public TerminalNode PATH() { return getToken(ModelParser.PATH, 0); }
		public TerminalNode LEVEL() { return getToken(ModelParser.LEVEL, 0); }
		public TerminalNode LOCATION() { return getToken(ModelParser.LOCATION, 0); }
		public TerminalNode USERNAME() { return getToken(ModelParser.USERNAME, 0); }
		public TerminalNode PASSWORD() { return getToken(ModelParser.PASSWORD, 0); }
		public TerminalNode FILENAME() { return getToken(ModelParser.FILENAME, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ModelParserListener ) ((ModelParserListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(DOUBLE_QUOTE);
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << METHOD) | (1L << PATH) | (1L << LOCATION) | (1L << LEVEL) | (1L << USERNAME) | (1L << PASSWORD) | (1L << FILENAME))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
			match(DOUBLE_QUOTE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)[\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6\64\13\6\5\6\66\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7@\n\7\f\7\16\7C\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\tP\n\t\f\t\16\tS\13\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\4\2\24\24$)\2U\2\24\3\2\2\2"+
		"\4\30\3\2\2\2\6\37\3\2\2\2\b&\3\2\2\2\n,\3\2\2\2\f9\3\2\2\2\16F\3\2\2"+
		"\2\20M\3\2\2\2\22V\3\2\2\2\24\25\5\4\3\2\25\26\5\6\4\2\26\27\5\b\5\2\27"+
		"\3\3\2\2\2\30\31\7\f\2\2\31\32\7\37\2\2\32\33\7\f\2\2\33\34\7\4\2\2\34"+
		"\35\7\16\2\2\35\36\7\6\2\2\36\5\3\2\2\2\37 \7\f\2\2 !\7 \2\2!\"\7\f\2"+
		"\2\"#\7\4\2\2#$\7\16\2\2$%\7\6\2\2%\7\3\2\2\2&\'\7\f\2\2\'(\7!\2\2()\7"+
		"\f\2\2)*\7\4\2\2*+\5\n\6\2+\t\3\2\2\2,\65\7\t\2\2-\62\5\f\7\2./\7\6\2"+
		"\2/\61\5\f\7\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\66\3\2\2\2\64\62\3\2\2\2\65-\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678"+
		"\7\n\2\28\13\3\2\2\29A\7\7\2\2:;\5\16\b\2;<\5\6\4\2<=\5\20\t\2=>\7\6\2"+
		"\2>@\3\2\2\2?:\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2"+
		"\2DE\7\b\2\2E\r\3\2\2\2FG\7\f\2\2GH\7\"\2\2HI\7\f\2\2IJ\7\4\2\2JK\7\16"+
		"\2\2KL\7\6\2\2L\17\3\2\2\2MQ\7\7\2\2NP\5\22\n\2ON\3\2\2\2PS\3\2\2\2QO"+
		"\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\b\2\2U\21\3\2\2\2VW\7\f\2\2"+
		"WX\t\2\2\2XY\7\f\2\2Y\23\3\2\2\2\6\62\65AQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}