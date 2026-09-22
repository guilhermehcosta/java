package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private int[] salarios;


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade + " anos");

        for (int i = 0; i < this.salarios.length; i++) {
            System.out.println("Mês " + (i + 1) + ": " + this.salarios[i]);
        }
    }

    public void mediaSalarial(){
        int soma = 0;
        int quantidadeDeSalarios = 0;
        for(int i = 0; i < salarios.length; i++){
            soma += salarios[i];
        }
        for(int i = 0; i < salarios.length; i++){
            quantidadeDeSalarios = i + 1;
        }
        double result = soma / quantidadeDeSalarios;

        System.out.println("\nA média salarial do funcionário foi de "+result+" reais.");
    }



    public String getNome() {
        return nome;
    }

    public int[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(int[] salarios) {
        this.salarios = salarios;
    }



}
