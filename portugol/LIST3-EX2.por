programa
{
	
	funcao inicio()
	{
	inteiro soma=0, num
	escreva("INFORME UM NÚMERO: ")
	leia(num)
	para (inteiro x=num; x<=500; x++){
		se (x%2==1 e x%3==0){
			soma= (soma+x)
		}
	}
	escreva ("SOMA: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */