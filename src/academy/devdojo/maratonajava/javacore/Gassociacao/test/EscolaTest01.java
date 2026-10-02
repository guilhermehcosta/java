package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {

        Professor professor1Escola1 = new Professor("Ribamar");
        Professor professor2Escola1 = new Professor("Heloisa");
        Professor professor3Escola1 = new Professor("Marta");

        Professor[] professoresEscola1 = {professor1Escola1, professor2Escola1, professor3Escola1};

        Escola escola1 = new Escola("Juraccy", professoresEscola1);

        Professor professor1Escola2 = new Professor("Nilce");
        Professor professor2Escola2 = new Professor("Leon");
        Professor professor3Escola2 = new Professor("Jeff");

        Professor[] professoresEscola2 = {professor1Escola2, professor2Escola2, professor3Escola2};

        Escola escola2 = new Escola("Augusto Saes", professoresEscola2);

        escola1.imprime();
        escola2.imprime();
    }
}
