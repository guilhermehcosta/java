package myprojects.sistemadenotas.dominio;

public class ImpressoraDeNotas {
    public void imprimir(AlunoBoletim aluno){
        CalculadoraDeMedia calculadoraDeMedia = new CalculadoraDeMedia();

        System.out.println("\nNome: " + aluno.nome +
                "\nPortuguês: " + aluno.portugues +
                "\nMatemática: " + aluno.matematica +
                "\nCiências: " + aluno.ciencias +
                "\nHistória: " + aluno.historia +
                "\nGeografia: " + aluno.geografia +
                "\nArtes: " + aluno.artes);
        calculadoraDeMedia.Media(aluno.nome, aluno.portugues, aluno.matematica, aluno.ciencias, aluno.historia, aluno.geografia, aluno.artes);
        System.out.println("\n-------------------------------");
    }
}
