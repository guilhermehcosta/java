package myprojects.exercicio65.dominio;

public class ContaPoupanca extends Conta{
    private int diaAniversario;

    @Override
    public double atualizarSaldoMensal() {
        double rendimento = this.getSaldo() * 0.05;
        return this.getSaldo() + rendimento;
    }

    public ContaPoupanca(String titular, double saldo, int diaAniversario) {
        super(titular, saldo);
        this.diaAniversario = diaAniversario;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
}
