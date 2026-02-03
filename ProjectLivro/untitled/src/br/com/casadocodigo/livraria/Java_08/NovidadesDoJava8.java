package br.com.casadocodigo.livraria.Java_08;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.ComparadorPorNome;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Comparator.comparing;

public class NovidadesDoJava8 {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodigo Turini");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O.O.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Lvro de Ruby");

        List<Livro> livros = Arrays.asList(javaoo, java8);


        //USANDO O ALGORITMO SORT ENTENDER QUE ELE MANIPULA A LISTA INTERNAMENTE

        //comparando usando uma classe
       // Collections.sort(livros, new ComparadorPorNome());


        //comparando usando lambdas ou seja esse codigo faz a mesma coisa que o codigo acima
        //porem ultliza expressoes lambdas
        livros.sort((l1, l2) -> l2.getNome().compareTo(l1.getNome()));

        //outra forma mais simples com lambas
        livros.sort(comparing(l -> l.getNome()));


        //usando method reference
        //se a expressao for l -> l.getNome() podemos usar a expressao lambdas a seguir
        livros.sort(comparing(Livro::getNome));

        //TRABALHANDO COM FOR

        //aqui os livros ja sofreram as manipulacoes do sort
        for(Livro livro : livros){
            System.out.println(livro.getNome());
        }

        //forma de percorrer uma lista no java 8
        livros.forEach(l -> System.out.println(l.getNome()));
    }
}