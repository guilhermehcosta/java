package myprojects.exercicio06.dominio;

public class Carro {
    private String nome;
    private String marca;
    private int ano;
    private String cambio;

    public Carro(String nome, String marca, int ano){
        this();
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }

    public Carro(String nome, String marca, int ano, String cambio){
        this(nome, marca, ano);
        this.cambio = cambio;
    }

    public Carro(){
    }



    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Marca "+this.marca);
        System.out.println("Ano: "+this.ano);
        System.out.println("Cambio: "+this.cambio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
}
