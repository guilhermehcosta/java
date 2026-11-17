package myprojects.exercicio64.dominio;

public class Carro extends Veiculo{
    private int numeroPortas;

    @Override
    public double calcularSeguro() {
        return this.getValorFipe() * 0.05;
    }

    public Carro(String marca, String modelo, double valorFipe, int numeroPortas) {
        super(marca, modelo, valorFipe);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
