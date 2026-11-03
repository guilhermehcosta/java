package myprojects.exercicio52.test;

import myprojects.exercicio52.dominio.BoletoBancario;
import myprojects.exercicio52.dominio.CartaoCredito;
import myprojects.exercicio52.dominio.Pix;

public class Main {
    static void main(String[] args) {
        Pix pix = new Pix("1314141");
        CartaoCredito cartaoCredito = new CartaoCredito(464758, 2500);
        BoletoBancario boletoBancario = new BoletoBancario();

        cartaoCredito.processarPagamento(2600);
    }
}
