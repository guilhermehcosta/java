package myprojects.exercicio53.dominio;

public class MotoBoy implements Transportavel{
    @Override
    public double calcularCustoFrete(double distanciaKm) {
        return distanciaKm * 1.5;
    }
}
