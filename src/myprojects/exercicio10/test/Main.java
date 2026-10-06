package myprojects.exercicio10.test;

import myprojects.exercicio10.dominio.Disciplina;
import myprojects.exercicio10.dominio.Professor;

public class Main {
    static void main(String[] args) {

        Disciplina Matematica = new Disciplina("Matemática");
        Disciplina Portugues = new Disciplina("Portugues");
        Disciplina Historia = new Disciplina("Historia");
        Disciplina Geografia = new Disciplina("Geografia");
        Disciplina Ciencias = new Disciplina("Ciencias");
        Disciplina Artes = new Disciplina("Artes");

        Disciplina[] disciplinasAlex = {Matematica, Portugues, Historia, Geografia};
        Disciplina[] disciplinasJanaina = {Ciencias, Artes};


        Professor Alex = new Professor("Alex", disciplinasAlex);

        Matematica.setProfessorResponsavel(Alex);
        Portugues.setProfessorResponsavel(Alex);
        Historia.setProfessorResponsavel(Alex);
        Geografia.setProfessorResponsavel(Alex);

        Professor Janaina = new Professor("Janaina", disciplinasJanaina);

        Ciencias.setProfessorResponsavel(Janaina);
        Artes.setProfessorResponsavel(Janaina);

        Historia.imprime();

    }
}
