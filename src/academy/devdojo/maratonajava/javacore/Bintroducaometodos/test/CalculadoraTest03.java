package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double value1 = scanner.nextDouble();

        System.out.println("Digite um numero para dividir "+value1+":");
        double value2 = scanner.nextDouble();

        double value = calculadora.divideDoisNumeros02(value1, value2);
        System.out.println("O resultado da divisão é: "+value);




    }
}
