package br.com.casadocodigo.livraria.produtos;

public interface Promocional {

    boolean aplicarDescontoDe(double porcentagem);

    //toda casse que implementar essa interface terá acesso a esse metodo concreto
    default boolean aplicarDescontoDeDezPorcento(){
        return aplicarDescontoDe(0.1);
    }
}
