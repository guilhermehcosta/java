package myprojects.exercicio34.dominio;

public class Usuario {
    private String nome;
    private MoedaCambio moedaCambio;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", moedaCambio=" + moedaCambio +
                '}';
    }

    public Usuario(String nome, MoedaCambio moedaCambio) {
        this.nome = nome;
        this.moedaCambio = moedaCambio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MoedaCambio getMoedaCambio() {
        return moedaCambio;
    }

    public void setMoedaCambio(MoedaCambio moedaCambio) {
        this.moedaCambio = moedaCambio;
    }
}
