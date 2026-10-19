package myprojects.exercicio26.dominio;

public class AlunoBolsista extends MembroAcademico {
    private double percentualBolsa;
    private String nomeProjetoPesquisa;
    private double valorMensalidadeAuxilio;
    private MembroAcademico membroAcademico;

    public void imprime(){
        super.imprime();
        System.out.println();
        System.out.println("Percentual da bolsa: "+this.percentualBolsa);
        System.out.println("Percentual do Projeto de Pesquisa: "+this.nomeProjetoPesquisa);
        System.out.println("Valor Mensalidade Auxílio: "+this.valorMensalidadeAuxilio);
    }


    public AlunoBolsista(MembroAcademico membroAcademico, double percentualBolsa) {
        super(membroAcademico.getNomeCompleto(), membroAcademico.getRg(), membroAcademico.getDataDeNascimento(), membroAcademico.getTelefoneContato());
        this.percentualBolsa = percentualBolsa;
    }

    public AlunoBolsista(MembroAcademico membroAcademico, double percentualBolsa, String nomeProjetoPesquisa) {
        super(membroAcademico.getNomeCompleto(), membroAcademico.getRg(), membroAcademico.getDataDeNascimento(), membroAcademico.getTelefoneContato());
        this.percentualBolsa = percentualBolsa;
        this.nomeProjetoPesquisa = nomeProjetoPesquisa;
    }

    public AlunoBolsista(MembroAcademico membroAcademico, double percentualBolsa, String nomeProjetoPesquisa, double valorMensalidadeAuxilio) {
        super(membroAcademico.getNomeCompleto(), membroAcademico.getRg(), membroAcademico.getDataDeNascimento(), membroAcademico.getTelefoneContato());
        this.percentualBolsa = percentualBolsa;
        this.nomeProjetoPesquisa = nomeProjetoPesquisa;
        this.valorMensalidadeAuxilio = valorMensalidadeAuxilio;
    }

    public double getPercentualBolsa() {
        return percentualBolsa;
    }

    public void setPercentualBolsa(double percentualBolsa) {
        this.percentualBolsa = percentualBolsa;
    }

    public String getNomeProjetoPesquisa() {
        return nomeProjetoPesquisa;
    }

    public void setNomeProjetoPesquisa(String nomeProjetoPesquisa) {
        this.nomeProjetoPesquisa = nomeProjetoPesquisa;
    }

    public double getValorMensalidadeAuxilio() {
        return valorMensalidadeAuxilio;
    }

    public void setValorMensalidadeAuxilio(double valorMensalidadeAuxilio) {
        this.valorMensalidadeAuxilio = valorMensalidadeAuxilio;
    }
}
