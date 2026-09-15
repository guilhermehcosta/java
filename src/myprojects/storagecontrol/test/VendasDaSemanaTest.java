package myprojects.storagecontrol.test;

import myprojects.storagecontrol.dominio.VendasDaSemana;

import java.util.Scanner;

public class VendasDaSemanaTest {
    public static void main(String[] args) {

        // Estoque Original

        int sucoDeLaranja = 50;
        int salgadoAssado = 40;
        int sanduicheNatural = 30;

        String[] itensCadastrados = new String[3];


        // System.out.println("Itens cadastrados: ");
        // for (int i = 0; i < sucoDeLaranja; i++) {

        // }



        /*




        int SucosdeLaranjaVendidosNaSegunda = 8;
        int SucosdeLaranjaVendidosNaTerca = 10;
        int SucosdeLaranjaVendidosNaQuarta = 12;
        int SucosdeLaranjaVendidosNaQuinta = 9;
        int SucosdeLaranjaVendidosNaSexta = 11;

        int salgadoAssadoVendidosNaSegunda = 6;
        int salgadoAssadoVendidosNaTerca = 8;
        int salgadoAssadoVendidosNaQuarta = 5;
        int salgadoAssadoVendidosNaQuinta = 7;
        int salgadoAssadoVendidosNaSexta = 6;

        int sanduicheNaturalVendidosNaSegunda = 3;
        int sanduicheNaturalVendidosNaTerca = 2;
        int sanduicheNaturalVendidosNaQuarta = 4;
        int sanduicheNaturalVendidosNaQuinta = 3;
        int sanduicheNaturalVendidosNaSexta = 3;


        int[] sucosDeLaranjaSemana = new int[5];
        sucosDeLaranjaSemana[0] = SucosdeLaranjaVendidosNaSegunda;
        sucosDeLaranjaSemana[1] = SucosdeLaranjaVendidosNaTerca;
        sucosDeLaranjaSemana[2] = SucosdeLaranjaVendidosNaQuarta;
        sucosDeLaranjaSemana[3] = SucosdeLaranjaVendidosNaQuinta;
        sucosDeLaranjaSemana[4] = SucosdeLaranjaVendidosNaSexta;

        int[] salgadoAssadoSemana = new int[5];
        salgadoAssadoSemana[0] = salgadoAssadoVendidosNaSegunda;
        salgadoAssadoSemana[1] = salgadoAssadoVendidosNaTerca;
        salgadoAssadoSemana[2] = salgadoAssadoVendidosNaQuarta;
        salgadoAssadoSemana[3] = salgadoAssadoVendidosNaQuinta;
        salgadoAssadoSemana[4] = salgadoAssadoVendidosNaSexta;

        int[] sanduicheNaturalSemana = new int[5];
        sanduicheNaturalSemana[0] = sanduicheNaturalVendidosNaSegunda;
        sanduicheNaturalSemana[1] = sanduicheNaturalVendidosNaTerca;
        sanduicheNaturalSemana[2] = sanduicheNaturalVendidosNaQuarta;
        sanduicheNaturalSemana[3] = sanduicheNaturalVendidosNaQuinta;
        sanduicheNaturalSemana[4] = sanduicheNaturalVendidosNaSexta;

         */

        VendasDaSemana sucos = new VendasDaSemana();
        VendasDaSemana salgados = new VendasDaSemana();
        VendasDaSemana sanduiches = new VendasDaSemana();


        Scanner scanner =  new Scanner(System.in);


        System.out.println("Quantidade de SUCOS vendidos na... segunda: ");
        sucos.segunda =  scanner.nextInt();

        System.out.println("Quantidade de SUCOS vendidos na... terça: ");
        sucos.terca =  scanner.nextInt();

        System.out.println("Quantidade de SUCOS vendidos na... quarta: ");
        sucos.quarta =  scanner.nextInt();

        System.out.println("Quantidade de SUCOS vendidos na... quinta: ");
        sucos.quinta =  scanner.nextInt();

        System.out.println("Quantidade de SUCOS vendidos na... sexta: ");
        sucos.sexta =  scanner.nextInt();



        System.out.println("Quantidade de SALGADOS vendidos na... segunda: ");
        salgados.segunda =  scanner.nextInt();

        System.out.println("Quantidade de SALGADOS vendidos na... terça: ");
        salgados.terca =  scanner.nextInt();

        System.out.println("Quantidade de SALGADOS vendidos na... quarta: ");
        salgados.quarta =  scanner.nextInt();

        System.out.println("Quantidade de SALGADOS vendidos na... quinta: ");
        salgados.quinta =  scanner.nextInt();

        System.out.println("Quantidade de SALGADOS vendidos na... sexta: ");
        salgados.sexta =  scanner.nextInt();



        System.out.println("Quantidade de SANDUICHES vendidos na... segunda: ");
        sanduiches.segunda =  scanner.nextInt();

        System.out.println("Quantidade de SANDUICHES vendidos na... terça: ");
        sanduiches.terca =  scanner.nextInt();

        System.out.println("Quantidade de SANDUICHES vendidos na... quarta: ");
        sanduiches.quarta =  scanner.nextInt();

        System.out.println("Quantidade de SANDUICHES vendidos na... quinta: ");
        sanduiches.quinta =  scanner.nextInt();

        System.out.println("Quantidade de SANDUICHES vendidos na... sexta: ");
        sanduiches.sexta =  scanner.nextInt();



        System.out.println("Vendas Semanais:");
        System.out.println("-------------------------------");
        System.out.println("Sucos");
        System.out.println("Segunda: " +  sucos.segunda);
        System.out.println("Terça: "  +  sucos.terca);
        System.out.println("Quarta: " +  sucos.quarta);
        System.out.println("Quinta: "  +  sucos.quinta );
        System.out.println("Sexta: "   +  sucos.sexta);
        System.out.println("-------------------------------");
        System.out.println("Salgados");
        System.out.println("Segunda: "  +  salgados.segunda);
        System.out.println("Terça: "   +  salgados.terca);
        System.out.println("Quarta: "   +  salgados.quarta);
        System.out.println("Quinta: "    +  salgados.quinta);
        System.out.println("Sexta: "    +  salgados.sexta);
        System.out.println("-------------------------------");
        System.out.println("Sanduiches");
        System.out.println("Segunda: "   +  sanduiches.segunda);
        System.out.println("Terça: "    +  sanduiches.terca);
        System.out.println("Quarta: "     +  sanduiches.quarta);
        System.out.println("Quinta: "      +  sanduiches.quinta);
        System.out.println("Sexta: "       +  sanduiches.sexta);





    }
}
/*

int somaDoSucos = 0;

        for (int i = 0; i < sucosDeLaranjaSemana.length; i++) {
            somaDoSucos += sucosDeLaranjaSemana[i];
        }

        int somaDosSalgados = 0;

        for (int i = 0; i < salgadoAssadoSemana.length; i++) {
            somaDosSalgados += salgadoAssadoSemana[i];
        }

        int somaDosSanduiches = 0;

        for (int i = 0; i < sanduicheNaturalSemana.length; i++) {
            somaDosSanduiches += sanduicheNaturalSemana[i];
        }

        int novoEstoqueSucos = sucoDeLaranja - somaDoSucos;
        int novoEstoqueSalgados = salgadoAssado - somaDosSalgados;
        int novoEstoqueSanduiches = sanduicheNatural - somaDosSanduiches;

        int[] produtosEmEstoque = new int[3];

        produtosEmEstoque[0] = novoEstoqueSucos;
        produtosEmEstoque[1] = novoEstoqueSalgados;
        produtosEmEstoque[2] = novoEstoqueSanduiches;

        String[] mensagemDeEstoqueRestante = new String[3];

        mensagemDeEstoqueRestante[0] = "Estoque restante de sucos: " + novoEstoqueSucos;
        mensagemDeEstoqueRestante[1] = "Estoque restante de salgados: " + novoEstoqueSalgados;
        mensagemDeEstoqueRestante[2] = "Estoque restante de sanduiches: " + novoEstoqueSanduiches;


        String[] mensagemDeVendasTotaisDaSemana = new String[3];
        mensagemDeVendasTotaisDaSemana[0] = "Soma dos sucos vendidos na semana: " + somaDoSucos;
        mensagemDeVendasTotaisDaSemana[1] = "Soma dos salgados vendidos na semana: " + somaDosSalgados;
        mensagemDeVendasTotaisDaSemana[2] = "Soma dos sanduiches vendidos na semana: " + somaDosSanduiches;

        for (int i = 0; i < mensagemDeVendasTotaisDaSemana.length; i++) {
            System.out.println(mensagemDeVendasTotaisDaSemana[i]);
        }


        for (int i = 0; i < mensagemDeEstoqueRestante.length; i++) {
            System.out.println(mensagemDeEstoqueRestante[i]);

        }

 */