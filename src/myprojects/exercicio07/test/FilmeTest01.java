package myprojects.exercicio07.test;

import myprojects.exercicio07.dominio.Filme;

public class FilmeTest01 {
    static void main(String[] args) {
        Filme filme1 = new Filme("Miranha", 60);
        Filme filme2 = new Filme("Titanic", 90);
        Filme filme3 = new Filme("Pelé", 45);

        filme1.imprime();
        filme2.imprime();
        filme3.imprime();

        Filme.setPlataforma("Prime Video");

        filme1.imprime();
        filme2.imprime();
        filme3.imprime();
    }
}
