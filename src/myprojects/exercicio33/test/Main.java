package myprojects.exercicio33.test;

import myprojects.exercicio33.dominio.Produto;
import myprojects.exercicio33.dominio.RegiaoEnvio;

public class Main {
    static void main(String[] args) {
        Produto produto1 = new Produto("Blusa", RegiaoEnvio.CENTRO_OESTE);
        Produto produto2 = new Produto("Jaqueta", RegiaoEnvio.NORTE);
        Produto produto3 = new Produto("Calça", RegiaoEnvio.SUDESTE);
        Produto produto4 = new Produto("Cinto", RegiaoEnvio.SUL);
        System.out.println();

        System.out.println(produto1);
        System.out.println(produto1.getRegiaoEnvio().calcularFrete(4));
        System.out.println();

        System.out.println(produto2);
        System.out.println(produto2.getRegiaoEnvio().calcularFrete(4));
        System.out.println();

        System.out.println(produto3);
        System.out.println(produto3.getRegiaoEnvio().calcularFrete(4));
        System.out.println();

        System.out.println(produto4);
        System.out.println(produto4.getRegiaoEnvio().calcularFrete(4));
        System.out.println();
    }
}
