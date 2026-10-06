package myprojects.exercicio11.test;

import myprojects.exercicio11.dominio.Curso;
import myprojects.exercicio11.dominio.Estudante;

public class Main {
    static void main(String[] args) {
        Curso DesenvolvimentoFullStack = new Curso("Desenvolvimento FullStack", 100);

        Estudante Marquinhos = new Estudante("Marquinhos", DesenvolvimentoFullStack);
        Estudante Pamela = new Estudante("Pamela", DesenvolvimentoFullStack);
        Estudante Otavio = new Estudante("Otavio", DesenvolvimentoFullStack);

        Estudante[] matriculasDesenvolvimentoFullStack = {Marquinhos, Pamela, Otavio};
        DesenvolvimentoFullStack.setEstudantesMatriculados(matriculasDesenvolvimentoFullStack);

        DesenvolvimentoFullStack.imprime();
    }
}
