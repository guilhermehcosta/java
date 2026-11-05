package myprojects.exercicio58.test;

import myprojects.exercicio58.dominio.GerenciadorBancoDeDados;
import myprojects.exercicio58.dominio.GerenciadorPlanilha;

public class Main {
    static void main(String[] args) {
        GerenciadorBancoDeDados gerenciadorBancoDeDados = new GerenciadorBancoDeDados();
        GerenciadorPlanilha gerenciadorPlanilha = new GerenciadorPlanilha();

        gerenciadorBancoDeDados.escrever();
        gerenciadorBancoDeDados.ler();
        gerenciadorBancoDeDados.gerarLog();

        System.out.println();

        gerenciadorPlanilha.escrever();
        gerenciadorPlanilha.ler();
        gerenciadorPlanilha.gerarLog();
    }
}
