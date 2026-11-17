package myprojects.exercicio66.dominio;

public class Notebook extends Dispositivo{
    private String placaDeVideo;

    @Override
    public double calcularValorGarantia() {
        return this.getPreco() * 0.18;
    }

    public Notebook(String fabricante, double preco, String placaDeVideo) {
        super(fabricante, preco);
        this.placaDeVideo = placaDeVideo;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }
}
