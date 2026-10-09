package myprojects.exercicio14.test;

import myprojects.exercicio14.dominio.Aluno;
import myprojects.exercicio14.dominio.Turma;

public class Main {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joberson", 18);
        Aluno aluno2 = new Aluno("Ana Clara", 26);
        Turma terceiroBTurma = new Turma("TerceiroB", 27);

        if (terceiroBTurma.matricularAluno(aluno2)){
            terceiroBTurma.imprime();
        } else {
            System.out.println("A matrícula não foi concluída, logo a turma não será impressa.");
        }


    }
}
