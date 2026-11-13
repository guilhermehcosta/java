package myprojects.exercicio60.servico;

import myprojects.exercicio60.dominio.Caminhao;
import myprojects.exercicio60.dominio.Carro;

public class CalculadoraImpostoVeiculo {
    public static void imprimirRelatorioCarro(Carro carro){
        System.out.println();
        System.out.println("Placa: "+carro.getPlaca());
        System.out.println("Valor do veículo: "+carro.getValorFipe());
        System.out.println("Imposto a ser pago: "+carro.calcularImposto());
        System.out.println("Total a se pagar: "+carro.calcularTotalASerPago());
    }

    public static void imprimirRelatorioCaminhao(Caminhao caminhao){
        System.out.println("Placa: "+caminhao.getPlaca());
        System.out.println("Valor do veículo: "+caminhao.getValorFipe());
        System.out.println("Imposto a ser pago: "+caminhao.calcularImposto());
        System.out.println("Total a se pagar: "+caminhao.calcularTotalASerPago());
        System.out.println();
    }
}
