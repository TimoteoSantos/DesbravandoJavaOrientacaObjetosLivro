package br.com.casadocodigo.livraria.produtos.interfaces;

public interface Produto extends Comparable<Produto>{

    double getValor(); // todas as classes que implementarem essa interface presaram ter um metodo com essa assinatura

}
//uma interface nao tem metodos concretos nem atributos