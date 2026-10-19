package myprojects.exercicio20.dominio;

public class Paciente {
    private String nome;
    private int idade;
    private double nivelOxigenacao;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Paciente(String nome, int idade, double nivelOxigenacao) {
        this.nome = nome;
        this.idade = idade;
        this.nivelOxigenacao = nivelOxigenacao;
    }

    public void verificacao() {
        if (nivelOxigenacao < 92.0 && nivelOxigenacao > 86.0) {
            System.out.println("ALERTA AMARELO: Oxigenação de sangue baixa");
        } else if (nivelOxigenacao < 86.0) {
            System.out.println("ALERTA VERMELHOO! OXIGENACAO NO SANGUE BAIXISSIMA!");
        } else {
            System.out.println("Nivel de oxigenação normal");
        }
    }

        public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Oxigenação no Sangue: "+this.nivelOxigenacao);
            verificacao();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNivelOxigenacao() {
        return nivelOxigenacao;
    }

    public void setNivelOxigenacao(double nivelOxigenacao) {
        this.nivelOxigenacao = nivelOxigenacao;
    }
}
