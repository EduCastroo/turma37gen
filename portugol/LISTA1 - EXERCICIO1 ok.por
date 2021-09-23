programa
{
	funcao inicio()
	{
		inteiro anos, meses, dias, soma=0, convertMeses=0, convertAnos=0
		escreva("QUANTOS ANOS? ")
		leia(anos)
		escreva("QUANTOS MESES? ")
		leia(meses)
		escreva("QUANTOS DIAS? ")
		leia(dias)
		convertAnos=(anos*365)
		convertMeses=(meses*30)
		anos=convertAnos
		meses=convertMeses
		soma=anos+meses+dias
		escreva("SOMA DA IDADE EM DIAS = ", soma)
		
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 339; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */