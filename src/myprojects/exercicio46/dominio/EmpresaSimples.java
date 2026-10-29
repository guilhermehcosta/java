package myprojects.exercicio46.dominio;

public class EmpresaSimples extends Empresa{
    public EmpresaSimples(String razaoSocial, double faturamentoAnual) {
        super(razaoSocial, faturamentoAnual);
    }

    @Override
    public double calcularImposto() {
        return faturamentoAnual * 0.06;
    }
}
