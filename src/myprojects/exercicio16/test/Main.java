package myprojects.exercicio16.test;

import myprojects.exercicio16.dominio.Aluno;
import myprojects.exercicio16.dominio.Turma;

public class Main {
    static void main(String[] args) {
        Turma terceirao = new Turma("terceirao", 1);
        Aluno oswaldo = new Aluno("Oswaldo", 18);
        Aluno claudia = new Aluno("Claudia", 18);

        if(terceirao.matricularAluno(oswaldo)){
            terceirao.imprime();
        } else {
            System.out.println("Não foi possível realizar a matrícula");
        }

        if(terceirao.matricularAluno(claudia)){
            terceirao.imprime();
        } else {
            System.out.println("Não foi possível realizar a matrícula");
        }
    }
}
