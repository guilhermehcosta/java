package myprojects.exercicio62.dominio;

public class ProfessorEnsinoMedio extends Professor{
    @Override
    public double calularBonus() {
        return this.getSalarioBase() * 0.05;
    }

    public ProfessorEnsinoMedio(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
}
