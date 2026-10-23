package myprojects.exercicio29.dominio;

public class CamisaEsportiva extends PecaRoupa {
    private String tecnologiaTecido;
    private boolean possuiProtecaoUV;
    private String tamanho;
    private PecaRoupa pecaRoupa;

    public void imprime(){
        super.imprime();
        System.out.println();
        System.out.println("Tecnologia Do Tecido: "+this.tecnologiaTecido);
        System.out.println("Possui Proteção UV: "+this.possuiProtecaoUV);
        System.out.println("Tamanho: "+this.tamanho);
    }

    public CamisaEsportiva(PecaRoupa pecaRoupa, String tecnologiaTecido) {
        super(pecaRoupa.getCodigoSku(), pecaRoupa.getNomeModelo(), pecaRoupa.getPreco(), pecaRoupa.getTecidoPrincipal());
        this.tecnologiaTecido = tecnologiaTecido;
    }

    public CamisaEsportiva(PecaRoupa pecaRoupa, String tecnologiaTecido, boolean possuiProtecaoUV) {
        super(pecaRoupa.getCodigoSku(), pecaRoupa.getNomeModelo(), pecaRoupa.getPreco(), pecaRoupa.getTecidoPrincipal());
        this.tecnologiaTecido = tecnologiaTecido;
        this.possuiProtecaoUV = possuiProtecaoUV;
    }

    public CamisaEsportiva(PecaRoupa pecaRoupa, String tecnologiaTecido, boolean possuiProtecaoUV, String tamanho) {
        super(pecaRoupa.getCodigoSku(), pecaRoupa.getNomeModelo(), pecaRoupa.getPreco(), pecaRoupa.getTecidoPrincipal());
        this.tecnologiaTecido = tecnologiaTecido;
        this.possuiProtecaoUV = possuiProtecaoUV;
        this.tamanho = tamanho;
    }

    public String getTecnologiaTecido() {
        return tecnologiaTecido;
    }

    public void setTecnologiaTecido(String tecnologiaTecido) {
        this.tecnologiaTecido = tecnologiaTecido;
    }

    public boolean isPossuiProtecaoUV() {
        return possuiProtecaoUV;
    }

    public void setPossuiProtecaoUV(boolean possuiProtecaoUV) {
        this.possuiProtecaoUV = possuiProtecaoUV;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
