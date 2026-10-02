package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro.setVelocidadeLimite(160);

        Carro carro1 = new Carro("Elantra", 180);
        Carro carro2 = new Carro("Versa", 150);
        Carro carro3 = new Carro("Onix", 120);


        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
