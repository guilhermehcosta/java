package myprojects.exercicio62.dominio;

public class ProfessorUniversitario extends Professor{
    @Override
    public double calularBonus() {
     return this.getSalarioBase() * 0.15;
    }

    public ProfessorUniversitario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
}
