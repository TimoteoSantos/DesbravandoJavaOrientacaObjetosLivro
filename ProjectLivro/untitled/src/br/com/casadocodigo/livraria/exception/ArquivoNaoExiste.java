package br.com.casadocodigo.livraria.exception;

public class ArquivoNaoExiste extends RuntimeException{

    public ArquivoNaoExiste(String mensagm){
        super(mensagm);
    }
}
