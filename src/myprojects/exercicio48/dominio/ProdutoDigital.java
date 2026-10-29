package myprojects.exercicio48.dominio;

public class ProdutoDigital extends Produto{
    protected String linkDownload;

    public ProdutoDigital(String nome, double pesoKg, String linkDownload) {
        super(nome, pesoKg);
        this.linkDownload = linkDownload;
    }

    @Override
    public String toString() {
        return "ProdutoDigital{" +
                "linkDownload='" + linkDownload + '\'' +
                ", nome='" + nome + '\'' +
                ", precoBruto=" + precoBruto +
                '}';
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBruto - (precoBruto * 0.15);
    }
}
