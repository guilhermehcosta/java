package myprojects.exercicio44.dominio;

public class ContaPoupanca extends Conta{
    protected double rendimentoMensal;

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    public ContaPoupanca(String titular, double saldo, double rendimentoMensal) {
        super(titular, saldo);
        this.rendimentoMensal = rendimentoMensal;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "rendimentoMensal=" + rendimentoMensal +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
