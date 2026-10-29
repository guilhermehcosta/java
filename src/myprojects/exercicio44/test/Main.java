package myprojects.exercicio44.test;

import myprojects.exercicio44.dominio.ContaCorrente;
import myprojects.exercicio44.dominio.ContaPoupanca;

public class Main {
    static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Guilherme Henrique", 30000, 2600);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Oswaldo Cruz", 2000, 0.1);

        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }
}
