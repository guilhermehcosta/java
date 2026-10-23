package myprojects.exercicio31.test;

import myprojects.exercicio31.dominio.Pedido;
import myprojects.exercicio31.dominio.StatusDoPedido;

public class Main {
    static void main(String[] args) {
        Pedido blusaMoletom = new Pedido("1243533", "Joberson", 50.00, StatusDoPedido.PROCESSANDO);
        Pedido celular = new Pedido("5634145", "Alfredo", 4000.00, StatusDoPedido.ENVIADO);
        Pedido camiseta = new Pedido("9829467", "Nivete", 30.00, StatusDoPedido.AGUARDANDO_PAGAMENTO);

        System.out.println(blusaMoletom);
        System.out.println(celular);
        System.out.println(camiseta);
    }
}
