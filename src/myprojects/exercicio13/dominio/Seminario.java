package myprojects.exercicio13.dominio;

public class Seminario {
    private String materia;
    private String tema;
    private Estudante[] ministrantes;
    private Local local;
    private Professor professorMinistrante;

    public Seminario(String materia) {
        this.materia = materia;
    }

    public Seminario(String materia, String tema) {
        this.materia = materia;
        this.tema = tema;
    }

    public Seminario(String materia, String tema, Estudante[] ministrantes) {
        this.materia = materia;
        this.tema = tema;
        this.ministrantes = ministrantes;
    }

    public void imprime(){
        System.out.println("Matéria: "+this.materia);
        System.out.println("Tema: "+this.tema);
        System.out.println("Local: "+local.getEndereco());
        System.out.println("Professor Responsável: "+professorMinistrante.getNome());
        System.out.println("\nMinistrantes: ");
        if(ministrantes == null){
            return;
        } else {
            for (Estudante ministrantes : ministrantes) {
                System.out.println(ministrantes.getNome());
            }

        }
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Estudante[] getMinistrantes() {
        return ministrantes;
    }

    public void setMinistrantes(Estudante[] ministrantes) {
        this.ministrantes = ministrantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessorMinistrante() {
        return professorMinistrante;
    }

    public void setProfessorMinistrante(Professor professorMinistrante) {
        this.professorMinistrante = professorMinistrante;
    }
}
