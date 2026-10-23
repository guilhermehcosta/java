package myprojects.exercicio29.test;

import myprojects.exercicio29.dominio.CamisaEsportiva;
import myprojects.exercicio29.dominio.PecaRoupa;

public class Main {
    static void main(String[] args) {
        PecaRoupa camiseta = new PecaRoupa("wjedui2h", "Oversized", 200, "algodao");
        PecaRoupa casaco = new PecaRoupa("ou49r030", "slim", 400, "couro");

        CamisaEsportiva camisaEsportiva1 = new CamisaEsportiva(camiseta, "NanoTech", true, "M");

        camisaEsportiva1.imprime();
    }
}
