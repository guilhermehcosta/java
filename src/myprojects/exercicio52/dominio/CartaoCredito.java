package myprojects.exercicio52.dominio;

public class CartaoCredito implements ProcessadorDePagamento{
    private int numero;
    private double limite;

    @Override
    public void processarPagamento(double valor) {
         if(valor <= limite){
             System.out.println("Pagamento aprovado!");
             System.out.println("\nValor: R$"+valor);
             System.out.println("\nLimite restante: "+(limite - valor));
         } else {
             System.out.println("Pagamento recusado! Limite insuficiente.");
         }
    }

    @Override
    public String toString() {
        return "CartaoCredito{" +
                "numero=" + numero +
                ", limite=" + limite +
                '}';
    }

    public CartaoCredito(int numero, double limite) {
        this.numero = numero;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
