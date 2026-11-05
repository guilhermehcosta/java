package myprojects.exercicio59.dominio;

public class NotificadorMaster implements EnviarPorSms, EnviavelPorEmail{
    @Override
    public void enviarSms() {
        System.out.println("SMS enviado!");
    }

    @Override
    public void enviarEmail() {
        System.out.println("Email enviado!");
    }
}
