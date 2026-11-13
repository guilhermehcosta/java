package myprojects.exercicio60.dominio;

public class Carro extends Veiculo{
    @Override
    public double calcularImposto() {
        return this.getValorFipe() * 0.10;
    }

    @Override
    public double calcularTotalASerPago() {
        return calcularImposto() + this.getValorFipe();
    }

    public Carro(String placa, double valorFipe) {
        super(placa, valorFipe);
    }
}
