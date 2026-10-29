package myprojects.exercicio42.dominio;

public class Aluno extends Pessoa{
    public Aluno(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
