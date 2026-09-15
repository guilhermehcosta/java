package myprojects.sistemadenotas.test;

import myprojects.sistemadenotas.dominio.AlunoBoletim;
import myprojects.sistemadenotas.dominio.CalculadoraDeMedia;

public class AlunoBoletimTest {
    public static void main(String[] args) {

        CalculadoraDeMedia calculadoraDeMedia = new CalculadoraDeMedia();

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



        System.out.println("\nNome: " + LucasSilva.nome +
                "\nPortuguês: " + LucasSilva.portugues +
                "\nMatemática: " + LucasSilva.matematica +
                "\nCiências: " + LucasSilva.ciencias +
                "\nHistória: " + LucasSilva.historia +
                "\nGeografia: " + LucasSilva.geografia +
                "\nArtes: " + LucasSilva.artes + "\n");
        calculadoraDeMedia.Media(LucasSilva.nome, LucasSilva.portugues, LucasSilva.matematica, LucasSilva.ciencias, LucasSilva.historia, LucasSilva.geografia, LucasSilva.artes);


        System.out.println("\nNome: " + BeatrizSouza.nome +
                "\nPortuguês: " + BeatrizSouza.portugues +
                "\nMatemática: " + BeatrizSouza.matematica +
                "\nCiências: " + BeatrizSouza.ciencias +
                "\nHistória: " + BeatrizSouza.historia +
                "\nGeografia: " + BeatrizSouza.geografia +
                "\nArtes: " + BeatrizSouza.artes + "\n");
        calculadoraDeMedia.Media(BeatrizSouza.nome, BeatrizSouza.portugues, BeatrizSouza.matematica, BeatrizSouza.ciencias, BeatrizSouza.historia, BeatrizSouza.geografia, BeatrizSouza.artes);


        System.out.println("\nNome: " + MarianaSantos.nome +
                "\nPortuguês: " + MarianaSantos.portugues +
                "\nMatemática: " + MarianaSantos.matematica +
                "\nCiências: " + MarianaSantos.ciencias +
                "\nHistória: " + MarianaSantos.historia +
                "\nGeografia: " + MarianaSantos.geografia +
                "\nArtes: " + MarianaSantos.artes + "\n");
        calculadoraDeMedia.Media(MarianaSantos.nome, MarianaSantos.portugues, MarianaSantos.matematica, MarianaSantos.ciencias, MarianaSantos.historia, MarianaSantos.geografia, MarianaSantos.artes);


        System.out.println("\nNome: " + GabrielCosta.nome +
                "\nPortuguês: " + GabrielCosta.portugues +
                "\nMatemática: " + GabrielCosta.matematica +
                "\nCiências: " + GabrielCosta.ciencias +
                "\nHistória: " + GabrielCosta.historia +
                "\nGeografia: " + GabrielCosta.geografia +
                "\nArtes: " + GabrielCosta.artes + "\n");
        calculadoraDeMedia.Media(GabrielCosta.nome, GabrielCosta.portugues, GabrielCosta.matematica, GabrielCosta.ciencias, GabrielCosta.historia, GabrielCosta.geografia, GabrielCosta.artes);


        System.out.println("\nNome: " + MateusOliveira.nome +
                "\nPortuguês: " + MateusOliveira.portugues +
                "\nMatemática: " + MateusOliveira.matematica +
                "\nCiências: " + MateusOliveira.ciencias +
                "\nHistória: " + MateusOliveira.historia +
                "\nGeografia: " + MateusOliveira.geografia +
                "\nArtes: " + MateusOliveira.artes + "\n");
        calculadoraDeMedia.Media(MateusOliveira.nome, MateusOliveira.portugues, MateusOliveira.matematica, MateusOliveira.ciencias, MateusOliveira.historia, MateusOliveira.geografia, MateusOliveira.artes);







    }



}

