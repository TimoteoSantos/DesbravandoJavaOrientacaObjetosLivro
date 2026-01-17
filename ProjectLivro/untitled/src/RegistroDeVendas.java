public class RegistroDeVendas {

    public static void main(String[] args){

        //criando um objeto da classe Autor
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        //criando um novo produto nesse caso um Ebook
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("teste");
        fisico.setValor(10.00);

        if (fisico.aplicarDescontoDeDezPorcento()){
            System.out.println(fisico.getValor());
        }

        //enviando para o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        System.out.println("Total: " + carrinho.getTotal());
    }

}
