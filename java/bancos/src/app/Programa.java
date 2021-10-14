package app;

import java.util.Scanner;

import entities.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int escolhaTipoConta;

		System.out.println("NOME DO BANCO");
		System.out.println("SLOGAN\n\n");

		System.out.println("1 - CONTA POUPANÇA");
		System.out.println("2 - CONTA CORRENTE");
		System.out.println("3 - CONTA ESPECIAL");
		System.out.println("4 - CONTA EMPRESA");
		System.out.println("5 - CONTA ESTUDANTIL");
		System.out.println("6 - SAIR\n");
		System.out.println("DIGITE O CODIGO DA OPÇÃO SELECIONADA: ");
		escolhaTipoConta = ler.nextInt();

		while (escolhaTipoConta != 1 || escolhaTipoConta != 2 || escolhaTipoConta != 3 || escolhaTipoConta != 4
				|| escolhaTipoConta != 5 || escolhaTipoConta != 6) {

			System.out.println("VOCÊ NÃO ESCOLHEU UMA OPÇÃO VÁLIDA");
			System.out.println("DIGITE UMA OPÇÃO VÁLIDA: ");
			escolhaTipoConta = ler.nextInt();
		}

		switch (escolhaTipoConta) {

		case 1:
			System.out.println("CONTA POUPANÇA CRIADA");
			break;
		case 2:
			System.out.println("CONTA CORRENTE CRIADA");
			break;
		case 3:
			System.out.println("CONTA ESPECIAL CRIADA");
			break;
		case 4:
			System.out.println("CONTA EMPRESA CRIADA");
			break;
		case 5:
			System.out.println("CONTA ESTUDANTIL CRIADA");
			break;

		}

	}

}
