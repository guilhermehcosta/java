package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 4000;
        String messageDonate = "Vou doar 500 reais pra organização!";
        String messageNoDonate = "Ainda não tenho condições, mas vou ter!";
        String result = salary > 5000 ? messageDonate : messageNoDonate;



        System.out.println(result);
    }
}
