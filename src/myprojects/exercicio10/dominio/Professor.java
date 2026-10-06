package myprojects.exercicio10.dominio;

public class Professor {
    private String nome;
    private Disciplina[] especialidade;

    public void imprime(){
        System.out.println("\nProfessor: "+this.nome);
        if(especialidade == null){
            return;
        } else {
            for (Disciplina disciplina : especialidade) {
                System.out.println("Especialidade: "+disciplina.getNome());
            }

        }


    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, Disciplina[] especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina[] getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Disciplina[] especialidade) {
        this.especialidade = especialidade;
    }
}
