package myprojects.exercicio18.dominio;

public class Estudante {
    private String nome;
    private Materia[] historicoEscolar;
    private int totalDeMaterias = 0;
    private boolean aprovacao;

    public Estudante(String nome) {
        this.nome = nome;
        this.historicoEscolar = new Materia[totalDeMaterias];
    }

    public Estudante(String nome, Materia[] historicoEscolar) {
        this.nome = nome;
        this.historicoEscolar = historicoEscolar;
    }

    public void calcularMedia(){
        double soma = 0.0;
        for (int i = 0; i < historicoEscolar.length; i++) {
            soma += historicoEscolar[i].getNota();
        }
        double media = soma / 2.0;
        if(media >= 5){
            this.aprovacao = true;
        } else {
            this.aprovacao = false;
        }
        System.out.println("Media do aluno: "+media);
    }

    public void aprovacao(){
        if(this.aprovacao == true){
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }

    public void imprime(){
        System.out.println("\nNotas de "+this.nome+":");
        for (int i = 0; i < historicoEscolar.length; i++) {
            System.out.println(historicoEscolar[i].getNomeMateria());
            System.out.println(historicoEscolar[i].getNota());
        }

        calcularMedia();
        aprovacao();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Materia[] getHistoricoEscolar() {
        return historicoEscolar;
    }

    public void setHistoricoEscolar(Materia[] historicoEscolar) {
        this.historicoEscolar = historicoEscolar;
    }
}
