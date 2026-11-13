package myprojects.exercicio63.test;

import myprojects.exercicio63.dominio.CargaNormal;
import myprojects.exercicio63.dominio.CargaPerigosa;
import myprojects.exercicio63.service.CalcularFrete;

public class Main {
    static void main(String[] args) {
        CargaNormal cargaNormal = new CargaNormal("Celulares", 50);
        CargaPerigosa cargaPerigosa = new CargaPerigosa("Bombas", 50);

        CalcularFrete.relatorioCargaNormal(cargaNormal);
        CalcularFrete.relatorioCargaPerigosa(cargaPerigosa);
    }
}
