//Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos serão as somas dos elementos de 
//mesma posição das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma 
//posição das matrizes N1 e N2.




import java.util.Scanner;
public class lista4ex3 {

	public static void main(String[] args) {
	
	    Scanner entrada = new Scanner(System.in);
	    
        
        int N1[][] = new int [4][6];
        int N2[][] = new int [4][6];
        int M1[][] = new int [4][6];
        int M2[][] = new int [4][6];
   
       
   // Obtendo a primeira matriz
        System.out.print("DIGITE MATRIZ ");
               
    for (int i=0; i<4; ++i){
        for (int j=0; j<6; ++j){
            System.out.printf("N1[%d][%d]: \n",i,j);
            N1[i][j] = entrada.nextInt();
        }       
    }
    
       
    // Obtendo a segunda matriz
        System.out.print("DIGITE MATRIZ ");
            
    for (int i=0; i<4; ++i){
        for (int j=0; j<6; ++j){
            System.out.printf("N2[%d][%d]: \n",i,j);
            N2[i][j] = entrada.nextInt();
        }            
    }
       
       
       
        System.out.printf("SOMA DAS MATRIZ N1 e N2!\n");
    
    for (int i=0; i<4; ++i){
        for (int j=0; j<6; ++j){
            M1[i][j] = N1[i][j] + N2[i][j];
            System.out.printf("%d\t",M1[i][j]); 
        }
          System.out.printf("\n");
    }
       
       
        System.out.print("\nDIFERENÇA DAS MATRIZ N1 e N2! \n");
    for (int i=0; i<4; ++i){
        for (int j=0; j<6; ++j){
            M2[i][j] = N1[i][j] - N2[i][j];
            System.out.printf("%d\t",M2[i][j]);   
        } 
          System.out.printf("\n");      
    }
   
   
    }   
}
