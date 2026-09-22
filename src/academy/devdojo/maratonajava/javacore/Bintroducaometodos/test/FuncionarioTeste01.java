package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();

        funcionario1.setNome("Jurandir");
        funcionario1.setIdade(19);
        funcionario1.setSalarios(new int[]{1000, 2000, 6000, 10000, 20000});

        funcionario1.imprime();
        funcionario1.mediaSalarial();

    }
}
