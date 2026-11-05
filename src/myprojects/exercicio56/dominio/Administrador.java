package myprojects.exercicio56.dominio;

public class Administrador implements UsuarioAutenticavel{
    @Override
    public void login() {
        System.out.println("Logando como adm");
    }

    @Override
    public void realizarBackupLogs() {
        System.out.println("Backup master do admin realizado com privilégios!");
    }
}
