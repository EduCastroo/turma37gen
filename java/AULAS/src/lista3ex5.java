
//LISTA3EX5 - Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)
import java.util.Scanner;

public class lista3ex5 {

	public static void main(String[] args) {

		int numero = 0;
		int soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("DIGITE UM NÚMERO: ");
			numero = leia.nextInt();

			if (numero > 0) {
				soma += numero;
			} else if (numero == 0) {

			} else {
				System.out.println("DIGITE UM NÚMERO POSITIVO!!");
			}

		} while (numero != 0);

		System.out.print("A SOMA DOS NÚMEROS DIGITADOS FOI: " + soma);

	}
}
