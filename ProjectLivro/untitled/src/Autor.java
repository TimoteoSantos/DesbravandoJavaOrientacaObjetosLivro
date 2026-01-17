public class Autor {

    private String nome;
    private String email;
    private String cpf;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }

    void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do autor");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF " + cpf);
    }
}
