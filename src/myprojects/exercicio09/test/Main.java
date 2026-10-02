package myprojects.exercicio09.test;

import myprojects.exercicio09.dominio.Aluno;
import myprojects.exercicio09.dominio.Turma;

public class Main {
    static void main(String[] args) {
        Aluno jessica = new Aluno("Jessica", 7);
        Aluno otavio = new Aluno("Otávio", 9);
        Aluno marcos = new Aluno("Marcos", 6);

        Aluno[] terceiroB = {jessica, otavio, marcos};

        Turma turma = new Turma("TerceiroB", terceiroB);


        jessica.imprime();
        otavio.imprime();
        marcos.imprime();

        turma.imprime();


    }
}
