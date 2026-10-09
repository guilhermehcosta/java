package myprojects.exercicio17.dominio;

public class Turma {
    private String nomeDaTurma;
    private int capacidadeMaxima;
    private int totalDeAlunos = 0;
    private Aluno[] alunosMatriculados;

    public Turma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
    }

    public Turma(String nomeDaTurma, int capacidadeMaxima) {
        this.nomeDaTurma = nomeDaTurma;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = new Aluno[capacidadeMaxima];

    }

    public Turma(String nomeDaTurma, int capacidadeMaxima, int totalDeAlunos) {
        this.nomeDaTurma = nomeDaTurma;
        this.capacidadeMaxima = capacidadeMaxima;
        this.totalDeAlunos = totalDeAlunos;
    }

    public Turma(String nomeDaTurma, int capacidadeMaxima, int totalDeAlunos, Aluno[] alunosMatriculados) {
        this.nomeDaTurma = nomeDaTurma;
        this.capacidadeMaxima = capacidadeMaxima;
        this.totalDeAlunos = totalDeAlunos;
        this.alunosMatriculados = alunosMatriculados;
    }

    public boolean matricularAluno(Aluno aluno){
        if(totalDeAlunos >= capacidadeMaxima){
            System.out.println("Não foi possível realizar a matrícula "+aluno.getNome()+". A sala está lotada.");
            return false;
        } else if(aluno.getIdade() < 18){
            System.out.println("Não foi possível realizar a matrícula de "+aluno.getNome()+". Aluno é menor de idade.");
            return false;
        } else {
            alunosMatriculados[totalDeAlunos] = aluno;
            totalDeAlunos++;
            System.out.println("Matrícula realizada com sucesso!");
            return true;
        }
    }

    public void imprime(){
        System.out.println("\nTurma: "+this.nomeDaTurma);
        System.out.println("Capacidade máxima de alunos: "+this.capacidadeMaxima);
        System.out.println("Alunos matriculados: ");
        if(alunosMatriculados == null){
            return;
        } else {
            for (int i = 0; i < totalDeAlunos; i++) {
                System.out.println("\n"+alunosMatriculados[i].getNome());
                System.out.println(alunosMatriculados[i].getIdade()+" anos de idade");
            }

            System.out.println("\nQuantidade de alunos matriculados na turma: "+this.totalDeAlunos);
        }
    }

    public String getNomeDaTurma() {
        return nomeDaTurma;
    }

    public void setNomeDaTurma(String nomeDaTurma) {
        this.nomeDaTurma = nomeDaTurma;
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
