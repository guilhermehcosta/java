package myprojects.exercicio57.dominio;

public class HoverCraft implements VeiculoAquatico, VeiculoTerrestre{
    @Override
    public void navegarNaAgua() {
        System.out.println("Navegação na água iniciada");
    }

    @Override
    public void acelerarNoAsfalto() {
        System.out.println("Aceleração no asfalto iniciada");
    }

    @Override
    public void ligarSonar() {
        VeiculoAquatico.super.ligarSonar();
    }
}
