package myprojects.exercicio11.dominio;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private Estudante[] estudantesMatriculados;

    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void imprime(){
        System.out.println("Curso: "+ this.nome);
        System.out.println("Carga-horaria: "+ this.cargaHoraria);

        if(estudantesMatriculados != null){
            System.out.println("\nAlunos Matriculados: ");
            for (Estudante estudantesMatriculados : estudantesMatriculados) {
                System.out.println(estudantesMatriculados.getNome());
        }
        } else {
            return;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Estudante[] getEstudantesMatriculados() {
        return estudantesMatriculados;
    }

    public void setEstudantesMatriculados(Estudante[] estudantesMatriculados) {
        this.estudantesMatriculados = estudantesMatriculados;
    }
}
