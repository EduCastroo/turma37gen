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

		// IN�CIO LOOP PROGRAMA

		s1.slogan();
		System.out.print("\nDeseja fazer uma compra [S/N] ? ");
		desejaComprar = ler.next().toUpperCase().charAt(0);

		// APRESENTA��O TABELA PRODUTOS
		if (desejaComprar == 'S') {
			for (Produto item : lista) {
				System.out.print("\n\t    " + item.getCodProduto() + " \t\t" + item.getProduto() + " \t\t"
						+ item.getPreco() + "\t   \t  " + item.getEstoque() + "\t   ");
			}
			// ESCOLHE PRODUTO
			do {// INICIO LA�O COMPRA
				s1.slogan();
				System.out.print("\nSelecione o c�digo do produto : "); // Caso cod errado (linha 144)
				auxCod = ler.next().toUpperCase();
				for (int contador = 0; contador < lista.size(); contador++) {
					if (lista.get(contador).getCodProduto().equals(auxCod)) {
						pos = contador;
						break;
					}
				}
				// VERIFICA A REPETI��O DE PRODUTO NA MESMA COMPRA
				for (int i = 0; i < carrinho.size(); i++) {
					if (carrinho.get(i).getCodProduto().equals(auxCod)) {
						produtoIgual = carrinho.get(i).getCodProduto();
						posicaoProdutoIgual = carrinho.indexOf(carrinho.get(i));
					}
				}
				// TESTE DO PRODUTO REPETIDO
				if (produtoIgual.equals(auxCod)) {
					System.out.print("Voc� j� selecionou este c�digo, deseja alter�-lo [S/N] ?");
					altera = ler.next().toUpperCase().charAt(0);
					if (altera == 'S') {
						// DADOS DO PRODUTO ESCOLHIDO
						System.out.println("C�DIGO : " + lista.get(pos).getCodProduto());
						System.out.println("PRODUTO : " + lista.get(pos).getProduto());
						System.out.println("VALOR : " + lista.get(pos).getPreco());
						System.out.println("ESTOQUE : " + lista.get(pos).getEstoque());
						System.out.print("\nInforme a nova quantidade : ");
						auxQuant = ler.nextInt();
						// VALIDA��ES DE QUANTIDADE DO PRODUTO SELECIONADO
						if (auxQuant < 0) {
							System.out.println("Imposs�vel realizar, valor negativo!");
						} else if (auxQuant == 0) {
							System.out.println("Imposs�vel realizar, nenhuma quantidade foi escolhida.");
						} else if (lista.get(pos).getEstoque() == 0) {
							System.out.println("Imposs�vel realizar, produto sem estoque!");
						} else if (lista.get(pos).getEstoque() < auxQuant) {
							System.out.print("Imposs�vel realizar, quantidade maior que estoque!");
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
					// CASO O PRODUTO N�O TENHA SIDO SELECIONADO MAIS DE UMA VEZ, ELE VEM DIRETO
					// PARA C�
				} else if (pos >= 0) {
					// DADOS DO PRODUTO ESCOLHIDO
					System.out.println("C�DIGO : " + lista.get(pos).getCodProduto());
					System.out.println("PRODUTO : " + lista.get(pos).getProduto());
					System.out.println("VALOR : " + lista.get(pos).getPreco());
					System.out.println("ESTOQUE : " + lista.get(pos).getEstoque());
					//System.out.print("\nDigite a quantidade desejada : ");
					//auxQuant = ler.nextInt();


					do {
						System.out.println("Digite a quantidade desejada: ");
						while (!ler.hasNextInt()) {
							System.out.println("Valor digitado � inv�lido, digite novamente.");
							ler.next(); // this is important!
						}
						auxQuant = ler.nextInt();
					} while (auxQuant <= 0);


					// VALIDA��ES DE QUANTIDADE DO PRODUTO SELECIONADO
					if (auxQuant < 0) {

						System.out.println("Imposs�vel realizar, valor negativo!");
					} else if (auxQuant == 0) {
						System.out.println("Imposs�vel realizar, nenhuma quantidade foi escolhida.");
					} else if (lista.get(pos).getEstoque() == 0) {
						System.out.println("Imposs�vel realizar, produto sem estoque!");
					} else if (lista.get(pos).getEstoque() < auxQuant) {
						System.out.print("Imposs�vel realizar, quantidade maior que estoque!");
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
					System.out.println("Codigo informado n�o existe!"); // incentiva a continuar a compra (linha
																		// 147)
				}
				// PERGUNTA PARA PROSSEGUIR COM A COMPRA
				System.out.print("\nDeseja continuar a compra [S/N] ? ");
				continua = ler.next().toUpperCase().charAt(0);
			} while (continua == 'S');// FIM DO LA�O COMPRA
			// EXIBI��O DO CARRINHO FINAL e ATUALIZA ESTOQUE
			for (Produto escolhido : carrinho) {
				System.out.print("    " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto() + "\t\t"
						+ escolhido.getPreco() + "\t  \t  " + escolhido.getEstoque() + "\t\t"
						+ escolhido.getEstoque() * escolhido.getPreco() + "\t   \n");
			}
			// C�LCULO DO CARRINHO FINAL
			for (int i = 0; i < carrinho.size(); i++) {
				pos = i;
				total += (carrinho.get(pos).getPreco() * carrinho.get(pos).getEstoque());
			}
			// OP��ES DE PAGAMENTO
			//opcoesPagamento();
			System.out.print("\nDigite a op��o de pagamento :\n"

					+ "1 - � VISTA|\t 2 - � VISTA CART�O (10% juros) |\t 3 - 2x NO CART�O (15% juros)");
			opcao = ler.nextInt();
			System.out.print("\n");

			while (opcao > 3 || opcao <= 0) {
				System.out.println("Op��o inv�lida, escolha novamente!");
				opcoesPagamento();
				System.out.print("\nDigite a op��o de pagamento :\n "

						+ "1 - � VISTA|\t 2 - � VISTA CART�O (10% juros) |\t 3- 2x NO CART�O (15% juros)");
				opcao = ler.nextInt();
			}
			// OP��O 1 - � VISTA
			if (opcao == 1) {
				for (Produto escolhido : carrinho) {
					System.out.print("     " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto() + "\t\t"
							+ escolhido.getPreco() + "\t   \t  " + escolhido.getEstoque() + "\t\t"
							+ escolhido.getEstoque() * escolhido.getPreco() + "\t    \n");
				}
				System.out.println("\nDinheiro � vista");
				System.out.println("9% de ICMS : R$ " + df.format(total * 0.09));
				System.out.println("10% de desconto : R$ " + df.format(total * 0.1));
				System.out.println("\nTOTAL DA COMPRA R$ " + df.format(total * 0.9));
				System.out.println("\nWakanda Store agradece!\n� um prazer ter voc� conosco a cada momento da jornada DEV!\n");
				System.out.print("\n\t\t\t\t\tData de emiss�o : " + formatterData.format(agora) + "\t    Hora : "
						+ formatterHora.format(agora));
				s1.linhaNota();
				s1.nota();

			}

			// OP��O 2 - � VISTA CART�O
			if (opcao == 2) {
				for (Produto escolhido : carrinho) {
					System.out.print("     " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto() + "\t\t"
							+ escolhido.getPreco() + "\t   \t  " + escolhido.getEstoque() + "\t\t"
							+ escolhido.getEstoque() * escolhido.getPreco() + "\t    \n");
				}

				System.out.println("\nCart�o � vista");
				System.out.println("9% de ICMS : R$ " + df.format(total * 0.09));
				System.out.println("10% de acr�scimo : R$ " + df.format(total * 0.1));
				System.out.println("\nTOTAL DA COMPRA R$ " + df.format(total * 1.1));
				System.out.print("\n\t\t\t\t\tData de emiss�o : " + formatterData.format(agora) + "\t    Hora : "
						+ formatterHora.format(agora));
				s1.linhaNota();
				s1.nota();
			}

			// OP��O 3 - 2X NO CART�O
			if (opcao == 3) {
				for (Produto escolhido : carrinho) {
					System.out.print("     " + escolhido.getCodProduto() + " \t\t" + escolhido.getProduto() + "\t\t"
							+ escolhido.getPreco() + "\t   \t  " + escolhido.getEstoque() + "\t\t"
							+ escolhido.getEstoque() * escolhido.getPreco() + "\t    \n");
				}

				System.out.println("\n2X no Cart�o");
				System.out.println("9% de ICMS : R$ " + df.format(total * 0.09));
				System.out.println("15% de acr�scimo : R$ " + df.format(total * 0.15));
				System.out.println("Valor da parcela : R$ " + df.format((total * 1.15) / 2));
				System.out.println("\nTOTAL DA COMPRA R$ " + df.format(total * 1.15));
				System.out.print("\n\t\t\t\t\tData de emiss�o : " + formatterData.format(agora) + "\t    Hora : "
						+ formatterHora.format(agora));
				s1.linhaNota();
				s1.nota();

			}
			// ATUALIZA A LISTA DE PRODUTOS AP�S A COMPRA
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
		System.out.println("\n� uma pena, infelizmente n�o foi dessa vez! \nWakanda Store agradece!\n");
		System.out.println("Fim de Programa!!");
		//break;
		} else {
			System.out.println("Voc� digitou algo diferente do que foi pedido!!");
		}
		
	}
	/*
	 * public static void slogan() { }
	 */

	private static void opcoesPagamento() {

		char desejaVoltarParaSite = 0;
		while (desejaVoltarParaSite == 'S')
			;
		
		//System.out.println("\nWakanda Store agradece!\n� um prazer ter voc� conosco a cada momento da jornada DEV!\n");
	}
} 