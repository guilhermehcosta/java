package myprojects.exercicio49.dominio;

public class ProfessorHorista extends Professor{
    protected int horasTrabalhadas;
    protected double valorHora;

    public ProfessorHorista(String nome, String matricula, int horasTrabalhadas, double valorHora) {
        super(nome, matricula);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public void calcularMediaSalarial() {
        System.out.println(this.horasTrabalhadas * this.valorHora);
    }

    @Override
    public String toString() {
        return "ProfessorHorista{" +
                "horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                '}';
    }
}
