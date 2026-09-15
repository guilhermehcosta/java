package myprojects.sistemadenotas.test;
import myprojects.sistemadenotas.dominio.AlunoBoletim;
import myprojects.sistemadenotas.dominio.ImpressoraDeNotas;

public class AlunoBoletimTest {
    public static void main(String[] args) {

        ImpressoraDeNotas impressora = new ImpressoraDeNotas();

        AlunoBoletim LucasSilva = new AlunoBoletim();
        AlunoBoletim BeatrizSouza = new AlunoBoletim();
        AlunoBoletim MateusOliveira = new AlunoBoletim();
        AlunoBoletim MarianaSantos = new AlunoBoletim();
        AlunoBoletim GabrielCosta = new AlunoBoletim();

        LucasSilva.nome = "Lucas Silva";
        BeatrizSouza.nome = "Beatriz Souza";
        MarianaSantos.nome = "Mariana Santos";
        GabrielCosta.nome = "Gabriel Costa";
        MateusOliveira.nome = "Mateus Oliveira";

        LucasSilva.portugues =  8.5;
        BeatrizSouza.portugues = 9.0;
        MarianaSantos.portugues = 7.0;
        GabrielCosta.portugues = 6.5;
        MateusOliveira.portugues = 5.5;

        LucasSilva.matematica = 6.0;
        BeatrizSouza.matematica = 8.5;
        MarianaSantos.matematica = 9.5;
        GabrielCosta.matematica = 5.0;
        MateusOliveira.matematica = 4.0;

        LucasSilva.ciencias = 7.5;
        BeatrizSouza.ciencias = 9.0;
        MarianaSantos.ciencias = 8.5;
        GabrielCosta.ciencias = 4.5;
        MateusOliveira.ciencias = 6.0;

        LucasSilva.historia = 9.0;
        BeatrizSouza.historia = 7.5;
        MarianaSantos.historia = 8.0;
        GabrielCosta.historia = 7.0;
        MateusOliveira.historia = 6.5;

        LucasSilva.geografia = 8.0;
        BeatrizSouza.geografia = 8.5;
        MarianaSantos.geografia = 9.0;
        GabrielCosta.geografia = 6.0;
        MateusOliveira.geografia = 5.0;

        LucasSilva.artes = 1.5;
        BeatrizSouza.artes = 10.0;
        MarianaSantos.artes = 8.5;
        GabrielCosta.artes = 8.0;
        MateusOliveira.artes = 7.0;

        impressora.imprimir(LucasSilva);
        impressora.imprimir(BeatrizSouza);
        impressora.imprimir(MarianaSantos);
        impressora.imprimir(GabrielCosta);
        impressora.imprimir(MateusOliveira);




    }



}

