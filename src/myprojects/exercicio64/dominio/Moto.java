package myprojects.exercicio64.dominio;

public class Moto extends Veiculo{
    private int cilindradas;

    @Override
    public double calcularSeguro() {
        return this.getValorFipe() * 0.08;
    }

    public Moto(String marca, String modelo, double valorFipe, int cilindradas) {
        super(marca, modelo, valorFipe);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
