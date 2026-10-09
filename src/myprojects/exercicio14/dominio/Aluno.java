package myprojects.exercicio14.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private boolean validacao;

    public Aluno(String nome) {
        this.nome = nome;

    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        if(this.idade < 17){
            System.out.println("ERROOOOOOOOOOO");
        }
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

    public boolean isValidacao() {
        return validacao;
    }

    public void setValidacao(boolean validacao) {
        this.validacao = validacao;
    }
}
