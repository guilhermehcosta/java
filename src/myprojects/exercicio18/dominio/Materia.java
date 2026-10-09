package myprojects.exercicio18.dominio;

public class Materia {
    private String nomeMateria;
    private double nota;

    public Materia(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public Materia(String nomeMateria, double nota) {
        this.nomeMateria = nomeMateria;
        this.nota = nota;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
