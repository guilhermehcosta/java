package myprojects.exercicio55.dominio;

public class MultiFuncional implements Digitalizavel, Imprimivel{
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando documento...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }
}
