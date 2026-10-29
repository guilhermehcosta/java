package myprojects.exercicio45.dominio;

public class CarroPremium extends VeiculoApp{
    public CarroPremium(String placa, String motorista) {
        super(placa, motorista);
    }

    @Override
    public String toString() {
        return "CarroPremium{" +
                "placa='" + placa + '\'' +
                ", motorista='" + motorista + '\'' +
                '}';
    }
}
