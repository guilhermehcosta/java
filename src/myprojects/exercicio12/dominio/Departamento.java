package myprojects.exercicio12.dominio;

import myprojects.exercicio12.dominio.Professor;

public class Departamento {
    private String nomeSetor;
    private Professor[] professores;

    public Departamento(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public Departamento(String nomeSetor, Professor[] professores) {
        this.nomeSetor = nomeSetor;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println("Departamento: "+ this.nomeSetor);
        if(professores == null){
            return;
        } else {
            System.out.println("Professores: ");
            for (Professor professores : professores) {
                System.out.println(professores.getNome());
            }
        }

    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
