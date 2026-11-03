package myprojects.exercicio52.dominio;

public class BoletoBancario implements ProcessadorDePagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto gerado com sucesso!");
        System.out.println("Valor: R$"+valor);
    }
}
