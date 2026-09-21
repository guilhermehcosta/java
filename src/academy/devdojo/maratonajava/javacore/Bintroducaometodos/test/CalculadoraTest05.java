package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest05 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        System.out.println("Digite o primeiro numero: ");
        numeros[0] = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        numeros[1] = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        numeros[2] = scanner.nextInt();

        System.out.println("Digite o quarto numero: ");
        numeros[3] = scanner.nextInt();

        System.out.println("Digite o quinto numero: ");
        numeros[4] = scanner.nextInt();

        calculadora.somaVarArgs(10, 10, 10, 10, 10);


    }
}
