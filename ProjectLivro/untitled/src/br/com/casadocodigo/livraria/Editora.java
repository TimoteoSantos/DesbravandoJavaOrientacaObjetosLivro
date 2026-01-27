package br.com.casadocodigo.livraria;

public class Editora {

    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals (Object obj){

        //garantir que seja um Autor
        if (!(obj instanceof  Editora)) return  false;//forma minima de fazer um if que se o obj nao for Autor retorna um false encerrando o metodo
        //converter o objeto recebido em um Autor
        Editora editora = (Editora) obj;
        //compara se o cnpj da editora atual é igual ao que foi chamado pelo metodo equals
        return this.cnpj.equals(editora.cnpj);
    }
}
