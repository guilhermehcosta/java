package myprojects.exercicio43.dominio;

public class Retangulo extends FormaGeometrica{
    protected int base;
    protected int altura;

    public Retangulo(String nome) {
        super(nome);
    }

    public Retangulo(String nome, int base, int altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
