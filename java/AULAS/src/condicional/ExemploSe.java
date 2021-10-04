package condicional;

import java.util.Scanner;

public class ExemploSe {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		final int AUXILIO_EMERGENCIAL = 600;
		String nome;
		char pronome;
		char op;
		int qntFilhos;
		int chef;
		int valorTotal=0;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print(nome+", digite o pronome que você prefere A/O/E: ");
		pronome = leia.next().toUpperCase().charAt(0);
		System.out.print(nome+", digite o número de filhos: ");
		qntFilhos = leia.nextInt();
		System.out.print(nome+", digite [1] para chefa de família ou [2] para chefe de família: ");
		chef = leia.nextInt();
		System.out.print(nome+", você já recebe algum auxílio S/N:");
		op = leia.next().toUpperCase().charAt(0);
		
		if (pronome == 'A') {
			System.out.println("Seja bem-vinda!");
		} else if (pronome == 'O') {
			System.out.println("Seja bem-vindo!");
		} else if (pronome == 'E') {
			System.out.println("Seja bem-vinde!");
		}
			
		if (op == 'N') {
			if (chef == 2) {
				valorTotal = AUXILIO_EMERGENCIAL+(50*qntFilhos);
				System.out.println(nome+", o valor do seu auxílio é: "+valorTotal);
			} else if (chef == 1) {
				valorTotal = (AUXILIO_EMERGENCIAL*2)+(50*qntFilhos);
				System.out.println(nome+", o valor do seu auxílio é: R$ "+valorTotal);
			}
		} else {
			System.out.println(nome+", você já recebe outro auxílio.");
		}
		
	
		
	}

}