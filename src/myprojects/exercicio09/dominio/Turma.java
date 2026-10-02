package myprojects.exercicio09.dominio;

public class Turma {
    private String nome;
    private Aluno[] alunos;

    public Turma(String nome) {
        this.nome = nome;
    }

    public Turma(String nome, Aluno[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("\nTurma: "+this.nome);
        if(alunos == null){
            return;
        } else {
            for (Aluno alunos : alunos) {
                System.out.println(alunos.getNome());
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
