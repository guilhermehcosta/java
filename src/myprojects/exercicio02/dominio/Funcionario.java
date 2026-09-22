package myprojects.exercicio02.dominio;

public class Funcionario {
    private String matricula;
    private String nome;
    private double salario;

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        if(salario < 1412){
            System.out.println("Funcionário NÃO recebe um salário mínimo.");
        }
            this.salario = salario;


    }
}
