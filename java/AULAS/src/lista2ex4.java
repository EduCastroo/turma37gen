import java.util.Scanner;

public class lista2ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		System.out.print("DIGITE UM N�MERO: ");
		numero = sc.nextDouble();
		if((numero%2) == 0) {
			System.out.print(numero  + " � PAR E SUA RA�Z �: "+ Math.sqrt(numero));
		}else {
			System.out.print(numero + "  � IMPAR E SEU QUADRADO � "+ (numero*numero) );

		}
		
		
		sc.close();

	}

}