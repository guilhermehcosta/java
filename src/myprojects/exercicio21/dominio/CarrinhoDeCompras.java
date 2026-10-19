package myprojects.exercicio21.dominio;

public class CarrinhoDeCompras {
    private String donoDoCarrinho;
    private Produto[] produtos;
    private int totalDeProdutos = 0;
    private int capacidadeMaxima = 5;

    public CarrinhoDeCompras(String donoDoCarrinho) {
        this.donoDoCarrinho = donoDoCarrinho;
    }

    public CarrinhoDeCompras(String donoDoCarrinho, Produto[] produtos) {
        this.donoDoCarrinho = donoDoCarrinho;
        this.produtos = new Produto[totalDeProdutos];
    }

    public CarrinhoDeCompras(String donoDoCarrinho, Produto[] produtos, int totalDeProdutos) {
        this.donoDoCarrinho = donoDoCarrinho;
        this.produtos = produtos;
        this.totalDeProdutos = totalDeProdutos;
    }

    public boolean validation(){
        if(totalDeProdutos > capacidadeMaxima){
            System.out.println("Capacidade máxima de carrinho atingida!");
            return false;
        } else {
            return true;
        }
    }

    public void exibirCarrinho(){
        System.out.println("Dono do carrinho: "+this.donoDoCarrinho);
        System.out.println("Produtos do carrinho: ");
        if(validation()){
            for (int i = 0; i < produtos.length; i++) {
                produtos[i].validation();
            }
            for (int i = 0; i < produtos.length; i++) {
                System.out.println(produtos[i].getNome());
                System.out.println(produtos[i].getPreco());
            }
            double soma = 0;
            for (int i = 0; i < produtos.length; i++) {
                soma += produtos[i].getPreco();
            }
            System.out.println("Quantidade de produtos: "+this.totalDeProdutos);
            System.out.println("Preço Total: "+soma);
        }

    }

    public String getDonoDoCarrinho() {
        return donoDoCarrinho;
    }

    public void setDonoDoCarrinho(String donoDoCarrinho) {
        this.donoDoCarrinho = donoDoCarrinho;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public int getTotalDeProdutos() {
        return totalDeProdutos;
    }

    public void setTotalDeProdutos(int totalDeProdutos) {
        this.totalDeProdutos = totalDeProdutos;
    }
}
