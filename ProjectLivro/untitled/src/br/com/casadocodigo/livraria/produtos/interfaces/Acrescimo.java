package br.com.casadocodigo.livraria.produtos.interfaces;

@FunctionalInterface
public interface Acrescimo {

    boolean acrescimo(double porcentagem);

    default boolean acrescimoPadrao(){
       boolean aplicarAcrecimo =  acrescimo(0.1);

    if(aplicarAcrecimo){
            return true;
        }else{
            return false;
        }

    }
}

//classe feita para consolidar conhecimento nao faz parte do livro