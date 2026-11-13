package myprojects.exercicio61.test;

import myprojects.exercicio44.dominio.Conta;
import myprojects.exercicio61.dominio.ContaInvestimento;
import myprojects.exercicio61.dominio.ContaPoupanca;
import myprojects.exercicio61.service.RelatorioRendimentos;

public class Main {
    static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Joao", 400000);
        ContaInvestimento contaInvestimento = new ContaInvestimento("Claudio", 900000);

        RelatorioRendimentos.gerarRelatorioInvestimento(contaInvestimento);
        RelatorioRendimentos.gerarRelatorioPoupanca(contaPoupanca);
    }
}
