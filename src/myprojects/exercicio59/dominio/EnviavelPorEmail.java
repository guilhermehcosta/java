package myprojects.exercicio59.dominio;

public interface EnviavelPorEmail {
    void enviarEmail();
    default void enviarEmailComAnexo(){
        System.out.println("Anexo Vazio/Padrão.");
    }
}
