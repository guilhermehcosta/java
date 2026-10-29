package myprojects.exercicio45.dominio;

public class MotoEntrega extends VeiculoApp{
    public MotoEntrega(String placa, String motorista) {
        super(placa, motorista);
    }

    @Override
    public String toString() {
        return "MotoEntrega{" +
                "placa='" + placa + '\'' +
                ", motorista='" + motorista + '\'' +
                '}';
    }
}
