package myprojects.exercicio62.service;

import myprojects.exercicio62.dominio.ProfessorEnsinoMedio;
import myprojects.exercicio62.dominio.ProfessorUniversitario;

public class FolhaDePagamento {
    public static void imprimirContraChequeEnsinoMedio(ProfessorEnsinoMedio professorEnsinoMedio){
        System.out.println();
        System.out.println("Professor: "+professorEnsinoMedio.getNome());
        System.out.println("Salario: "+professorEnsinoMedio.getSalarioBase());
        System.out.println("Bônus: "+professorEnsinoMedio.calularBonus());
        System.out.println();
    }

    public static void imprimirContraChequeUniversitario(ProfessorUniversitario professorUniversitario){
        System.out.println();
        System.out.println("Professor: "+professorUniversitario.getNome());
        System.out.println("Salario: "+professorUniversitario.getSalarioBase());
        System.out.println("Bônus: "+professorUniversitario.calularBonus());
        System.out.println();
    }
}
