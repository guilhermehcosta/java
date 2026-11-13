package myprojects.exercicio61.dominio;

public class ContaInvestimento extends ContaBancaria{
    @Override
    public double calcularRendimentoAnual() {
        return this.getSaldoAtual() * 0.10;
    }

    public ContaInvestimento(String titular, double saldoAtual) {
        super(titular, saldoAtual);
    }
}
