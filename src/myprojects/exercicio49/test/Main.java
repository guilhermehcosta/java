package myprojects.exercicio49.test;

import myprojects.exercicio49.dominio.ProfessorDedicacaoExclusiva;
import myprojects.exercicio49.dominio.ProfessorHorista;

public class Main {
    static void main(String[] args) {
        ProfessorHorista professorHorista = new ProfessorHorista("Adilson", "Juracy", 120, 30);
        ProfessorDedicacaoExclusiva professorDedicacaoExclusiva = new ProfessorDedicacaoExclusiva("Tomson", "Juracy", 4000, 300);

        System.out.println();

        System.out.println(professorHorista);
        professorHorista.calcularMediaSalarial();

        System.out.println();

        System.out.println(professorDedicacaoExclusiva);
        professorDedicacaoExclusiva.calcularMediaSalarial();


    }
}
