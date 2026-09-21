package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        Calculadora calculadora = new Calculadora();

        funcionario1.nome = "José";
        funcionario1.idade = 37;
        funcionario1.salarios = new int[]{1000, 4000, 4566, 7000, 1000};

        funcionario1.imprime();



        int soma = calculadora.somaArray(funcionario1.salarios);
        int aSerDividido = funcionario1.salarios.length;
        int result = calculadora.mediaSalarial(soma, aSerDividido);
        System.out.println("\nA média salarial do funcionário foi de "+result+" reais.");


    }
}
