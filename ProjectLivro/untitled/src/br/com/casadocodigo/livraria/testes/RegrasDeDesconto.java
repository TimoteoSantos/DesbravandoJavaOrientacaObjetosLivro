package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.Autor;
import  br.com.casadocodigo.livraria.produtos.Ebook;

public class RegrasDeDesconto {

    public static void main(String[] args){

        Autor autor = new Autor();
        autor.setNome("Timóteo");
        autor.setEmail("santostimoteo@gmailcom");
        autor.setCpf("098777444666");

        Ebook livro = new Ebook(autor);
        livro.setValor(59.90);

    System.out.println("Valor atual: " + livro.getValor());

    if (!livro.aplicarDescontoDe(0.1)){

        System.out.println("Desconto não pode ser maior que 30%");
    }else{
        System.out.println("Valor com desconto: " + livro.getValor());
    }
    }
}
