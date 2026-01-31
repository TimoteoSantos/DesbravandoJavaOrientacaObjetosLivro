package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.GerenciadorDeCupons;

public class ConsultaDeDescontoss {

    public static void main(String[] args){

        GerenciadorDeCupons gerenciador  = new GerenciadorDeCupons();

        if (gerenciador.validarCupom("CUP158")){
            System.out.println("Cupom de desconto válido");
        }else{
            System.out.println("Esse cupom não existe");
        }
    }
}
