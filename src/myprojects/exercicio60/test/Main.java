package myprojects.exercicio60.test;

import myprojects.exercicio60.dominio.Caminhao;
import myprojects.exercicio60.dominio.Carro;
import myprojects.exercicio60.servico.CalculadoraImpostoVeiculo;

public class Main {
    static void main(String[] args) {
        Carro carro = new Carro("dasdasdw", 50000);
        Caminhao caminhao = new Caminhao("214ewde", 200000);

        CalculadoraImpostoVeiculo.imprimirRelatorioCarro(carro);
        System.out.println();
        CalculadoraImpostoVeiculo.imprimirRelatorioCaminhao(caminhao);

    }
}
