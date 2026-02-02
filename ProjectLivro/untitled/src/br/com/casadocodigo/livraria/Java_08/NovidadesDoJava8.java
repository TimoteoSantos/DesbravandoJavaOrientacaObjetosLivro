package br.com.casadocodigo.livraria.Java_08;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.ComparadorPorNome;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

        Collections.sort(livros, new ComparadorPorNome());

        for(Livro livro : livros){

            System.out.println(livro.getNome());
        }
    }
}
