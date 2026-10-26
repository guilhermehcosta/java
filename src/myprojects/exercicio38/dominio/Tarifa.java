package myprojects.exercicio38.dominio;

public class Tarifa {
    private String donoDoVeiculo;
    private TipoVeiculo tipoVeiculo;

    @Override
    public String toString() {
        return "Tarifa{" +
                "donoDoVeiculo='" + donoDoVeiculo + '\'' +
                ", tipoVeiculo=" + tipoVeiculo +
                '}';
    }

    public Tarifa(String donoDoVeiculo, TipoVeiculo tipoVeiculo) {
        this.donoDoVeiculo = donoDoVeiculo;
        this.tipoVeiculo = tipoVeiculo;
    }

    public String getDonoDoVeiculo() {
        return donoDoVeiculo;
    }

    public void setDonoDoVeiculo(String donoDoVeiculo) {
        this.donoDoVeiculo = donoDoVeiculo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
