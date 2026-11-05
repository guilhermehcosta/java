package myprojects.exercicio53.dominio;

public class DroneEntrega implements Transportavel{
    @Override
    public double calcularCustoFrete(double distanciaKm) {
        if(distanciaKm <= 20){
            return distanciaKm * 15.0;
        } else {
          System.out.println("Erro: Distância excede o alcance máximo do drone (20KM)");
          return -1;
        }
    }
}
