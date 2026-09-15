package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultiDimensionais02 {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "Rodrigues";
        nomes[2] = "José";

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];



        for(int[] arrayBase:  arrayInt){
            for(int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
