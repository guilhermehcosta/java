package myprojects.exercicio05.test;

import myprojects.exercicio05.dominio.Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAluno01 {
    static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos você deseja cadastrar?");
        int numeroDeAlunos = scanner.nextInt();
        double[] aluno1 = new double[2];

        for(int i = 0; i <= numeroDeAlunos; i++){

            System.out.println("Digite o nome do aluno: ");
            String nomeDoAluno = scanner.nextLine();

            System.out.println("Digite a nota de portugues: ");
            aluno1[0] = scanner.nextDouble();

            System.out.println("Digite a nota de matematica: ");
            aluno1[1] = scanner.nextDouble();

            System.out.println(nomeDoAluno+": ");
            System.out.println("Portugues: "+ aluno1[0]);
            System.out.println("Matematica: "+ aluno1[1]);
        }

        aluno.setNome("Vanderson");
        aluno.setNotaMatematica(10.0);
        aluno.setNotaPortugues(0.0);

        aluno.getNome();
        aluno.getNotaMatematica();
        aluno.getNotaPortugues();

    }
}
