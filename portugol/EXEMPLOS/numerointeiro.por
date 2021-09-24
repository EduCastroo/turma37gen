programa{

	funcao inicio(){
		inteiro nume,divisao
		escreva("Escreva um numero inteiro e vou lhe dizer se ele é par ou impar: ")
		leia(nume)
		se (nume>0) {
			divisao=nume%2
			se(divisao>0){
				escreva("Seu numero é impar")
				
			}
			senao{
				escreva("seu numero é par")
			}
			
		    
		}
		se(nume==0) {
			escreva("seu numero é neutro")
			
			
		}
		se (nume<0){
			escreva("Voce nao colocou um numero inteiro")
		}
		
		
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */