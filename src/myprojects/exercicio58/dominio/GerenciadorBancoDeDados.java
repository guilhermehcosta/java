package myprojects.exercicio58.dominio;

public class GerenciadorBancoDeDados implements Auditavel, EscritorDeDados, LeitorDeDados{
    @Override
    public void gerarLog() {
        System.out.println("Gerando Log detalhado do query SQL...");
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo dados de banco de dados...");
    }

    @Override
    public void ler() {
        System.out.println("Lendo dados de banco de dados...");

    }
}
