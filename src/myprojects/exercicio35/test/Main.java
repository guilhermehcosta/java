package myprojects.exercicio35.test;

import myprojects.exercicio35.dominio.Assinatura;
import myprojects.exercicio35.dominio.PlanoStreaming;

public class Main{
    static void main(String[] args) {
        Assinatura cleber = new Assinatura("Cleber", PlanoStreaming.PREMIUM);

        System.out.println(cleber);
        System.out.println("Limite de telas simultâneas: "+cleber.getPlanoStreaming().calcularLimiteTelas());
        System.out.println("Telas 4K: "+cleber.getPlanoStreaming().oferece4k());
    }
}
