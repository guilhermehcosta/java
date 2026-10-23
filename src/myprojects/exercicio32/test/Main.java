package myprojects.exercicio32.test;

import myprojects.exercicio32.dominio.Cliente;
import myprojects.exercicio32.dominio.TipoCliente;

public class Main {
    static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jorel", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("IrmaoDoJorel", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente1.getNome()+" pagará "+cliente1.getTipoCliente().calcularImposto(100));
        System.out.println();
        System.out.println(cliente2);
        System.out.println(cliente2.getNome()+" pagará "+cliente2.getTipoCliente().calcularImposto(100));

    }
}
