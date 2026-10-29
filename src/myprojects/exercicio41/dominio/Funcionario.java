package myprojects.exercicio41.dominio;

public class Funcionario {
    private String nome;
    private NivelHierarquico nivelHierarquico;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", nivelHierarquico=" + nivelHierarquico +
                '}';
    }

    public Funcionario(String nome, NivelHierarquico nivelHierarquico) {
        this.nome = nome;
        this.nivelHierarquico = nivelHierarquico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelHierarquico getNivelHierarquico() {
        return nivelHierarquico;
    }

    public void setNivelHierarquico(NivelHierarquico nivelHierarquico) {
        this.nivelHierarquico = nivelHierarquico;
    }
}
