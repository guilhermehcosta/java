package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String dataDeValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Imposto do TOMATE");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
