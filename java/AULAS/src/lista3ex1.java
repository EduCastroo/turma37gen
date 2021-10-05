//Informar todos os números de 1000 a 1999 que 
//quando divididos por 11 obtemos resto = 5. (FOR)


public class lista3ex1 {

	public static void main(String[] args) {
	//x%11= 5 
		
		int i;
		//for (inicial; condição; incrementador/decrementador)
		for (i=1000; i<=1999; i++) {
			if(i%11==5) {
				System.out.println(i);
			}
		}
	
		
		

	}

}
