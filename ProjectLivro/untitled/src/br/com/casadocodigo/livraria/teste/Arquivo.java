package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.execoes.ArquivoNaoExiste;

import java.io.FileNotFoundException;

//algumas tarefas como abrir um arquivo ou acessar um banco de dados precisara
// usar exceções para garantir que existe uma estrutura que proteja a aplicação de possivel problemas
//como por exemplo nao encontra um arquivo ou um erro ao se conectar a um banco de dados

public class Arquivo {

    public static void main(String[] arquivos){
        try {

            new java.io.FileInputStream("arquivo.txt");

        }catch (FileNotFoundException e1){

        throw new ArquivoNaoExiste("o arquivo nao existe");

        }
    }
}
