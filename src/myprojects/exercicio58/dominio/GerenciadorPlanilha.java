package myprojects.exercicio58.dominio;

public class GerenciadorPlanilha implements LeitorDeDados, EscritorDeDados, Auditavel{
    @Override
    public void escrever() {
        System.out.println("Lendo dados de planilha...");
    }

    @Override
    public void ler() {
        System.out.println("Escrevendo dados de planilha...");
    }
}
