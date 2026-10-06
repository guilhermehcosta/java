package myprojects.exercicio13.test;

import myprojects.exercicio13.dominio.Estudante;
import myprojects.exercicio13.dominio.Local;
import myprojects.exercicio13.dominio.Professor;
import myprojects.exercicio13.dominio.Seminario;

public class Main {
    static void main(String[] args) {
        Local local1 = new Local("Rua dos Bobos, 523");
        Local local2 = new Local("Rua dos Tontos, 987");

        Professor Alberto = new Professor("Alberto");
        Professor Vanessa = new Professor("Vanessa");

        Seminario grupo1 = new Seminario("ciencias", "Fotossintese");
        grupo1.setLocal(local1);

        Seminario grupo2 = new Seminario("ciencias", "Ovulação");
        grupo2.setLocal(local2);

        Estudante Jelberson = new Estudante("Jelberson");
        Jelberson.setSeminarioPertencente(grupo1);

        Estudante Claudia = new Estudante("Claudia");
        Claudia.setSeminarioPertencente(grupo1);

        Estudante[] grupo1Ministrantes = {Jelberson, Claudia};

        Estudante Ana = new Estudante("Ana");
        Ana.setSeminarioPertencente(grupo2);

        Estudante Mathias = new Estudante("Mathias");
        Mathias.setSeminarioPertencente(grupo2);

        Estudante[] grupo2Ministrantes = {Ana, Mathias};


        grupo1.setMinistrantes(grupo1Ministrantes);
        grupo1.setProfessorMinistrante(Alberto);

        grupo2.setMinistrantes(grupo2Ministrantes);
        grupo2.setProfessorMinistrante(Alberto);

        Seminario[] gruposAlberto = {grupo1, grupo2};
        Alberto.setSeminariosMinistrantes(gruposAlberto);

        grupo2.imprime();
    }
}
