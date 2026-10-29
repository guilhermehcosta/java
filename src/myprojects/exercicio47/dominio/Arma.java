package myprojects.exercicio47.dominio;

public abstract class Arma {
    protected String nome;
    protected int nivel;

    public Arma(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public abstract void atacar();
}
