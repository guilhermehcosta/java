package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Suares");
        Jogador jogador4 = new Jogador("Yamal");

        Time time = new Time("Barcelona");

        Jogador[] jogadores = {jogador1, jogador2, jogador3, jogador4};

        jogador4.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("\n------Jogador-------");

        jogador4.imprime();

        System.out.println("\n------Time-------");

        time.imprime();


    }
}
