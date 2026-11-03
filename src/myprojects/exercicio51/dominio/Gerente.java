package myprojects.exercicio51.dominio;

import java.util.Objects;

public class Gerente implements Autenticavel{
    private String nome;
    private String login;
    private String senha;

    @Override
    public boolean autenticar(String login, String senha) {
        if(Objects.equals(login, this.login) && Objects.equals(senha, this.senha)){
            System.out.println("Login de "+this.nome+" realizado com sucesso!");
            return true;
        } else {
            System.out.println("Login ou senha estão incorretos!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public Gerente(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
