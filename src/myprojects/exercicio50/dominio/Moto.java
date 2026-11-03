package myprojects.exercicio50.dominio;

public class Moto extends VeiculoMotorizado{
    protected int cilindradas;

    public Moto(String modelo, int capacidadeTanqueLitros, int cilindradas) {
        super(modelo, capacidadeTanqueLitros);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularAutonomiaMaxima() {
        return this.capacidadeTanqueLitros * 35;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                ", modelo='" + modelo + '\'' +
                ", capacidadeTanqueLitros=" + capacidadeTanqueLitros +
                '}';
    }
}
