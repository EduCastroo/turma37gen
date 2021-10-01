programa
{
	inclua biblioteca Matematica	
	inclua biblioteca Texto
	funcao inicio()
	{
		//Declaração de variáveis
		inteiro quantidadeProdutoFinal[]
		cadeia notaFiscal
		inteiro opcaoPagamento = 0
		inteiro codProd = 0,quantidadeProduto=0, verificaQuantidade = 0, m = 0
		real valorTotal = 0.0
		cadeia codigo 
		cadeia continuaCompra ="N"
		//cadeia continuaCompra[3] = { " ","S", "N"}
		///cadeia desejaComprar[3] = { " ","S", "N"}
		cadeia desejaComprar 
		cadeia codigoProduto[10][2] = {{"G7-1"," Mouse         "},
								{"G7-2", " Teclado       "},
								{"G7-3", " Monitor       "},
								{"G7-4", " TV            "},
								{"G7-5", " Gabinete Gamer"},
								{"G7-6", " Headphone     "},
								{"G7-7", " Impressora    "},
								{"G7-8", " Fonte         "},
								{"G7-9", " Memória RAM   "},
								{"G7-10","SSD           "}}
		
		//FAZER MATRIZ CARRINHO
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
		leia(desejaComprar)
		desejaComprar = Texto.caixa_alta(desejaComprar) //sobrescreve desejaComprar[0]
		
		se (desejaComprar == "S"){ //comparação com a resposta S
		 //Fase dois
		limpa()
		escreva("WAKANDA STORE")
		escreva("\nSLOGAN")
		escreva("\n\nRELAÇÃO DOS PRODUTOS")
		escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
		
		//RELAÇÃO PRODUTOS
		para (inteiro i = 0; i < 10; i++){
			escreva("\n")
			escreva(codigoProduto[i][0] + "     ")
			escreva(codigoProduto[i][1] + "     ")
			escreva(valorProduto[i] +     "     ")
			escreva(estoqueProduto[i])
		}

		// laço para encontrar o produto escolhido dentro da matriz
		faca {
			se (continuaCompra=="S") {
				escreva("WAKANDA STORE")
				escreva("\nSLOGAN")
				escreva("\n\nRELAÇÃO DOS PRODUTOS")
				escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
				
				//RELAÇÃO PRODUTOS
				para (inteiro i = 0; i < 10; i++){
					escreva("\n")
					escreva(codigoProduto[i][0] + "     ")
					escreva(codigoProduto[i][1] + "     ")
					escreva(valorProduto[i] +     "     ")
					escreva(estoqueProduto[i])
				}

			}
		escreva("\n\nDIGITE O CÓDIGO DO PRODUTO: ")		
		leia(codigo)	
		/*se (codigo=="G7-1" ou codigo=="G7-2" ou codigo=="G7-3" ou codigo=="G7-4" ou codigo=="G7-5" ou codigo=="G7-6" ou codigo=="G7-7" ou codigo=="G7-8" ou codigo=="G7-9" ou codigo=="G7-10")	{
		escreva("CÓDIGO INVÁLIDO!")
		escreva("\n\nDIGITE O CÓDIGO DO PRODUTO: ")		
		leia(codigo)
		*/		
		para (inteiro a=0;a<100;a++) {
		escreva("\nDIGITE A QUANTIDADE NECESSÁRIA: ")
		leia(quantidadeProdutoFinal[a])	
		} 
		
		
		// VALIDADOR DA QUANTIDADE EM ESTOQUE
		faca{
			
		para(m = 0; (estoqueProduto[m] < quantidadeProduto ou quantidadeProduto<0) ; m++){
			escreva("\nSem essa quantidade em estoque.\n")
			escreva("\nDIGITE UMA QUANTIDADE VÁLIDA: ")									
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
			
			// colocar uma variável para guardar a quantidade selecionada
			estoqueProduto[j] -= quantidadeProduto
			escreva("\n")
					
		}

		escreva("\n\nRELAÇÃO DOS PRODUTOS")
		escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
		
		//RELAÇÃO PRODUTOS ATUALIZADA
		para (inteiro i = 0; i < 10; i++){
			escreva("\n")
			escreva(codigoProduto[i][0] + "     ")
			escreva(codigoProduto[i][1] + "     ")
			escreva(valorProduto[i] +     "     ")
			escreva(estoqueProduto[i])
		}

		//TELA DE CARRINHO DE COMPRAS
		limpa()
		escreva("\n\nCARRINHO DE COMPRAS\n")
		escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
		para(inteiro l = 0; l < 10; l++){
			
			se (carrinhoValProd[l] != 0.0 e carrinhoEstProd[l] != 0.0){
			
			escreva("\n")
			escreva(carrinhoCodProd[l][0] + "     ")
			escreva(carrinhoCodProd[l][1] + "     ")
			escreva(carrinhoValProd[l] +     "     ")
			escreva(carrinhoEstProd[l])
			escreva(" - QTDE SELECIONADA: " + quantidadeProdutoFinal[])
			
			}
		}
		//TESTE EMISSAO NOTA
		// EMISSAO DA NOTA FISCAL
		//CALCULO VALOR TOTAL
		para (inteiro i = 0; i < 10; i++){
		
		valorTotal += (carrinhoValProd[i] * quantidadeProduto)
		
		}
		
		
		
		//TESTE SIMULAÇÃO NOTA FISCAL
		
		escreva("\n\nCONTINUAR A COMPRA? S/N -> ")
		leia(continuaCompra)
		continuaCompra = Texto.caixa_alta(continuaCompra)
		} 
		enquanto (continuaCompra== "S")  
			
	
		// TELA DE RELAÇÃO DE PRODUTOS FINAL
		limpa()
		escreva("WAKANDA STORE")
		escreva("\nSLOGAN")
		escreva("\n\nRELAÇÃO DOS PRODUTOS")
		escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")		
		
		//RELAÇÃO PRODUTOS FINAL - NECESSÁRIO?

		
		para (inteiro i = 0; i < 10; i++){
			escreva("\n")
			escreva(codigoProduto[i][0] + "     ")
			escreva(codigoProduto[i][1] + "     ")
			escreva(valorProduto[i] +     "     ")
			escreva(estoqueProduto[i])
		}
		
		limpa()
		escreva("\n\nWAKANDA STORE")
		escreva("\nRESUMO DA COMPRA:\n")
		escreva("\nVALOR TOTAL DA COMPRA: " + valorTotal)
		escreva("\nIMPOSTO 9% DO VALOR TOTAL: " + valorTotal * 0.09)
		escreva("\n\nOPÇÕES DE PAGAMENTO:\n")
		escreva("\n1 - A VISTA COM 10% DESCONTO ")		
		escreva("\n2 - NO CARTÃO COM ACRESCIMO DE 10% " )
		escreva("\n3 - 2X COM ACRÉSCIMO DE 15% \n")
		
		escreva("\nINFORME SUA OPÇÃO DE PAGAMENTO: ")
		leia(opcaoPagamento)

		escolha (opcaoPagamento) {

			caso 1: 
			escreva ("\n - A VISTA COM 10% DESCONTO -> " + Matematica.arredondar(valorTotal * 0.9, 2))
			pare
			
			caso 2:
			escreva ("\n - NO CARTÃO COM ACRESCIMO DE 10% -> " + Matematica.arredondar(valorTotal * 1.1, 2))
			pare
			
			caso 3:
			escreva ("\n - 2X COM ACRÉSCIMO DE 15% -> " + Matematica.arredondar(valorTotal * 1.15, 2) + " - VALOR DE CADA PARCELA: " + (valorTotal * 1.15)/2)
			pare
		}

			
			escreva("\nCOMPRA REALIZADA COM SUCESSO!  DESEJA A EMISSÃO DA NOTA FISCAL (S/N)?")
			leia (notaFiscal)
			notaFiscal = Texto.caixa_alta(notaFiscal)
			se (notaFiscal=="S") {

			escreva("\n\nOBRIGADA PELA COMPRA E VOLTE SEMPRE\n")
			escreva("\nNota Fiscal de Serviços Eletrônica - NFS-e No. 584562925 do  prestador de serviços: \n")
			escreva("Razão Social: HELLCIFE DO NORDESTE SERVICOS DE VAREJO LTDA\n")
			escreva("E-mail: faleconosco@hellcife.com\n")
			escreva("CCM : 34.972.128-2\n")
			escreva("CNPJ: 123.321.111/0001-66\n")
			} senao {
				escreva("OBRIGADA PELA COMPRA E VOLTE SEMPRE")
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
		escreva("\nOPÇÕES DE PAGAMENTO:\n")
		escreva("\n1 - A VISTA COM 10% DESCONTO -> " + valorTotal * 0.9)		
		escreva("\n2 - NO CARTÃO COM ACRESCIMO DE 10% -> " + valorTotal * 1.1)
		escreva("\n3 - 2X COM ACRÉSCIMO DE 15% -> " + valorTotal * 1.15 + " - VALOR DE CADA PARCELA: " + (valorTotal * 1.15)/2)
		*/

		} senao se (desejaComprar == "N") //comparação com a resposta N
		escreva("ATÉ BREVE!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 7659; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */