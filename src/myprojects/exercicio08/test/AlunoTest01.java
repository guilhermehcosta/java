package myprojects.exercicio08.test;

import myprojects.exercicio08.dominio.Aluno;

public class AlunoTest01 {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Alexandre", 1, 7);
        aluno1.imprime();

        Aluno aluno2 = new Aluno("Alex", 3, 5);
        aluno2.imprime();

        Aluno aluno3 = new Aluno("Maria", 8, 0);
        aluno3.imprime();

        Aluno.getContadorAlunosTotal();
        Aluno.getcontadorAlunosAprovados();
        Aluno.getContadorAlunosReprovados();

    }
}
