package myprojects.exercicio33.dominio;

public class Produto {
    private String nomeProduto;
    private RegiaoEnvio regiaoEnvio;

    @Override
    public String toString() {
        return "Produto{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", regiaoEnvio=" + regiaoEnvio +
                '}';
    }

    public Produto(String nomeProduto, RegiaoEnvio regiaoEnvio) {
        this.nomeProduto = nomeProduto;
        this.regiaoEnvio = regiaoEnvio;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public RegiaoEnvio getRegiaoEnvio() {
        return regiaoEnvio;
    }

    public void setRegiaoEnvio(RegiaoEnvio regiaoEnvio) {
        this.regiaoEnvio = regiaoEnvio;
    }
}
