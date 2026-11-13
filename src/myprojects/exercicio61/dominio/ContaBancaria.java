package myprojects.exercicio61.dominio;

public abstract class ContaBancaria implements Rentavel {
    private String titular;
    private double saldoAtual;

    public ContaBancaria(String titular, double saldoAtual) {
        this.titular = titular;
        this.saldoAtual = saldoAtual;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
