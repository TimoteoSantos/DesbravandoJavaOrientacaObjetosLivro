package br.com.casadocodigo.livraria;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GerenciadorDeCupons {
    //quando queremos criar uma lista sem repetiocoes usamos o Set<>
    private Set<String> cupons ;

    public GerenciadorDeCupons(){

        this.cupons = new HashSet<>();
        cupons.addAll(Arrays.asList(
          "CUPO74", "CUP158", "CUP14", "CUP52", "CUP21",
          "CUP221", "CUP91", "CUP327", "CUP410", "CUP275",
          "CUP484", "CUP207", "CUP96", "CUP119", "CUP174",
          "CUP291", "CUP1", "CUP115"
        ));
    }

    public boolean validarCupom(String cupom){// entender que uma String já é um objeto
        //aqui retonar o retorno do metodo contains() do objeto que o chamou ou seja do this
        return this.cupons.contains(cupom);// estou passando um objeto mas String é um objeto
    }
}
