package myprojects.exercicio19.dominio;

public class Estudante {
    private String nome;
    private int idade;
    private Materia[] alunoBoletim;
    private int totalDeMaterias = 0;
    private boolean statusAprovacao;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.alunoBoletim = new Materia[totalDeMaterias];
    }

    public Estudante(String nome, int idade, Materia[] alunoBoletim) {
        this.nome = nome;
        this.idade = idade;
        this.alunoBoletim = alunoBoletim;
    }

    public void media(){
        double media = 0;
        for (int i = 0; i < alunoBoletim.length; i++) {
            media += alunoBoletim[i].getNotaMateria();
            this.totalDeMaterias++;
        }
        double mediaFinal = media / this.totalDeMaterias;
        if(mediaFinal < 5.0){
            this.statusAprovacao = false;
        } else {
            this.statusAprovacao = true;
        }
        System.out.println("Média do aluno: "+mediaFinal);
    }

    public void aprovacao(){
        if(this.statusAprovacao == true){
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }

    public void imprime(){
        System.out.println("Aluno: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println();

            for (int i = 0; i < alunoBoletim.length; i++) {
                System.out.println(alunoBoletim[i].getNomeMateria());
                System.out.println(alunoBoletim[i].getNotaMateria());
        }

        media();
            aprovacao();
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

    public Materia[] getAlunoBoletim() {
        return alunoBoletim;
    }

    public void setAlunoBoletim(Materia[] alunoBoletim) {
        this.alunoBoletim = alunoBoletim;
    }
}
