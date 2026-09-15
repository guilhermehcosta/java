package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultiDimensionais01 {
    public static void main(String[] args) {

        int[][] dias = new int[3][3];

        dias[0][0] = 1;
        dias[0][1] = 11;
        dias[0][2] = 111;

        dias[1][0] = 2;
        dias[1][1] = 22;
        dias[1][2] = 222;

        dias[2][0] = 3;
        dias[2][1] = 33;
        dias[2][2] = 333;

        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------------------------------------------------------");

        for(int[] arr: dias){
            for(int num: arr){
                System.out.println(num);
            }
        }

    }
}
