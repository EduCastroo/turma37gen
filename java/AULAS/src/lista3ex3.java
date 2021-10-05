import java.util.Scanner;

//LISTA3EX3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas 
//com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)
public class lista3ex3 {

	public static void main(String[] args) {
	
		int idade=0;
		int contaMenorVinte=0;
		int contaMaiorCinquenta=0;
		
		//SCANNER = LEIA
		Scanner leia = new Scanner(System.in);
		
		while (idade!=-99) {
		//SYSTEM.OUT.PRINT = ESCREVA
		System.out.print("DIGITE UMA IDADE: ");
		idade=leia.nextInt();
		
		 
		if (idade<21 && idade>0) {
			contaMenorVinte++;	
		} 
		if (idade>50) {
			contaMaiorCinquenta++;
		}
		
		}
		
		System.out.println("EXISTEM " + contaMenorVinte + " IDADES MENORES QUE 20");
		System.out.println("EXISTEM " + contaMaiorCinquenta + " IDADES MAIORES QUE 50");
		System.out.println("PROGRAMA FINALIZADO!");
		
}
}
