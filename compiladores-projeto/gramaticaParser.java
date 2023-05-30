// Generated from gramatica.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, NUM=36, ID=37, STRING=38, Ws=39;
	public static final int
		RULE_init = 0, RULE_inicio = 1, RULE_bloco = 2, RULE_declaracao = 3, RULE_atribuicao = 4, 
		RULE_condicional = 5, RULE_enquanto = 6, RULE_para = 7, RULE_condicao = 8, 
		RULE_printar = 9, RULE_declaracao_cond = 10, RULE_operacao_mat = 11, RULE_input_int = 12, 
		RULE_input_string = 13, RULE_input_double = 14, RULE_entrada = 15, RULE_variavel = 16, 
		RULE_numero = 17, RULE_string = 18, RULE_inteiro = 19, RULE_real = 20, 
		RULE_texto = 21, RULE_tipo = 22, RULE_int_abv = 23, RULE_rl_abv = 24, 
		RULE_txt_abv = 25, RULE_maior_que = 26, RULE_menor_que = 27, RULE_maior_igual = 28, 
		RULE_menor_igual = 29, RULE_igual = 30, RULE_igual_duplo = 31, RULE_operador = 32, 
		RULE_definicao = 33, RULE_mais = 34, RULE_duplo_mais = 35, RULE_duplo_menos = 36, 
		RULE_dobro = 37, RULE_dobro_menos = 38, RULE_menos = 39, RULE_multiplicacao = 40, 
		RULE_divisao = 41, RULE_operador_matematico = 42, RULE_end = 43, RULE_se = 44, 
		RULE_senao = 45, RULE_senao_se = 46, RULE_eqt = 47, RULE_pr = 48, RULE_abre_bloco = 49, 
		RULE_fecha_bloco = 50, RULE_divisor = 51, RULE_abre_prt = 52, RULE_fecha_prt = 53, 
		RULE_printa = 54, RULE_input = 55, RULE_leitura_i = 56, RULE_leitura_s = 57, 
		RULE_leitura_r = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "inicio", "bloco", "declaracao", "atribuicao", "condicional", 
			"enquanto", "para", "condicao", "printar", "declaracao_cond", "operacao_mat", 
			"input_int", "input_string", "input_double", "entrada", "variavel", "numero", 
			"string", "inteiro", "real", "texto", "tipo", "int_abv", "rl_abv", "txt_abv", 
			"maior_que", "menor_que", "maior_igual", "menor_igual", "igual", "igual_duplo", 
			"operador", "definicao", "mais", "duplo_mais", "duplo_menos", "dobro", 
			"dobro_menos", "menos", "multiplicacao", "divisao", "operador_matematico", 
			"end", "se", "senao", "senao_se", "eqt", "pr", "abre_bloco", "fecha_bloco", 
			"divisor", "abre_prt", "fecha_prt", "printa", "input", "leitura_i", "leitura_s", 
			"leitura_r"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inteiro'", "'real'", "'texto'", "'int'", "'rl'", "'txt'", "'>'", 
			"'<'", "'>='", "'<='", "'='", "'=='", "'->'", "'+'", "'++'", "'--'", 
			"'-'", "'*'", "'/'", "'.'", "'se'", "'senao'", "'senao se'", "'enquanto'", 
			"'para'", "'?'", "'\\u00BF'", "'|'", "'('", "')'", "'exiba'", "'leia'", 
			"'leia.inteiro().'", "'leia.texto().'", "'leia.real().'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUM", "ID", "STRING", "Ws"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				inicio();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 139638865934L) != 0) );
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
	public static class InicioContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public PrintarContext printar() {
			return getRuleContext(PrintarContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inicio);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				declaracao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				condicional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				enquanto();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				para();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				printar();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				atribuicao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
				entrada();
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
	public static class BlocoContext extends ParserRuleContext {
		public DobroContext dobro() {
			return getRuleContext(DobroContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public Dobro_menosContext dobro_menos() {
			return getRuleContext(Dobro_menosContext.class,0);
		}
		public Operacao_matContext operacao_mat() {
			return getRuleContext(Operacao_matContext.class,0);
		}
		public PrintarContext printar() {
			return getRuleContext(PrintarContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public EntradaContext entrada() {
			return getRuleContext(EntradaContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				dobro();
				setState(133);
				end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				dobro_menos();
				setState(136);
				end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				operacao_mat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				printar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				atribuicao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				entrada();
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public List<Operacao_matContext> operacao_mat() {
			return getRuleContexts(Operacao_matContext.class);
		}
		public Operacao_matContext operacao_mat(int i) {
			return getRuleContext(Operacao_matContext.class,i);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			tipo();
			setState(145);
			variavel();
			setState(146);
			definicao();
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(150);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(147);
						variavel();
						}
						break;
					case NUM:
						{
						setState(148);
						numero();
						}
						break;
					case STRING:
						{
						setState(149);
						string();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM || _la==ID) {
				{
				{
				setState(155);
				operacao_mat();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			end();
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Operacao_matContext operacao_mat() {
			return getRuleContext(Operacao_matContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			variavel();
			setState(164);
			definicao();
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(165);
				variavel();
				}
				break;
			case 2:
				{
				setState(166);
				numero();
				}
				break;
			case 3:
				{
				setState(167);
				string();
				}
				break;
			case 4:
				{
				setState(168);
				operacao_mat();
				}
				break;
			}
			setState(171);
			end();
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
	public static class CondicionalContext extends ParserRuleContext {
		public SeContext se() {
			return getRuleContext(SeContext.class,0);
		}
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public Senao_seContext senao_se() {
			return getRuleContext(Senao_seContext.class,0);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public Abre_blocoContext abre_bloco() {
			return getRuleContext(Abre_blocoContext.class,0);
		}
		public Fecha_blocoContext fecha_bloco() {
			return getRuleContext(Fecha_blocoContext.class,0);
		}
		public InicioContext inicio() {
			return getRuleContext(InicioContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			se();
			setState(174);
			condicao();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(175);
				senao_se();
				setState(176);
				condicao();
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(180);
				senao();
				setState(181);
				abre_bloco();
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(182);
					inicio();
					}
					break;
				case 2:
					{
					setState(183);
					bloco();
					}
					break;
				}
				setState(186);
				fecha_bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoContext extends ParserRuleContext {
		public EqtContext eqt() {
			return getRuleContext(EqtContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			eqt();
			setState(191);
			condicao();
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
	public static class ParaContext extends ParserRuleContext {
		public PrContext pr() {
			return getRuleContext(PrContext.class,0);
		}
		public Abre_prtContext abre_prt() {
			return getRuleContext(Abre_prtContext.class,0);
		}
		public Declaracao_condContext declaracao_cond() {
			return getRuleContext(Declaracao_condContext.class,0);
		}
		public List<DivisorContext> divisor() {
			return getRuleContexts(DivisorContext.class);
		}
		public DivisorContext divisor(int i) {
			return getRuleContext(DivisorContext.class,i);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public Fecha_prtContext fecha_prt() {
			return getRuleContext(Fecha_prtContext.class,0);
		}
		public Abre_blocoContext abre_bloco() {
			return getRuleContext(Abre_blocoContext.class,0);
		}
		public Fecha_blocoContext fecha_bloco() {
			return getRuleContext(Fecha_blocoContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public DobroContext dobro() {
			return getRuleContext(DobroContext.class,0);
		}
		public Dobro_menosContext dobro_menos() {
			return getRuleContext(Dobro_menosContext.class,0);
		}
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			pr();
			setState(194);
			abre_prt();
			setState(195);
			declaracao_cond();
			setState(196);
			divisor();
			setState(197);
			variavel();
			setState(198);
			operador();
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(199);
				variavel();
				}
				break;
			case NUM:
				{
				setState(200);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(203);
			divisor();
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(204);
				dobro();
				}
				break;
			case 2:
				{
				setState(205);
				dobro_menos();
				}
				break;
			}
			setState(208);
			fecha_prt();
			setState(209);
			abre_bloco();
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(210);
					inicio();
					}
					break;
				case 2:
					{
					setState(211);
					bloco();
					}
					break;
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 208358342670L) != 0) );
			setState(216);
			fecha_bloco();
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
	public static class CondicaoContext extends ParserRuleContext {
		public Abre_prtContext abre_prt() {
			return getRuleContext(Abre_prtContext.class,0);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public Fecha_prtContext fecha_prt() {
			return getRuleContext(Fecha_prtContext.class,0);
		}
		public Abre_blocoContext abre_bloco() {
			return getRuleContext(Abre_blocoContext.class,0);
		}
		public Fecha_blocoContext fecha_bloco() {
			return getRuleContext(Fecha_blocoContext.class,0);
		}
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<InicioContext> inicio() {
			return getRuleContexts(InicioContext.class);
		}
		public InicioContext inicio(int i) {
			return getRuleContext(InicioContext.class,i);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCondicao(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			abre_prt();
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(219);
				variavel();
				}
				break;
			case NUM:
				{
				setState(220);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(223);
			operador();
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(224);
				variavel();
				}
				break;
			case NUM:
				{
				setState(225);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(228);
			fecha_prt();
			setState(229);
			abre_bloco();
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(232);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(230);
					inicio();
					}
					break;
				case 2:
					{
					setState(231);
					bloco();
					}
					break;
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 208358342670L) != 0) );
			setState(236);
			fecha_bloco();
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
	public static class PrintarContext extends ParserRuleContext {
		public PrintaContext printa() {
			return getRuleContext(PrintaContext.class,0);
		}
		public Abre_prtContext abre_prt() {
			return getRuleContext(Abre_prtContext.class,0);
		}
		public Fecha_prtContext fecha_prt() {
			return getRuleContext(Fecha_prtContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Operacao_matContext operacao_mat() {
			return getRuleContext(Operacao_matContext.class,0);
		}
		public PrintarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrintar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrintar(this);
		}
	}

	public final PrintarContext printar() throws RecognitionException {
		PrintarContext _localctx = new PrintarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_printar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			printa();
			setState(239);
			abre_prt();
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(240);
				string();
				}
				break;
			case 2:
				{
				setState(241);
				variavel();
				}
				break;
			case 3:
				{
				setState(242);
				numero();
				}
				break;
			case 4:
				{
				setState(243);
				operacao_mat();
				}
				break;
			}
			setState(246);
			fecha_prt();
			setState(247);
			end();
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
	public static class Declaracao_condContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Declaracao_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracao_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracao_cond(this);
		}
	}

	public final Declaracao_condContext declaracao_cond() throws RecognitionException {
		Declaracao_condContext _localctx = new Declaracao_condContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracao_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			variavel();
			setState(250);
			definicao();
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(251);
				variavel();
				}
				break;
			case NUM:
				{
				setState(252);
				numero();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operacao_matContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<Operador_matematicoContext> operador_matematico() {
			return getRuleContexts(Operador_matematicoContext.class);
		}
		public Operador_matematicoContext operador_matematico(int i) {
			return getRuleContext(Operador_matematicoContext.class,i);
		}
		public Operacao_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_mat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperacao_mat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperacao_mat(this);
		}
	}

	public final Operacao_matContext operacao_mat() throws RecognitionException {
		Operacao_matContext _localctx = new Operacao_matContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operacao_mat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(255);
				variavel();
				}
				break;
			case NUM:
				{
				setState(256);
				numero();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(264); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				operador_matematico();
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(260);
					variavel();
					}
					break;
				case NUM:
					{
					setState(261);
					numero();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 933888L) != 0) );
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
	public static class Input_intContext extends ParserRuleContext {
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public Leitura_iContext leitura_i() {
			return getRuleContext(Leitura_iContext.class,0);
		}
		public Input_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInput_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInput_int(this);
		}
	}

	public final Input_intContext input_int() throws RecognitionException {
		Input_intContext _localctx = new Input_intContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_input_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			inteiro();
			setState(269);
			variavel();
			setState(270);
			definicao();
			setState(271);
			leitura_i();
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
	public static class Input_stringContext extends ParserRuleContext {
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public Leitura_sContext leitura_s() {
			return getRuleContext(Leitura_sContext.class,0);
		}
		public Input_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInput_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInput_string(this);
		}
	}

	public final Input_stringContext input_string() throws RecognitionException {
		Input_stringContext _localctx = new Input_stringContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_input_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			texto();
			setState(274);
			variavel();
			setState(275);
			definicao();
			setState(276);
			leitura_s();
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
	public static class Input_doubleContext extends ParserRuleContext {
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public DefinicaoContext definicao() {
			return getRuleContext(DefinicaoContext.class,0);
		}
		public Leitura_rContext leitura_r() {
			return getRuleContext(Leitura_rContext.class,0);
		}
		public Input_doubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_double; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInput_double(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInput_double(this);
		}
	}

	public final Input_doubleContext input_double() throws RecognitionException {
		Input_doubleContext _localctx = new Input_doubleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_input_double);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			real();
			setState(279);
			variavel();
			setState(280);
			definicao();
			setState(281);
			leitura_r();
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
	public static class EntradaContext extends ParserRuleContext {
		public Input_intContext input_int() {
			return getRuleContext(Input_intContext.class,0);
		}
		public Input_doubleContext input_double() {
			return getRuleContext(Input_doubleContext.class,0);
		}
		public Input_stringContext input_string() {
			return getRuleContext(Input_stringContext.class,0);
		}
		public EntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEntrada(this);
		}
	}

	public final EntradaContext entrada() throws RecognitionException {
		EntradaContext _localctx = new EntradaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_entrada);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				input_int();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				input_double();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(285);
				input_string();
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
	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(ID);
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
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(gramaticaParser.NUM, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gramaticaParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(STRING);
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
	public static class InteiroContext extends ParserRuleContext {
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInteiro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInteiro(this);
		}
	}

	public final InteiroContext inteiro() throws RecognitionException {
		InteiroContext _localctx = new InteiroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_inteiro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__0);
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
	public static class RealContext extends ParserRuleContext {
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitReal(this);
		}
	}

	public final RealContext real() throws RecognitionException {
		RealContext _localctx = new RealContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_real);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__1);
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
	public static class TextoContext extends ParserRuleContext {
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public InteiroContext inteiro() {
			return getRuleContext(InteiroContext.class,0);
		}
		public RealContext real() {
			return getRuleContext(RealContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipo);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				inteiro();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				real();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				texto();
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
	public static class Int_abvContext extends ParserRuleContext {
		public Int_abvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_abv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInt_abv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInt_abv(this);
		}
	}

	public final Int_abvContext int_abv() throws RecognitionException {
		Int_abvContext _localctx = new Int_abvContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_int_abv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(T__3);
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
	public static class Rl_abvContext extends ParserRuleContext {
		public Rl_abvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rl_abv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRl_abv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRl_abv(this);
		}
	}

	public final Rl_abvContext rl_abv() throws RecognitionException {
		Rl_abvContext _localctx = new Rl_abvContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rl_abv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(T__4);
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
	public static class Txt_abvContext extends ParserRuleContext {
		public Txt_abvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txt_abv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTxt_abv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTxt_abv(this);
		}
	}

	public final Txt_abvContext txt_abv() throws RecognitionException {
		Txt_abvContext _localctx = new Txt_abvContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_txt_abv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__5);
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
	public static class Maior_queContext extends ParserRuleContext {
		public Maior_queContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior_que; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMaior_que(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMaior_que(this);
		}
	}

	public final Maior_queContext maior_que() throws RecognitionException {
		Maior_queContext _localctx = new Maior_queContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_maior_que);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Menor_queContext extends ParserRuleContext {
		public Menor_queContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor_que; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMenor_que(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMenor_que(this);
		}
	}

	public final Menor_queContext menor_que() throws RecognitionException {
		Menor_queContext _localctx = new Menor_queContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_menor_que);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__7);
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
	public static class Maior_igualContext extends ParserRuleContext {
		public Maior_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMaior_igual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMaior_igual(this);
		}
	}

	public final Maior_igualContext maior_igual() throws RecognitionException {
		Maior_igualContext _localctx = new Maior_igualContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_maior_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Menor_igualContext extends ParserRuleContext {
		public Menor_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMenor_igual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMenor_igual(this);
		}
	}

	public final Menor_igualContext menor_igual() throws RecognitionException {
		Menor_igualContext _localctx = new Menor_igualContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_menor_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IgualContext extends ParserRuleContext {
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIgual(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__10);
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
	public static class Igual_duploContext extends ParserRuleContext {
		public Igual_duploContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual_duplo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterIgual_duplo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitIgual_duplo(this);
		}
	}

	public final Igual_duploContext igual_duplo() throws RecognitionException {
		Igual_duploContext _localctx = new Igual_duploContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_igual_duplo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__11);
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
	public static class OperadorContext extends ParserRuleContext {
		public Maior_queContext maior_que() {
			return getRuleContext(Maior_queContext.class,0);
		}
		public Menor_queContext menor_que() {
			return getRuleContext(Menor_queContext.class,0);
		}
		public Maior_igualContext maior_igual() {
			return getRuleContext(Maior_igualContext.class,0);
		}
		public Menor_igualContext menor_igual() {
			return getRuleContext(Menor_igualContext.class,0);
		}
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public Igual_duploContext igual_duplo() {
			return getRuleContext(Igual_duploContext.class,0);
		}
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperador(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operador);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				maior_que();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				menor_que();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				maior_igual();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				menor_igual();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				igual();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 6);
				{
				setState(328);
				igual_duplo();
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
	public static class DefinicaoContext extends ParserRuleContext {
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDefinicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDefinicao(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_definicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__12);
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
	public static class MaisContext extends ParserRuleContext {
		public MaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMais(this);
		}
	}

	public final MaisContext mais() throws RecognitionException {
		MaisContext _localctx = new MaisContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Duplo_maisContext extends ParserRuleContext {
		public Duplo_maisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplo_mais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDuplo_mais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDuplo_mais(this);
		}
	}

	public final Duplo_maisContext duplo_mais() throws RecognitionException {
		Duplo_maisContext _localctx = new Duplo_maisContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_duplo_mais);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Duplo_menosContext extends ParserRuleContext {
		public Duplo_menosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplo_menos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDuplo_menos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDuplo_menos(this);
		}
	}

	public final Duplo_menosContext duplo_menos() throws RecognitionException {
		Duplo_menosContext _localctx = new Duplo_menosContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_duplo_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__15);
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
	public static class DobroContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Duplo_maisContext duplo_mais() {
			return getRuleContext(Duplo_maisContext.class,0);
		}
		public DobroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dobro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDobro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDobro(this);
		}
	}

	public final DobroContext dobro() throws RecognitionException {
		DobroContext _localctx = new DobroContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_dobro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			variavel();
			setState(340);
			duplo_mais();
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
	public static class Dobro_menosContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Duplo_menosContext duplo_menos() {
			return getRuleContext(Duplo_menosContext.class,0);
		}
		public Dobro_menosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dobro_menos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDobro_menos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDobro_menos(this);
		}
	}

	public final Dobro_menosContext dobro_menos() throws RecognitionException {
		Dobro_menosContext _localctx = new Dobro_menosContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dobro_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			variavel();
			setState(343);
			duplo_menos();
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
	public static class MenosContext extends ParserRuleContext {
		public MenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMenos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMenos(this);
		}
	}

	public final MenosContext menos() throws RecognitionException {
		MenosContext _localctx = new MenosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_menos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacaoContext extends ParserRuleContext {
		public MultiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitMultiplicacao(this);
		}
	}

	public final MultiplicacaoContext multiplicacao() throws RecognitionException {
		MultiplicacaoContext _localctx = new MultiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_multiplicacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DivisaoContext extends ParserRuleContext {
		public DivisaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDivisao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDivisao(this);
		}
	}

	public final DivisaoContext divisao() throws RecognitionException {
		DivisaoContext _localctx = new DivisaoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_divisao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__18);
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
	public static class Operador_matematicoContext extends ParserRuleContext {
		public MaisContext mais() {
			return getRuleContext(MaisContext.class,0);
		}
		public MenosContext menos() {
			return getRuleContext(MenosContext.class,0);
		}
		public MultiplicacaoContext multiplicacao() {
			return getRuleContext(MultiplicacaoContext.class,0);
		}
		public DivisaoContext divisao() {
			return getRuleContext(DivisaoContext.class,0);
		}
		public Operador_matematicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_matematico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterOperador_matematico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitOperador_matematico(this);
		}
	}

	public final Operador_matematicoContext operador_matematico() throws RecognitionException {
		Operador_matematicoContext _localctx = new Operador_matematicoContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operador_matematico);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				mais();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				menos();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				multiplicacao();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				divisao();
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
	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(T__19);
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
	public static class SeContext extends ParserRuleContext {
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSe(this);
		}
	}

	public final SeContext se() throws RecognitionException {
		SeContext _localctx = new SeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__20);
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
	public static class SenaoContext extends ParserRuleContext {
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_senao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(T__21);
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
	public static class Senao_seContext extends ParserRuleContext {
		public Senao_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_se; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSenao_se(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSenao_se(this);
		}
	}

	public final Senao_seContext senao_se() throws RecognitionException {
		Senao_seContext _localctx = new Senao_seContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_senao_se);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__22);
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
	public static class EqtContext extends ParserRuleContext {
		public EqtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEqt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEqt(this);
		}
	}

	public final EqtContext eqt() throws RecognitionException {
		EqtContext _localctx = new EqtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_eqt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__23);
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
	public static class PrContext extends ParserRuleContext {
		public PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPr(this);
		}
	}

	public final PrContext pr() throws RecognitionException {
		PrContext _localctx = new PrContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(T__24);
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
	public static class Abre_blocoContext extends ParserRuleContext {
		public Abre_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abre_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAbre_bloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAbre_bloco(this);
		}
	}

	public final Abre_blocoContext abre_bloco() throws RecognitionException {
		Abre_blocoContext _localctx = new Abre_blocoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_abre_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__25);
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
	public static class Fecha_blocoContext extends ParserRuleContext {
		public Fecha_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFecha_bloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFecha_bloco(this);
		}
	}

	public final Fecha_blocoContext fecha_bloco() throws RecognitionException {
		Fecha_blocoContext _localctx = new Fecha_blocoContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_fecha_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__26);
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
	public static class DivisorContext extends ParserRuleContext {
		public DivisorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDivisor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDivisor(this);
		}
	}

	public final DivisorContext divisor() throws RecognitionException {
		DivisorContext _localctx = new DivisorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_divisor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__27);
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
	public static class Abre_prtContext extends ParserRuleContext {
		public Abre_prtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abre_prt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAbre_prt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAbre_prt(this);
		}
	}

	public final Abre_prtContext abre_prt() throws RecognitionException {
		Abre_prtContext _localctx = new Abre_prtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_abre_prt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__28);
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
	public static class Fecha_prtContext extends ParserRuleContext {
		public Fecha_prtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha_prt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFecha_prt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFecha_prt(this);
		}
	}

	public final Fecha_prtContext fecha_prt() throws RecognitionException {
		Fecha_prtContext _localctx = new Fecha_prtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fecha_prt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__29);
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
	public static class PrintaContext extends ParserRuleContext {
		public PrintaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrinta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrinta(this);
		}
	}

	public final PrintaContext printa() throws RecognitionException {
		PrintaContext _localctx = new PrintaContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_printa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__30);
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
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__31);
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
	public static class Leitura_iContext extends ParserRuleContext {
		public Leitura_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura_i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLeitura_i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLeitura_i(this);
		}
	}

	public final Leitura_iContext leitura_i() throws RecognitionException {
		Leitura_iContext _localctx = new Leitura_iContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_leitura_i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__32);
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
	public static class Leitura_sContext extends ParserRuleContext {
		public Leitura_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLeitura_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLeitura_s(this);
		}
	}

	public final Leitura_sContext leitura_s() throws RecognitionException {
		Leitura_sContext _localctx = new Leitura_sContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_leitura_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(T__33);
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
	public static class Leitura_rContext extends ParserRuleContext {
		public Leitura_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterLeitura_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitLeitura_r(this);
		}
	}

	public final Leitura_rContext leitura_r() throws RecognitionException {
		Leitura_rContext _localctx = new Leitura_rContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_leitura_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__34);
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
		"\u0004\u0001\'\u0186\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0001\u0000\u0004\u0000"+
		"x\b\u0000\u000b\u0000\f\u0000y\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0083\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008f\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0097\b\u0003\n\u0003\f\u0003\u009a\t\u0003\u0001\u0003\u0005\u0003"+
		"\u009d\b\u0003\n\u0003\f\u0003\u00a0\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00aa\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b3\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b9\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00bd\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00ca\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00cf\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0004\u0007\u00d5\b\u0007\u000b\u0007\f\u0007\u00d6\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u00e3\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00e9"+
		"\b\b\u000b\b\f\b\u00ea\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u00f5\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u00fe\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0102\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0107\b"+
		"\u000b\u0004\u000b\u0109\b\u000b\u000b\u000b\f\u000b\u010a\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u011f\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0130\b\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u014a\b \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0003*\u0164\b*\u0001+\u0001"+
		"+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u0001"+
		"0\u00011\u00011\u00012\u00012\u00013\u00013\u00014\u00014\u00015\u0001"+
		"5\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0000\u0000;\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprt\u0000\u0000\u017b\u0000w\u0001\u0000\u0000\u0000\u0002\u0082"+
		"\u0001\u0000\u0000\u0000\u0004\u008e\u0001\u0000\u0000\u0000\u0006\u0090"+
		"\u0001\u0000\u0000\u0000\b\u00a3\u0001\u0000\u0000\u0000\n\u00ad\u0001"+
		"\u0000\u0000\u0000\f\u00be\u0001\u0000\u0000\u0000\u000e\u00c1\u0001\u0000"+
		"\u0000\u0000\u0010\u00da\u0001\u0000\u0000\u0000\u0012\u00ee\u0001\u0000"+
		"\u0000\u0000\u0014\u00f9\u0001\u0000\u0000\u0000\u0016\u0101\u0001\u0000"+
		"\u0000\u0000\u0018\u010c\u0001\u0000\u0000\u0000\u001a\u0111\u0001\u0000"+
		"\u0000\u0000\u001c\u0116\u0001\u0000\u0000\u0000\u001e\u011e\u0001\u0000"+
		"\u0000\u0000 \u0120\u0001\u0000\u0000\u0000\"\u0122\u0001\u0000\u0000"+
		"\u0000$\u0124\u0001\u0000\u0000\u0000&\u0126\u0001\u0000\u0000\u0000("+
		"\u0128\u0001\u0000\u0000\u0000*\u012a\u0001\u0000\u0000\u0000,\u012f\u0001"+
		"\u0000\u0000\u0000.\u0131\u0001\u0000\u0000\u00000\u0133\u0001\u0000\u0000"+
		"\u00002\u0135\u0001\u0000\u0000\u00004\u0137\u0001\u0000\u0000\u00006"+
		"\u0139\u0001\u0000\u0000\u00008\u013b\u0001\u0000\u0000\u0000:\u013d\u0001"+
		"\u0000\u0000\u0000<\u013f\u0001\u0000\u0000\u0000>\u0141\u0001\u0000\u0000"+
		"\u0000@\u0149\u0001\u0000\u0000\u0000B\u014b\u0001\u0000\u0000\u0000D"+
		"\u014d\u0001\u0000\u0000\u0000F\u014f\u0001\u0000\u0000\u0000H\u0151\u0001"+
		"\u0000\u0000\u0000J\u0153\u0001\u0000\u0000\u0000L\u0156\u0001\u0000\u0000"+
		"\u0000N\u0159\u0001\u0000\u0000\u0000P\u015b\u0001\u0000\u0000\u0000R"+
		"\u015d\u0001\u0000\u0000\u0000T\u0163\u0001\u0000\u0000\u0000V\u0165\u0001"+
		"\u0000\u0000\u0000X\u0167\u0001\u0000\u0000\u0000Z\u0169\u0001\u0000\u0000"+
		"\u0000\\\u016b\u0001\u0000\u0000\u0000^\u016d\u0001\u0000\u0000\u0000"+
		"`\u016f\u0001\u0000\u0000\u0000b\u0171\u0001\u0000\u0000\u0000d\u0173"+
		"\u0001\u0000\u0000\u0000f\u0175\u0001\u0000\u0000\u0000h\u0177\u0001\u0000"+
		"\u0000\u0000j\u0179\u0001\u0000\u0000\u0000l\u017b\u0001\u0000\u0000\u0000"+
		"n\u017d\u0001\u0000\u0000\u0000p\u017f\u0001\u0000\u0000\u0000r\u0181"+
		"\u0001\u0000\u0000\u0000t\u0183\u0001\u0000\u0000\u0000vx\u0003\u0002"+
		"\u0001\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0001\u0001\u0000\u0000"+
		"\u0000{\u0083\u0003\u0006\u0003\u0000|\u0083\u0003\n\u0005\u0000}\u0083"+
		"\u0003\f\u0006\u0000~\u0083\u0003\u000e\u0007\u0000\u007f\u0083\u0003"+
		"\u0012\t\u0000\u0080\u0083\u0003\b\u0004\u0000\u0081\u0083\u0003\u001e"+
		"\u000f\u0000\u0082{\u0001\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000"+
		"\u0082}\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0082\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0003\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0003J%\u0000\u0085\u0086\u0003V+\u0000\u0086\u008f\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0003L&\u0000\u0088\u0089\u0003V+\u0000\u0089\u008f"+
		"\u0001\u0000\u0000\u0000\u008a\u008f\u0003\u0016\u000b\u0000\u008b\u008f"+
		"\u0003\u0012\t\u0000\u008c\u008f\u0003\b\u0004\u0000\u008d\u008f\u0003"+
		"\u001e\u000f\u0000\u008e\u0084\u0001\u0000\u0000\u0000\u008e\u0087\u0001"+
		"\u0000\u0000\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008e\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0005\u0001\u0000\u0000\u0000\u0090\u0091\u0003"+
		",\u0016\u0000\u0091\u0092\u0003 \u0010\u0000\u0092\u0098\u0003B!\u0000"+
		"\u0093\u0097\u0003 \u0010\u0000\u0094\u0097\u0003\"\u0011\u0000\u0095"+
		"\u0097\u0003$\u0012\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u009a"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009e\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009b\u009d\u0003\u0016\u000b\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0003V+\u0000\u00a2\u0007\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003 "+
		"\u0010\u0000\u00a4\u00a9\u0003B!\u0000\u00a5\u00aa\u0003 \u0010\u0000"+
		"\u00a6\u00aa\u0003\"\u0011\u0000\u00a7\u00aa\u0003$\u0012\u0000\u00a8"+
		"\u00aa\u0003\u0016\u000b\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0003V+\u0000\u00ac\t\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003"+
		"X,\u0000\u00ae\u00b2\u0003\u0010\b\u0000\u00af\u00b0\u0003\\.\u0000\u00b0"+
		"\u00b1\u0003\u0010\b\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00bc"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0003Z-\u0000\u00b5\u00b8\u0003b"+
		"1\u0000\u00b6\u00b9\u0003\u0002\u0001\u0000\u00b7\u00b9\u0003\u0004\u0002"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003d2\u0000\u00bb"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b4\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u000b\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0003^/\u0000\u00bf\u00c0\u0003\u0010\b\u0000\u00c0\r\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0003`0\u0000\u00c2\u00c3\u0003h4\u0000\u00c3"+
		"\u00c4\u0003\u0014\n\u0000\u00c4\u00c5\u0003f3\u0000\u00c5\u00c6\u0003"+
		" \u0010\u0000\u00c6\u00c9\u0003@ \u0000\u00c7\u00ca\u0003 \u0010\u0000"+
		"\u00c8\u00ca\u0003\"\u0011\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ce\u0003f3\u0000\u00cc\u00cf\u0003J%\u0000\u00cd\u00cf\u0003L&\u0000"+
		"\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003j5\u0000\u00d1\u00d4"+
		"\u0003b1\u0000\u00d2\u00d5\u0003\u0002\u0001\u0000\u00d3\u00d5\u0003\u0004"+
		"\u0002\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0003d2\u0000\u00d9\u000f\u0001\u0000\u0000\u0000"+
		"\u00da\u00dd\u0003h4\u0000\u00db\u00de\u0003 \u0010\u0000\u00dc\u00de"+
		"\u0003\"\u0011\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e2\u0003"+
		"@ \u0000\u00e0\u00e3\u0003 \u0010\u0000\u00e1\u00e3\u0003\"\u0011\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003j5\u0000\u00e5\u00e8"+
		"\u0003b1\u0000\u00e6\u00e9\u0003\u0002\u0001\u0000\u00e7\u00e9\u0003\u0004"+
		"\u0002\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0003d2\u0000\u00ed\u0011\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0003l6\u0000\u00ef\u00f4\u0003h4\u0000\u00f0\u00f5\u0003"+
		"$\u0012\u0000\u00f1\u00f5\u0003 \u0010\u0000\u00f2\u00f5\u0003\"\u0011"+
		"\u0000\u00f3\u00f5\u0003\u0016\u000b\u0000\u00f4\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0003j5\u0000\u00f7\u00f8\u0003V+\u0000\u00f8\u0013"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0003 \u0010\u0000\u00fa\u00fd\u0003"+
		"B!\u0000\u00fb\u00fe\u0003 \u0010\u0000\u00fc\u00fe\u0003\"\u0011\u0000"+
		"\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u0015\u0001\u0000\u0000\u0000\u00ff\u0102\u0003 \u0010\u0000\u0100"+
		"\u0102\u0003\"\u0011\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0108\u0001\u0000\u0000\u0000\u0103\u0106"+
		"\u0003T*\u0000\u0104\u0107\u0003 \u0010\u0000\u0105\u0107\u0003\"\u0011"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0103\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0017\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0003&\u0013\u0000\u010d\u010e\u0003 \u0010\u0000\u010e"+
		"\u010f\u0003B!\u0000\u010f\u0110\u0003p8\u0000\u0110\u0019\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0003*\u0015\u0000\u0112\u0113\u0003 \u0010\u0000"+
		"\u0113\u0114\u0003B!\u0000\u0114\u0115\u0003r9\u0000\u0115\u001b\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0003(\u0014\u0000\u0117\u0118\u0003 \u0010"+
		"\u0000\u0118\u0119\u0003B!\u0000\u0119\u011a\u0003t:\u0000\u011a\u001d"+
		"\u0001\u0000\u0000\u0000\u011b\u011f\u0003\u0018\f\u0000\u011c\u011f\u0003"+
		"\u001c\u000e\u0000\u011d\u011f\u0003\u001a\r\u0000\u011e\u011b\u0001\u0000"+
		"\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011d\u0001\u0000"+
		"\u0000\u0000\u011f\u001f\u0001\u0000\u0000\u0000\u0120\u0121\u0005%\u0000"+
		"\u0000\u0121!\u0001\u0000\u0000\u0000\u0122\u0123\u0005$\u0000\u0000\u0123"+
		"#\u0001\u0000\u0000\u0000\u0124\u0125\u0005&\u0000\u0000\u0125%\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0005\u0001\u0000\u0000\u0127\'\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0005\u0002\u0000\u0000\u0129)\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0005\u0003\u0000\u0000\u012b+\u0001\u0000\u0000\u0000"+
		"\u012c\u0130\u0003&\u0013\u0000\u012d\u0130\u0003(\u0014\u0000\u012e\u0130"+
		"\u0003*\u0015\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u012f\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130-\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005\u0004\u0000\u0000\u0132/\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0005\u0005\u0000\u0000\u01341\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0005\u0006\u0000\u0000\u01363\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\u0005\u0007\u0000\u0000\u01385\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0005\b\u0000\u0000\u013a7\u0001\u0000\u0000\u0000\u013b\u013c\u0005"+
		"\t\u0000\u0000\u013c9\u0001\u0000\u0000\u0000\u013d\u013e\u0005\n\u0000"+
		"\u0000\u013e;\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u000b\u0000\u0000"+
		"\u0140=\u0001\u0000\u0000\u0000\u0141\u0142\u0005\f\u0000\u0000\u0142"+
		"?\u0001\u0000\u0000\u0000\u0143\u014a\u00034\u001a\u0000\u0144\u014a\u0003"+
		"6\u001b\u0000\u0145\u014a\u00038\u001c\u0000\u0146\u014a\u0003:\u001d"+
		"\u0000\u0147\u014a\u0003<\u001e\u0000\u0148\u014a\u0003>\u001f\u0000\u0149"+
		"\u0143\u0001\u0000\u0000\u0000\u0149\u0144\u0001\u0000\u0000\u0000\u0149"+
		"\u0145\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000\u0000\u0149"+
		"\u0147\u0001\u0000\u0000\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a"+
		"A\u0001\u0000\u0000\u0000\u014b\u014c\u0005\r\u0000\u0000\u014cC\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0005\u000e\u0000\u0000\u014eE\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0005\u000f\u0000\u0000\u0150G\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0005\u0010\u0000\u0000\u0152I\u0001\u0000\u0000\u0000"+
		"\u0153\u0154\u0003 \u0010\u0000\u0154\u0155\u0003F#\u0000\u0155K\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0003 \u0010\u0000\u0157\u0158\u0003H$"+
		"\u0000\u0158M\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0011\u0000\u0000"+
		"\u015aO\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0012\u0000\u0000\u015c"+
		"Q\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0013\u0000\u0000\u015eS\u0001"+
		"\u0000\u0000\u0000\u015f\u0164\u0003D\"\u0000\u0160\u0164\u0003N\'\u0000"+
		"\u0161\u0164\u0003P(\u0000\u0162\u0164\u0003R)\u0000\u0163\u015f\u0001"+
		"\u0000\u0000\u0000\u0163\u0160\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164U\u0001\u0000"+
		"\u0000\u0000\u0165\u0166\u0005\u0014\u0000\u0000\u0166W\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005\u0015\u0000\u0000\u0168Y\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0005\u0016\u0000\u0000\u016a[\u0001\u0000\u0000\u0000\u016b"+
		"\u016c\u0005\u0017\u0000\u0000\u016c]\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0005\u0018\u0000\u0000\u016e_\u0001\u0000\u0000\u0000\u016f\u0170\u0005"+
		"\u0019\u0000\u0000\u0170a\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u001a"+
		"\u0000\u0000\u0172c\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u001b\u0000"+
		"\u0000\u0174e\u0001\u0000\u0000\u0000\u0175\u0176\u0005\u001c\u0000\u0000"+
		"\u0176g\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u001d\u0000\u0000\u0178"+
		"i\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u001e\u0000\u0000\u017ak\u0001"+
		"\u0000\u0000\u0000\u017b\u017c\u0005\u001f\u0000\u0000\u017cm\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005 \u0000\u0000\u017eo\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0005!\u0000\u0000\u0180q\u0001\u0000\u0000\u0000\u0181\u0182"+
		"\u0005\"\u0000\u0000\u0182s\u0001\u0000\u0000\u0000\u0183\u0184\u0005"+
		"#\u0000\u0000\u0184u\u0001\u0000\u0000\u0000\u001by\u0082\u008e\u0096"+
		"\u0098\u009e\u00a9\u00b2\u00b8\u00bc\u00c9\u00ce\u00d4\u00d6\u00dd\u00e2"+
		"\u00e8\u00ea\u00f4\u00fd\u0101\u0106\u010a\u011e\u012f\u0149\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}