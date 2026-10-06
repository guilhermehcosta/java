package myprojects.exercicio13.dominio;

public class Professor {
    private String nome;
    private Seminario[] seminariosMinistrantes;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, Seminario[] seminariosMinistrantes) {
        this.nome = nome;
        this.seminariosMinistrantes = seminariosMinistrantes;
    }

    public void imprime(){
        System.out.println("Professor: "+this.nome);
        System.out.println("Seminários Ministrantes: ");
        if(seminariosMinistrantes == null){
            return;
        } else {
            for (Seminario seminariosMinistrantes : seminariosMinistrantes) {
                System.out.println(seminariosMinistrantes.getTema());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminariosMinistrantes() {
        return seminariosMinistrantes;
    }

    public void setSeminariosMinistrantes(Seminario[] seminariosMinistrantes) {
        this.seminariosMinistrantes = seminariosMinistrantes;
    }

}
