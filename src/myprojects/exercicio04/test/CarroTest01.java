package myprojects.exercicio04.test;

import myprojects.exercicio04.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("ferrari");
        carro.isLigado();
        carro.setVelocidadeAtual(1);


        carro.getModelo();
        carro.getVelocidadeAtual();
        carro.getLigado();


    }
}
