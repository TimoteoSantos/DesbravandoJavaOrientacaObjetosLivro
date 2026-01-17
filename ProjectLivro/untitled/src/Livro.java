/*essa classe implementa a interface Produtos suas classes filhas tambem serao do mesmo tipo Produto */
public abstract class Livro implements  Produto {

    private String nome;
    private String descricao;
    private double valor;
    private  String isbn;
    private Autor autor;//recebe um autor do tipo Autor

    //java permite multiplos construtores
    public Livro(Autor autor){
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

    void mostrarDetalhes(){

        System.out.println("[ Mostrando detalhes do livro ]");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " + descricao);
        System.out.println("valor: " + valor);
        System.out.println("ISBN: " + isbn);

        if (this.temAutor()){
            autor.mostrarDetalhes();;
        }
        System.out.println("--");
    }

    boolean temAutor(){
        return this.autor != null;
    }
}