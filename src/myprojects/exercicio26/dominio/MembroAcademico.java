package myprojects.exercicio26.dominio;

public class MembroAcademico {
    private String nomeCompleto;
    private String rg;
    private String dataDeNascimento;
    private int telefoneContato;

    public void imprime(){
        System.out.println();
        System.out.println("Nome: "+this.nomeCompleto);
        System.out.println("RG: "+this.rg);
        System.out.println("Data de Nascimento: "+this.dataDeNascimento);
        System.out.println("Telefone: "+this.telefoneContato);
    }

    public MembroAcademico(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public MembroAcademico(String nomeCompleto, String rg) {
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
    }

    public MembroAcademico(String nomeCompleto, String rg, String dataDeNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
    }

    public MembroAcademico(String nomeCompleto, String rg, String dataDeNascimento, int telefoneContato) {
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.dataDeNascimento = dataDeNascimento;
        this.telefoneContato = telefoneContato;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getRg() {
        return rg;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(int telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
