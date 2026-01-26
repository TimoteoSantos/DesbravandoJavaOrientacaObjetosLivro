package br.com.casadocodigo.livraria;

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

    public void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do autor");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("CPF " + cpf);
    }

    // sobrescrever o metodo equals da classe object
    @Override
    public boolean equals(Object obj){

        //verificar se a instancia obj é do tipo Autor se nao for
        // retornar false e o codigo para a compilacao desse metodo
        if (!(obj instanceof  Autor)) return false;

        //se foi passado um objeto do tipo Autor seguir a diante

        //convertendo o objeto object em Autor
        Autor outro  = (Autor) obj;
        //retornando o retorno do metodo equals comparando
        // o atributo nome do objeto que o chamou com o que foi passado
        return this.nome.equals(outro.nome);
    }
}
