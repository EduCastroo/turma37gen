import java.util.Scanner;

public class LISTA1EX1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dia=0,ano=0,mes=0,diaFinal=0;
		
		System.out.print("DIGITE QUANTOS ANOS VOC� TEM: ");
		ano= scan.nextInt();
		System.out.print("\nDIGITE QUANTOS MESES VOC� TEM: ");
		mes= scan.nextInt();
		System.out.print("\nDIGITE QUANTOS DIAS VOC� TEM: ");
		dia= scan.nextInt();
		
		diaFinal= dia+(mes*30)+(ano*365);
		
		System.out.print("\nVOC� TEM "+diaFinal+" DIAS DE VIDA.");
	}

}