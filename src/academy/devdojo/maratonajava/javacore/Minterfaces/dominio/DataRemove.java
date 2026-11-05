package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataRemove {
    void remove();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
