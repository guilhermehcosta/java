package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        String[] nomes = new String[4];

        nomes[0] = "Marta";
        nomes[1] = "Jorge";
        nomes[2] = "Cleitin";
        nomes[3] = "Adilson";

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
