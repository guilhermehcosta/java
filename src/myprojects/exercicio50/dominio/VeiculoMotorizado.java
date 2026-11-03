package myprojects.exercicio50.dominio;

public abstract class VeiculoMotorizado {
    protected String modelo;
    protected int capacidadeTanqueLitros;

    public VeiculoMotorizado(String modelo, int capacidadeTanqueLitros) {
        this.modelo = modelo;
        this.capacidadeTanqueLitros = capacidadeTanqueLitros;
    }

    public abstract double calcularAutonomiaMaxima();
}
