package myprojects.exercicio01.test;

import myprojects.exercicio01.dominio.Produto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("celular");
        produto.setPreco(4);
        produto.setQuantidadeEmEstoque(0);

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidadeEmEstoque());
    }
}
