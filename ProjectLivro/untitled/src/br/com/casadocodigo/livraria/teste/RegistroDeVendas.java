package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.Editora;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

import java.util.Random;

public class RegistroDeVendas {

    public static void main(String[] args){

        //criando um objeto da classe Autor
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        Autor autorDois = new Autor();
        autorDois.setNome("Mauricio Aniche");

        //comprando se objetos sao iguais
        if (autor.equals(autorDois)){ //estamos chamando o atributo que esta sobrescrito na classe Autor

            System.out.println("Igual");

        }else{
            System.out.println("Diferente");
        }

        Editora editora = new Editora();
        editora.setCnpj("096");
        System.out.println("o cnpj da editora é" + editora.getCnpj());

        Editora editora1 = new Editora();
        editora1.setCnpj("096");

        System.out.println("o cnpj da editora01" + editora1.getCnpj());

        //verificar se o sao as mesmas editoras pelo cnpj
        if (editora.equals(editora1)){
            System.out.println("SAO A MESMA EDITORA");
        }else{
            System.out.println("NAO É A MESMA EDITORA");
        }

        //criando um novo produto nesse caso um Ebook
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("teste");
        fisico.setValor(10.00);

        if (fisico.aplicarDescontoDeDezPorcento()){
           // System.out.println(fisico.getValor());
        }

        //cria numeros aleatorios
        Random aleatorio = new Random();
        System.out.println(aleatorio.nextInt(10));

        Ebook ebook = new Ebook(autor);
        ebook.setNome("TIMOTEO SANTOS");
        ebook.setDescricao("O PORQUE DO JAVA");
        ebook.setValor(10.00);
        ebook.acrescimo(0.08);
        //System.out.println(ebook.getValor());
        ebook.toString();//esse metodo sofreu sobrecarga na classe Ebook

        //enviando para o carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.getProdutos();
        //System.out.println("Total: " + carrinho.getTotal());
    }
}