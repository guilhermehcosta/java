package myprojects.exercicio11.dominio;

public class Estudante {
    private String nome;
    private Curso cursoMatriculado;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, Curso cursoMatriculado) {
        this.nome = nome;
        this.cursoMatriculado = cursoMatriculado;
    }

    public void imprime(){
        System.out.println("Estudante: "+ this.nome);
        System.out.println("Curso Matriculado: "+ cursoMatriculado.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(Curso cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }
}
