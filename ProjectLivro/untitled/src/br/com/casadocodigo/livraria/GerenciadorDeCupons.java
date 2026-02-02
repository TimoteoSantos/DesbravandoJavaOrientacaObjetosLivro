package br.com.casadocodigo.livraria;

import java.util.*;

public class GerenciadorDeCupons {

    //set<> não permite valores repetidos List<> permite
    private Map<String, Double> cupons;

    public GerenciadorDeCupons(){

        this.cupons = new HashMap<>();

        cupons.put("CAB11", 10.00);
        cupons.put("CAB22", 12.0);
        cupons.put("CAB33",13.00);
        cupons.put("CAB33", 14.0);
    }
    
    public Double validarCupom(String cupom){
        return this.cupons.get(cupom);
    }
}
