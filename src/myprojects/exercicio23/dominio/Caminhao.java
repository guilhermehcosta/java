package myprojects.exercicio23.dominio;

public class Caminhao extends Veiculo{
    private double CapacidadeCargaEmTon;
    private int quantidadeDeEixos;
    private boolean temReboque;

    public void imprime(){
        super.imprime();
        System.out.println("Capacidade de Carga em TON: "+this.CapacidadeCargaEmTon);
        System.out.println("Quantidade de eixos: "+this.quantidadeDeEixos);
        System.out.println("Tem reboque? "+this.temReboque);
    }

    public Caminhao(Veiculo veiculo, double capacidadeCargaEmTon) {
        super(veiculo.getPlaca(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getAnoFabricacao(), veiculo.getValorDiaria(), veiculo.getQuantidadeDeDias());
        this.CapacidadeCargaEmTon = capacidadeCargaEmTon;
    }

    public Caminhao(Veiculo veiculo, double capacidadeCargaEmTon, int quantidadeDeEixos) {
        super(veiculo.getPlaca(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getAnoFabricacao(), veiculo.getValorDiaria(), veiculo.getQuantidadeDeDias());
        this.CapacidadeCargaEmTon = capacidadeCargaEmTon;
        this.quantidadeDeEixos = quantidadeDeEixos;
    }

    public Caminhao(Veiculo veiculo, double capacidadeCargaEmTon, int quantidadeDeEixos, boolean temReboque) {
        super(veiculo.getPlaca(), veiculo.getMarca(), veiculo.getModelo(), veiculo.getAnoFabricacao(), veiculo.getValorDiaria(), veiculo.getQuantidadeDeDias());
        this.CapacidadeCargaEmTon = capacidadeCargaEmTon;
        this.quantidadeDeEixos = quantidadeDeEixos;
        this.temReboque = temReboque;
    }


}
