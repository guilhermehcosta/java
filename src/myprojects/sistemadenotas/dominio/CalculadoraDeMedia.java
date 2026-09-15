package myprojects.sistemadenotas.dominio;

public class CalculadoraDeMedia {

        public void Media(String name, double n1, double n2, double n3, double n4, double n5, double n6){
        double soma = n1 + n2 + n3 + n4 + n5 + n6;
        double divisor = soma / 6;

        double result = Math.floor(divisor);

            System.out.println("\nMedia do "+name+": "+result);

            if(result >= 8){
                System.out.println("Aluno Aprovado");
            } else {
                System.out.println("Aluno Reprovado");
            }
        };
}
