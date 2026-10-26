package myprojects.exercicio36.dominio;

public class Pagamento {
    private String nomePagador;
    private MetodoPagamento metodoPagamento;

    @Override
    public String toString() {
        return "Pagamento{" +
                "nomePagador='" + nomePagador + '\'' +
                ", metodoPagamento=" + metodoPagamento +
                '}';
    }

    public Pagamento(String nomePagador, MetodoPagamento metodoPagamento) {
        this.nomePagador = nomePagador;
        this.metodoPagamento = metodoPagamento;
    }

    public String getNomePagador() {
        return nomePagador;
    }

    public void setNomePagador(String nomePagador) {
        this.nomePagador = nomePagador;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
