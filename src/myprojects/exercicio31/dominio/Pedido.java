package myprojects.exercicio31.dominio;

public class Pedido {
    private String idPedido;
    private String cliente;
    private double valorTotal;
    private StatusDoPedido status;

    public Pedido(String idPedido, String cliente, double valorTotal, StatusDoPedido status) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido='" + idPedido + '\'' +
                ", cliente='" + cliente + '\'' +
                ", valorTotal=" + valorTotal +
                ", status=" + status +
                '}';
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }
}
