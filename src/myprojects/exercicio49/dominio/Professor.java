package myprojects.exercicio49.dominio;

public abstract class Professor {
    protected String nome;
    protected String matricula;

    public Professor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract void calcularMediaSalarial();
}
