public class LivroFisico extends  Livro implements Promocional{

    public LivroFisico(Autor autor){
        super(autor);
    }

    public double getTaxaImpressao(){
        return super.getValor() * 0.05;
    }
    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if (porcentagem > 0.3){
            return false;//nesse ponto o sistema para a excuxao e sai desse metodo
        }

        this.setValor(this.getValor() - (this.getValor() * porcentagem));
        return  true;//se aplicou o desconto retornar verdadeiro
    }
}
