package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        int valorDoCarro = 30000;
        int parcela;

        for (parcela = valorDoCarro; parcela >= 1 ; parcela--){
            double valorParcela = valorDoCarro / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println( "Parcela "+ parcela+ " R$ " + valorParcela);
        }
    }
}
