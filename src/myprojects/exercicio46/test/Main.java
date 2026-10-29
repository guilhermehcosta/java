package myprojects.exercicio46.test;

import myprojects.exercicio46.dominio.EmpresaLucroReal;
import myprojects.exercicio46.dominio.EmpresaSimples;

public class Main {
    static void main(String[] args) {
        EmpresaLucroReal empresaLucroReal = new EmpresaLucroReal("Animais", 300000);
        EmpresaSimples empresaSimples = new EmpresaSimples("Saúde", 100000);

        System.out.println(empresaLucroReal.calcularImposto());
        System.out.println(empresaSimples.calcularImposto());
    }
}
