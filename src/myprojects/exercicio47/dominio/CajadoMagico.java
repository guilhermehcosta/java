package myprojects.exercicio47.dominio;

public class CajadoMagico extends Arma{
    protected ElementosMagicos elementosMagicos;

    public CajadoMagico(String nome, int nivel, ElementosMagicos elementosMagicos) {
        super(nome, nivel);
        this.elementosMagicos = elementosMagicos;
    }

    @Override
    public String toString() {
        return "CajadoMagico{" +
                "elementosMagicos=" + elementosMagicos +
                ", nome='" + nome + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    @Override
    public void atacar() {
        System.out.println("Ataque de "+elementosMagicos+". "+"Dano causado: "+elementosMagicos.danoDeElementoMagico(this.nivel));
    }
}
