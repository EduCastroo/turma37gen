import java.util.Scanner;

public class LISTA1EX1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dia=0,ano=0,mes=0,diaFinal=0;
		
		System.out.print("DIGITE QUANTOS ANOS VOCÊ TEM: ");
		ano= scan.nextInt();
		System.out.print("\nDIGITE QUANTOS MESES VOCÊ TEM: ");
		mes= scan.nextInt();
		System.out.print("\nDIGITE QUANTOS DIAS VOCÊ TEM: ");
		dia= scan.nextInt();
		
		diaFinal= dia+(mes*30)+(ano*365);
		
		System.out.print("\nVOCÊ TEM "+diaFinal+" DIAS DE VIDA.");
	}

}