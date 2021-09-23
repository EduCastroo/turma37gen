programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias=0, convertMeses=0, convertAnos=0, restoDias=0
		escreva("DIGITE A IDADE EM DIAS: ")
		leia(dias)
		convertAnos=(dias/365)
		restoDias=(dias%365)
		convertMeses=(restoDias/30)
		dias=(restoDias%30)
		escreva("ANOS = ", convertAnos, " /MESES = ", convertMeses, " /DIAS = ", dias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 149; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */