package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        int day = 10;
        switch (day) {
            case 1:
                System.out.println("Fim de semana! (Domingo)");
                break;
            case 2:
                System.out.println("Dia útil. (Segunda)");
                break;
            case 3:
                System.out.println("Dia útil. (Terça)");
                break;
            case 4:
                System.out.println("Dia útil. (Quarta)");
                break;
            case 5:
                System.out.println("Dia útil. (Quinta)");
                break;
            case 6:
                System.out.println("Dia útil. (Sexta)");
                break;
            case 7:
                System.out.println("Fim de semana! (Sábado)");
                break;
            default:
                System.out.println("Dia inválido.");
        }
    }
}
