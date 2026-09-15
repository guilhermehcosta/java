package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double salary = 4700.00;

        String messageIsent = "Salário isento de imposto de renda!";

        String message7Percent = "Imposto de 7,5% do salário.";
        double impost7PercentDeduzed = (salary * 7.5) / 100;
        double impost7Percent = impost7PercentDeduzed - 182.16;

        String message15Percent = "Imposto de 15% do salário.";
        double impost15PercentDeduzed = (salary * 15.0) / 100;
        double impost15Percent = impost15PercentDeduzed - 394.16;

        String message22Percent = "Imposto de 22,5% do salário.";
        double impost22PercentDeduzed = (salary * 22.5) / 100;
        double impost22Percent = impost22PercentDeduzed - 675.49;

        String message27Percent = "Imposto de 27,5% do salário.";
        double impost27PercentDeduzed = (salary * 27.5) / 100;
        double impost27Percent = impost27PercentDeduzed - 908.73;

        String finalMessage;
        double totalImpost = 0.0;


        if(salary <= 2428.80){
            finalMessage =  messageIsent;

        } else if(salary <= 2826.65){
            finalMessage =  message7Percent;
            totalImpost = impost7Percent;

        } else if(salary <= 3751.05){
            finalMessage =  message15Percent;
            totalImpost = impost15Percent;

        } else if(salary <= 4664.68){
            finalMessage =  message22Percent;
            totalImpost = impost22Percent;

        } else {
            finalMessage =  message27Percent;
            totalImpost = impost27Percent;

        }

        System.out.println(finalMessage);
        System.out.println(totalImpost);
    }
}
