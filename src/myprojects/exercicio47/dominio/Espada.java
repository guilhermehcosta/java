package myprojects.exercicio47.dominio;

public class Espada extends Arma{
    protected int afiacao;

    public Espada(String nome, int nivel, int afiacao) {
        super(nome, nivel);
        this.afiacao = afiacao;
    }

    @Override
    public String toString() {
        return "Espada{" +
                "afiacao=" + afiacao +
                ", nome='" + nome + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    @Override
    public void atacar() {
        System.out.println("Ataque de Espada. Dano causado: "+ (this.nivel + this.afiacao));
    }
}
