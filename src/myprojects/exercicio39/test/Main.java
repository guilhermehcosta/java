package myprojects.exercicio39.test;

import myprojects.exercicio39.dominio.ClassePersonagem;
import myprojects.exercicio39.dominio.Personagem;

public class Main {
    static void main(String[] args) {
        Personagem mago = new Personagem("Mago", ClassePersonagem.MAGO);
        Personagem guerreiro = new Personagem("Guerreiro", ClassePersonagem.GUERREIRO);
        Personagem arqueiro = new Personagem("Arqueiro", ClassePersonagem.ARQUEIRO);

        System.out.println(mago);
        System.out.println(mago.getClassePersonagem().calcularDanoFinal(50, 50));

        System.out.println(guerreiro);
        System.out.println(guerreiro.getClassePersonagem().calcularDanoFinal(50, 50));


        System.out.println(arqueiro);
        System.out.println(arqueiro.getClassePersonagem().calcularDanoFinal(50, 50));


    }
}
