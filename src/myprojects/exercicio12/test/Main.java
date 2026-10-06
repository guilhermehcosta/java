package myprojects.exercicio12.test;

import myprojects.exercicio12.dominio.Departamento;
import myprojects.exercicio12.dominio.Professor;

public class Main {
    static void main(String[] args) {
        Departamento setorTecnologia = new Departamento("Tecnologia");
        Professor Jelberson = new Professor("Jelberson");
        Professor Claudia = new Professor("Claudia");
        Professor Ana = new Professor("Ana");
        Professor Mathias = new Professor("Mathias");

        Professor[] DepartamentoTecnologia = {Jelberson, Claudia, Ana, Mathias};

        Jelberson.setDepartamentoLotacao(setorTecnologia);
        setorTecnologia.setProfessores(DepartamentoTecnologia);

        setorTecnologia.imprime();
    }
}
