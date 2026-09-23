package myprojects.exercicio03.test;

import myprojects.exercicio03.dominio.Usuario;

public class UsuarioTest01 {
    static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario.setEmail("guilhermehcosta@gmail.com");
        usuario.setSenha("123456");

        usuario.getEmail();
        usuario.getSenha();
    }
}
