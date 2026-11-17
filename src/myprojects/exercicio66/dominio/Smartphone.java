package myprojects.exercicio66.dominio;

public class Smartphone extends Dispositivo{
    private int capacidadeBateriaMah;


    @Override
    public double calcularValorGarantia() {
        return this.getPreco() * 0.12;
    }

    public Smartphone(String fabricante, double preco, int capacidadeBateriaMah) {
        super(fabricante, preco);
        this.capacidadeBateriaMah = capacidadeBateriaMah;
    }

    public int getCapacidadeBateriaMah() {
        return capacidadeBateriaMah;
    }

    public void setCapacidadeBateriaMah(int capacidadeBateriaMah) {
        this.capacidadeBateriaMah = capacidadeBateriaMah;
    }
}
