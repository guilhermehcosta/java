package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemove{
    @Override
    public void load() {
        System.out.println("Carregando dados de um banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de Dados!");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando dados do banco de dados!");;
    }
}
