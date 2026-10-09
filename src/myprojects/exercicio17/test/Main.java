package myprojects.exercicio17.test;

import myprojects.exercicio17.dominio.Aluno;
import myprojects.exercicio17.dominio.Turma;

public class Main {
    static void main(String[] args) {
        Turma segundoB = new Turma("SegundoB", 25);
        Aluno Joelson = new Aluno("Joelson", 18);
        Aluno AnaClara = new Aluno("Ana Clara", 19);
        Aluno Robin = new Aluno("Robin", 17);

        segundoB.matricularAluno(Joelson);
        segundoB.matricularAluno(AnaClara);
        segundoB.matricularAluno(Robin);

        segundoB.imprime();
    }
}
