package app;

import java.util.Scanner;

import entities.*;

public class Programa {
// TODO conta nÃ£o pode ficar negativa depois dos possiveis 10 movimentos

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Scanner lerInt = new Scanner(System.in);
		Scanner lerString = new Scanner(System.in);
		int escolhaTipoConta;
		String cpfCliente, tipoConta = "", tipoMovimento = "", continua = "";
		int diaData;
		double valorMovimento = 0;

// INICIO DA TELA 1
		System.out.println("NOME DO BANCO");
		System.out.println("SLOGAN\n\n");
		System.out.println("1 - CONTA POUPANÇA");
		System.out.println("2 - CONTA CORRENTE");
		System.out.println("3 - CONTA ESPECIAL");
		System.out.println("4 - CONTA EMPRESA");
		System.out.println("5 - CONTA ESTUDANTIL");
		System.out.println("6 - SAIR\n");
		System.out.println("DIGITE O CODIGO DA OPÇÃO SELECIONADA: ");
		escolhaTipoConta = lerInt.nextInt();

		while (escolhaTipoConta < 0 && escolhaTipoConta > 7) {

			System.out.println("VOCÊ NÃO ESCOLHEU UMA OPÇÃO VALIDA");
			System.out.println("DIGITE UMA OPÇÃO VÁLIDA: ");
			escolhaTipoConta = lerInt.nextInt();
		}
		// CONTA POUPANÃ‡A
		if (escolhaTipoConta == 1) {
			System.out.println("DIGITE O NUMERO DO SEU CPF: ");
			cpfCliente = lerString.nextLine();
			System.out.println("INFORME O DIA DO MES: ");
			diaData = lerInt.nextInt();
			ContaPoupanca conta = new ContaPoupanca(escolhaTipoConta, cpfCliente, diaData);
			System.out.println("CONTA POUPANÃ‡A CRIADA");
			tipoConta = "POUPANÃ‡A";
			// FIM DA TELA 1
			// LIMPEZA DE TELA - DEPOIS ME DIZ SE TU ACHOU UM FLUSH DA VIDA ou algo a mais
			// pra limpar a tela e recomeçar, tive que usar gambiarra aqui...
			for (

					int i = 0; i < 50; ++i)
				System.out.println();
			// LIMPEZA DE TELA

			conta.mostraTela();
			System.out.printf("MOVIMENTO - D-debito ou C-CrÃ©dito: ");
			tipoMovimento = lerString.nextLine();
			System.out.printf("Valor movimento: R$ ");
			valorMovimento = lerInt.nextDouble();
			System.out.printf("CONTINUAR S/N: ");
			continua = lerString.nextLine();
			// CONTA CORRENTE
		} else if (escolhaTipoConta == 2) {
			System.out.println("DIGITE O NÃšMERO DO SEU CPF: ");
			cpfCliente = lerString.nextLine();
			ContaCorrente conta = new ContaCorrente(escolhaTipoConta, cpfCliente);
			System.out.println("CONTA CORRENTE CRIADA");
			tipoConta = "CORRENTE";

			// FIM DA TELA 1
			// LIMPEZA DE TELA - DEPOIS ME DIZ SE TU ACHOU UM FLUSH DA VIDA ou algo a mais
			// pra limpar a tela e recomeÃ§ar, tive que usar gambiarra aqui...
			for (

					int i = 0; i < 50; ++i)
				System.out.println();
			// LIMPEZA DE TELA

			// INICIO TELA 2
			conta.mostraTela();
			System.out.printf("MOVIMENTO - D-debito ou C-CrÃ©dito: ");
			tipoMovimento = lerString.nextLine();
			System.out.printf("Valor movimento: R$ ");
			valorMovimento = lerInt.nextDouble();
			System.out.printf("CONTINUAR S/N: ");
			continua = lerString.nextLine();
			// CONTA ESPECIAL
		} else if (escolhaTipoConta == 3) {
			System.out.println("DIGITE O NÃšMERO DO SEU CPF: ");
			cpfCliente = lerString.nextLine();
			ContaEspecial conta = new ContaEspecial(escolhaTipoConta, cpfCliente);
			System.out.println("CONTA ESPECIAL CRIADA");
			tipoConta = "ESPECIAL";

			// FIM DA TELA 1
			// LIMPEZA DE TELA - DEPOIS ME DIZ SE TU ACHOU UM FLUSH DA VIDA ou algo a mais
			// pra limpar a tela e recomeÃ§ar, tive que usar gambiarra aqui...
			for (

					int i = 0; i < 50; ++i)
				System.out.println();
			// LIMPEZA DE TELA

			// INICIO TELA 2
			conta.mostraTela();
			System.out.printf("MOVIMENTO - D-debito ou C-CrÃ©dito: ");
			tipoMovimento = lerString.nextLine();
			System.out.printf("Valor movimento: R$ ");
			valorMovimento = lerInt.nextDouble();
			System.out.printf("CONTINUAR S/N: ");
			continua = lerString.nextLine();
			// CONTA EMPRESA
		} else if (escolhaTipoConta == 4) {
			System.out.println("DIGITE O NÃšMERO DO SEU CPF: ");
			cpfCliente = lerString.nextLine();
			ContaEmpresa conta = new ContaEmpresa(escolhaTipoConta, cpfCliente);
			System.out.println("CONTA EMPRESA CRIADA");
			tipoConta = "EMPRESA";

			// FIM DA TELA 1
			// LIMPEZA DE TELA - DEPOIS ME DIZ SE TU ACHOU UM FLUSH DA VIDA ou algo a mais
			// pra limpar a tela e recomeÃ§ar, tive que usar gambiarra aqui...
			for (

					int i = 0; i < 50; ++i)
				System.out.println();
			// LIMPEZA DE TELA

			// INICIO TELA 2
			conta.mostraTela();
			System.out.printf("MOVIMENTO - D-debito ou C-CrÃ©dito: ");
			tipoMovimento = lerString.nextLine();
			System.out.printf("Valor movimento: R$ ");
			valorMovimento = lerInt.nextDouble();
			System.out.printf("CONTINUAR S/N: ");
			continua = lerString.nextLine();

			// CONTA ESTUDANTIL
		} else if (escolhaTipoConta == 5) {
			System.out.println("DIGITE O NÃšMERO DO SEU CPF: ");
			cpfCliente = lerString.nextLine();
			ContaEstudantil conta = new ContaEstudantil(escolhaTipoConta, cpfCliente);
			System.out.println("CONTA ESTUDANTIL CRIADA");
			tipoConta = "ESTUDANTIL";

			// FIM DA TELA 1
			// LIMPEZA DE TELA - DEPOIS ME DIZ SE TU ACHOU UM FLUSH DA VIDA ou algo a mais
			// pra limpar a tela e recomeÃ§ar, tive que usar gambiarra aqui...
			for (

					int i = 0; i < 50; ++i)
				System.out.println();
			// LIMPEZA DE TELA

			// INICIO TELA 2
			conta.mostraTela();
			System.out.printf("MOVIMENTO - D-debito ou C-CrÃ©dito: ");
			tipoMovimento = lerString.nextLine();
			System.out.printf("Valor movimento: R$ ");
			valorMovimento = lerInt.nextDouble();
			System.out.printf("CONTINUAR S/N: ");
			continua = lerString.nextLine();
		}

		// FIM TELA 2

		// FIM DO PROGRAMA
	}

}
