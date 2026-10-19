package myprojects.exercicio22.test;

import myprojects.exercicio22.dominio.Desenvolvedor;
import myprojects.exercicio22.dominio.Pessoa;

public class Main {
    static void main(String[] args) {
        Pessoa enderson = new Pessoa("enderson", "3254235", "guilhermehcosta86@gmail.com", 24);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor(enderson, "Java", 2, true);
        desenvolvedor1.imprime();
    }
}
