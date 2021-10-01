import java.util.Scanner;

public class LISTA1EX2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dia=0,ano=0,mes=0,diaFinal=0,mesFinal=0;
		System.out.print("QUANTOS DIAS DE VIDA VOCÊ TEM? ");
		dia= scan.nextInt();
		
		diaFinal= dia % 30;
		mes= dia /30;
		ano = mes/12;
		mesFinal= mes - (ano * 12);
		
		System.out.println("VOCÊ TEM "+ano+" ANOS, "+mesFinal+" MESES E "+diaFinal+" DIAS!!");
	}

}