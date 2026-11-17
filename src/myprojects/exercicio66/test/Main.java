package myprojects.exercicio66.test;

import myprojects.exercicio66.dominio.Dispositivo;
import myprojects.exercicio66.dominio.Notebook;
import myprojects.exercicio66.dominio.Smartphone;

public class Main {
    static void main(String[] args) {
        Dispositivo d1 = new Smartphone("Apple", 20000, 6000);
        Dispositivo d2 = new Notebook("Asus", 4000, "Rtx 2060 Super");

        System.out.println(d1);
        System.out.println(d1.calcularValorGarantia());
        System.out.println(d2);
        System.out.println(d2.calcularValorGarantia());
    }
}
