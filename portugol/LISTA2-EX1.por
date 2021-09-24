programa
{
	
	funcao inicio()
	{
		inteiro peso, excesso, multa
		escreva("QUAL O PESO DOS TOMATES EM KG: \n")
		leia(peso)

		excesso= (peso-50)
		multa= excesso*4

		se(excesso==0){
			escreva("NÃO HÁ PESO EXCEDENTE ")
		}
		
		senao se(excesso>0){
			escreva("TEM ", excesso, " KG A MAIS, A MULTA É DE R$",multa)
		}
		
		senao se(peso<0){
			escreva("PESO INVÁLIDO")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 319; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */