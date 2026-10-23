package myprojects.exercicio29.dominio;

public class PecaRoupa {
    private String codigoSku;
    private String nomeModelo;
    private double preco;
    private String tecidoPrincipal;

    public void imprime(){
        System.out.println("Código Sku: "+this.codigoSku);
        System.out.println("Modelo: "+this.nomeModelo);
        System.out.println("Preço: "+this.preco);
        System.out.println("Tecido Principal: "+this.tecidoPrincipal);
    }

    public PecaRoupa(String codigoSku) {
        this.codigoSku = codigoSku;
    }

    public PecaRoupa(String codigoSku, String nomeModelo) {
        this.codigoSku = codigoSku;
        this.nomeModelo = nomeModelo;
    }

    public PecaRoupa(String codigoSku, String nomeModelo, double preco) {
        this.codigoSku = codigoSku;
        this.nomeModelo = nomeModelo;
        this.preco = preco;
    }

    public PecaRoupa(String codigoSku, String nomeModelo, double preco, String tecidoPrincipal) {
        this.codigoSku = codigoSku;
        this.nomeModelo = nomeModelo;
        this.preco = preco;
        this.tecidoPrincipal = tecidoPrincipal;
    }

    public String getCodigoSku() {
        return codigoSku;
    }

    public void setCodigoSku(String codigoSku) {
        this.codigoSku = codigoSku;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTecidoPrincipal() {
        return tecidoPrincipal;
    }

    public void setTecidoPrincipal(String tecidoPrincipal) {
        this.tecidoPrincipal = tecidoPrincipal;
    }
}
