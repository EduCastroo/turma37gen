package entities;

import java.util.*;

public class Slogan {

	public static void slogan() {
		System.out.print("\n----------------------------------------------------------------------------------|");
		System.out.println("\nWAKANDA STORE                                                                     |");
		System.out.println("----------------------------------------------------------------------------------|");
		System.out.println("WAKANDA STORE - TECH FOREVER                                                      |");
		System.out.print("----------------------------------------------------------------------------------|");

	}
	// CABEÇALHO NOTA FISCAL
	public static void nota() {
		for (int count = 1; count <= 999999999; count++) {
			Random randomGenerator = new Random();
			int num_aleatorio = 0;
			num_aleatorio = randomGenerator.nextInt(999999999);

			System.out.println("\nNota Fiscal de Servicos Eletronica - NFS-e No. "+num_aleatorio + "do  prestador de servicos: ");
			System.out.println("Razão Social: WAKANDA STORE LTDA");
			System.out.println("E-mail: faleconosco@wakandastore.com");
			System.out.println("CCM : 34.972.128-2");
			System.out.println("CNPJ: 123.321.111/0001-66");
			break;
		}
	}
	// LINHA INFERIOR NOTA
	public static void linhaNota() {
		System.out.println(
				"\n=============================================================================================\n");
	}
}