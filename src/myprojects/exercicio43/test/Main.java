package myprojects.exercicio43.test;

import myprojects.exercicio43.dominio.Circulo;
import myprojects.exercicio43.dominio.FormaGeometrica;
import myprojects.exercicio43.dominio.Retangulo;

public class Main {
    static void main(String[] args) {
        Circulo circulo = new Circulo("Circulo", 10);
        Retangulo retangulo = new Retangulo("Retangulo", 10, 20);

        System.out.println(circulo);
        System.out.println(retangulo);
    }
}
