// Generated from gramatica.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(gramaticaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(gramaticaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(gramaticaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(gramaticaParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(gramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(gramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(gramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(gramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(gramaticaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(gramaticaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(gramaticaParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(gramaticaParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(gramaticaParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(gramaticaParser.EnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(gramaticaParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(gramaticaParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(gramaticaParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(gramaticaParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#printar}.
	 * @param ctx the parse tree
	 */
	void enterPrintar(gramaticaParser.PrintarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#printar}.
	 * @param ctx the parse tree
	 */
	void exitPrintar(gramaticaParser.PrintarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracao_cond}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_cond(gramaticaParser.Declaracao_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracao_cond}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_cond(gramaticaParser.Declaracao_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operacao_mat}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_mat(gramaticaParser.Operacao_matContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operacao_mat}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_mat(gramaticaParser.Operacao_matContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#input_int}.
	 * @param ctx the parse tree
	 */
	void enterInput_int(gramaticaParser.Input_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#input_int}.
	 * @param ctx the parse tree
	 */
	void exitInput_int(gramaticaParser.Input_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#input_string}.
	 * @param ctx the parse tree
	 */
	void enterInput_string(gramaticaParser.Input_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#input_string}.
	 * @param ctx the parse tree
	 */
	void exitInput_string(gramaticaParser.Input_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#input_double}.
	 * @param ctx the parse tree
	 */
	void enterInput_double(gramaticaParser.Input_doubleContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#input_double}.
	 * @param ctx the parse tree
	 */
	void exitInput_double(gramaticaParser.Input_doubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void enterEntrada(gramaticaParser.EntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#entrada}.
	 * @param ctx the parse tree
	 */
	void exitEntrada(gramaticaParser.EntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(gramaticaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(gramaticaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(gramaticaParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(gramaticaParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(gramaticaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(gramaticaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void enterInteiro(gramaticaParser.InteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#inteiro}.
	 * @param ctx the parse tree
	 */
	void exitInteiro(gramaticaParser.InteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#real}.
	 * @param ctx the parse tree
	 */
	void enterReal(gramaticaParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#real}.
	 * @param ctx the parse tree
	 */
	void exitReal(gramaticaParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#texto}.
	 * @param ctx the parse tree
	 */
	void enterTexto(gramaticaParser.TextoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#texto}.
	 * @param ctx the parse tree
	 */
	void exitTexto(gramaticaParser.TextoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(gramaticaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#int_abv}.
	 * @param ctx the parse tree
	 */
	void enterInt_abv(gramaticaParser.Int_abvContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#int_abv}.
	 * @param ctx the parse tree
	 */
	void exitInt_abv(gramaticaParser.Int_abvContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#rl_abv}.
	 * @param ctx the parse tree
	 */
	void enterRl_abv(gramaticaParser.Rl_abvContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#rl_abv}.
	 * @param ctx the parse tree
	 */
	void exitRl_abv(gramaticaParser.Rl_abvContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#txt_abv}.
	 * @param ctx the parse tree
	 */
	void enterTxt_abv(gramaticaParser.Txt_abvContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#txt_abv}.
	 * @param ctx the parse tree
	 */
	void exitTxt_abv(gramaticaParser.Txt_abvContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#maior_que}.
	 * @param ctx the parse tree
	 */
	void enterMaior_que(gramaticaParser.Maior_queContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#maior_que}.
	 * @param ctx the parse tree
	 */
	void exitMaior_que(gramaticaParser.Maior_queContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#menor_que}.
	 * @param ctx the parse tree
	 */
	void enterMenor_que(gramaticaParser.Menor_queContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#menor_que}.
	 * @param ctx the parse tree
	 */
	void exitMenor_que(gramaticaParser.Menor_queContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#maior_igual}.
	 * @param ctx the parse tree
	 */
	void enterMaior_igual(gramaticaParser.Maior_igualContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#maior_igual}.
	 * @param ctx the parse tree
	 */
	void exitMaior_igual(gramaticaParser.Maior_igualContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#menor_igual}.
	 * @param ctx the parse tree
	 */
	void enterMenor_igual(gramaticaParser.Menor_igualContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#menor_igual}.
	 * @param ctx the parse tree
	 */
	void exitMenor_igual(gramaticaParser.Menor_igualContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#igual}.
	 * @param ctx the parse tree
	 */
	void enterIgual(gramaticaParser.IgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#igual}.
	 * @param ctx the parse tree
	 */
	void exitIgual(gramaticaParser.IgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#igual_duplo}.
	 * @param ctx the parse tree
	 */
	void enterIgual_duplo(gramaticaParser.Igual_duploContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#igual_duplo}.
	 * @param ctx the parse tree
	 */
	void exitIgual_duplo(gramaticaParser.Igual_duploContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(gramaticaParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(gramaticaParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#definicao}.
	 * @param ctx the parse tree
	 */
	void enterDefinicao(gramaticaParser.DefinicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#definicao}.
	 * @param ctx the parse tree
	 */
	void exitDefinicao(gramaticaParser.DefinicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#mais}.
	 * @param ctx the parse tree
	 */
	void enterMais(gramaticaParser.MaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#mais}.
	 * @param ctx the parse tree
	 */
	void exitMais(gramaticaParser.MaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#duplo_mais}.
	 * @param ctx the parse tree
	 */
	void enterDuplo_mais(gramaticaParser.Duplo_maisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#duplo_mais}.
	 * @param ctx the parse tree
	 */
	void exitDuplo_mais(gramaticaParser.Duplo_maisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#duplo_menos}.
	 * @param ctx the parse tree
	 */
	void enterDuplo_menos(gramaticaParser.Duplo_menosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#duplo_menos}.
	 * @param ctx the parse tree
	 */
	void exitDuplo_menos(gramaticaParser.Duplo_menosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dobro}.
	 * @param ctx the parse tree
	 */
	void enterDobro(gramaticaParser.DobroContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dobro}.
	 * @param ctx the parse tree
	 */
	void exitDobro(gramaticaParser.DobroContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#dobro_menos}.
	 * @param ctx the parse tree
	 */
	void enterDobro_menos(gramaticaParser.Dobro_menosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#dobro_menos}.
	 * @param ctx the parse tree
	 */
	void exitDobro_menos(gramaticaParser.Dobro_menosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#menos}.
	 * @param ctx the parse tree
	 */
	void enterMenos(gramaticaParser.MenosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#menos}.
	 * @param ctx the parse tree
	 */
	void exitMenos(gramaticaParser.MenosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacao(gramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacao(gramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#divisao}.
	 * @param ctx the parse tree
	 */
	void enterDivisao(gramaticaParser.DivisaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#divisao}.
	 * @param ctx the parse tree
	 */
	void exitDivisao(gramaticaParser.DivisaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#operador_matematico}.
	 * @param ctx the parse tree
	 */
	void enterOperador_matematico(gramaticaParser.Operador_matematicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#operador_matematico}.
	 * @param ctx the parse tree
	 */
	void exitOperador_matematico(gramaticaParser.Operador_matematicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(gramaticaParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(gramaticaParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(gramaticaParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(gramaticaParser.SeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#senao}.
	 * @param ctx the parse tree
	 */
	void enterSenao(gramaticaParser.SenaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#senao}.
	 * @param ctx the parse tree
	 */
	void exitSenao(gramaticaParser.SenaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#senao_se}.
	 * @param ctx the parse tree
	 */
	void enterSenao_se(gramaticaParser.Senao_seContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#senao_se}.
	 * @param ctx the parse tree
	 */
	void exitSenao_se(gramaticaParser.Senao_seContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#eqt}.
	 * @param ctx the parse tree
	 */
	void enterEqt(gramaticaParser.EqtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#eqt}.
	 * @param ctx the parse tree
	 */
	void exitEqt(gramaticaParser.EqtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#pr}.
	 * @param ctx the parse tree
	 */
	void enterPr(gramaticaParser.PrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#pr}.
	 * @param ctx the parse tree
	 */
	void exitPr(gramaticaParser.PrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#abre_bloco}.
	 * @param ctx the parse tree
	 */
	void enterAbre_bloco(gramaticaParser.Abre_blocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#abre_bloco}.
	 * @param ctx the parse tree
	 */
	void exitAbre_bloco(gramaticaParser.Abre_blocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fecha_bloco}.
	 * @param ctx the parse tree
	 */
	void enterFecha_bloco(gramaticaParser.Fecha_blocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fecha_bloco}.
	 * @param ctx the parse tree
	 */
	void exitFecha_bloco(gramaticaParser.Fecha_blocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#divisor}.
	 * @param ctx the parse tree
	 */
	void enterDivisor(gramaticaParser.DivisorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#divisor}.
	 * @param ctx the parse tree
	 */
	void exitDivisor(gramaticaParser.DivisorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#abre_prt}.
	 * @param ctx the parse tree
	 */
	void enterAbre_prt(gramaticaParser.Abre_prtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#abre_prt}.
	 * @param ctx the parse tree
	 */
	void exitAbre_prt(gramaticaParser.Abre_prtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fecha_prt}.
	 * @param ctx the parse tree
	 */
	void enterFecha_prt(gramaticaParser.Fecha_prtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fecha_prt}.
	 * @param ctx the parse tree
	 */
	void exitFecha_prt(gramaticaParser.Fecha_prtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#printa}.
	 * @param ctx the parse tree
	 */
	void enterPrinta(gramaticaParser.PrintaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#printa}.
	 * @param ctx the parse tree
	 */
	void exitPrinta(gramaticaParser.PrintaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(gramaticaParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(gramaticaParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#leitura_i}.
	 * @param ctx the parse tree
	 */
	void enterLeitura_i(gramaticaParser.Leitura_iContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#leitura_i}.
	 * @param ctx the parse tree
	 */
	void exitLeitura_i(gramaticaParser.Leitura_iContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#leitura_s}.
	 * @param ctx the parse tree
	 */
	void enterLeitura_s(gramaticaParser.Leitura_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#leitura_s}.
	 * @param ctx the parse tree
	 */
	void exitLeitura_s(gramaticaParser.Leitura_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#leitura_r}.
	 * @param ctx the parse tree
	 */
	void enterLeitura_r(gramaticaParser.Leitura_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#leitura_r}.
	 * @param ctx the parse tree
	 */
	void exitLeitura_r(gramaticaParser.Leitura_rContext ctx);
}