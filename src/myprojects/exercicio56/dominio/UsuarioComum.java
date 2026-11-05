package myprojects.exercicio56.dominio;

public class UsuarioComum implements UsuarioAutenticavel{
    @Override
    public void login() {
        System.out.println("Logando como usuário comum...");
    }

    @Override
    public void realizarBackupLogs() {
        UsuarioAutenticavel.super.realizarBackupLogs();
    }
}
