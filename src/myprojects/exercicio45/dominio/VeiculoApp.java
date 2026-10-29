package myprojects.exercicio45.dominio;

public abstract class VeiculoApp {
    protected String placa;
    protected String motorista;

    public VeiculoApp(String placa, String motorista) {
        this.placa = placa;
        this.motorista = motorista;
    }
}
