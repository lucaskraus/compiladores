grammar gramatica;

init: inicio+;

inicio: declaracao | condicional | enquanto | para | printar | atribuicao | entrada;
bloco: dobro end | dobro_menos end | operacao_mat | printar | atribuicao | entrada;
declaracao: tipo variavel definicao (variavel | numero | string)* (operacao_mat)* end;
atribuicao: variavel definicao (variavel|numero|string|operacao_mat) end;
condicional: se condicao (senao_se condicao)? (senao abre_bloco (inicio | bloco) fecha_bloco)?;
enquanto: eqt condicao;
para: pr abre_prt declaracao_cond divisor variavel operador (variavel | numero) divisor (dobro | dobro_menos) fecha_prt abre_bloco (inicio | bloco)+ fecha_bloco;
condicao: abre_prt ( variavel | numero ) operador (variavel | numero) fecha_prt abre_bloco (inicio | bloco)+ fecha_bloco;
printar: printa abre_prt (string|variavel|numero|operacao_mat) fecha_prt end;
declaracao_cond: variavel definicao (variavel | numero);
operacao_mat: (variavel | numero) (operador_matematico (variavel | numero))+;

input_int: inteiro variavel definicao leitura_i;
input_string: texto variavel definicao leitura_s;
input_double: real variavel definicao leitura_r;

entrada: input_int | input_double | input_string;

//+ - 1 ou + repetições
//* - 0 ou + repetições
//? - 0 ou 1 vez

NUM: [0-9]+(.[0-9]+)?;
ID: [a-zA-Z]+[a-zA-Z0-9]*;
variavel: ID;
numero: NUM;
string: STRING;
STRING: '"'([a-zA-Z0-9 ])*('?'|'/'|':'|'+'|'-'|'*'|'('|')')*'"';
inteiro: 'inteiro';
real: 'real';
texto: 'texto';
tipo: inteiro | real | texto;
int_abv: 'int';
rl_abv: 'rl';
txt_abv: 'txt';
maior_que: '>';
menor_que: '<';
maior_igual: '>=';
menor_igual: '<=';
igual: '=';
igual_duplo: '==';
operador: maior_que | menor_que | maior_igual | menor_igual | igual | igual_duplo;
definicao: '->';
mais: '+';
duplo_mais: '++';
duplo_menos: '--';
dobro: variavel duplo_mais;
dobro_menos: variavel duplo_menos;
menos: '-';
multiplicacao: '*';
divisao: '/';
operador_matematico: mais | menos | multiplicacao | divisao;
end: '.';
se: 'se';
senao: 'senao';
senao_se: 'senao se';
eqt: 'enquanto';
pr: 'para';
abre_bloco: '?';
fecha_bloco: '¿';
divisor: '|';
abre_prt: '(';
fecha_prt: ')';
printa: 'exiba';
input: 'leia';
//Argumento de tipo para as variáveis que irão receber input do usuário.
leitura_i: 'leia.inteiro().';
leitura_s: 'leia.texto().';
leitura_r: 'leia.real().';


Ws: [\t\r\n ]+ -> skip;