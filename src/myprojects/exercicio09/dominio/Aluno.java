package myprojects.exercicio09.dominio;

public class Aluno {
    private String nome;
    private double nota;

    public void imprime(){
        System.out.println("\nNome: "+this.nome);
        System.out.println("Nota: "+this.nota);
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
