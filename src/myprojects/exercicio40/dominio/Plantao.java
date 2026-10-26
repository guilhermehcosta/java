package myprojects.exercicio40.dominio;

public class Plantao {
    private String responsavelPeloPlantao;
    private TipoPlantao tipoPlantao;

    @Override
    public String toString() {
        return "Plantao{" +
                "responsavelPeloPlantao='" + responsavelPeloPlantao + '\'' +
                ", tipoPlantao=" + tipoPlantao +
                '}';
    }

    public Plantao(String responsavelPeloPlantao, TipoPlantao tipoPlantao) {
        this.responsavelPeloPlantao = responsavelPeloPlantao;
        this.tipoPlantao = tipoPlantao;
    }

    public String getResponsavelPeloPlantao() {
        return responsavelPeloPlantao;
    }

    public void setResponsavelPeloPlantao(String responsavelPeloPlantao) {
        this.responsavelPeloPlantao = responsavelPeloPlantao;
    }

    public TipoPlantao getTipoPlantao() {
        return tipoPlantao;
    }

    public void setTipoPlantao(TipoPlantao tipoPlantao) {
        this.tipoPlantao = tipoPlantao;
    }
}
