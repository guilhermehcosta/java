package myprojects.exercicio64.dominio;

import myprojects.exercicio64.service.Calculos;

public abstract class Veiculo implements Calculos {
    private String marca;
    private String modelo;
    private double valorFipe;


    public Veiculo(String marca, String modelo, double valorFipe) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorFipe = valorFipe;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorFipe() {
        return valorFipe;
    }

    public void setValorFipe(double valorFipe) {
        this.valorFipe = valorFipe;
    }
}
