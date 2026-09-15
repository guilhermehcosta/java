package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int age = 14;

        if(age < 15){
            System.out.println("Infantil");
        }
        else if(age >= 15 && age <= 18){
            System.out.println("Juvenil");
        }
        else{
            System.out.println("Adulto");
        }

    }
}

/*
Exercicio

Jogadores com menos de 15 anos devem fazer parte da cagetoria Infantil
Jogadores com entre 15 e 18 anos devem fazer parte da cagetoria Juvenil
Jogadores com mais de 18 anos devem fazer parte da cagetoria Adulto


*/