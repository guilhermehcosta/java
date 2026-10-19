package myprojects.exercicio22.dominio;

public class Desenvolvedor extends Pessoa {
    private String linguagemPrincipal;
    private int anosDeExperiencia;
    private boolean trabalhoRemoto;



    public void imprime(){
        super.imprime();
        System.out.println("Linguaguem Principal: "+this.linguagemPrincipal);
        System.out.println("Anos de experiência: "+this.anosDeExperiencia);
        System.out.println("Trabalho remoto: "+this.trabalhoRemoto);
    }

    public Desenvolvedor(Pessoa pessoa, String linguagemPrincipal) {
        super(pessoa.getNome(), pessoa.getCpf(), pessoa.getEmail(), pessoa.getIdade());
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public Desenvolvedor(Pessoa pessoa, String linguagemPrincipal, int anosDeExperiencia) {
        super(pessoa.getNome(), pessoa.getCpf(), pessoa.getEmail(), pessoa.getIdade());
        this.linguagemPrincipal = linguagemPrincipal;
        this.anosDeExperiencia = anosDeExperiencia;

    }

    public Desenvolvedor(Pessoa pessoa, String linguagemPrincipal, int anosDeExperiencia, boolean trabalhoRemoto) {
        super(pessoa.getNome(), pessoa.getCpf(), pessoa.getEmail(), pessoa.getIdade());
        this.linguagemPrincipal = linguagemPrincipal;
        this.anosDeExperiencia = anosDeExperiencia;
        this.trabalhoRemoto = trabalhoRemoto;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public boolean isTrabalhoRemoto() {
        return trabalhoRemoto;
    }

    public void setTrabalhoRemoto(boolean trabalhoRemoto) {
        this.trabalhoRemoto = trabalhoRemoto;
    }
}
