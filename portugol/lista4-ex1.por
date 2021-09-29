programa
{
	
	funcao inicio()
	{
		real num[5], maiorNum=0
		para(inteiro i=0; i<5;i = i+1){
			escreva("digite um valor: ")
			leia(num[i])
			se(maiorNum<num[i]){
				maiorNum = num[i]
			}
		}
		para(inteiro i=0; i<5;i = i+1){
			escreva(num[i] +"\n")
			}
		escreva("O MAIOR NÚMERO É: " + maiorNum)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */