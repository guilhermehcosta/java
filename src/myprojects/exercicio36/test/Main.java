package myprojects.exercicio36.test;

import myprojects.exercicio36.dominio.MetodoPagamento;
import myprojects.exercicio36.dominio.Pagamento;

public class Main {
    static void main(String[] args) {
        Pagamento pagamento1 = new Pagamento("Jelber", MetodoPagamento.PIX);
        Pagamento pagamento2 = new Pagamento("Jorel", MetodoPagamento.BOLETO);
        Pagamento pagamento3 = new Pagamento("Jirson", MetodoPagamento.CARTAO_CREDITO);

        System.out.println(pagamento1);
        System.out.println(pagamento1.getMetodoPagamento().aplicarTaxa(100.00));

        System.out.println(pagamento2);
        System.out.println(pagamento2.getMetodoPagamento().aplicarTaxa(100.00));

        System.out.println(pagamento3);
        System.out.println(pagamento3.getMetodoPagamento().aplicarTaxa(100.00));
    }
}
