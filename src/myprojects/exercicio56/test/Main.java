package myprojects.exercicio56.test;

import myprojects.exercicio56.dominio.Administrador;
import myprojects.exercicio56.dominio.UsuarioComum;

public class Main {
    static void main(String[] args) {
        Administrador administrador = new Administrador();
        UsuarioComum usuarioComum = new UsuarioComum();

        administrador.login();
        administrador.realizarBackupLogs();
        System.out.println();
        usuarioComum.login();
        usuarioComum.realizarBackupLogs();
    }
}
