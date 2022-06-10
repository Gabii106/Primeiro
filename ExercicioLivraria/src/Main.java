import classes.DVD;
import classes.Estante;
import classes.Item;
import classes.Livro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Livro l = new Livro();
        l.setTitulo("Harry Potter e a Autora Transfobica");
        l.avaliar();
        l.avaliar();
        l.avaliar();
        System.out.println(l.getTotalRanting());*/
        Scanner in = new Scanner(System.in);
        Estante e = new Estante(5);
        Item item = null;
        System.out.println("---MENU PRINCIPAL---");
        System.out.println("(1) - Adicionar um item");
        System.out.println("(2) - Ver a quantidade de itens");
        System.out.println("(3) - Verificar se a estante está cheia");
        System.out.println("(4) - Buscar um item");
        System.out.println("(5) - Remover um item");
        System.out.println("(6) - Fazer uma avaliação sobre um item");
        String escolhido = in.nextLine();

        switch (escolhido){

        }
        for (int i = 0; i < 5; i++) {
            System.out.println("DVD ou livro? ");
            String escolha = in.nextLine();

            if (escolha.equalsIgnoreCase("livro")) {
                item = new Livro();
                Livro l = ((Livro) item);
                System.out.println("Informe o nome do autor: ");
                l.setAutor(in.nextLine());
                System.out.println("Informe a quantidade de páginas: ");
                l.setQtdePaginas(in.nextInt());
                in.nextLine();
                System.out.println("Informe o ano de publicação: ");
                l.setAnoPublicacao(in.nextInt());
                in.nextLine();
                System.out.println("Informe a edição: ");
                l.setEdicao(in.nextInt());
                in.nextLine();
                e.adicionarItem(l);
            } else if (escolha.equalsIgnoreCase("dvd")) {
                item = new DVD();
                DVD d = ((DVD) item);
                System.out.println("Informe o nome do diretor: ");
                d.setDiretor(in.nextLine());
                System.out.println("Informe a duração: ");
                d.setDuração(in.nextDouble());
                in.nextLine();
                System.out.println("Informe o ano de lançamento: ");
                d.setAnoLancamento(in.nextInt());
                in.nextLine();
                e.adicionarItem(d);
            } else {
                System.err.println("Escolha inválida!");
                i--;
                continue;
            }

            System.out.println("Informe o titulo: ");
            item.setTitulo(in.nextLine());
            System.out.println("Informe o genero: ");
            item.setGenero(in.nextLine());

            for (int c = 0; c < 5; c++) {
                if (e.getItens()[c] != null) {
                    System.out.println(e.getItens()[c].getTitulo());
                }
                System.out.println("A quantidade de itens é " + e.quantidadeItens());
            }
        }
    }

}
