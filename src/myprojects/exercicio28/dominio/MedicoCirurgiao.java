package myprojects.exercicio28.dominio;

public class MedicoCirurgiao extends FuncionarioHospital {
    private String crm;
    private String especialidadeCirurgica;
    private double adicionalInsalubridade;
    private int quantidadeCirurgiaMes;
    private FuncionarioHospital funcionarioHospital;

    public void imprime(){
        super.imprime();
        System.out.println();
        System.out.println("crm: "+this.crm);
        System.out.println("Especialidade Cirurgica: "+this.especialidadeCirurgica);
        System.out.println("Adicional de Insalubridade: "+this.adicionalInsalubridade);
        System.out.println("Quantidade de Cirurgias no mês: "+this.quantidadeCirurgiaMes);
        salarioTotal();
    }

    public void salarioTotal(){
        double salarioBase = super.getSalarioBase();
        double soma = salarioBase + this.adicionalInsalubridade;
        System.out.println();
        System.out.println("Salário total: R$"+soma);
    }

    public MedicoCirurgiao(FuncionarioHospital funcionarioHospital, String crm) {
        super(funcionarioHospital.getNome(), funcionarioHospital.getCpf(), funcionarioHospital.getSalarioBase(), funcionarioHospital.getCargaHorariaSemanal(), funcionarioHospital.getSetorDeTrabalho());
        this.crm = crm;
    }

    public MedicoCirurgiao(FuncionarioHospital funcionarioHospital, String crm, String especialidadeCirurgica) {
        super(funcionarioHospital.getNome(), funcionarioHospital.getCpf(), funcionarioHospital.getSalarioBase(), funcionarioHospital.getCargaHorariaSemanal(), funcionarioHospital.getSetorDeTrabalho());        this.crm = crm;
        this.especialidadeCirurgica = especialidadeCirurgica;
    }

    public MedicoCirurgiao(FuncionarioHospital funcionarioHospital, String crm, String especialidadeCirurgica, double adicionalInsalubridade) {
        super(funcionarioHospital.getNome(), funcionarioHospital.getCpf(), funcionarioHospital.getSalarioBase(), funcionarioHospital.getCargaHorariaSemanal(), funcionarioHospital.getSetorDeTrabalho());        this.crm = crm;
        this.especialidadeCirurgica = especialidadeCirurgica;
        this.adicionalInsalubridade = adicionalInsalubridade;
    }

    public MedicoCirurgiao(FuncionarioHospital funcionarioHospital, String crm, String especialidadeCirurgica, double adicionalInsalubridade, int quantidadeCirurgiaMes) {
        super(funcionarioHospital.getNome(), funcionarioHospital.getCpf(), funcionarioHospital.getSalarioBase(), funcionarioHospital.getCargaHorariaSemanal(), funcionarioHospital.getSetorDeTrabalho());        this.crm = crm;
        this.especialidadeCirurgica = especialidadeCirurgica;
        this.adicionalInsalubridade = adicionalInsalubridade;
        this.quantidadeCirurgiaMes = quantidadeCirurgiaMes;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidadeCirurgica() {
        return especialidadeCirurgica;
    }

    public void setEspecialidadeCirurgica(String especialidadeCirurgica) {
        this.especialidadeCirurgica = especialidadeCirurgica;
    }

    public double getAdicionalInsalubridade() {
        return adicionalInsalubridade;
    }

    public void setAdicionalInsalubridade(double adicionalInsalubridade) {
        this.adicionalInsalubridade = adicionalInsalubridade;
    }

    public int getQuantidadeCirurgiaMes() {
        return quantidadeCirurgiaMes;
    }

    public void setQuantidadeCirurgiaMes(int quantidadeCirurgiaMes) {
        this.quantidadeCirurgiaMes = quantidadeCirurgiaMes;
    }
}
