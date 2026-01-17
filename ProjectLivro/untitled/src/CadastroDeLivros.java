public class CadastroDeLivros {

    public static void main(String[] args){
        //dados do primeiro livro
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("096174563399");

        Livro livro = new LivroFisico(autor);
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        //livro.setIsbn("789");
        livro.setAutor(autor); //passando um objeto para um atributo que espera um tipo igual ao enviado

        livro.mostrarDetalhes();

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("09778776543");

        Livro outroLivro = new LivroFisico(autor);
        outroLivro.setNome("Lógica de programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(58.90);
        outroLivro.setIsbn("9999999");
        outroLivro.setAutor(outroAutor);//passando um objeto do tipo Autor

        //observar que nao estamos acessando diretamente estamos
        // acessando atraves do atributo ca classe Livro
        outroLivro.getAutor().mostrarDetalhes();

        System.out.println("------------------- EBOOK");
        Ebook ebook = new Ebook(outroAutor);
        ebook.setNome("Timóteo Santos");
        ebook.setValor(10.00);
        System.out.println(ebook.getValor());//o ebook consegue acessar os metodos e atributos da classe Livro

        /* perceber que temos um operador de negação
        isso significa que se o retorno NÃO FOR VERDADEIRO entrana primeira consição
        */

        //se o retorno não for true
        if(!ebook.aplicarDescontoDe(0.05)){
            System.out.println("Deconto do livro não foi aplicado foi maior que o limite o valor maximo permitido");

        //se for verdadeiro true
        }else {
            System.out.println("O valor do livro com desconto é de : " + ebook.getValor());
        }
        System.out.println(ebook.getValor());

    }
}