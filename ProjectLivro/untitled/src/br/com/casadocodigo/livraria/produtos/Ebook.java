package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class Ebook  extends Livro implements Promocional, Acrescimo {

    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }
    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }
    public String getWaterMark(){
        return this.waterMark;
    }
    @Override
    public boolean aplicarDescontoDe(double porcentagem){

        if (porcentagem > 0.15) {
            return false;
        }
        this.setValor(this.getValor() - (this.getValor() * porcentagem));
        return true;
    }

    @Override
    public boolean acrescimo(double porcentagem) {
        if (porcentagem > 0.10) {
            return false;
        }
        this.setValor(this.getValor() + (this.getValor() * porcentagem));
        return true;
    }
}
