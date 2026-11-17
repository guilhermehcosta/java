package myprojects.exercicio64.test;

import myprojects.exercicio64.dominio.Carro;
import myprojects.exercicio64.dominio.Moto;
import myprojects.exercicio64.dominio.Veiculo;

public class Main {
    static void main(String[] args) {
        Veiculo v1 = new Carro("Porshe", "Cayman", 600000, 2);
        Veiculo v2 = new Moto("Hornet", "Turbo", 40000, 8);
        Carro v3 = new Carro("Versa", "Unique", 50000, 4);

        System.out.println(v1.getMarca());
        System.out.println(v1.getModelo());
        System.out.println(v1.getValorFipe());
        System.out.println(v1.calcularSeguro());
        System.out.println();
        System.out.println(v2.getMarca());
        System.out.println(v2.getModelo());
        System.out.println(v2.getValorFipe());
        System.out.println(v2.calcularSeguro());
        System.out.println();
        System.out.println(v3.getNumeroPortas());
    }
}
