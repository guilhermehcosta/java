package myprojects.exercicio23.test;

import myprojects.exercicio23.dominio.Caminhao;
import myprojects.exercicio23.dominio.Veiculo;

public class Main {
    static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("AAA-AA", "Honda", "hibrido", 2016, 70, 5);
        Caminhao caminhao1 = new Caminhao(veiculo1, 2500, 4, true);

        caminhao1.imprime();
    }
}
