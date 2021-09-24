programa
{
	
	funcao inicio()
	{
		inteiro hora, horaEx, salario, salarioEx, salarioMin
		cadeia cod

		escreva("INFORME O CÓDIGO DO FUNCIONÁRIO: ")
		leia(cod)
		
		escreva("INFORME O TOTAL DE HORAS TRABALHADAS: ")
		leia(hora)

		horaEx= (hora-50)
		salarioEx= (horaEx*20)
		salario= (50*10)
		salarioMin=(hora*10)

		se(horaEx>0.1){
			escreva(("VOCÊ TRABALHOU "), horaEx, "h EXTRAS E O VALOR EXTRA É: R$", salarioEx, (" E RECEBERÁ: "),(salario + salarioEx))
		}
		senao se(horaEx==0){
			escreva("SEM HORA EXTRA")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 312; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */