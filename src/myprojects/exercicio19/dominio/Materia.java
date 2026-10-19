package myprojects.exercicio19.dominio;

public class Materia {
    private String nomeMateria;
    private double notaMateria;

    public Materia(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public Materia(String nomeMateria, double notaMateria) {
        this.nomeMateria = nomeMateria;
        this.notaMateria = notaMateria;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public double getNotaMateria() {
        return notaMateria;
    }

    public void setNotaMateria(double notaMateria) {
        this.notaMateria = notaMateria;
    }
}
