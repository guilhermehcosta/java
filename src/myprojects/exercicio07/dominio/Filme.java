package myprojects.exercicio07.dominio;

public class Filme {
    private String nome;
    private double duracao;
    private static String plataforma = "Netflix";

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Duração (em minutos): "+this.duracao);
        System.out.println("Plataforma: "+Filme.plataforma+"\n");
    }

    public Filme(String nome, double duracao){
        this.nome = nome;
        this.duracao = duracao;
    }

    public static void setPlataforma(String plataforma){
        Filme.plataforma = plataforma;
    }

    public static String getPlataforma(){
        return Filme.plataforma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
