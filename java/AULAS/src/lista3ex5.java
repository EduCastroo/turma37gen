
//LISTA3EX5 - Crie um programa que leia um n�mero do teclado at� que encontre um
//n�mero igual a zero. No final, mostre a soma dos n�meros
//digitados.(DO...WHILE)
import java.util.Scanner;

public class lista3ex5 {

	public static void main(String[] args) {

		int numero = 0;
		int soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("DIGITE UM N�MERO: ");
			numero = leia.nextInt();

			if (numero > 0) {
				soma += numero;
			} else if (numero == 0) {

			} else {
				System.out.println("DIGITE UM N�MERO POSITIVO!!");
			}

		} while (numero != 0);

		System.out.print("A SOMA DOS N�MEROS DIGITADOS FOI: " + soma);

	}
}
