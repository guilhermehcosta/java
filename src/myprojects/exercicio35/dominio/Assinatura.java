package myprojects.exercicio35.dominio;

public class Assinatura {
    private String nomeAssinante;
    private PlanoStreaming planoStreaming;

    @Override
    public String toString() {
        return "Assinatura{" +
                "nomeAssinante='" + nomeAssinante + '\'' +
                ", planoStreaming=" + planoStreaming +
                '}';
    }

    public Assinatura(String nomeAssinante, PlanoStreaming planoStreaming) {
        this.nomeAssinante = nomeAssinante;
        this.planoStreaming = planoStreaming;
    }

    public String getNomeAssinante() {
        return nomeAssinante;
    }

    public void setNomeAssinante(String nomeAssinante) {
        this.nomeAssinante = nomeAssinante;
    }

    public PlanoStreaming getPlanoStreaming() {
        return planoStreaming;
    }

    public void setPlanoStreaming(PlanoStreaming planoStreaming) {
        this.planoStreaming = planoStreaming;
    }
}
