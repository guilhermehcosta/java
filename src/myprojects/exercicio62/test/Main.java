package myprojects.exercicio62.test;


import myprojects.exercicio62.dominio.ProfessorEnsinoMedio;
import myprojects.exercicio62.dominio.ProfessorUniversitario;
import myprojects.exercicio62.service.FolhaDePagamento;

public class Main {
    static void main(String[] args) {
        ProfessorEnsinoMedio professorEnsinoMedio = new ProfessorEnsinoMedio("Claudio", 3000);
        ProfessorUniversitario professorUniversitario = new ProfessorUniversitario("Alfredo", 5000);

        FolhaDePagamento.imprimirContraChequeEnsinoMedio(professorEnsinoMedio);
        FolhaDePagamento.imprimirContraChequeUniversitario(professorUniversitario);
    }
}
