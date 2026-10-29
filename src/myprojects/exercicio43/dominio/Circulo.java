package myprojects.exercicio43.dominio;


public class Circulo extends FormaGeometrica{
    protected int raio;

    public Circulo(String nome) {
        super(nome);
    }

    public Circulo(String nome, int raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
