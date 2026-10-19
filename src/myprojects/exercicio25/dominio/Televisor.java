package myprojects.exercicio25.dominio;

public class Televisor extends Produto{
    private int polegadas;
    private String resolucaoTela;
    private boolean smartTV;

    public void imprime(){
        super.imprime();
        System.out.println("Polegadas: "+this.polegadas);
        System.out.println("Resolução: "+this.resolucaoTela);
        System.out.println("É Smart: "+this.smartTV);
        double margemDeLucro = super.getPrecoDeVenda() - super.getPrecoCusto();
        System.out.println();
        System.out.println("Margem de lucro: R$"+margemDeLucro);
    }

    public Televisor(Produto produto, int polegadas) {
        super(produto.getCodigoDeBarras(), produto.getPrecoCusto(), produto.getPrecoDeVenda(), produto.getEstoqueAtual());
        this.polegadas = polegadas;
    }

    public Televisor(Produto produto, int polegadas, String resolucaoTela) {
        super(produto.getCodigoDeBarras(), produto.getPrecoCusto(), produto.getPrecoDeVenda(), produto.getEstoqueAtual());
        this.polegadas = polegadas;
        this.resolucaoTela = resolucaoTela;
    }

    public Televisor(Produto produto, int polegadas, String resolucaoTela, boolean smartTV) {
        super(produto.getCodigoDeBarras(), produto.getPrecoCusto(), produto.getPrecoDeVenda(), produto.getEstoqueAtual());
        this.polegadas = polegadas;
        this.resolucaoTela = resolucaoTela;
        this.smartTV = smartTV;
    }

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public String getResolucaoTela() {
        return resolucaoTela;
    }

    public void setResolucaoTela(String resolucaoTela) {
        this.resolucaoTela = resolucaoTela;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }
}
