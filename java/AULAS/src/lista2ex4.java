import java.util.Scanner;

public class lista2ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		System.out.print("DIGITE UM NÚMERO: ");
		numero = sc.nextDouble();
		if((numero%2) == 0) {
			System.out.print(numero  + " É PAR E SUA RAÍZ É: "+ Math.sqrt(numero));
		}else {
			System.out.print(numero + "  É IMPAR E SEU QUADRADO É "+ (numero*numero) );

		}
		
		
		sc.close();

	}

}