package myprojects.exercicio61.service;

import myprojects.exercicio61.dominio.ContaInvestimento;
import myprojects.exercicio61.dominio.ContaPoupanca;

public class RelatorioRendimentos {
    public static void gerarRelatorioPoupanca(ContaPoupanca contaPoupanca){
        System.out.println();
        System.out.println("Titular: "+contaPoupanca.getTitular());
        System.out.println("Saldo Atual: "+contaPoupanca.getSaldoAtual());
        System.out.println("Rendimento Mensal: "+contaPoupanca.calcularRendimentoAnual());
        System.out.println();
    }

    public static void gerarRelatorioInvestimento(ContaInvestimento contaInvestimento){
        System.out.println();
        System.out.println("Titular: "+contaInvestimento.getTitular());
        System.out.println("Saldo Atual: "+contaInvestimento.getSaldoAtual());
        System.out.println("Rendimento Mensal: "+contaInvestimento.calcularRendimentoAnual());
        System.out.println();
    }
}
