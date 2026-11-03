package myprojects.exercicio51.dominio;

import java.util.Objects;

public class ClienteLogado implements Autenticavel {
    private String nome;
    private String email;
    private String senha;

    @Override
    public String toString() {
        return "ClienteLogado{" +
                "cpf='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    @Override
    public boolean autenticar(String login, String senha) {
        if(Objects.equals(login, this.email) && Objects.equals(senha, this.senha)){
            System.out.println("Login de "+this.nome+" realizado com sucesso!");
            return true;
        } else {
            System.out.println("Login ou senha estão incorretos!");
            return false;
        }
    }

    public ClienteLogado(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
