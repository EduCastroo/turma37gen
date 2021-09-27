programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro nota=0
		inteiro totalNotas=0
		real media=0.0
		inteiro maiorNota=0
		inteiro menorNota=10
		inteiro contadorMenorNota=0
		
		//contador
		//totalizador
		//comparação - inversão

		
			escreva("DIGITE O NOME: ")
		leia(nome)
		para (inteiro x=1; x<=4; x++){
		escreva("DIGITE A NOTA ",x,": ")
		leia(nota)
		totalNotas= (totalNotas+nota)
		se(nota> maiorNota){
			maiorNota = nota
		}
		se(nota <= menorNota){
			menorNota=nota
			contadorMenorNota++
		}
		
		}
		media = totalNotas/4.00
		escreva("Oi ", nome, " sua média é: ", media+"\n")
		escreva("SUA MAIOR NOTA FOI ", maiorNota, "\n")
		escreva("SUA MENOR NOTA FOI ", menorNota, "\n")
		escreva("SUA MENOR APARECE ", contadorMenorNota, "\n")
		
		
		
		

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */