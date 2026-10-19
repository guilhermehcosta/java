package myprojects.exercicio27.dominio;

public class Instrutor extends UsuarioPlataforma {
    private String[] especialidades;
    private int quantidadeDeCursosPublicados;
    private double avaliacaoMedia;
    private UsuarioPlataforma usuarioPlataforma;

    public void imprime(){
        super.imprime();
        System.out.println();
        System.out.println("Especialidades: ");
        for (int i = 0; i < especialidades.length; i++) {
            System.out.println(especialidades[i]);
        }
        System.out.println("Cursos Publicados: "+this.quantidadeDeCursosPublicados);
        System.out.println("Avaliação Média: "+this.avaliacaoMedia);
    }

    public Instrutor(UsuarioPlataforma usuarioPlataforma, String[] especialidades) {
        super(usuarioPlataforma.getLogin(), usuarioPlataforma.getSenha(), usuarioPlataforma.getDataCriacaoConta(), usuarioPlataforma.isAtivo());
        this.especialidades = especialidades;
    }

    public Instrutor(UsuarioPlataforma usuarioPlataforma, String[] especialidades, int quantidadeDeCursosPublicados) {
        super(usuarioPlataforma.getLogin(), usuarioPlataforma.getSenha(), usuarioPlataforma.getDataCriacaoConta(), usuarioPlataforma.isAtivo());
        this.especialidades = especialidades;
        this.quantidadeDeCursosPublicados = quantidadeDeCursosPublicados;
    }

    public Instrutor(UsuarioPlataforma usuarioPlataforma, String[] especialidades, int quantidadeDeCursosPublicados, double avaliacaoMedia) {
        super(usuarioPlataforma.getLogin(), usuarioPlataforma.getSenha(), usuarioPlataforma.getDataCriacaoConta(), usuarioPlataforma.isAtivo());
        this.especialidades = especialidades;
        this.quantidadeDeCursosPublicados = quantidadeDeCursosPublicados;
        this.avaliacaoMedia = avaliacaoMedia;
    }

    public String[] getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String[] especialidades) {
        this.especialidades = especialidades;
    }

    public int getQuantidadeDeCursosPublicados() {
        return quantidadeDeCursosPublicados;
    }

    public void setQuantidadeDeCursosPublicados(int quantidadeDeCursosPublicados) {
        this.quantidadeDeCursosPublicados = quantidadeDeCursosPublicados;
    }

    public double getAvaliacaoMedia() {
        return avaliacaoMedia;
    }

    public void setAvaliacaoMedia(double avaliacaoMedia) {
        this.avaliacaoMedia = avaliacaoMedia;
    }
}
