package myprojects.exercicio14.dominio;

public class Turma {
    private String nomeTurma;
    private int capacidadeMaxima;
    private Aluno[] alunosMatriculados;
    private int totalAlunos = 0;

    public Turma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public Turma(String nomeTurma, int capacidadeMaxima) {
        this.nomeTurma = nomeTurma;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = new Aluno[capacidadeMaxima];
    }

    public Turma(String nomeTurma, int capacidadeMaxima, Aluno[] alunosMatriculados) {
        this.nomeTurma = nomeTurma;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = alunosMatriculados;
    }

    public Turma(String nomeTurma, int capacidadeMaxima, Aluno[] alunosMatriculados, int totalAlunos) {
        this.nomeTurma = nomeTurma;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = alunosMatriculados;
        this.totalAlunos = totalAlunos;
    }

    public boolean matricularAluno(Aluno aluno){
        if(totalAlunos >= capacidadeMaxima){
            System.out.println("ERRO! A sala está lotada. ");
            return false;
        } else if (aluno.getIdade() < 18) {
            System.out.println("ERRO! Aluno é menor de idade ");
            return false;
        } else {
            alunosMatriculados[totalAlunos] = aluno;
            totalAlunos++;

            System.out.println("Matricula realizada com sucesso!");
            return true;
        }
    }

    public void imprime(){


        System.out.println("Turma: "+this.nomeTurma);
        System.out.println("Capacidade máxima: "+this.capacidadeMaxima);
        System.out.println("\nAlunos Matriculados:");
           if(alunosMatriculados == null){
               return;
           } else {
               for (int i = 0; i < totalAlunos; i++) {
                   System.out.println(alunosMatriculados[i].getNome());
                   System.out.println("Idade: " + alunosMatriculados[i].getIdade() + " anos");
               }

        }
        System.out.println("\nTotal de Alunos: "+this.totalAlunos);

    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Aluno[] getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(Aluno[] alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;

    }

    public int getTotalAlunos() {
        return totalAlunos;
    }

    public void setTotalAlunos(int totalAlunos) {
        this.totalAlunos = totalAlunos;
    }
}
