package myprojects.exercicio25.test;

import myprojects.exercicio25.dominio.Produto;
import myprojects.exercicio25.dominio.Televisor;

public class Main {
    static void main(String[] args) {
        Produto produto1 = new Produto(13134124, 100, 150, 10);
        Televisor tvPhilips = new Televisor(produto1, 50, "4K", true);

        tvPhilips.imprime();
    }
}
