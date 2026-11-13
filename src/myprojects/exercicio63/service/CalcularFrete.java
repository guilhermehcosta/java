package myprojects.exercicio63.service;

import myprojects.exercicio63.dominio.CargaNormal;
import myprojects.exercicio63.dominio.CargaPerigosa;

public class CalcularFrete {
    public static void relatorioCargaNormal(CargaNormal cargaNormal){
        System.out.println();
        System.out.println("Descricao: "+cargaNormal.getDescricao());
        System.out.println("Peso: "+cargaNormal.getPesoKg());
        System.out.println("Custo de frete: "+cargaNormal.calcularCustoFrete());
        System.out.println();
    }

    public static void relatorioCargaPerigosa(CargaPerigosa cargaPerigosa){
        System.out.println();
        System.out.println("Descricao: "+cargaPerigosa.getDescricao());
        System.out.println("Peso: "+cargaPerigosa.getPesoKg());
        System.out.println("Taxa de Risco: "+cargaPerigosa.getTaxaDeRisco());
        System.out.println("Custo de frete: "+cargaPerigosa.calcularCustoFrete());
        System.out.println();
    }
}
