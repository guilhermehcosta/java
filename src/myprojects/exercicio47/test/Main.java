package myprojects.exercicio47.test;

import myprojects.exercicio47.dominio.CajadoMagico;
import myprojects.exercicio47.dominio.ElementosMagicos;
import myprojects.exercicio47.dominio.Espada;

public class Main {
    static void main(String[] args) {
        Espada espada = new Espada("Diamond_Sword", 10, 5);
        CajadoMagico cajadoMagico = new CajadoMagico("Cajado_Mágico", 5, ElementosMagicos.AGUA);

        espada.atacar();
        cajadoMagico.atacar();
    }
}
