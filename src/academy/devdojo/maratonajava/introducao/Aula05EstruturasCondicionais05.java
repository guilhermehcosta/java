package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {

        int dia = 7;

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");

            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;

            default:
                System.out.println("Opção invalida");
        }

        char sexo = 'V';
        switch (sexo){
            case 'M':
                System.out.println("Sexo Masculino");
                break;

            case 'F':
                System.out.println("Sexo Feminino");
                break;

                default:
                    System.out.println("Identificador de sexo inválido");
                    break;
        }
    }
}
