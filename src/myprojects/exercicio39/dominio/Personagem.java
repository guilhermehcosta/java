package myprojects.exercicio39.dominio;

public class Personagem {
    private String nome;
    private ClassePersonagem classePersonagem;

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", classePersonagem=" + classePersonagem +
                '}';
    }

    public Personagem(String nome, ClassePersonagem classePersonagem) {
        this.nome = nome;
        this.classePersonagem = classePersonagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClassePersonagem getClassePersonagem() {
        return classePersonagem;
    }

    public void setClassePersonagem(ClassePersonagem classePersonagem) {
        this.classePersonagem = classePersonagem;
    }
}
