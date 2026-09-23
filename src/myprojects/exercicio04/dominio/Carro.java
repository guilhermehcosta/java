package myprojects.exercicio04.dominio;

public class Carro {
    private String modelo;
    private double velocidadeAtual = 0.0;
    private boolean ligado = false;


    public String getModelo() {
        System.out.println(modelo);
        return modelo;
    }

    public double getVelocidadeAtual() {
        System.out.println(velocidadeAtual);
        return velocidadeAtual;
    }

    public boolean getLigado() {
        if(ligado){
            System.out.println("Carro está LIGADO.");
        } else {
            System.out.println("Carro está DESLIGADO.");
        }
        return ligado;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void isLigado() {
            this.ligado = true;
    }

    public void isDesligado() {
        this.ligado = false;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        if(velocidadeAtual < 0.0){
            System.out.println("erro: velocidade inválida");
        } else if (ligado) {
            this.velocidadeAtual = velocidadeAtual;
        } else if (velocidadeAtual > 0) {
            System.out.println("Não é possível acelerar com o Carro desligado!");
        }

    }
}

