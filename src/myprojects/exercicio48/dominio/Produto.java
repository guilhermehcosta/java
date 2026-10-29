package myprojects.exercicio48.dominio;

public abstract class Produto {
    protected String nome;
    protected double precoBruto;

    public Produto(String nome, double precoBruto) {
        this.nome = nome;
        this.precoBruto = precoBruto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoBruto=" + precoBruto +
                '}';
    }

    public abstract double calcularPrecoFinal();
}
