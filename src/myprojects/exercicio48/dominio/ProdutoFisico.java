package myprojects.exercicio48.dominio;

public class ProdutoFisico extends Produto{
    protected double pesoKg;
    protected double fretePorKg;

    public ProdutoFisico(String nome, double precoBruto, double pesoKg, double fretePorKg) {
        super(nome, precoBruto);
        this.pesoKg = pesoKg;
        this.fretePorKg = fretePorKg;
    }

    @Override
    public String toString() {
        return "ProdutoFisico{" +
                "pesoKg=" + pesoKg +
                ", fretePorKg=" + fretePorKg +
                ", nome='" + nome + '\'' +
                ", precoBruto=" + precoBruto +
                '}';
    }

    @Override
    public double calcularPrecoFinal() {
        double precoReal =  (precoBruto + (pesoKg * fretePorKg));
        double desconto = 5;
        return precoReal - (precoReal * desconto / 100);
    }
}
