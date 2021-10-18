package app;

import java.util.*; //* junta todas a bbs do java da pasta util
import java.text.*;
import java.time.LocalDateTime; //Como manipular datas
import java.time.format.DateTimeFormatter;

import entities.Produto;
import entities.Slogan;

public class Projetonew {

	public static void main(String[] args) {
		Slogan s1 = new Slogan(); // instanciar (criar obj)

		DecimalFormat df = new DecimalFormat("#.00");// ARREDONDA VALOR
		LocalDateTime agora = LocalDateTime.now();// DATA/HORA ATUAL
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");// FORMATA DATA
		String dataFormatada = formatterData.format(agora);
		DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");// FORMATA HORA
		String horaFormatada = formatterHora.format(agora);
		Scanner ler = new Scanner(System.in);
		String auxCod = " ";
		double total = 0.0;
		int opcao = 0;
		int auxQuant = 0;
		char continua = ' ';
		char desejaComprar = ' ';
		char desejaVoltarParaSite = ' ';
		int pos = -1;
		char altera = ' ';
		String produtoIgual = "";
		int posicaoProdutoIgual = 0;
		int num_aleatorio = 0;
		List<Produto> lista = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();
		lista.add(new Produto("G7-1", "Mouse           ", 100.00, 10));
		lista.add(new Produto("G7-2", "Teclado         ", 100.00, 10));
		lista.add(new Produto("G7-3", "Monitor         ", 100.00, 10));
		lista.add(new Produto("G7-4", "TV              ", 100.00, 10));
		lista.add(new Produto("G7-5", "Gabinete Gamer  ", 100.00, 10));
		lista.add(new Produto("G7-6", "Headphone       ", 100.00, 10));
		lista.add(new Produto("G7-7", "Impressora      ", 100.00, 10));
		lista.add(new Produto("G7-8", "Fonte           ", 100.00, 10));
		lista.add(new Produto("G7-9", "Memoria RAM     ", 100.00, 10));
		lista.add(new Produto("G7-10", "SSD            ", 100.00, 10));

		// INÍCIO LOOP PROGRAMA

		s1.slogan();
		System.out.print("\nDeseja fazer uma compra [S/N] ? ");
		desejaComprar = ler.next().toUpperCase().charAt(0);

		// APRESENTAÇÃO TABELA PRODUTOS
		if (desejaComprar == 'S') {
			for (Produto item : lista) {
				System.out.print("\n\t    " + item.getCodProduto() + " \t\t" + item.getProduto() + " \t\t"
						+ item.getPreco() + "\t   \t  " + item.getEstoque() + "\t   ");
			}
			// ESCOLHE PRODUTO
			do {// INICIO LAÇO COMPRA
				s1.slogan();
				System.out.print("\nSelecione o código do produto : "); // Caso cod errado (linha 144)
				auxCod = ler.next().toUpperCase();
				for (int contador = 0; contador < lista.size(); contador++) {
					if (lista.get(contador).getCodProduto().equals(auxCod)) {
						pos = contador;
						break;
					}
				}
				// VERIFICA A REPETIÇÃO DE PRODUTO NA MESMA COMPRA
				for (int i = 0; i < carrinho.size(); i++) {
					if (carrinho.get(i).getCodProduto().equals(auxCod)) {
						produtoIgual = carrinho.get(i).getCodProduto();
						posicaoProdutoIgual = carrinho.indexOf(carrinho.get(i));
					}
				}
				// TESTE DO PRODUTO REPETIDO
				if (produtoIgual.equals(auxCod)) {
					System.out.print("Você já selecionou este código, deseja alterá-lo [S/N] ?");
					altera = ler.next().toUpperCase().charAt(0);
					if (altera == 'S') {
						// DADOS DO PRODUTO ESCOLHIDO
						System.out.println("CÓDIGO : " + lista.get(pos).getCodProduto());
						System.out.println("PRODUTO : " + lista.get(pos).getProduto());
						System.out.println("VALOR : " + lista.get(pos).getPreco());
						System.out.println("ESTOQUE : " + lista.get(pos).getEstoque());
						System.out.print("\nInforme a nova quantidade : ");
						auxQuant = ler.nextInt();
						// VALIDAÇÕES DE QUANTIDADE DO PRODUTO SELECIONADO
						if (auxQuant < 0) {
							System.out.println("Impossível realizar, valor negativo!");
						} else if (auxQuant == 0) {
							System.out.println("Impossível realizar, nenhuma quantidade foi escolhida.");
						} else if (lista.get(pos).getEstoque() == 0) {
							System.out.println("Impossível realizar, produto sem estoque!");
						} else if (lista.get(pos).getEstoque() < auxQuant) {
							System.out.print("Impossível realizar, quantidade maior que estoque!");
						} else {
							// ATUALIZA e EXIBE CARRINHO
							carrinho.get(posicaoProdutoIgual).setEstoque(auxQuant);
							for (Produto escolhido : carrinho) {
								System.out.print("     " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto()
										+ "\t\t" + escolhido.getPreco() + "\t   \t  " + escolhido.getEstoque() + "\t\t"
										+ escolhido.getEstoque() * escolhido.getPreco() + "\t    \n");
							}
						}
					}
					// CASO O PRODUTO NÃO TENHA SIDO SELECIONADO MAIS DE UMA VEZ, ELE VEM DIRETO
					// PARA CÁ
				} else if (pos >= 0) {
					// DADOS DO PRODUTO ESCOLHIDO
					System.out.println("CÓDIGO : " + lista.get(pos).getCodProduto());
					System.out.println("PRODUTO : " + lista.get(pos).getProduto());
					System.out.println("VALOR : " + lista.get(pos).getPreco());
					System.out.println("ESTOQUE : " + lista.get(pos).getEstoque());
					//System.out.print("\nDigite a quantidade desejada : ");
					//auxQuant = ler.nextInt();


					do {
						System.out.println("Digite a quantidade desejada: ");
						while (!ler.hasNextInt()) {
							System.out.println("Valor digitado é inválido, digite novamente.");
							ler.next(); // this is important!
						}
						auxQuant = ler.nextInt();
					} while (auxQuant <= 0);


					// VALIDAÇÕES DE QUANTIDADE DO PRODUTO SELECIONADO
					if (auxQuant < 0) {

						System.out.println("Impossível realizar, valor negativo!");
					} else if (auxQuant == 0) {
						System.out.println("Impossível realizar, nenhuma quantidade foi escolhida.");
					} else if (lista.get(pos).getEstoque() == 0) {
						System.out.println("Impossível realizar, produto sem estoque!");
					} else if (lista.get(pos).getEstoque() < auxQuant) {
						System.out.print("Impossível realizar, quantidade maior que estoque!");
					} else {
						// ATUALIZA e EXIBE CARRINHO
						carrinho.add(new Produto(lista.get(pos).getCodProduto(), lista.get(pos).getProduto(),
								lista.get(pos).getPreco(), auxQuant));
						for (Produto escolhido : carrinho) {
							System.out.print("     " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto()
									+ "\t\t" + escolhido.getPreco() + "\t   \t  " + escolhido.getEstoque() + "\t\t"
									+ escolhido.getEstoque() * escolhido.getPreco() + "\t    \n");
						}
					}
				} else {
					System.out.println("Codigo informado não existe!"); // incentiva a continuar a compra (linha
																		// 147)
				}
				// PERGUNTA PARA PROSSEGUIR COM A COMPRA
				System.out.print("\nDeseja continuar a compra [S/N] ? ");
				continua = ler.next().toUpperCase().charAt(0);
			} while (continua == 'S');// FIM DO LAÇO COMPRA
			// EXIBIÇÃO DO CARRINHO FINAL e ATUALIZA ESTOQUE
			for (Produto escolhido : carrinho) {
				System.out.print("    " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto() + "\t\t"
						+ escolhido.getPreco() + "\t  \t  " + escolhido.getEstoque() + "\t\t"
						+ escolhido.getEstoque() * escolhido.getPreco() + "\t   \n");
			}
			// CÁLCULO DO CARRINHO FINAL
			for (int i = 0; i < carrinho.size(); i++) {
				pos = i;
				total += (carrinho.get(pos).getPreco() * carrinho.get(pos).getEstoque());
			}
			// OPÇÕES DE PAGAMENTO
			//opcoesPagamento();
			System.out.print("\nDigite a opção de pagamento :\n"

					+ "1 - À VISTA|\t 2 - À VISTA CARTÃO (10% juros) |\t 3 - 2x NO CARTÃO (15% juros)");
			opcao = ler.nextInt();
			System.out.print("\n");

			while (opcao > 3 || opcao <= 0) {
				System.out.println("Opção inválida, escolha novamente!");
				opcoesPagamento();
				System.out.print("\nDigite a opção de pagamento :\n "

						+ "1 - À VISTA|\t 2 - À VISTA CARTÃO (10% juros) |\t 3- 2x NO CARTÃO (15% juros)");
				opcao = ler.nextInt();
			}
			// OPÇÃO 1 - À VISTA
			if (opcao == 1) {
				for (Produto escolhido : carrinho) {
					System.out.print("     " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto() + "\t\t"
							+ escolhido.getPreco() + "\t   \t  " + escolhido.getEstoque() + "\t\t"
							+ escolhido.getEstoque() * escolhido.getPreco() + "\t    \n");
				}
				System.out.println("\nDinheiro à vista");
				System.out.println("9% de ICMS : R$ " + df.format(total * 0.09));
				System.out.println("10% de desconto : R$ " + df.format(total * 0.1));
				System.out.println("\nTOTAL DA COMPRA R$ " + df.format(total * 0.9));
				System.out.println("\nWakanda Store agradece!\nÉ um prazer ter você conosco a cada momento da jornada DEV!\n");
				System.out.print("\n\t\t\t\t\tData de emissão : " + formatterData.format(agora) + "\t    Hora : "
						+ formatterHora.format(agora));
				s1.linhaNota();
				s1.nota();

			}

			// OPÇÃO 2 - À VISTA CARTÃO
			if (opcao == 2) {
				for (Produto escolhido : carrinho) {
					System.out.print("     " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto() + "\t\t"
							+ escolhido.getPreco() + "\t   \t  " + escolhido.getEstoque() + "\t\t"
							+ escolhido.getEstoque() * escolhido.getPreco() + "\t    \n");
				}

				System.out.println("\nCartão à vista");
				System.out.println("9% de ICMS : R$ " + df.format(total * 0.09));
				System.out.println("10% de acréscimo : R$ " + df.format(total * 0.1));
				System.out.println("\nTOTAL DA COMPRA R$ " + df.format(total * 1.1));
				System.out.print("\n\t\t\t\t\tData de emissão : " + formatterData.format(agora) + "\t    Hora : "
						+ formatterHora.format(agora));
				s1.linhaNota();
				s1.nota();
			}

			// OPÇÃO 3 - 2X NO CARTÃO
			if (opcao == 3) {
				for (Produto escolhido : carrinho) {
					System.out.print("     " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto() + "\t\t"
							+ escolhido.getPreco() + "\t   \t  " + escolhido.getEstoque() + "\t\t"
							+ escolhido.getEstoque() * escolhido.getPreco() + "\t    \n");
				}

				System.out.println("\n2X no Cartão");
				System.out.println("9% de ICMS : R$ " + df.format(total * 0.09));
				System.out.println("15% de acréscimo : R$ " + df.format(total * 0.15));
				System.out.println("Valor da parcela : R$ " + df.format((total * 1.15) / 2));
				System.out.println("\nTOTAL DA COMPRA R$ " + df.format(total * 1.15));
				System.out.print("\n\t\t\t\t\tData de emissão : " + formatterData.format(agora) + "\t    Hora : "
						+ formatterHora.format(agora));
				s1.linhaNota();
				s1.nota();

			}
			// ATUALIZA A LISTA DE PRODUTOS APÓS A COMPRA
			for (int i = 0; i < carrinho.size(); i++) {
				for (int j = 0; j < lista.size(); j++) {
					if (lista.get(j).getCodProduto().equals(carrinho.get(i).getCodProduto())) {
						lista.get(j).setEstoque(lista.get(j).getEstoque() - carrinho.get(i).getEstoque());
					}
				}

			}
			// ZERA CARRINHO
			carrinho.clear();
			/*
			 * } else { // break; }
//			 */
//			do {
//
//				System.out.print("Deseja voltar ao site [S/N] ?: ");
//				desejaVoltarParaSite = ler.next().toUpperCase().charAt(0);
//				System.out.println();
//			} while (continua != 'S' && continua != 'N');

		}

		if (desejaComprar =='N') {
		System.out.println("\nÉ uma pena, infelizmente não foi dessa vez! \nWakanda Store agradece!\n");
		System.out.println("Fim de Programa!!");
		//break;
		} else {
			System.out.println("Você digitou algo diferente do que foi pedido!!");
		}
		
	}
	/*
	 * public static void slogan() { }
	 */

	private static void opcoesPagamento() {

		char desejaVoltarParaSite = 0;
		while (desejaVoltarParaSite == 'S')
			;
		
		//System.out.println("\nWakanda Store agradece!\nÉ um prazer ter você conosco a cada momento da jornada DEV!\n");
	}
} 