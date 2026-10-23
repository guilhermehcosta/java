package myprojects.exercicio30.test;

import myprojects.exercicio30.dominio.CoberturaDuplex;
import myprojects.exercicio30.dominio.ImovelBase;

public class Main {
    static void main(String[] args) {
        ImovelBase imovel1 = new ImovelBase("Rua dos bobos, 801", 81, 1100, true);
        ImovelBase imovel2 = new ImovelBase("Rua dos tontos, 107", 56, 900, false);

        CoberturaDuplex coberturaDuplexImovel2 = new CoberturaDuplex(imovel1, 3000, true, 2, 100);

        coberturaDuplexImovel2.imprime();
    }
}
