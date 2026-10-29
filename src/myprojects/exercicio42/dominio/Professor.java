package myprojects.exercicio42.dominio;

public class Professor extends Pessoa{
    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
