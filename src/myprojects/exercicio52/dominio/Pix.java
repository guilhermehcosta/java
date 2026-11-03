package myprojects.exercicio52.dominio;

public class Pix implements ProcessadorDePagamento{
    private String chavePix;

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento aprovado!");
        System.out.println("Valor: R$"+ valor);
    }

    @Override
    public String toString() {
        return "Pix{" +
                "chavePix='" + chavePix + '\'' +
                '}';
    }

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }
}
