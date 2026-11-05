package myprojects.exercicio53.dominio;

public class CaminhaoCegonha implements Transportavel{
    @Override
    public double calcularCustoFrete(double distanciaKm) {
        return 500 + (distanciaKm * 5.0);
    }
}
