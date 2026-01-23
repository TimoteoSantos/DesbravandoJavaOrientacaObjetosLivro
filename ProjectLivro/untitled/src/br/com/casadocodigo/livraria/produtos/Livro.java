package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;

/*essa classe implementa a interface Produtos suas classes filhas tambem serao do mesmo tipo Produto */
public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private  String isbn;
    private Autor autor;//recebe um autor do tipo Autor

    //java permite multiplos construtores
    public Livro(Autor autor){
        //verificar se o autor é null se for lançar uma exceção
        if (autor == null){

            //estamos chamando a classe responsavel por tratar esse erro em especifico
            throw new AutorNuloException("O autor não pode ser null");// enviando a mensagem para o construtor responsavel por tratar esse erro dessa classe
        }
        this();//chamando outro construtor que esta sem parametros
        this.autor = autor;

    }
    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void mostrarDetalhes(){

        System.out.println("[ Mostrando detalhes do livro ]");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()){
            this.autor.mostrarDetalhes();;
        }
        System.out.println("--");
    }

    boolean temAutor(){
        return this.autor != null;
    }
}