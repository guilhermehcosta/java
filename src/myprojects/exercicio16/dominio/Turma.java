package myprojects.exercicio16.dominio;

public class Turma {
    private String nomeTurma;
    private int capacidadeMaxima;
    private Aluno[] alunosMatriculados;
    private int totalDeAlunos;

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

    public Turma(String nomeTurma, int capacidadeMaxima, Aluno[] alunosMatriculados, int totalDeAlunos) {
        this.nomeTurma = nomeTurma;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = alunosMatriculados;
        this.totalDeAlunos = totalDeAlunos;
    }

    public boolean matricularAluno(Aluno aluno){
        if(totalDeAlunos >= capacidadeMaxima){
            System.out.println("\nErro: não foi possivel matricular "+aluno.getNome()+" a sala está lotada");
            return false;
        } else if(aluno.getIdade() < 18){
            System.out.println("\nErro: "+aluno.getNome()+" é menor de idade");
            return false;
        } else {
            alunosMatriculados[totalDeAlunos] = aluno;
            totalDeAlunos++;
            System.out.println("\nMatrícula de "+aluno.getNome()+" realizada com sucesso!");
            return true;
        }
    }

    public void imprime(){
        System.out.println("Turma: "+this.nomeTurma);
        System.out.println("Capacidade da turma: "+this.capacidadeMaxima);
        System.out.println("\nAlunos matriculados: ");
        if(alunosMatriculados == null){
            return;
        } else {
            for (int i = 0; i < totalDeAlunos; i++) {
                System.out.println("\n"+alunosMatriculados[i].getNome());
                System.out.println("Idade: "+alunosMatriculados[i].getIdade());
            }

            System.out.println("Total de alunos: "+this.totalDeAlunos);
        }
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

    public int getTotalDeAlunos() {
        return totalDeAlunos;
    }

    public void setTotalDeAlunos(int totalDeAlunos) {
        this.totalDeAlunos = totalDeAlunos;
    }
}
