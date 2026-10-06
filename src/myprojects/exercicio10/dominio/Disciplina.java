package myprojects.exercicio10.dominio;

public class Disciplina {
    private String nome;
    private Professor professorResponsavel;

    public void imprime(){
        System.out.println("\nDisciplina: "+this.nome);
        System.out.println("Responsável pela disciplina: "+professorResponsavel.getNome());
    }

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public Disciplina(String nome, Professor professorResponsavel) {
        this.nome = nome;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }
}
