//

programa{
   
  funcao inicio(){
    inteiro l, c, N1[4][6] = {{10,10,10,10,10,10},{5,5,5,5,5,5},{5,5,5,5,5,5},{5,5,5,5,5,5}}
    inteiro M1[4][6], N2[4][6] = {{5,5,5,5,5,5},{5,5,5,5,5,5},{5,5,5,5,5,5},{5,5,5,5,5,5}}

    para(l = 0; l < 4; l++){
      para(c = 0; c < 6; c++){
        M1[l][c] = N1[l][c] - N2[l][c]
      }
    }

    para(l = 0; l < 4; l++){
      para(c = 0; c < 6; c++){
        escreva(M1[l][c], " ")
      }
      escreva("\n")
    }
  }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 311; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */