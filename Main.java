import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int sair = 1;
        double limite;
        double valor;
        String descricao;


        System.out.println("Digite o limite do cartão: ");
        limite = leitura.nextDouble();
        Cartao cartao = new Cartao(limite);


        while (sair == 1) {

            System.out.println("Digite a descrição do compra: ");
            descricao = leitura.next();

            System.out.println("Digite o valor da compra: ");
            valor = leitura.nextDouble();


            Compras compras = new Compras(descricao,valor );
            boolean compraRealizada = cartao.lancaCompra(compras);

            if (compraRealizada) {
                System.out.println("Compra Realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("***********************************************");
                System.out.println("Saldo insuficiente!");
                System.out.println("***********************************************");
                sair = 0;
            }

        }
        System.out.println("****************************************");
        System.out.println("COMPRAS REALIZADAS:\n");


        Collections.sort(cartao.getCompras());
        for (Compras c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + "  -  "  +c.getValor());
        }

        System.out.println("\n***************************************");
        System.out.println("Saldo diponivel no cartão:" + cartao.getSaldo());

    }
}
