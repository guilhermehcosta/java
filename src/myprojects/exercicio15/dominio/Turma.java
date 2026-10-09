package myprojects.exercicio15.dominio;

public class Turma {
    private String nomeTurma;
    private int capacidadeMaxima;
    private int totalDeAlunos = 0;
    private Aluno[] alunosMatriculados;

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

    public Turma(String nomeTurma, int capacidadeMaxima, int totalDeAlunos, Aluno[] alunosMatriculados) {
        this.nomeTurma = nomeTurma;
        this.capacidadeMaxima = capacidadeMaxima;
        this.totalDeAlunos = totalDeAlunos;
        this.alunosMatriculados = alunosMatriculados;
    }

    public boolean matricularAluno(Aluno aluno){
        if(totalDeAlunos >= capacidadeMaxima){
            System.out.println("Erro! Essa sala está lotada!");
        return false;
        } else if(aluno.getIdade() < 18){
            System.out.println("Erro! Aluno é menor de idade!");
            return false;
        } else {
            alunosMatriculados[totalDeAlunos] = aluno;
            totalDeAlunos++;
            System.out.println("Matricula realizada com sucesso!");
            return true;
        }
    }

    public void imprime(){
        System.out.println("Turma: "+ this.nomeTurma);
        System.out.println("Capacidade máxima: "+ this.capacidadeMaxima);
        System.out.println("Alunos matriculados: ");
        if(alunosMatriculados == null){
            return;
        } else {
            for (int i = 0; i < totalDeAlunos; i++) {
                System.out.println(alunosMatriculados[i].getNome());
                System.out.println("Idade: "+alunosMatriculados[i].getIdade());
            }
        }


        System.out.println("Total de alunos: "+ this.totalDeAlunos);
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

    public int getTotalDeAlunos() {
        return totalDeAlunos;
    }

    public void setTotalDeAlunos(int totalDeAlunos) {
        this.totalDeAlunos = totalDeAlunos;
    }

    public Aluno[] getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(Aluno[] alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
