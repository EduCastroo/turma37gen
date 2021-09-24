programa
{
	
	funcao inicio()
	{
		real indicePoluicao
		
		escreva("DIGITE O INDICE DE POLUIÇÃO ATUAL: ")
		leia(indicePoluicao)

		se(indicePoluicao<=0.29){
			escreva("INDICE ACEITAVEL!")
		}
		senao se(indicePoluicao<0.4){
			escreva("GRUPO 1 - PAREM SUAS ATIVIDADES!")
		}
		senao se(indicePoluicao<0.5){
			escreva("GRUPO 1 E GRUPO 2 - PAREM SUAS ATIVIDADES!")
		}
		senao {
			escreva("GRUPO 1, GRUPO 2 E GRUPO 3 - PAREM SUAS ATIVIDADES!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 161; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */