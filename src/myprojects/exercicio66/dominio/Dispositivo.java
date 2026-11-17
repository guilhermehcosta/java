package myprojects.exercicio66.dominio;

public abstract class Dispositivo implements GarantiaEstendida{
    private String fabricante;
    private double preco;

    @Override
    public String toString() {
        return "Dispositivo{" +
                "fabricante='" + fabricante + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Dispositivo(String fabricante, double preco) {
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
