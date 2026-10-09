package myprojects.exercicio15.test;

import myprojects.exercicio15.dominio.Aluno;
import myprojects.exercicio15.dominio.Turma;

public class Main {
    static void main(String[] args) {
        Turma terceiroB = new Turma("terceiroB", 30);

        Aluno Weber = new Aluno("Weber", 19);
        Aluno Flavia = new Aluno("Flavia", 28);
        Aluno Jurandir = new Aluno("Jurandir", 20);



        if (terceiroB.matricularAluno(Weber)){
            terceiroB.imprime();
        } else {
            System.out.println("Não foi possível realizar a matrícula!");
        }

        if (terceiroB.matricularAluno(Flavia)){
            terceiroB.imprime();
        } else {
            System.out.println("Não foi possível realizar a matrícula!");
        }

        if (terceiroB.matricularAluno(Jurandir)){
            terceiroB.imprime();
        } else {
            System.out.println("Não foi possível realizar a matrícula!");
        }


    }
}
