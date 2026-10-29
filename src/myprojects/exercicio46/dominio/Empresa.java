package myprojects.exercicio46.dominio;

public abstract class Empresa {
    protected String razaoSocial;
    protected double faturamentoAnual;

    public Empresa(String razaoSocial, double faturamentoAnual) {
        this.razaoSocial = razaoSocial;
        this.faturamentoAnual = faturamentoAnual;
    }

    public abstract double calcularImposto();

    @Override
    public String toString() {
        return "Empresa{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", faturamentoAnual=" + faturamentoAnual +
                '}';
    }
}
