package myprojects.exercicio03.dominio;

public class Usuario {
    private String email    ;
    private String senha;

    public String getEmail() {
        System.out.println(email);
        return email;
    }

    public String getSenha() {
        System.out.println(senha);
        return senha;
    }

    public void setEmail(String email) {
        if(email.contains("@")){
            this.email = email;
        } else {
            System.out.println("Email inválido.");
        }

    }

    public void setSenha(String senha) {
        if(senha.length() >= 6){
            this.senha = senha;
        } else {
            System.out.println("A senha deve conter pelo menos 6 caracteres.");
        }

    }
}
