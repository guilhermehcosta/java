package myprojects.exercicio27.dominio;

public class EstudantePlataforma extends UsuarioPlataforma {
    private int totalCursosMatriculados;
    private double progressoMedioGeral;
    private UsuarioPlataforma usuarioPlataforma;

    public void imprime(){
        super.imprime();
        System.out.println();
        System.out.println("Cursos Matriculados: "+this.totalCursosMatriculados);
        System.out.println("Progresso Médio Geral: "+this.progressoMedioGeral);
    }

    public EstudantePlataforma(UsuarioPlataforma usuarioPlataforma, int totalCursosMatriculados) {
        super(usuarioPlataforma.getLogin(), usuarioPlataforma.getSenha(), usuarioPlataforma.getDataCriacaoConta(), usuarioPlataforma.isAtivo());
        this.totalCursosMatriculados = totalCursosMatriculados;
    }

    public EstudantePlataforma(UsuarioPlataforma usuarioPlataforma, int totalCursosMatriculados, double progressoMedioGeral) {
        super(usuarioPlataforma.getLogin(), usuarioPlataforma.getSenha(), usuarioPlataforma.getDataCriacaoConta(), usuarioPlataforma.isAtivo());
        this.totalCursosMatriculados = totalCursosMatriculados;
        this.progressoMedioGeral = progressoMedioGeral;
    }

    public int getTotalCursosMatriculados() {
        return totalCursosMatriculados;
    }

    public void setTotalCursosMatriculados(int totalCursosMatriculados) {
        this.totalCursosMatriculados = totalCursosMatriculados;
    }

    public double getProgressoMedioGeral() {
        return progressoMedioGeral;
    }

    public void setProgressoMedioGeral(double progressoMedioGeral) {
        this.progressoMedioGeral = progressoMedioGeral;
    }
}
