package myprojects.exercicio46.dominio;

public class EmpresaLucroReal extends Empresa{
    public EmpresaLucroReal(String razaoSocial, double faturamentoAnual) {
        super(razaoSocial, faturamentoAnual);
    }

    @Override
    public String toString() {
        return "EmpresaLucroReal{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", faturamentoAnual=" + faturamentoAnual +
                '}';
    }

    @Override
    public double calcularImposto() {
        return faturamentoAnual * 0.15 + 5000;
    }
}
