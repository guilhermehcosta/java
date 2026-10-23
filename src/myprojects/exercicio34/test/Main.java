package myprojects.exercicio34.test;

import myprojects.exercicio34.dominio.MoedaCambio;
import myprojects.exercicio34.dominio.Usuario;

public class Main {
    static void main(String[] args) {
        Usuario murilo = new Usuario("Murilo", MoedaCambio.DOLAR);
        Usuario joao = new Usuario("João", MoedaCambio.EURO);
        Usuario weber = new Usuario("Weber", MoedaCambio.LIBRA);

        System.out.println(murilo);
        System.out.println(murilo.getMoedaCambio().converterParaReal(20));

        System.out.println(joao);
        System.out.println(joao.getMoedaCambio().converterParaReal(20));


        System.out.println(weber);
        System.out.println(weber.getMoedaCambio().converterParaReal(20));


        System.out.println();


    }
}
