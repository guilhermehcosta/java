package myprojects.exercicio57.dominio;

public interface VeiculoAquatico {
    void navegarNaAgua();
    default void ligarSonar(){
    System.out.println("Sonar ativado: buscando profundidade padrão...");
    }
}
