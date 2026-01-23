package br.com.casadocodigo.livraria.exception;

public class AutorNuloException extends RuntimeException{

    public AutorNuloException(String mensagem){
        //perceba o seguint esta enviando para o RuntimeExcepton a mensagem recebida ja que ela é nossa super
        super(mensagem);
    }
}