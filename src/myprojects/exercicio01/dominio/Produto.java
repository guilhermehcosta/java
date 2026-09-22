package myprojects.exercicio01.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if(preco <= 0){
            System.out.println("Preço do produto não é válido!");
        } else {
            this.preco = preco;
        }

    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if(quantidadeEmEstoque < 0){
            System.out.println("Quantidade em Estoque Inválida!");
        } else {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }

    }
}
