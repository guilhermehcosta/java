package myprojects.exercicio40.test;

import myprojects.exercicio40.dominio.Plantao;
import myprojects.exercicio40.dominio.TipoPlantao;

public class Main {
    static void main(String[] args) {
        Plantao plantao1 = new Plantao("Jair", TipoPlantao.DIURNO_NORMAL);
        Plantao plantao2 = new Plantao("Valdemir", TipoPlantao.NOTURNO);
        Plantao plantao3 = new Plantao("Flavio", TipoPlantao.FINAL_DE_SEMANA);
        Plantao plantao4 = new Plantao("Inácio", TipoPlantao.FERIADO);

        System.out.println(plantao1);
        System.out.println(plantao1.getTipoPlantao().calcularValorHora(20));

        System.out.println(plantao2);
        System.out.println(plantao2.getTipoPlantao().calcularValorHora(20));


        System.out.println(plantao3);
        System.out.println(plantao3.getTipoPlantao().calcularValorHora(20));


        System.out.println(plantao4);
        System.out.println(plantao4.getTipoPlantao().calcularValorHora(20));


    }
}
