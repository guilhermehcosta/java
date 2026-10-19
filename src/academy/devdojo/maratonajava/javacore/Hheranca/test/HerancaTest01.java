package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua dos bobos 123");
        endereco.setCep("13417-550");

        Pessoa pessoa = new Pessoa("Weber");
        pessoa.setIdade(19);
        pessoa.setCpf("434226818-33");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Adilson");
        funcionario.setIdade(20);
        funcionario.setCpf("24252524");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        System.out.println();

        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
