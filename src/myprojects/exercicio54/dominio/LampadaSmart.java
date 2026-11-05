package myprojects.exercicio54.dominio;

public class LampadaSmart implements DispositivoControlavel{
    private boolean ligado = false;

    @Override
    public String toString() {
        return "LampadaSmart{" +
                "ligado=" + ligado +
                '}';
    }

    @Override
    public void ligar() {
        if(verificarStatus()){
            System.out.println("a lampada já está ligada!");
        } else {
            this.ligado = true;
        }
    }

    @Override
    public void desligar() {
        if(!verificarStatus()){
            System.out.println("a lampada já está desligada!");
        } else {
            this.ligado = false;
        }

    }

    @Override
    public boolean verificarStatus() {
        return this.ligado;
    }

    public LampadaSmart(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
