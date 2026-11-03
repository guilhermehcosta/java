package myprojects.exercicio50.test;

import myprojects.exercicio50.dominio.Caminhao;
import myprojects.exercicio50.dominio.Moto;

public class Main {
    static void main(String[] args) {
        Moto moto = new Moto("Esportiva", 3, 8);
        Caminhao caminhao = new Caminhao("Scania", 60, 0);
        System.out.println();

        System.out.println(moto);
        System.out.println(moto.calcularAutonomiaMaxima());

        System.out.println();

        System.out.println(caminhao);
        System.out.println(caminhao.calcularAutonomiaMaxima());

    }
}
