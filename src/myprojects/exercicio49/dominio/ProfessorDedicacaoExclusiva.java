package myprojects.exercicio49.dominio;

public class ProfessorDedicacaoExclusiva extends Professor{
    protected double salarioFixoMensal;
    protected double adicionalPesquisa;

    public ProfessorDedicacaoExclusiva(String nome, String matricula, double salarioFixoMensal, double adicionalPesquisa) {
        super(nome, matricula);
        this.salarioFixoMensal = salarioFixoMensal;
        this.adicionalPesquisa = adicionalPesquisa;
    }

    @Override
    public void calcularMediaSalarial() {
        System.out.println(this.salarioFixoMensal + this.adicionalPesquisa);
    }

    @Override
    public String toString() {
        return "ProfessorDedicacaoExclusiva{" +
                "salarioFixoMensal=" + salarioFixoMensal +
                ", adicionalPesquisa=" + adicionalPesquisa +
                '}';
    }
}
