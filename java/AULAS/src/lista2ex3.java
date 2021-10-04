
import java.util.Scanner;
public class lista2ex3 {

	public static void main(String[] args) {
		int idade;
		Scanner ler = new Scanner (System.in);
		System.out.print("DIGITE A IDADE: ");
		idade = ler.nextInt();
		
		if (idade >=10 && idade <=14) {
			System.out.println("\n CATEGORIA INFANTIL!");
		}
		else if (idade >=15 && idade <=17) {
			System.out.println("\n CATEGORIA JUVENIL!");
		}
		else if (idade >=18 && idade <=25) {
			System.out.println("\n CATEGORIA ADULTO!");
		}
		else {
			System.out.println("\n VOCÊ NÃO SE ENCAIXA EM NENHUMA CATEGORIA!");
		}
	}
}
