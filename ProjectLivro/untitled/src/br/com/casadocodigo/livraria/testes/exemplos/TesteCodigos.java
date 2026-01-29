package br.com.casadocodigo.livraria.testes.exemplos;

//estudando ordenacao
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.interfaces.Produto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCodigos {

    public static void main(String[] args) {

        //criando uma lista de nomes
        //o Lis<> é uma interface ao usa-la estamos usando seus metodos abstratos que sao implemantados na classe
        //que estamos instanciando no caso o ArrayList<>() que recebe um tipo generico como ja passamos no List<String>
        //estamos usando o operador diamante que indica que usaremos o tipo passado anteriormente no List<String>;
        //esse conceiro é chamado de programar para interface

        List<String> nomes = new ArrayList<>();

        //adicionamos valores ao nosso ArrayLis
        nomes.add("Rodrigo Turini");
        nomes.add("Adriano Almeida");
        nomes.add("Paulo Silveira");

        Collections.sort(nomes); // estamos ordenando pelo nome em ordem alfabetica
        System.out.println(nomes);//preceba que estamos usando o toString do List que na verdade esta na classe AbstractCollection

        //passando a interface para a list assim aceitara todos que a implementam
        List<Produto> produtos = new ArrayList<>();

        //criando um autor
        Autor autor = new Autor();
        autor.setNome("Timoteo");

        //criando um ebook que implementa a interface Produto
        Ebook ebook = new Ebook(autor);

        //adidionando um ebook na lista porque ele implenta uma Produto isso significa que ele pode conviver nessa lista
        produtos.add(ebook);

        //ordenar uma lista de objetos
        Collections.sort(produtos);

    }
}
