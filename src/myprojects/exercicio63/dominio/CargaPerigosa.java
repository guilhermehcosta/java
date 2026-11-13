package myprojects.exercicio63.dominio;

public class CargaPerigosa extends Carga{
    private double taxaDeRisco = 500;

    public CargaPerigosa(String descricao, double pesoKg) {
        super(descricao, pesoKg);
    }

    @Override
    public double calcularCustoFrete() {
        return this.getPesoKg() * 5;
    }

    public double getTaxaDeRisco() {
        return taxaDeRisco;
    }

    public void setTaxaDeRisco(double taxaDeRisco) {
        this.taxaDeRisco = taxaDeRisco;
    }
}
