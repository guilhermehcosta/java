package myprojects.exercicio13.dominio;

public class Estudante {
    private String nome;
    private Seminario seminarioPertencente;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, Seminario seminarioPertencente) {
        this.nome = nome;
        this.seminarioPertencente = seminarioPertencente;
    }

    public void imprime(){
        System.out.println("Estudante: "+ this.nome);
        System.out.println("Seminario Pertencente: "+ seminarioPertencente.getTema());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminarioPertencente() {
        return seminarioPertencente;
    }

    public void setSeminarioPertencente(Seminario seminarioPertencente) {
        this.seminarioPertencente = seminarioPertencente;
    }
}
