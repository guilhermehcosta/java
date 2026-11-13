package myprojects.exercicio60.dominio;

public class Caminhao extends Veiculo{
    @Override
    public double calcularImposto() {
        return this.getValorFipe() * 0.05;
    }

    @Override
    public double calcularTotalASerPago() {
        return calcularImposto() + this.getValorFipe();
    }

    public Caminhao(String placa, double valorFipe) {
        super(placa, valorFipe);
    }
}
