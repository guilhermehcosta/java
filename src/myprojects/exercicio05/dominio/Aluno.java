package myprojects.exercicio05.dominio;

public class Aluno {
    private String nome;
    private double notaMatematica;
    private double notaPortugues;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaMatematica(double notaMatematica) {
        if(notaMatematica >= 0.0 && notaMatematica <=10.0){
            this.notaMatematica = notaMatematica;
        } else {
            System.out.println("ERRO! Insira uma nota de Matematica válida!");
        }

    }

    public void setNotaPortugues(double notaPortugues) {
        if(notaPortugues >= 0.0 && notaPortugues <=10.0){
            this.notaPortugues = notaPortugues;
        } else {
            System.out.println("ERRO! Insira uma nota de Portugues válida!");
        }
    }

    public String getNome() {
        System.out.println(this.nome);
        return nome;
    }

    public double getNotaMatematica() {
        System.out.println("Matematica: "+this.notaMatematica);
        return notaMatematica;
    }

    public double getNotaPortugues() {
        System.out.println("Portugues: "+this.notaPortugues);
        return notaPortugues;
    }


}
