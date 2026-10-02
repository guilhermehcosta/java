package myprojects.exercicio05.test;

import myprojects.exercicio05.dominio.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class TestAluno01 {
    static void main(String[] args) {

        String nome = "Douglas";
        double notaPortugues = 4.0;
        double notaMatematica = 7.0;


        Aluno aluno = new Aluno();

        aluno.setNome(nome);
        aluno.setNotaPortugues(notaPortugues);
        aluno.setNotaMatematica(notaMatematica);

        aluno.getNome();
        aluno.getNotaPortugues();
        aluno.getNotaMatematica();

    }
}
