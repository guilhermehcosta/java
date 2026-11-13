package myprojects.exercicio63.dominio;

public class CargaNormal extends Carga{
    @Override
    public double calcularCustoFrete() {
        return this.getPesoKg() * 2;
    }

    public CargaNormal(String descricao, double pesoKg) {
        super(descricao, pesoKg);
    }
}
