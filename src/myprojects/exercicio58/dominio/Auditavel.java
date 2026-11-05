package myprojects.exercicio58.dominio;

public interface Auditavel {
    default void gerarLog(){
        System.out.println("Auditoria não implementada especificamente. Log padrão gerado.");
    }
}
