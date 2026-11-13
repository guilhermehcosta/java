package myprojects.exercicio60.dominio;

public abstract class Veiculo implements Taxavel{
    private String placa;
    private double valorFipe;

    public Veiculo(String placa, double valorFipe) {
        this.placa = placa;
        this.valorFipe = valorFipe;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(double valorFipe) {
        this.valorFipe = valorFipe;
    }
}
