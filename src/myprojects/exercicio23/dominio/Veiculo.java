package myprojects.exercicio23.dominio;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double valorDiaria;
    private int quantidadeDeDias;

    public void imprime(){
        System.out.println("Placa: "+this.placa);
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano de Fabricação: "+this.anoFabricacao);
        System.out.println("Valor da Diária: R$"+this.valorDiaria);

        double total = this.quantidadeDeDias * this.valorDiaria;

        System.out.println("Total a pagar: R$"+total);
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public Veiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public Veiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo(String placa, String marca, String modelo, int anoFabricacao) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public Veiculo(String placa, String marca, String modelo, int anoFabricacao, double valorDiaria) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valorDiaria = valorDiaria;
    }

    public Veiculo(String placa, String marca, String modelo, int anoFabricacao, double valorDiaria, int quantidadeDeDias) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valorDiaria = valorDiaria;
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    public void setQuantidadeDeDias(int quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }
}
