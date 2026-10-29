package myprojects.exercicio45.test;

import myprojects.exercicio45.dominio.CarroPremium;
import myprojects.exercicio45.dominio.MotoEntrega;
import myprojects.exercicio45.dominio.VanCompartilhada;

public class Main {
    static void main(String[] args) {
        CarroPremium carroPremium = new CarroPremium("20u4r5wej", "Jelbertson");
        MotoEntrega motoEntrega = new MotoEntrega("982eh9pi", "Jair");
        VanCompartilhada vanCompartilhada = new VanCompartilhada("924ruoi2", "Noir");

        System.out.println(carroPremium);
        System.out.println(motoEntrega);
        System.out.println(vanCompartilhada);
    }
}
