package myprojects.exercicio12.dominio;

public class Professor {
    private String nome;
    private Departamento departamentoLotacao;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, Departamento departamentoLotacao) {
        this.nome = nome;
        this.departamentoLotacao = departamentoLotacao;
    }

    public void imprime(){
        System.out.println("Professor: "+ this.nome);
        System.out.println("Departamento: "+ departamentoLotacao.getNomeSetor());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamentoLotacao() {
        return departamentoLotacao;
    }

    public void setDepartamentoLotacao(Departamento departamentoLotacao) {
        this.departamentoLotacao = departamentoLotacao;
    }
}
