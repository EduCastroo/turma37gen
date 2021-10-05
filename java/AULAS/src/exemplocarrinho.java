import java.util.Locale;
import java.util.Scanner;

public class exemplocarrinho {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        String codigoProduto[] = { "X01", "X02", "X03" }; // %s
        String nomeProduto[] = { "CALÇA", "CAMISA", "SAIA" }; // %s
        int estoque[] = { 20, 20, 20 }; // %d
        double valorProduto[] = { 100.50, 50.75, 70.99 }; // %f -> %.2f
        String auxCodigo;
        int teste = 0;
        int auxQtde = 0;
        // MOSTRANDO NA TELA
        System.out.println("LOJA DA TURMA 37");
        System.out.println();
        System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
        for (int x = 0; x < nomeProduto.length; x++) {
            System.out.printf("%s\t%s\t%d\t%.2f\n", codigoProduto[x], nomeProduto[x], estoque[x], valorProduto[x]);
            // System.out.println(codigoProduto[x]+"\t"+nomeProduto[x]+"\t"+estoque[x]+"\t"+valorProduto[x]);
        }
        System.out.println();
        System.out.println("Digite o codigo do produto que deseja compra :");
        auxCodigo = leia.next().toUpperCase();

        System.out.println("PRODUTO ESCOLHIDO");
        System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
        for (int y = 0; y < nomeProduto.length; y++) {
            if (codigoProduto[y].equals(auxCodigo)) {
                System.out.printf("%s\t%s\t%d\t%.2f\n", codigoProduto[y], nomeProduto[y], estoque[y], valorProduto[y]);
                teste = y;
                break;
            } else {
                teste++;
            }

        }
        if (teste == nomeProduto.length) {
            System.out.println("Produto não encontrado");
        } else {
            System.out.println("Quantos vc deseja compra : ");
            auxQtde = leia.nextInt();
            if (estoque[teste] == 0) {
                System.out.println("Produto indisponivel...");
            } else if (auxQtde > estoque[teste]) {
                System.out.println("Quantidade indisponivel");
            } else {
                System.out.println("Total a pagar " + (auxQtde * valorProduto[teste]));
                estoque[teste] -= auxQtde; 
            }

        }
        System.out.println("PÓS VENDA");
        System.out.println("COD\tPRODUTO\tESTOQUE\tVALOR");
        for (int x = 0; x < nomeProduto.length; x++) {
            System.out.printf("%s\t%s\t%d\t%.2f\n", codigoProduto[x], nomeProduto[x], estoque[x], valorProduto[x]);
            // System.out.println(codigoProduto[x]+"\t"+nomeProduto[x]+"\t"+estoque[x]+"\t"+valorProduto[x]);
        }

    }

}