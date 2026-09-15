package academy.devdojo.maratonajava.introducao;

public class ExerciciosGeminiOperadoresLogicos {
    public static void main(String[] args) {


        double temperatura = 36.0;
        double frequenciaCardiaca = 90;
        double nivelDeOxigenacao = 93;

        double[] paciente = new double[3];
        paciente[0] = temperatura;
        paciente[1] = frequenciaCardiaca;
        paciente[2] = nivelDeOxigenacao;

        boolean riscoClinico = nivelDeOxigenacao < 92 && temperatura > 38.5;
        boolean temperaturaElevada = temperatura > 38.5;
        boolean oxigenacaoBaixa = nivelDeOxigenacao < 92;
        boolean frequenciaCardiacaAnormal = frequenciaCardiaca < 60 || frequenciaCardiaca > 100;

        for(int i = 0; i < paciente.length; i++){

        if(riscoClinico){
            System.out.println("ALERTA VERMELHO: Risco Clínico!");
            break;
        }
        if(temperaturaElevada){
            System.out.println("ALERTA AMARELO: Temperatura Elevada!");
            break;
        }
        if(oxigenacaoBaixa){
            System.out.println("ALERTA AMARELO: Oxigenação Baixa!");
            break;
        }
        if(frequenciaCardiacaAnormal){
            System.out.println("ALERTA AMARELO: Atenção aos batimentos!");
            break;
        }
        else {
            System.out.println("Sinais Vitais Estaveis!");
            break;
        }

        }


    }
}
