package myprojects.exercicio19.test;

import myprojects.exercicio19.dominio.Estudante;
import myprojects.exercicio19.dominio.Materia;

public class Main {
    static void main(String[] args) {
        Materia matematicaJorel = new Materia("Matematica", 3.0);
        Materia portuguesJorel = new Materia("Portugues", 5.0);

        Materia[] notasJorel = {matematicaJorel, portuguesJorel};
        Estudante Jorel = new Estudante("Jorel", 19, notasJorel);

        Jorel.imprime();
    }
}
