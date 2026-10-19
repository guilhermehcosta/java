package myprojects.exercicio21.test;

import myprojects.exercicio21.dominio.CarrinhoDeCompras;
import myprojects.exercicio21.dominio.Produto;

public class Main {
    static void main(String[] args) {
        Produto sacola = new Produto("sacola", 10);
        Produto tablet = new Produto("tablet", 2000);
        Produto celular = new Produto("celular", -7);

        Produto[] carrinho = {sacola, tablet, celular};


        CarrinhoDeCompras carrinhoDeComprasFlavio = new CarrinhoDeCompras("Flávio", carrinho, carrinho.length);
        carrinhoDeComprasFlavio.exibirCarrinho();
    }
}
