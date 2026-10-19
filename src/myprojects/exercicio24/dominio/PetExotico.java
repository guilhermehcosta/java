package myprojects.exercicio24.dominio;

public class PetExotico extends Animal{
    private String paisDeOrigem;
    private boolean necessitaLicencaIbama;
    private String tipoAlimentacao;

    public void imprime(){
        super.imprime();
        System.out.println("País de Origem: "+ this.paisDeOrigem);
        System.out.println("Necessita de Licença: "+ this.necessitaLicencaIbama);
        System.out.println("Tipo de Alimentação: "+ this.tipoAlimentacao);
    }

    public PetExotico(Animal animal, String paisDeOrigem) {
        super(animal.getNome(), animal.getIdade(), animal.getPeso(), animal.getRaca());
        this.paisDeOrigem = paisDeOrigem;
    }

    public PetExotico(Animal animal, String paisDeOrigem, boolean necessitaLicencaIbama ) {
        super(animal.getNome(), animal.getIdade(), animal.getPeso(), animal.getRaca());
        this.paisDeOrigem = paisDeOrigem;
        this.necessitaLicencaIbama = necessitaLicencaIbama;
    }

    public PetExotico(Animal animal, String paisDeOrigem, boolean necessitaLicencaIbama , String tipoAlimentacao) {
        super(animal.getNome(), animal.getIdade(), animal.getPeso(), animal.getRaca());
        this.paisDeOrigem = paisDeOrigem;
        this.necessitaLicencaIbama = necessitaLicencaIbama;
        this.tipoAlimentacao = tipoAlimentacao;
    }


}
