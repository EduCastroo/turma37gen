programa
{
		

	funcao inicio()
	{
		//Declaracao de variaveis
				
		inteiro codProd = 0, quantidadeProduto = 0, verificaQuantidade = 0, m = 0
		real valorTotal = 0.0
		cadeia codigo 
		cadeia continuaCompra[5] = { " ","S", "N", "s", "n"}
		cadeia desejaComprar[5] = { " ","S", "N", "s", "n"}
		cadeia codigoProduto[10][2] = {{"G7-1","Mouse         "},
								{"G7-2", "Teclado       "},
								{"G7-3", "Monitor       "},
								{"G7-4", "TV            "},
								{"G7-5", "Gabinete Gamer"},
								{"G7-6", "Headphone     "},
								{"G7-7", "Impressora    "},
								{"G7-8", "Fonte         "},
								{"G7-9", "Memoria RAM   "},
								{"G7-10", "SSD          "}}
		
		//PAUSA, FAZER MATRIZ CARRINHO
		real valorProduto[10] = {100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0}
		inteiro estoqueProduto[10] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}												

		//Variaveis para o carrinho
		cadeia carrinhoCodProd[10][2]
		real carrinhoValProd[10]
		inteiro carrinhoEstProd[10]

		
		
		//Primeira fase
		escreva("WAKANDA STORE")
		escreva("\nSLOGAN")

		escreva("\n\nDESEJA FAZER COMPRAS S/N: ")		
		leia(desejaComprar[0]) //sobrescreve desejaComprar[0]
		
		se (desejaComprar[0] == desejaComprar[1] ou desejaComprar[0] == desejaComprar[3]){ //comparacao com a resposta S
		 //Fase dois
		
		escreva("WAKANDA STORE")
		escreva("\nSLOGAN")
		escreva("\n\nRELACAO DOS PRODUTOS")
		escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
		
		//RELATORIO PRODUTOS
		para (inteiro i = 0; i < 10; i++){
			escreva("\n")
			escreva(codigoProduto[i][0] + "     ")
			escreva(codigoProduto[i][1] + "     ")
			escreva(valorProduto[i] +     "     ")
			escreva(estoqueProduto[i])
		}

		// laco para encontrar o produto escolhido dentro da matriz
		faca {
		escreva("\n\nDIGITE O CODIGO DO PRODUTO: ")		
		leia(codigo)		
		
		escreva("\nDIGITE A QUANTIDADE NECESSARIA: ")
		leia(quantidadeProduto)		
		
		// VALIDADOR DA QUANTIDADE EM ESTOQUE
		faca{
		para(m = 0; estoqueProduto[m] < quantidadeProduto; m++){
			escreva("\nSem essa quantidade em estoque.\n")
			escreva("\nDIGITE UMA QUANTIDADE VALIDA: ")									
			leia(quantidadeProduto) //tentando validar com a quantidade em estoque
			
			} 
		} enquanto (estoqueProduto[m] < quantidadeProduto)
		
		
		
		
		para (inteiro j = 0; j < 10; j++)		
		se (codigo == codigoProduto[j][0]){			
			// Atribuindo os valores do vetor carrinho de compras
			carrinhoCodProd[j][0] = codigoProduto[j][0]
			carrinhoCodProd[j][1] = codigoProduto[j][1]
			carrinhoValProd[j] = valorProduto[j]
			carrinhoEstProd[j] = estoqueProduto[j]
			
			// colocar uma variavel para guardar a quantidade selecionada
			estoqueProduto[j] -= quantidadeProduto
			escreva("\n")
					
		}

		escreva("\n\nRELATORIO DOS PRODUTOS")
		escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
		
		//RELATORIO PRODUTOS ATUALIZADA
		para (inteiro i = 0; i < 10; i++){
			escreva("\n")
			escreva(codigoProduto[i][0] + "     ")
			escreva(codigoProduto[i][1] + "     ")
			escreva(valorProduto[i] +     "     ")
			escreva(estoqueProduto[i])
		}

		//TELA DE CARRINHO DE COMPRAS
		escreva("\n\nCARRINHO DE COMPRAS\n")
		escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
		para(inteiro l = 0; l < 10; l++){
			
			se (carrinhoValProd[l] != 0.0 e carrinhoEstProd[l] != 0.0){
			escreva("\n")
			escreva(carrinhoCodProd[l][0] + "     ")
			escreva(carrinhoCodProd[l][1] + "     ")
			escreva(carrinhoValProd[l] +     "     ")
			escreva(carrinhoEstProd[l])
			escreva(" - QTDE SELECIONADA: " + quantidadeProduto)	
			}
		}
		//TESTE EMISSAO NOTA
		// EMISSAO DA NOTA FISCAL
		//CALCULO VALOR TOTAL
		para (inteiro i = 0; i < 10; i++){
		
		valorTotal += (carrinhoValProd[i] * quantidadeProduto)
		
		}
		
		escreva("\n\nWAKANDA STORE")
		escreva("\nSIMULACAO NOTA FISCAL")
		escreva("\nVALOR TOTAL DA COMPRA: " + valorTotal)
		escreva("\nIMPOSTO 9% DO VALOR TOTAL: " + valorTotal * 0.09)
		escreva("\nOPCAO DE PAGAMENTO:\n")
		escreva("\n1 - A VISTA COM 10% DESCONTO -> " + valorTotal * 0.9)		
		escreva("\n2 - NO CARTAO COM ACRESCIMO DE 10% -> " + valorTotal * 1.1)
		escreva("\n3 - 2X COM ACRESCIMO DE 15% -> " + valorTotal * 1.15 + " - VALOR DE CADA PARCELA: " + (valorTotal * 1.15)/2)

		//TESTE SIMULACAO NOTA FISCAL
		
		escreva("\n\nCONTINUAR A COMPRA? S/N -> ")
		leia(continuaCompra[0])
		} enquanto (continuaCompra[0] == continuaCompra[1] ou continuaCompra[0] == continuaCompra[3] )
		// TELA DE RELATORIO DE PRODUTOS FINAL
		escreva("WAKANDA STORE")
		escreva("\nSLOGAN")
		escreva("\n\nRELACAO DOS PRODUTOS")
		escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")		

		//RELATORIO PRODUTOS FINAL - NECESSARIO?

		
		para (inteiro i = 0; i < 10; i++){
			escreva("\n")
			escreva(codigoProduto[i][0] + "     ")
			escreva(codigoProduto[i][1] + "     ")
			escreva(valorProduto[i] +     "     ")
			escreva(estoqueProduto[i])
		}
		

		
		/*
		// EMISSAO DA NOTA FISCAL
		//CALCULO VALOR TOTAL
		para (inteiro i = 0; i < 10; i++){
		
		valorTotal += (carrinhoValProd[i] * quantidadeProduto)
		
		}
		
		escreva("\n\nWAKANDA STORE")
		escreva("\nVALOR TOTAL DA COMPRA: " + valorTotal)
		escreva("\nIMPOSTO 9% DO VALOR TOTAL: " + valorTotal * 0.09)
		escreva("\nOPCOES DE PAGAMENTO:\n")
		escreva("\n1 - A VISTA COM 10% DESCONTO -> " + valorTotal * 0.9)		
		escreva("\n2 - NO CARTAO COM ACRESCIMO DE 10% -> " + valorTotal * 1.1)
		escreva("\n3 - 2X COM ACRESCIMO DE 15% -> " + valorTotal * 1.15 + " - VALOR DE CADA PARCELA: " + (valorTotal * 1.15)/2)
		*/

		} senao se (desejaComprar[0] == desejaComprar[2] ou desejaComprar[0] == desejaComprar[4]) //comparacao com a resposta N
		escreva("ATE BREVE!!")
	}
}
		

			 
		
		
		

	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */