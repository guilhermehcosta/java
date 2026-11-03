package myprojects.exercicio51.test;

import myprojects.exercicio51.dominio.ClienteLogado;
import myprojects.exercicio51.dominio.Gerente;

public class Main {
    static void main(String[] args) {
        Gerente gerente = new Gerente("Oswaldo", "patinho123", "patinho123");
        ClienteLogado clienteLogado = new ClienteLogado("Gelber", "patinho123", "patinho123");

        gerente.autenticar("patinho123", "patinho123");
        clienteLogado.autenticar("patinho123", "patinho123");
    }
}
