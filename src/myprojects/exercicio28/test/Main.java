package myprojects.exercicio28.test;


import myprojects.exercicio28.dominio.FuncionarioHospital;
import myprojects.exercicio28.dominio.MedicoCirurgiao;

public class Main {
    static void main(String[] args) {
        FuncionarioHospital sergio = new FuncionarioHospital("Sergio", "25425", 5000, 40, "Emergencia");
        FuncionarioHospital clotilda = new FuncionarioHospital("Clotilda", "6356", 2000, 40, "Atendimento");

        MedicoCirurgiao medico1 = new MedicoCirurgiao(sergio, "NaoSeioQueÉIsso", "Órgaos", 1000, 20);

        medico1.imprime();
    }
}
