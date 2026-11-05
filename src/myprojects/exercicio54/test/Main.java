package myprojects.exercicio54.test;

import myprojects.exercicio54.dominio.ArcondicionadoSmart;
import myprojects.exercicio54.dominio.LampadaSmart;

public class Main {
    static void main(String[] args) {
        LampadaSmart lampadaSmart = new LampadaSmart(false);
        ArcondicionadoSmart arcondicionadoSmart = new ArcondicionadoSmart();
        arcondicionadoSmart.ligar();


    }
}
