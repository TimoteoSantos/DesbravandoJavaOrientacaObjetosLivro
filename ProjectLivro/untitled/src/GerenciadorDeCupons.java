import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class GerenciadorDeCupons {

    private List<String> cupons ;//temos um atibuto chamado cupons que internamente tem uma List<String>

    public GerenciadorDeCupons(){
        //usando o metodo da classe Array do pacote java.util adicionar elementos ao nosso array
        this.cupons = Arrays.asList(
          "CUPO74", "CUP158", "CUP14", "CUP52", "CUP21",
          "CUP221", "CUP91", "CUP327", "CUP410", "CUP275",
          "CUP484", "CUP207", "CUP96", "CUP119", "CUP174",
          "CUP291", "CUP1", "CUP115"
        ); //note que passamos no array os Stings separados por virgula
    }
    public boolean validarCupom(String cupom){// entender que uma String já é um objeto
        //aqui retonar o retorno do metodo contains() do objeto que o chamou ou seja do this
        return this.cupons.contains(cupom);// estou passando um objeto mas String é um objeto
    }
}
