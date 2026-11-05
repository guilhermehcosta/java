package myprojects.exercicio56.dominio;

public interface UsuarioAutenticavel {
    void login();
    default void realizarBackupLogs(){
        System.out.println("Realizando backup genérico de segurança...");
    }
}
