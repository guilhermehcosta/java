package myprojects.exercicio08.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private double matematica;
    private double portugues;
    private double mediaFinal;
    private static int contadorAlunosAprovados = 0;
    private static int contadorAlunosReprovados = 0;
    private static int contadorAlunosTotal = 0;


    public void imprime(){
        System.out.println("\nNome: "+ this.nome);
        System.out.println("Nota de portugues: "+ this.portugues);
        System.out.println("Nota de matematica: "+ this.matematica);
        System.out.println("Media final: "+ this.mediaFinal);
    }

    public Aluno(String nome, double portugues, double matematica) {
        double soma = portugues + matematica;

        this.nome = nome;
        this.portugues = portugues;
        this.matematica = matematica;
        this.mediaFinal = soma / 2;
        Aluno.contadorAlunosTotal++;

        if(mediaFinal < 5){
            Aluno.contadorAlunosReprovados++;
        } else {
            Aluno.contadorAlunosAprovados++;
        }
    }

    public static int getContadorAlunosReprovados() {
        System.out.println("\nQuantidade de Alunos Reprovados: "+ Aluno.contadorAlunosReprovados);
        return contadorAlunosReprovados;
    }

    public static void setContadorAlunosReprovados(int contadorAlunosReprovados) {
        Aluno.contadorAlunosReprovados = contadorAlunosReprovados;
    }

    public static int getContadorAlunosTotal() {
        System.out.println("\nQuantidade total de Alunos: "+contadorAlunosTotal);
        return contadorAlunosTotal;
    }

    public static void setContadorAlunosTotal(int contadorAlunosTotal) {
        Aluno.contadorAlunosTotal = contadorAlunosTotal;
    }

    public static int getcontadorAlunosAprovados() {
        System.out.println("\nQuantidade de Alunos Aprovados: "+ Aluno.contadorAlunosAprovados);
        return contadorAlunosAprovados;
    }

    public static void setcontadorAlunosAprovados(int contadorAlunos) {
        Aluno.contadorAlunosAprovados = contadorAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
