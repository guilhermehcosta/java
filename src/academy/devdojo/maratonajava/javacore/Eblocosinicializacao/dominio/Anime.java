package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[30];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

    }

    public Anime(String nome) {
        this.nome = nome;
        System.out.println(nome);
    }

    public Anime() {
        episodios = new int[30];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
        for (int episodios : this.episodios){
            System.out.println(episodios);
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
