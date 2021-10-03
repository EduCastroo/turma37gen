	programa
	{
		inclua biblioteca Matematica	
		inclua biblioteca Texto
	
		//PEDRO
		//DECLARAÇÃO DE VARIAVEIS GLOBAIS
		inteiro c1 = 0, c2 = 0, c3 = 0 //contadores globais
		inteiro qtdCarrinho[10] // vetor global
		//PEDRO
		
		funcao inicio()
		{
			//Declaracao de variaveis
			//inteiro qtdCarrinho[]Final[]
	
			cadeia notaFiscal
			cadeia confirmaCompra
			inteiro opcaoPagamento = 0
			inteiro codProd = 0,verificaQuantidade = 0, m = 0 // A VARIAVEL qtdCarrinho[] NESTE CODIGO, ESTA OBSOLETA, TENDO EM VISTA QUE FOI SUBSTITUIDA PELO VETOR qtdCarrinho[]
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
									{"G7-9", " Memoria RAM   "},
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
			escreva("\n♥ WAKANDA FOREVER ♥")
	
			escreva("\n\nDESEJA FAZER COMPRAS S/N: ")		
			leia(desejaComprar)
			desejaComprar = Texto.caixa_alta(desejaComprar) //sobrescreve desejaComprar[0]
			
			se (desejaComprar == "S"){ //comparacao com a resposta S
			 //Fase dois
			limpa()
			escreva("WAKANDA STORE")
			escreva("\n♥ WAKANDA FOREVER ♥")
			escreva("\n\nRELATORIO DOS PRODUTOS")
			escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
			
			//RELATORIO PRODUTOS
			para (inteiro i = 0; i < 10; i++){
				escreva("\n")
				escreva(codigoProduto[i][0] + "     ")
				escreva(codigoProduto[i][1] + "     ")
				escreva(valorProduto[i] +     "     ")
				escreva(estoqueProduto[i])
			}
	
			// laﾃｧo para encontrar o produto escolhido dentro da matriz
			faca {
				se (continuaCompra=="S") {
					escreva("WAKANDA STORE")
					escreva("\n♥ WAKANDA FOREVER ♥")
					escreva("\n\nRELATORIO DOS PRODUTOS")
					escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
					
					//RELATORIO PRODUTOS
					para (inteiro i = 0; i < 10; i++){
						escreva("\n")
						escreva(codigoProduto[i][0] + "     ")
						escreva(codigoProduto[i][1] + "     ")
						escreva(valorProduto[i] +     "     ")
						escreva(estoqueProduto[i])
					}
	
				}
			
			// USUARIO COLOCA O CODIGO DO PRODUTO
			escreva("\n\nDIGITE O CODIGO DO PRODUTO: ")		
			leia(codigo)
	
			
			// VERIFICADOR DO CODIGO DO PRODUTO
			para (c2 = 0; c2 <10; c2++){
				para (c3 = 0; c3 < 2; c3++){
					enquanto (codigo == carrinhoCodProd[c2][c3]){ // CONDICAO DE VERIFICACAO: ENQUANTO CODIGO DO PRODUTO FOR IGUAL A ALGUM carrinhoCODPROD 
														//O LOOP CONTINUA PEDINDO PARA O USUARIO COLOCAR UM CODIGO VALIDO
														//O LOOP PERCORRE TODA A MATRIZ carrinhoCodProd e verifica a condicao em cada um dos indices
						escreva("Produto já selecionado anteriormente")
						escreva("\nDIGITE UM CODIGO VALIDO: ")
						leia(codigo)
						
				}
				}	
			}
			/*se (codigo=="G7-1" ou codigo=="G7-2" ou codigo=="G7-3" ou codigo=="G7-4" ou codigo=="G7-5" ou codigo=="G7-6" ou codigo=="G7-7" ou codigo=="G7-8" ou codigo=="G7-9" ou codigo=="G7-10")	{
			escreva("CODIGO INVALIDO!")
			escreva("\n\nDIGITE O CODIGO DO PRODUTO: ")		
			leia(codigo)
			*/		
			
			// Faz o vetor qtdCarrinho ficar no indice correto
			para (c2 = 0; c2 <10; c2++){
				para (c3 = 0; c3 < 2; c3++){
					se (codigo == codigoProduto[c2][c3]){
							c1 = c2
						}

					
				}
			}
			escreva("\nDIGITE A QUANTIDADE NECESSARIA: ")
			
			leia(qtdCarrinho[c1])	
			
			//c1 += 1
			//qtdCarrinho[c1] = qtdCarrinho[]
			 //SEU CARRINHO
			
			
			// VALIDADOR DA QUANTIDADE EM ESTOQUE
			faca{
				
			para(m = 0; (estoqueProduto[m] < qtdCarrinho[m] ou qtdCarrinho[m]<0) ; m++){ // VERIFICAR ESTA CONDICAO!!!!!!!
				escreva("\nQUANTIDADE INDISPONIVEL NO ESTOQUE.\n")
				escreva("\nDIGITE UMA QUANTIDADE VALIDA: ")									
				leia(qtdCarrinho[m]) //tentando validar com a quantidade em estoque
				
				} 
			} enquanto (estoqueProduto[m] < qtdCarrinho[m])
			
			
			
			
			para (inteiro j = 0; j < 10; j++){		
			se (codigo == codigoProduto[j][0]){
							
				// Atribuindo os valores do vetor carrinho de compras
				carrinhoCodProd[j][0] = codigoProduto[j][0]
				carrinhoCodProd[j][1] = codigoProduto[j][1]
				carrinhoValProd[j] = valorProduto[j]
				//Estoque P
				
				estoqueProduto[j] -= qtdCarrinho[j]
				carrinhoEstProd[j] = estoqueProduto[j]	
				
				
				escreva("\n")
						
			}
			}
	
			escreva("\n\nRELACAO DOS PRODUTOS")
			escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")
			
			//RELACAO PRODUTOS ATUALIZADA
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
				escreva(" - QTDE SELECIONADA: " + qtdCarrinho[l])
				
				
				
				}
				
			}
			//TESTE EMISSAO NOTA
			// EMISSAO DA NOTA FISCAL
			//CALCULO VALOR TOTAL
			para (inteiro i = 0; i < 10; i++){
			
			valorTotal += (carrinhoValProd[i] * qtdCarrinho[i])
			
			}
			
			
			
			//TESTE SIMULACAO NOTA FISCAL
			
			escreva("\n\nCONTINUAR A COMPRA? S/N -> ")
			leia(continuaCompra)
			continuaCompra = Texto.caixa_alta(continuaCompra)
			} 
			enquanto (continuaCompra == "S")  
				
		
			// TELA DE RELATORIO DE PRODUTOS FINAL
			limpa()
			escreva("WAKANDA STORE")
			escreva("\n♥ WAKANDA FOREVER ♥")
			escreva("\n\nRELACAO DOS PRODUTOS")
			escreva("\nCOD      PRODUTO            VALOR(R$) ESTOQUE")		
			
			//RELACAO PRODUTOS FINAL - NECESSARIO?
	
			
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
			escreva("\n\nOPCOES DE PAGAMENTO:\n")
			escreva("\n1 - A VISTA COM 10% DESCONTO ")		
			escreva("\n2 - NO CARTAO COM ACRESCIMO DE 10% " )
			escreva("\n3 - 2X COM ACRESCIMO DE 15% \n")
			
			escreva("\nINFORME SUA OPCAO DE PAGAMENTO: ")
			leia(opcaoPagamento)
	
			escolha (opcaoPagamento) {
	
				caso 1: 
				escreva ("\n - A VISTA COM 10% DESCONTO -> " + Matematica.arredondar(valorTotal * 0.9, 2))
				pare
				
				caso 2:
				escreva ("\n - NO CARTAO COM ACRESCIMO DE 10% -> " + Matematica.arredondar(valorTotal * 1.1, 2))
				pare
				
				caso 3:
				escreva ("\n - 2X COM ACRESCIMO DE 15% -> " + Matematica.arredondar(valorTotal * 1.15, 2) + " - VALOR DE CADA PARCELA: " + (valorTotal * 1.15)/2)
				pare
			}
				
				//CONFIRMA COMPRA
		
	
				escreva("\nCONFIRMAR COMPRA(S/N)?")
				leia (confirmaCompra)
				//notaFiscal = Texto.caixa_alta(notaFiscal)
				se (confirmaCompra == "S" ou confirmaCompra == "s") {
	
					//NOTA FISCAL
				
				escreva("\nCOMPRA REALIZADA COM SUCESSO!  DESEJA A EMISSAO DA NOTA FISCAL (S/N)?")
				leia (notaFiscal)
				notaFiscal = Texto.caixa_alta(notaFiscal)
				se (notaFiscal=="S"){
					
					escreva("\n\nOBRIGADA PELA COMPRA E VOLTE SEMPRE\n")
				     escreva("\nNota Fiscal de Servicos Eletronica - NFS-e No. 584562925 do  prestador de servicos: \n")
				     escreva("Razao Social: WAKANDA STORE LTDA\n")
				     escreva("E-mail: faleconosco@wakandastore.com\n")
				     escreva("CCM : 34.972.128-2\n")
				     escreva("CNPJ: 123.321.111/0001-66\n")
				} 
				senao {
					escreva("COMPRA CANCELADA!")
					escreva("OBRIGADA E VOLTE SEMPRE")
				}
			
			/*
			// EMISSAO DA NOTA FISCAL
			//CALCULO VALOR TOTAL
			para (inteiro i = 0; i < 10; i++){
			
			valorTotal += (carrinhoValProd[i] * qtdCarrinho[])
			
			}
			
			escreva("\n\nWAKANDA STORE")
			escreva("\nVALOR TOTAL DA COMPRA: " + valorTotal)
			escreva("\nIMPOSTO 9% DO VALOR TOTAL: " + valorTotal * 0.09)
			escreva("\nOPCOES DE PAGAMENTO:\n")
			escreva("\n1 - A VISTA COM 10% DESCONTO -> " + valorTotal * 0.9)		
			escreva("\n2 - NO CARTAO COM ACRESCIMO DE 10% -> " + valorTotal * 1.1)
			escreva("\n3 - 2X COM ACRESCIMO DE 15% -> " + valorTotal * 1.15 + " - VALOR DE CADA PARCELA: " + (valorTotal * 1.15)/2)
			*/
	
			} 
			}senao se (desejaComprar == "N") //comparacao com a resposta N
			escreva("ATE BREVE!!")
	
			
			}
		}
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1587; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {c1, 8, 10, 2}-{qtdCarrinho, 9, 10, 11}-{codigo, 22, 10, 6}-{estoqueProduto, 40, 11, 14}-{carrinhoEstProd, 45, 11, 15}-{j, 150, 17, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */