package myprojects.exercicio50.dominio;

public class Caminhao extends VeiculoMotorizado{
    protected double pesoCargaTon;

    public Caminhao(String modelo, int capacidadeTanqueLitros, double pesoCargaTon) {
        super(modelo, capacidadeTanqueLitros);
        this.pesoCargaTon = pesoCargaTon;
    }

    @Override
    public double calcularAutonomiaMaxima() {
        return this.capacidadeTanqueLitros * 6 - (0.1 * this.pesoCargaTon);
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "pesoCargaTon=" + pesoCargaTon +
                ", modelo='" + modelo + '\'' +
                ", capacidadeTanqueLitros=" + capacidadeTanqueLitros +
                '}';
    }
}
