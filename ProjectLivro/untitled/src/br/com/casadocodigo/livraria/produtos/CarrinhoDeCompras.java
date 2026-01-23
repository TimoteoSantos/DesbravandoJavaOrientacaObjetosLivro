package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {
    //criando um atributo do tipo Produto privado a essa classe
    private Produto[] produtos = new Produto[3];

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

    public void getProdutos() {
        /* uma forma mais antiga de fazer um for

         */

        for (int i = 0; i < produtos.length; i++) {
            //uma exceção
            try {
              //se o codigo compilar sera execultado essa parte

                Produto produto = produtos[i];
                if (produto != null) {
                    System.out.println(produto.getValor());
                }
            }catch (ArrayIndexOutOfBoundsException e ){
                //se o codigo entrar aqui é porque o codigo encontrou uma exeção do tipo informado
                //nesse caso uma exceçao que verificao se o tamanho do array ultrapassou o limite

                System.out.println("Chamou uma exeção no index: " + i);
                e.printStackTrace();// lembre-se que a letra e é um objeto do tipo da exeção passada

            // podemos combinar diferentes tipos de exceçoes
            } catch (NullPointerException e){

                System.out.println("O array não foi instanciado");

            // tambem podemos ter uma area onde sempre sera excecultada independe da exceção acontecer ou nao
            }finally {
                //finaly é muito util quando precisamos inserrar alguma tarefa sempre que execultarmos o try com desconetar de um banco de dados ou arquivo
                System.out.println("Eu sempre escrevo essa mensagem");
            }

        /*
        //uma forma mais moderda de fazer um for
        for (Produto  produtos : produtos){ // tipo nome variavel e objeto
            if (produtos != null){
                System.out.println(produtos.getValor()
                );
        }
        */
            System.out.println("Fui execultado");
    }
}
}