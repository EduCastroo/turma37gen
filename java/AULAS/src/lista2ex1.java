import java.util.Scanner;

public class lista2ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, maior=0;
		
		for(int i=0;i<3; i++) {
			System.out.print("DIGITE UM N�MERO:  ");
			n = sc.nextInt();
			if(maior<n) {
				maior = n;
			}
		}
		System.out.print("O MAIOR N�MERO DIGITADO FOI: " + maior);
		
		sc.close();
	}
}