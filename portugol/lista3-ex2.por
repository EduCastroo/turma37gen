programa
{
	
	funcao inicio()
	{
	
		inteiro somaImp = 0 
		para(inteiro i = 1; i<=500;i++){
			se((i%3)==0 e (i%2)!=0){
				somaImp+=i
				escreva(i + "/n")
			}
		}
		escreva("A SOMA É: " + somaImp)
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