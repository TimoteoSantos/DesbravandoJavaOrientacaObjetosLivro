package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {
    //um atributo que guarda o total
    private double total;

        //envio para adicionar qualquer produto independente do seu tipo Ebook Livro fisico ou Revista
        public void adiciona(Produto produto){

        System.out.println("Adicionando: " + produto);
        total += produto.getValor();// todos os objetos passados tem esse metodo porque foram obrigados pela interface Produto
            //que é o tipo do objeto passado
    }
    public double getTotal(){
        return total;
    }
}
