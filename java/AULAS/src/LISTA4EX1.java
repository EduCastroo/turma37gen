//Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
//atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
//
//

	import java.util.Scanner;

	public class LISTA4EX1 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			double pontuacao[]= new double[5],maior=0;
			
			for(int x=0;x<5;x++) {
				System.out.print("Digite a "+(x+1)+"� pontua��o da atividade: ");
				pontuacao[x]=scan.nextDouble();
				if(pontuacao[x]>maior) {
					maior=pontuacao[x];
				}
			}
			System.out.println("A maior pontua��o �: "+maior);

		}

	}