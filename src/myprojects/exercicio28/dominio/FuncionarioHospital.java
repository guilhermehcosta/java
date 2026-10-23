package myprojects.exercicio28.dominio;

public class FuncionarioHospital {
    private String nome;
    private String cpf;
    private double salarioBase;
    private int cargaHorariaSemanal;
    private String setorDeTrabalho;

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Salario Base: "+this.salarioBase);
        System.out.println("Carga-Horaria Semanal: "+this.cargaHorariaSemanal);
        System.out.println("Setor: "+this.setorDeTrabalho);
    }

    public FuncionarioHospital(String nome) {
        this.nome = nome;
    }

    public FuncionarioHospital(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public FuncionarioHospital(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public FuncionarioHospital(String nome, String cpf, double salarioBase, int cargaHorariaSemanal) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public FuncionarioHospital(String nome, String cpf, double salarioBase, int cargaHorariaSemanal, String setorDeTrabalho) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.setorDeTrabalho = setorDeTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public String getSetorDeTrabalho() {
        return setorDeTrabalho;
    }

    public void setSetorDeTrabalho(String setorDeTrabalho) {
        this.setorDeTrabalho = setorDeTrabalho;
    }
}
