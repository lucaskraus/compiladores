// Generated from c:\Users\lucaska\Desktop\compiladores-projeto\gramatica.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
			"'para'", "'?'", "'\u00BF'", "'|'", "'('", "')'", "'exiba'", "'leia'", 
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << ID))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << NUM) | (1L << ID))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__30) | (1L << NUM) | (1L << ID))) != 0) );
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0) );
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

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(gramaticaParser.ID, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(gramaticaParser.NUM, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(gramaticaParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
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

	public static class InteiroContext extends ParserRuleContext {
		public InteiroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inteiro; }
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

	public static class RealContext extends ParserRuleContext {
		public RealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real; }
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

	public static class TextoContext extends ParserRuleContext {
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
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

	public static class Int_abvContext extends ParserRuleContext {
		public Int_abvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_abv; }
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

	public static class Rl_abvContext extends ParserRuleContext {
		public Rl_abvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rl_abv; }
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

	public static class Txt_abvContext extends ParserRuleContext {
		public Txt_abvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_txt_abv; }
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

	public static class Maior_queContext extends ParserRuleContext {
		public Maior_queContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior_que; }
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

	public static class Menor_queContext extends ParserRuleContext {
		public Menor_queContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor_que; }
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

	public static class Maior_igualContext extends ParserRuleContext {
		public Maior_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maior_igual; }
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

	public static class Menor_igualContext extends ParserRuleContext {
		public Menor_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor_igual; }
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

	public static class IgualContext extends ParserRuleContext {
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
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

	public static class Igual_duploContext extends ParserRuleContext {
		public Igual_duploContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual_duplo; }
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

	public static class DefinicaoContext extends ParserRuleContext {
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
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

	public static class MaisContext extends ParserRuleContext {
		public MaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais; }
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

	public static class Duplo_maisContext extends ParserRuleContext {
		public Duplo_maisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplo_mais; }
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

	public static class Duplo_menosContext extends ParserRuleContext {
		public Duplo_menosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplo_menos; }
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

	public static class MenosContext extends ParserRuleContext {
		public MenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menos; }
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

	public static class MultiplicacaoContext extends ParserRuleContext {
		public MultiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacao; }
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

	public static class DivisaoContext extends ParserRuleContext {
		public DivisaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisao; }
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
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

	public static class SeContext extends ParserRuleContext {
		public SeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_se; }
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

	public static class SenaoContext extends ParserRuleContext {
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
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

	public static class Senao_seContext extends ParserRuleContext {
		public Senao_seContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_se; }
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

	public static class EqtContext extends ParserRuleContext {
		public EqtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqt; }
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

	public static class PrContext extends ParserRuleContext {
		public PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr; }
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

	public static class Abre_blocoContext extends ParserRuleContext {
		public Abre_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abre_bloco; }
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

	public static class Fecha_blocoContext extends ParserRuleContext {
		public Fecha_blocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha_bloco; }
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

	public static class DivisorContext extends ParserRuleContext {
		public DivisorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisor; }
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

	public static class Abre_prtContext extends ParserRuleContext {
		public Abre_prtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abre_prt; }
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

	public static class Fecha_prtContext extends ParserRuleContext {
		public Fecha_prtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha_prt; }
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

	public static class PrintaContext extends ParserRuleContext {
		public PrintaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printa; }
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

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
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

	public static class Leitura_iContext extends ParserRuleContext {
		public Leitura_iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura_i; }
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

	public static class Leitura_sContext extends ParserRuleContext {
		public Leitura_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura_s; }
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

	public static class Leitura_rContext extends ParserRuleContext {
		public Leitura_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura_r; }
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0188\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\6"+
		"\2z\n\2\r\2\16\2{\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0085\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0091\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\u0099\n\5\f\5\16\5\u009c\13\5\3\5\7\5\u009f\n\5\f\5\16\5\u00a2\13\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u00b5\n\7\3\7\3\7\3\7\3\7\5\7\u00bb\n\7\3\7\3\7\5\7\u00bf\n\7"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cc\n\t\3\t\3\t\3\t"+
		"\5\t\u00d1\n\t\3\t\3\t\3\t\3\t\6\t\u00d7\n\t\r\t\16\t\u00d8\3\t\3\t\3"+
		"\n\3\n\3\n\5\n\u00e0\n\n\3\n\3\n\3\n\5\n\u00e5\n\n\3\n\3\n\3\n\3\n\6\n"+
		"\u00eb\n\n\r\n\16\n\u00ec\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00f7"+
		"\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0100\n\f\3\r\3\r\5\r\u0104\n"+
		"\r\3\r\3\r\3\r\5\r\u0109\n\r\6\r\u010b\n\r\r\r\16\r\u010c\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\5\21\u0121\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\5\30\u0132\n\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u014c\n\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3,\5,\u0166\n,\3-\3-\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67"+
		"\38\38\39\39\3:\3:\3;\3;\3<\3<\3<\2\2=\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\2\2\u017d"+
		"\2y\3\2\2\2\4\u0084\3\2\2\2\6\u0090\3\2\2\2\b\u0092\3\2\2\2\n\u00a5\3"+
		"\2\2\2\f\u00af\3\2\2\2\16\u00c0\3\2\2\2\20\u00c3\3\2\2\2\22\u00dc\3\2"+
		"\2\2\24\u00f0\3\2\2\2\26\u00fb\3\2\2\2\30\u0103\3\2\2\2\32\u010e\3\2\2"+
		"\2\34\u0113\3\2\2\2\36\u0118\3\2\2\2 \u0120\3\2\2\2\"\u0122\3\2\2\2$\u0124"+
		"\3\2\2\2&\u0126\3\2\2\2(\u0128\3\2\2\2*\u012a\3\2\2\2,\u012c\3\2\2\2."+
		"\u0131\3\2\2\2\60\u0133\3\2\2\2\62\u0135\3\2\2\2\64\u0137\3\2\2\2\66\u0139"+
		"\3\2\2\28\u013b\3\2\2\2:\u013d\3\2\2\2<\u013f\3\2\2\2>\u0141\3\2\2\2@"+
		"\u0143\3\2\2\2B\u014b\3\2\2\2D\u014d\3\2\2\2F\u014f\3\2\2\2H\u0151\3\2"+
		"\2\2J\u0153\3\2\2\2L\u0155\3\2\2\2N\u0158\3\2\2\2P\u015b\3\2\2\2R\u015d"+
		"\3\2\2\2T\u015f\3\2\2\2V\u0165\3\2\2\2X\u0167\3\2\2\2Z\u0169\3\2\2\2\\"+
		"\u016b\3\2\2\2^\u016d\3\2\2\2`\u016f\3\2\2\2b\u0171\3\2\2\2d\u0173\3\2"+
		"\2\2f\u0175\3\2\2\2h\u0177\3\2\2\2j\u0179\3\2\2\2l\u017b\3\2\2\2n\u017d"+
		"\3\2\2\2p\u017f\3\2\2\2r\u0181\3\2\2\2t\u0183\3\2\2\2v\u0185\3\2\2\2x"+
		"z\5\4\3\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\3\3\2\2\2}\u0085\5"+
		"\b\5\2~\u0085\5\f\7\2\177\u0085\5\16\b\2\u0080\u0085\5\20\t\2\u0081\u0085"+
		"\5\24\13\2\u0082\u0085\5\n\6\2\u0083\u0085\5 \21\2\u0084}\3\2\2\2\u0084"+
		"~\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\5\3\2\2\2\u0086\u0087\5L\'\2"+
		"\u0087\u0088\5X-\2\u0088\u0091\3\2\2\2\u0089\u008a\5N(\2\u008a\u008b\5"+
		"X-\2\u008b\u0091\3\2\2\2\u008c\u0091\5\30\r\2\u008d\u0091\5\24\13\2\u008e"+
		"\u0091\5\n\6\2\u008f\u0091\5 \21\2\u0090\u0086\3\2\2\2\u0090\u0089\3\2"+
		"\2\2\u0090\u008c\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\7\3\2\2\2\u0092\u0093\5.\30\2\u0093\u0094\5\"\22"+
		"\2\u0094\u009a\5D#\2\u0095\u0099\5\"\22\2\u0096\u0099\5$\23\2\u0097\u0099"+
		"\5&\24\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a0\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009f\5\30\r\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\5X-\2\u00a4\t\3\2\2\2\u00a5\u00a6"+
		"\5\"\22\2\u00a6\u00ab\5D#\2\u00a7\u00ac\5\"\22\2\u00a8\u00ac\5$\23\2\u00a9"+
		"\u00ac\5&\24\2\u00aa\u00ac\5\30\r\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\5X-\2\u00ae\13\3\2\2\2\u00af\u00b0\5Z.\2\u00b0\u00b4\5\22\n\2\u00b1"+
		"\u00b2\5^\60\2\u00b2\u00b3\5\22\n\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00be\3\2\2\2\u00b6\u00b7\5\\/\2\u00b7"+
		"\u00ba\5d\63\2\u00b8\u00bb\5\4\3\2\u00b9\u00bb\5\6\4\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\5f\64\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00b6\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\r\3\2\2\2"+
		"\u00c0\u00c1\5`\61\2\u00c1\u00c2\5\22\n\2\u00c2\17\3\2\2\2\u00c3\u00c4"+
		"\5b\62\2\u00c4\u00c5\5j\66\2\u00c5\u00c6\5\26\f\2\u00c6\u00c7\5h\65\2"+
		"\u00c7\u00c8\5\"\22\2\u00c8\u00cb\5B\"\2\u00c9\u00cc\5\"\22\2\u00ca\u00cc"+
		"\5$\23\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d0\5h\65\2\u00ce\u00d1\5L\'\2\u00cf\u00d1\5N(\2\u00d0\u00ce\3\2\2"+
		"\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\5l\67\2\u00d3\u00d6"+
		"\5d\63\2\u00d4\u00d7\5\4\3\2\u00d5\u00d7\5\6\4\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5f\64\2\u00db\21\3\2\2\2\u00dc\u00df"+
		"\5j\66\2\u00dd\u00e0\5\"\22\2\u00de\u00e0\5$\23\2\u00df\u00dd\3\2\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e4\5B\"\2\u00e2\u00e5"+
		"\5\"\22\2\u00e3\u00e5\5$\23\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2"+
		"\u00e5\u00e6\3\2\2\2\u00e6\u00e7\5l\67\2\u00e7\u00ea\5d\63\2\u00e8\u00eb"+
		"\5\4\3\2\u00e9\u00eb\5\6\4\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\5f\64\2\u00ef\23\3\2\2\2\u00f0\u00f1\5n8\2\u00f1\u00f6"+
		"\5j\66\2\u00f2\u00f7\5&\24\2\u00f3\u00f7\5\"\22\2\u00f4\u00f7\5$\23\2"+
		"\u00f5\u00f7\5\30\r\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\5l\67\2\u00f9"+
		"\u00fa\5X-\2\u00fa\25\3\2\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00ff\5D#\2\u00fd"+
		"\u0100\5\"\22\2\u00fe\u0100\5$\23\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3"+
		"\2\2\2\u0100\27\3\2\2\2\u0101\u0104\5\"\22\2\u0102\u0104\5$\23\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u010a\3\2\2\2\u0105\u0108\5V"+
		",\2\u0106\u0109\5\"\22\2\u0107\u0109\5$\23\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0105\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\31\3\2\2\2\u010e\u010f"+
		"\5(\25\2\u010f\u0110\5\"\22\2\u0110\u0111\5D#\2\u0111\u0112\5r:\2\u0112"+
		"\33\3\2\2\2\u0113\u0114\5,\27\2\u0114\u0115\5\"\22\2\u0115\u0116\5D#\2"+
		"\u0116\u0117\5t;\2\u0117\35\3\2\2\2\u0118\u0119\5*\26\2\u0119\u011a\5"+
		"\"\22\2\u011a\u011b\5D#\2\u011b\u011c\5v<\2\u011c\37\3\2\2\2\u011d\u0121"+
		"\5\32\16\2\u011e\u0121\5\36\20\2\u011f\u0121\5\34\17\2\u0120\u011d\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121!\3\2\2\2\u0122\u0123"+
		"\7\'\2\2\u0123#\3\2\2\2\u0124\u0125\7&\2\2\u0125%\3\2\2\2\u0126\u0127"+
		"\7(\2\2\u0127\'\3\2\2\2\u0128\u0129\7\3\2\2\u0129)\3\2\2\2\u012a\u012b"+
		"\7\4\2\2\u012b+\3\2\2\2\u012c\u012d\7\5\2\2\u012d-\3\2\2\2\u012e\u0132"+
		"\5(\25\2\u012f\u0132\5*\26\2\u0130\u0132\5,\27\2\u0131\u012e\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132/\3\2\2\2\u0133\u0134\7\6\2\2"+
		"\u0134\61\3\2\2\2\u0135\u0136\7\7\2\2\u0136\63\3\2\2\2\u0137\u0138\7\b"+
		"\2\2\u0138\65\3\2\2\2\u0139\u013a\7\t\2\2\u013a\67\3\2\2\2\u013b\u013c"+
		"\7\n\2\2\u013c9\3\2\2\2\u013d\u013e\7\13\2\2\u013e;\3\2\2\2\u013f\u0140"+
		"\7\f\2\2\u0140=\3\2\2\2\u0141\u0142\7\r\2\2\u0142?\3\2\2\2\u0143\u0144"+
		"\7\16\2\2\u0144A\3\2\2\2\u0145\u014c\5\66\34\2\u0146\u014c\58\35\2\u0147"+
		"\u014c\5:\36\2\u0148\u014c\5<\37\2\u0149\u014c\5> \2\u014a\u014c\5@!\2"+
		"\u014b\u0145\3\2\2\2\u014b\u0146\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0148"+
		"\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014cC\3\2\2\2\u014d"+
		"\u014e\7\17\2\2\u014eE\3\2\2\2\u014f\u0150\7\20\2\2\u0150G\3\2\2\2\u0151"+
		"\u0152\7\21\2\2\u0152I\3\2\2\2\u0153\u0154\7\22\2\2\u0154K\3\2\2\2\u0155"+
		"\u0156\5\"\22\2\u0156\u0157\5H%\2\u0157M\3\2\2\2\u0158\u0159\5\"\22\2"+
		"\u0159\u015a\5J&\2\u015aO\3\2\2\2\u015b\u015c\7\23\2\2\u015cQ\3\2\2\2"+
		"\u015d\u015e\7\24\2\2\u015eS\3\2\2\2\u015f\u0160\7\25\2\2\u0160U\3\2\2"+
		"\2\u0161\u0166\5F$\2\u0162\u0166\5P)\2\u0163\u0166\5R*\2\u0164\u0166\5"+
		"T+\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0164\3\2\2\2\u0166W\3\2\2\2\u0167\u0168\7\26\2\2\u0168Y\3\2\2\2\u0169"+
		"\u016a\7\27\2\2\u016a[\3\2\2\2\u016b\u016c\7\30\2\2\u016c]\3\2\2\2\u016d"+
		"\u016e\7\31\2\2\u016e_\3\2\2\2\u016f\u0170\7\32\2\2\u0170a\3\2\2\2\u0171"+
		"\u0172\7\33\2\2\u0172c\3\2\2\2\u0173\u0174\7\34\2\2\u0174e\3\2\2\2\u0175"+
		"\u0176\7\35\2\2\u0176g\3\2\2\2\u0177\u0178\7\36\2\2\u0178i\3\2\2\2\u0179"+
		"\u017a\7\37\2\2\u017ak\3\2\2\2\u017b\u017c\7 \2\2\u017cm\3\2\2\2\u017d"+
		"\u017e\7!\2\2\u017eo\3\2\2\2\u017f\u0180\7\"\2\2\u0180q\3\2\2\2\u0181"+
		"\u0182\7#\2\2\u0182s\3\2\2\2\u0183\u0184\7$\2\2\u0184u\3\2\2\2\u0185\u0186"+
		"\7%\2\2\u0186w\3\2\2\2\35{\u0084\u0090\u0098\u009a\u00a0\u00ab\u00b4\u00ba"+
		"\u00be\u00cb\u00d0\u00d6\u00d8\u00df\u00e4\u00ea\u00ec\u00f6\u00ff\u0103"+
		"\u0108\u010c\u0120\u0131\u014b\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}