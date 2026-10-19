package myprojects.exercicio26.test;

import myprojects.exercicio17.dominio.Aluno;
import myprojects.exercicio26.dominio.AlunoBolsista;
import myprojects.exercicio26.dominio.MembroAcademico;

public class Main {
    static void main(String[] args) {
        MembroAcademico membroAcademico1 = new MembroAcademico("Ademir", "24525", "25/02/2006", 3653);
        AlunoBolsista alunoBolsista1 = new AlunoBolsista(membroAcademico1, 23.00, "Seila", 245.00);

        membroAcademico1.imprime();
    }
}
