package myprojects.exercicio38.test;

import myprojects.exercicio38.dominio.Tarifa;
import myprojects.exercicio38.dominio.TipoVeiculo;

public class Main {
    static void main(String[] args) {
        Tarifa tarifa1 = new Tarifa("Murilo", TipoVeiculo.CARRO);
        Tarifa tarifa2 = new Tarifa("Henrique", TipoVeiculo.MOTO);
        Tarifa tarifa3 = new Tarifa("Oswaldo", TipoVeiculo.CAMINHAO);

        System.out.println(tarifa1);
        System.out.println(tarifa1.getTipoVeiculo().calcularTarifa(10.00));

        System.out.println(tarifa2);
        System.out.println(tarifa2.getTipoVeiculo().calcularTarifa(10.00));


        System.out.println(tarifa3);
        System.out.println(tarifa3.getTipoVeiculo().calcularTarifa(10.00));


    }
}
