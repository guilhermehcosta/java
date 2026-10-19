package myprojects.exercicio27.test;

import myprojects.exercicio27.dominio.EstudantePlataforma;
import myprojects.exercicio27.dominio.Instrutor;
import myprojects.exercicio27.dominio.UsuarioPlataforma;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        UsuarioPlataforma Denilson = new UsuarioPlataforma("denilson123456", "paodequeijo", "23/02/2026", true);
        UsuarioPlataforma Cleber = new UsuarioPlataforma("cleber123456", "danone", "08/10/2024", false);

        String[] especialidades = {"Matematica", "Ciencias", "Historia"};

        Instrutor instrutor1 = new Instrutor(Denilson, especialidades, 10, 7.5);
        EstudantePlataforma estudante1 = new EstudantePlataforma(Cleber, 6, 6.5);

    }
}
