package myprojects.exercicio65.test;

import myprojects.exercicio65.dominio.Conta;
import myprojects.exercicio65.dominio.ContaCorrente;
import myprojects.exercicio65.dominio.ContaPoupanca;

public class Main {
    static void main(String[] args) {
        Conta c1 = new ContaCorrente("Marcos", 20000, 30000);
        Conta c2 = new ContaPoupanca("Olivia", 60000, 4);

        ContaCorrente c3 = new ContaCorrente("Jeferson", 200, 4090);

        System.out.println(c1.getTitular());
        System.out.println(c1.getSaldo());
        System.out.println(c1.atualizarSaldoMensal());
        System.out.println("---------------------");
        System.out.println(c2.getTitular());
        System.out.println(c2.getSaldo());
        System.out.println(c2.atualizarSaldoMensal());
    }
}
