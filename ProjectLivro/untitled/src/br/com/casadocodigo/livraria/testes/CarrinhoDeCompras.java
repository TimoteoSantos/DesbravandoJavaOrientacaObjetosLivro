package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.produtos.interfaces.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //criando um atributo do tipo Produto privado a essa classe
    private List<Produto> produtos;

    //um atributo que guarda o total
    private double total;
    private int contador = 0;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adiciona(Produto produto) {
        this.produtos.add(produto);
    }

    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    }
    public List<Produto> getProduto(){
        return  produtos;
    }
}