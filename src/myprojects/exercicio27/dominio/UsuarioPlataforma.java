package myprojects.exercicio27.dominio;

public class UsuarioPlataforma {
    private String login;
    private String senha;
    private String dataCriacaoConta;
    private boolean ativo;
    private UsuarioPlataforma[] listaDeUsuarios;

    public void imprime(){
        System.out.println();
        System.out.println("Login de usuario: "+this.login);
        System.out.println("Senha de usuario: "+this.senha);
        System.out.println("Data de criação de conta: "+this.dataCriacaoConta);
        System.out.println("Conta ativa: "+this.ativo);
    }

    public UsuarioPlataforma(String login) {
        this.login = login;
    }

    public UsuarioPlataforma(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public UsuarioPlataforma(String login, String senha, String dataCriacaoConta) {
        this.login = login;
        this.senha = senha;
        this.dataCriacaoConta = dataCriacaoConta;
    }

    public UsuarioPlataforma(String login, String senha, String dataCriacaoConta, boolean ativo) {
        this.login = login;
        this.senha = senha;
        this.dataCriacaoConta = dataCriacaoConta;
        this.ativo = ativo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataCriacaoConta() {
        return dataCriacaoConta;
    }

    public void setDataCriacaoConta(String dataCriacaoConta) {
        this.dataCriacaoConta = dataCriacaoConta;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public UsuarioPlataforma[] getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(UsuarioPlataforma[] listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }
}
