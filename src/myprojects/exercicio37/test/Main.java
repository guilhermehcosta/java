package myprojects.exercicio37.test;

import myprojects.exercicio37.dominio.CategoriaFidelidade;
import myprojects.exercicio37.dominio.Cliente;

public class Main {
    static void main(String[] args) {
        Cliente Hairton = new Cliente("Hairton", CategoriaFidelidade.BRONZE);
        Cliente Janaina = new Cliente("Janaina", CategoriaFidelidade.PRATA);
        Cliente Ana = new Cliente("Ana", CategoriaFidelidade.OURO);
        Cliente Weber = new Cliente("Weber", CategoriaFidelidade.DIAMANTE);

        System.out.println(Hairton);
        System.out.println(Hairton.getCategoriaFidelidade().calcularValorFinal(1000));

        System.out.println(Janaina);
        System.out.println(Janaina.getCategoriaFidelidade().calcularValorFinal(1000));


        System.out.println(Ana);
        System.out.println(Ana.getCategoriaFidelidade().calcularValorFinal(1000));


        System.out.println(Weber);
        System.out.println(Weber.getCategoriaFidelidade().calcularValorFinal(1000));


    }
}
