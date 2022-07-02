package classes;

import java.util.Scanner;

public class Livro extends Item{

    private String autor;
    private int qtdePaginas;
    private int anoPublicacao;
    private int edicao;

    // GETTER & SETTER

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void montarDetalhes(Scanner in ) {
        System.out.print("Informe o nome do autor: ");
        this.setAutor(in.nextLine());
        System.out.print("Informe a quantidade de páginas: ");
        this.setQtdePaginas(in.nextInt());
        System.out.print("Informe o ano de publicação: ");
        this.setAnoPublicacao(in.nextInt());
        System.out.print("Informe a edição: ");
        this.setEdicao(in.nextInt());
        in.nextLine();
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Quantidade de páginas: "+this.getQtdePaginas());
        System.out.println("Ano de publicação: "+this.getAnoPublicacao());
        System.out.println("Edição: "+this.getEdicao());
    }
}
