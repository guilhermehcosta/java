package myprojects.exercicio30.dominio;

public class CoberturaDuplex extends ImovelBase{
    private double valorCondominio;
    private boolean possuiPiscinaPrivativa;
    private int numeroVagasGaragem;
    private double taxaManutencaoCobertura;
    private ImovelBase imovelBase;

    public void imprime(){
        super.imprime();
        System.out.println();
        System.out.println("Taxa de condomínio anual: "+this.valorCondominio);
        System.out.println("Possui piscina privativa: "+this.possuiPiscinaPrivativa);
        System.out.println("Vagas de garagem: "+this.numeroVagasGaragem);
        System.out.println("Taxa de manutenção de cobertura: "+this.taxaManutencaoCobertura);
        calculo();
    }

    public void calculo(){
        double valorDoIPTUanual = super.getValorIPTUAnual();
        double taxaManutencaoCoberturaAnual = this.taxaManutencaoCobertura * 12;
        double soma = valorDoIPTUanual + taxaManutencaoCoberturaAnual + this.valorCondominio;
        System.out.println();
        System.out.println("Valor a se pagar anualmente: R$"+soma);
    }

    public CoberturaDuplex(ImovelBase imovelBase, double valorCondominio) {
        super(imovelBase.getEnderecoCompleto(), imovelBase.getMetragemQuadrada(), imovelBase.getValorIPTUAnual(), imovelBase.isQuitado());
        this.valorCondominio = valorCondominio;
    }

    public CoberturaDuplex(ImovelBase imovelBase, double valorCondominio, boolean possuiPiscinaPrivativa) {
        super(imovelBase.getEnderecoCompleto(), imovelBase.getMetragemQuadrada(), imovelBase.getValorIPTUAnual(), imovelBase.isQuitado());
        this.valorCondominio = valorCondominio;
        this.possuiPiscinaPrivativa = possuiPiscinaPrivativa;
    }

    public CoberturaDuplex(ImovelBase imovelBase, double valorCondominio, boolean possuiPiscinaPrivativa, int numeroVagasGaragem) {
        super(imovelBase.getEnderecoCompleto(), imovelBase.getMetragemQuadrada(), imovelBase.getValorIPTUAnual(), imovelBase.isQuitado());
        this.valorCondominio = valorCondominio;
        this.possuiPiscinaPrivativa = possuiPiscinaPrivativa;
        this.numeroVagasGaragem = numeroVagasGaragem;
    }

    public CoberturaDuplex(ImovelBase imovelBase, double valorCondominio, boolean possuiPiscinaPrivativa, int numeroVagasGaragem, double taxaManutencaoCobertura) {
        super(imovelBase.getEnderecoCompleto(), imovelBase.getMetragemQuadrada(), imovelBase.getValorIPTUAnual(), imovelBase.isQuitado());
        this.valorCondominio = valorCondominio;
        this.possuiPiscinaPrivativa = possuiPiscinaPrivativa;
        this.numeroVagasGaragem = numeroVagasGaragem;
        this.taxaManutencaoCobertura = taxaManutencaoCobertura;
    }

    public double getValorCondominio() {
        return valorCondominio;
    }

    public void setValorCondominio(double valorCondominio) {
        this.valorCondominio = valorCondominio;
    }

    public boolean isPossuiPiscinaPrivativa() {
        return possuiPiscinaPrivativa;
    }

    public void setPossuiPiscinaPrivativa(boolean possuiPiscinaPrivativa) {
        this.possuiPiscinaPrivativa = possuiPiscinaPrivativa;
    }

    public int getNumeroVagasGaragem() {
        return numeroVagasGaragem;
    }

    public void setNumeroVagasGaragem(int numeroVagasGaragem) {
        this.numeroVagasGaragem = numeroVagasGaragem;
    }

    public double getTaxaManutencaoCobertura() {
        return taxaManutencaoCobertura;
    }

    public void setTaxaManutencaoCobertura(double taxaManutencaoCobertura) {
        this.taxaManutencaoCobertura = taxaManutencaoCobertura;
    }
}
