package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // pessoas com mais de 25 anos e com salario acima de 3.400 estao dentro da lei
        // pessoas com mais de 50 anos e com salario acima de 5.000 estao dentro da lei

        double contaCorrente = 300;
        double cofrinho = 10000;
        double playStation = 3700;

        boolean daPraComprar = contaCorrente > playStation || cofrinho > playStation;

        System.out.println(daPraComprar);

    }
}


