package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public int[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade + " anos");

        for (int i = 0; i < this.salarios.length; i++) {
            System.out.println("Mês " + (i + 1) + ": " + this.salarios[i]);
        }
    }
}
