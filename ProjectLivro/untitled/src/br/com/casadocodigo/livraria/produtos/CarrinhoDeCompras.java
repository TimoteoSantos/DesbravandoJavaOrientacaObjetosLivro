package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {
    //criando um atributo do tipo Produto privado a essa classe
    private Produto[] produtos = new Produto[10];
    //um atributo que guarda o total
    private double total;
    private int contador = 0;

        //envio para adicionar qualquer produto independente do seu tipo Ebook Livro fisico ou Revista
        public void adiciona(Produto produto){
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto; //adicionar na posicao contador um produto recebido no argumento
        contador++;// andar uma posição do contador atual
        total += produto.getValor();// todos os objetos passados tem esse metodo porque foram obrigados pela interface Produto
            //que é o tipo do objeto passado
    }
    public double getTotal(){
        return total;
    }
}
