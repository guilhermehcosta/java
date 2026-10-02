package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Maradona");
        Jogador jogador3 = new Jogador("NeyMito");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i].imprime();
        }
    }
}
