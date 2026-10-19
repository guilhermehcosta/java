package myprojects.exercicio20.test;

import myprojects.exercicio20.dominio.Paciente;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o nivel de oxigenação do sangue: ");
        double oxigenacao = scanner.nextDouble();


        Paciente paciente1 = new Paciente(nome, idade, oxigenacao);
        paciente1.imprime();
        scanner.close();
    }
}
