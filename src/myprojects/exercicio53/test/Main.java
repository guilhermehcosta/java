package myprojects.exercicio53.test;

import myprojects.exercicio53.dominio.CaminhaoCegonha;
import myprojects.exercicio53.dominio.DroneEntrega;
import myprojects.exercicio53.dominio.MotoBoy;

public class Main {
    static void main(String[] args) {
        CaminhaoCegonha caminhaoCegonha = new CaminhaoCegonha();
        DroneEntrega droneEntrega = new DroneEntrega();
        MotoBoy motoBoy = new MotoBoy();

        System.out.println(motoBoy.calcularCustoFrete(20));
    }
}
