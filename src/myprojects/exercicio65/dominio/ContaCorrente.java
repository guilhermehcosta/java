package myprojects.exercicio65.dominio;

public class ContaCorrente extends Conta{
    private int limiteChequeEspecial;

    @Override
    public double atualizarSaldoMensal() {
        return this.getSaldo() - 25.00;
    }

    public ContaCorrente(String titular, double saldo, int limiteChequeEspecial) {
        super(titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public int getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(int limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
