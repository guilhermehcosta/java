package myprojects.exercicio44.dominio;

public class ContaCorrente extends Conta{
    protected double limite;

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limite=" + limite +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
