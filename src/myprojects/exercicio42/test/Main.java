package myprojects.exercicio42.test;

import myprojects.exercicio42.dominio.Aluno;
import myprojects.exercicio42.dominio.Pessoa;
import myprojects.exercicio42.dominio.Professor;

public class Main {
    static void main(String[] args) {
        Professor professor = new Professor("Marta", 39);
        Aluno aluno = new Aluno("Weber", 18);

        System.out.println(professor);
        System.out.println(aluno);
    }
}
