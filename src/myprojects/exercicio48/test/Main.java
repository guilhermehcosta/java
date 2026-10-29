package myprojects.exercicio48.test;

import myprojects.exercicio48.dominio.ProdutoDigital;
import myprojects.exercicio48.dominio.ProdutoFisico;

public class Main {
    static void main(String[] args) {
        ProdutoDigital produtoDigital = new ProdutoDigital("Celular", 3000, "2423tf35");
        ProdutoFisico produtoFisico = new ProdutoFisico("Luva", 30, 1, 5);

        System.out.println(produtoDigital.calcularPrecoFinal());
        System.out.println(produtoFisico.calcularPrecoFinal());
    }
}
