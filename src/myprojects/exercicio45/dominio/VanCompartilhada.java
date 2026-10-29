package myprojects.exercicio45.dominio;

public class VanCompartilhada extends VeiculoApp{
    public VanCompartilhada(String placa, String motorista) {
        super(placa, motorista);
    }

    @Override
    public String toString() {
        return "VanCompartilhada{" +
                "placa='" + placa + '\'' +
                ", motorista='" + motorista + '\'' +
                '}';
    }
}
