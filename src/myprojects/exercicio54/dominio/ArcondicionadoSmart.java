package myprojects.exercicio54.dominio;

public class ArcondicionadoSmart implements DispositivoControlavel{
    private boolean ligado = false;
    private int temperatura = 22;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void ligar() {
        if(verificarStatus()){
            System.out.println("O Arcondicionado já está ligado!");
        } else {
            this.ligado = true;
            System.out.println("Arcondicionado foi ligado na temperatura de "+this.temperatura+" graus.");
        }
    }

    @Override
    public void desligar() {
        if(!verificarStatus()){
            System.out.println("O Arcondicionado já está desligado!");
        } else {
            this.ligado = false;
            System.out.println("Arcondicionado foi desligado!");
        }

    }

    @Override
    public boolean verificarStatus() {
        return this.ligado;
    }



    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
}
