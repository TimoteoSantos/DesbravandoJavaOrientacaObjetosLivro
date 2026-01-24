package br.com.casadocodigo.livraria.execoes;

public class ArquivoNaoExiste extends RuntimeException{

    public ArquivoNaoExiste(String mensagm){
        super(mensagm);
    }
}
