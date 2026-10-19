package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de FUNCIONARIO");
    }
    {
        System.out.println("Dentro do bloco inicialização não-estático de FUNCIONARIO 1");
    }
    {
        System.out.println("Dentro do bloco inicialização não-estático de FUNCIONARIO 2");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.getSalario());
    }

    public Funcionario(String nome) {
        System.out.println("Dentro do construtor de FUNCIONARIO");
        super(nome);
    }


    public void relatorioPagamento(){
        System.out.println();
        System.out.println("Nome: "+this.nome);
        System.out.println("Valor do Pagamento: "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
