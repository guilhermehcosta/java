package myprojects.exercicio18.test;

import myprojects.exercicio18.dominio.Estudante;
import myprojects.exercicio18.dominio.Materia;

public class Main {
    static void main(String[] args) {
        Materia matematicaJonas = new Materia("Matematica", 8.0);
        Materia portuguesJonas = new Materia("Portugues", 6.0);
        Materia[] notasJonas = {matematicaJonas, portuguesJonas};

        Materia matematicaElisa = new Materia("Matematica", 5.0);
        Materia portuguesElisa = new Materia("Portugues", 3.0);
        Materia[] notasElisa = {matematicaElisa, portuguesElisa};

        Estudante Jonas = new Estudante("Jonas", notasJonas);
        Estudante Elisa = new Estudante("Elisa", notasElisa);


        Jonas.imprime();
        Elisa.imprime();


    }
}
