package myprojects.exercicio25.dominio;

public class Produto {
    private int codigoDeBarras;
    private double precoCusto;
    private double precoDeVenda;
    private int estoqueAtual;

    public void imprime(){
        System.out.println();
        System.out.println("Código de Barras: "+this.codigoDeBarras);
        System.out.println("Preço de Custo: R$"+this.precoCusto);
        System.out.println("Preço de Venda: R$"+this.precoDeVenda);
        System.out.println("Quantidade em Estoque: "+this.estoqueAtual);
    }

    public Produto(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Produto(int codigoDeBarras, double precoCusto) {
        this.codigoDeBarras = codigoDeBarras;
        this.precoCusto = precoCusto;
    }

    public Produto(int codigoDeBarras, double precoCusto, double precoDeVenda) {
        this.codigoDeBarras = codigoDeBarras;
        this.precoCusto = precoCusto;
        this.precoDeVenda = precoDeVenda;
    }

    public Produto(int codigoDeBarras, double precoCusto, double precoDeVenda, int estoqueAtual) {
        this.codigoDeBarras = codigoDeBarras;
        this.precoCusto = precoCusto;
        this.precoDeVenda = precoDeVenda;
        this.estoqueAtual = estoqueAtual;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }
}
