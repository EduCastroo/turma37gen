programa
{
	inclua biblioteca Matematica -->mat
	funcao inicio()
	{
		real num1, num2, num3, num4
		escreva("ESCREVA O PRIMEIRO NÚMERO ")
		leia(num1)
		escreva("ESCREVA O SEGUNDO NÚMERO ")
		leia(num2)
		escreva("ESCREVA O TERCEIRO NÚMERO ")
		leia(num3)
		escreva("ESCREVA O QUARTO NÚMERO ")
		leia(num4)

		mat.potencia(num1,2)
		mat.potencia(num2,2)
		mat.potencia(num3,2)
		mat.potencia(num4,2)

		se(mat.potencia(num3,2) >=1000){
			escreva("O VALOR DO TERCEIRO ", mat.potencia(num3,2))
		}
		senao se(num3<1000){
		escreva("\n A RAÍZ DO PRIMEIRO NÚMERO É: ", mat.potencia(num1,2), " E O VALOR LIDO FOI: ", num1)
		escreva("\n A RAÍZ DO SEGUNDO NÚMERO É: ", mat.potencia(num2,2), " E O VALOR LIDO FOI: ", num2)
		escreva("\n A RAÍZ DO TERCEIRO NÚMERO É: ", mat.potencia(num3,2), " E O VALOR LIDO FOI: ", num3)
		escreva("\n A RAÍZ DO QUARTO NÚMERO É: ", mat.potencia(num4,2), " E O VALOR LIDO FOI: ", num4)
		
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 903; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */