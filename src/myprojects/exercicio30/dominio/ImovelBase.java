package myprojects.exercicio30.dominio;

public class ImovelBase {
    private String enderecoCompleto;
    private double metragemQuadrada;
    private double valorIPTUAnual;
    private boolean quitado;

    public void imprime(){
        System.out.println("Endereço: "+this.enderecoCompleto);
        System.out.println("Metragem Quadrada: "+this.metragemQuadrada);
        System.out.println("Valor IPTU Anual: "+this.valorIPTUAnual);
        System.out.println("Quitado: "+this.quitado);
    }

    public ImovelBase(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public ImovelBase(String enderecoCompleto, double metragemQuadrada) {
        this.enderecoCompleto = enderecoCompleto;
        this.metragemQuadrada = metragemQuadrada;
    }

    public ImovelBase(String enderecoCompleto, double metragemQuadrada, double valorIPTUAnual) {
        this.enderecoCompleto = enderecoCompleto;
        this.metragemQuadrada = metragemQuadrada;
        this.valorIPTUAnual = valorIPTUAnual;
    }

    public ImovelBase(String enderecoCompleto, double metragemQuadrada, double valorIPTUAnual, boolean quitado) {
        this.enderecoCompleto = enderecoCompleto;
        this.metragemQuadrada = metragemQuadrada;
        this.valorIPTUAnual = valorIPTUAnual;
        this.quitado = quitado;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public double getMetragemQuadrada() {
        return metragemQuadrada;
    }

    public void setMetragemQuadrada(double metragemQuadrada) {
        this.metragemQuadrada = metragemQuadrada;
    }

    public double getValorIPTUAnual() {
        return valorIPTUAnual;
    }

    public void setValorIPTUAnual(double valorIPTUAnual) {
        this.valorIPTUAnual = valorIPTUAnual;
    }

    public boolean isQuitado() {
        return quitado;
    }

    public void setQuitado(boolean quitado) {
        this.quitado = quitado;
    }
}
