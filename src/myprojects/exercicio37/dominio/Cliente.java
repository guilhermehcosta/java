package myprojects.exercicio37.dominio;

public class Cliente {
    private String nome;
    private CategoriaFidelidade categoriaFidelidade;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", categoriaFidelidade=" + categoriaFidelidade +
                '}';
    }

    public Cliente(String nome, CategoriaFidelidade categoriaFidelidade) {
        this.nome = nome;
        this.categoriaFidelidade = categoriaFidelidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaFidelidade getCategoriaFidelidade() {
        return categoriaFidelidade;
    }

    public void setCategoriaFidelidade(CategoriaFidelidade categoriaFidelidade) {
        this.categoriaFidelidade = categoriaFidelidade;
    }
}
