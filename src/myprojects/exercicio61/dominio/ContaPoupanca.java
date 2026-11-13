package myprojects.exercicio61.dominio;

public class ContaPoupanca extends ContaBancaria{
    @Override
    public double calcularRendimentoAnual() {
        return this.getSaldoAtual() * 0.02;
    }

    public ContaPoupanca(String titular, double saldoAtual) {
        super(titular, saldoAtual);
    }
}
