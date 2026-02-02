package br.com.casadocodigo.livraria.testes;

import br.com.casadocodigo.livraria.GerenciadorDeCupons;

public class ConsultaDeDescontoss {

    public static void main(String[] args){

        GerenciadorDeCupons gerenciador  = new GerenciadorDeCupons();

        Double desconto = gerenciador.validarCupom("CAB22") ;

        if (desconto > 0.00){

            System.out.println("Cupom de desconto válido");
            System.out.println("O valor do desconto é " + desconto);

        }else{
            System.out.println("Esse cupom não existe");
        }
    }
}
