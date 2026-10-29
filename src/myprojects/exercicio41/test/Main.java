package myprojects.exercicio41.test;

import myprojects.exercicio41.dominio.Funcionario;
import myprojects.exercicio41.dominio.NivelHierarquico;

public class Main {
    static void main(String[] args) {
        Funcionario cleber = new Funcionario("Cleber", NivelHierarquico.ESTAGIARIO);
        Funcionario weber = new Funcionario("Weber", NivelHierarquico.JUNIOR);
        Funcionario jelber = new Funcionario("Jelber", NivelHierarquico.PLENO);
        Funcionario wilson = new Funcionario("Wilson", NivelHierarquico.SENIOR);
        Funcionario plinio = new Funcionario("Plinio", NivelHierarquico.DIRETOR);

        System.out.println(cleber);
        double lucroCleber = cleber.getNivelHierarquico().calcularPLR(100000, 1300);
        System.out.println(lucroCleber);

        System.out.println(weber);
        double lucroWeber = weber.getNivelHierarquico().calcularPLR(100000, 2000);
        System.out.println(lucroWeber);

        System.out.println(jelber);
        double lucroJelber = jelber.getNivelHierarquico().calcularPLR(100000, 5000);
        System.out.println(lucroJelber);

        System.out.println(wilson);
        double lucroWilson = wilson.getNivelHierarquico().calcularPLR(100000, 7000);
        System.out.println(lucroWilson);

        System.out.println(plinio);
        double lucroPlinio = plinio.getNivelHierarquico().calcularPLR(100000, 10000);
        System.out.println(lucroPlinio);

    }
}
