package condicional;

import java.util.Scanner;

public class Exe_05 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros a serem listados.");
        int cp = ler.nextInt();

        float mediaPar, mediaImpar;
        int contPar = 0, contImpar = 0;

        int num[] = new int[cp];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero: \n");
            num[i] = ler.nextInt();

            if ((num[i] % 3 == 0) && (num[i] % 5 == 0)) {
                System.out.println("Este numero é divisivel por 3 e 5.");
            }
            if (num[i] % 2 == 0) {
                System.out.println("Este numero é PAR.");
                contPar++;

            } else {
                System.out.println("Este numero é IMPAR.");
                contImpar++;
            }

        }
        mediaPar = contPar / num[cp];
        mediaImpar = contImpar / num[cp];

        System.out.println("A media dos numeros PARES é : " + mediaPar);
        System.out.println("A media dos numeros IMPARES é : " + mediaImpar);

    }

}