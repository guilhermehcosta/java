package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        int valorDoCarro = 50000;
        int parcela;

        for (parcela = 1; parcela <= valorDoCarro ; parcela++){

            double valorParcela = valorDoCarro / parcela;

            if(valorParcela < 1000){
                break;
            }
            System.out.println( "Parcela "+ parcela+ " R$ " + valorParcela);


        }
    }
}
