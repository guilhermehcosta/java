package myprojects.exercicio24.test;

import myprojects.exercicio24.dominio.Animal;
import myprojects.exercicio24.dominio.PetExotico;

public class Main {
    static void main(String[] args) {
        Animal galinha = new Animal("galinha", 15, 6, "branca");
        Animal cobra = new Animal("cobra", 10, 7, "coral");
        PetExotico petExotico1 = new PetExotico(cobra, "Australia", true, "pessoas");

        cobra.imprime();
    }
}
