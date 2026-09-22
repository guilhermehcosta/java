package myprojects.exercicio02.test;

import myprojects.exercicio02.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setMatricula("Ativa");
        funcionario.setNome("Oswaldo");
        funcionario.setSalario(1600);

        System.out.println(funcionario.getMatricula());
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
    }
}
