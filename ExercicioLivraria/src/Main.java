import classes.*;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Estante e = new Estante(5);
        boolean loop = true;
        while (loop) {
            EMenu escolhido = escolherOpcao();

            switch (escolhido) {
                case SAIR:
                    loop = false;
                    System.out.println("Programa finalizado!");
                    break;
                case ADICIONAR_ITEM:
                    adicionarItem(e);
                    break;
                case BUSCAR_ITEM:
                    buscarItem(e);
                    break;
                case REMOVER_ITEM:
                    removerItem(e);
                    break;
                case MOSTRAR_ITENS:
                    mostrarEstante(e);
                    break;

                default:
                    System.out.println("Selecione uma opção válida!");
            }
        }
    }
    public static EMenu escolherOpcao() {
        EMenu escolha = null;
        while (escolha == null) {
            System.out.println("Selecione uma opção");
            for (EMenu menu : EMenu.values()) {
                System.out.printf("(%d) - %s\n", menu.getValorOpcao(), menu.getDescricao());
            }
            escolha = EMenu.getByValorOpcao(in.nextInt());
            in.nextLine();
            if (escolha == null) {
                System.err.println("Selecione uma opção válida!");
            }
        }
        return escolha;
    }

    public static void adicionarItem (Estante e){
        if (e.estanteCheia()) {
            System.err.println("A estante está cheia!");
        } else {
            Item i = null;

            int escolha = -1;
            while (escolha < 0 || escolha > 1) {
                System.out.println("Informe o item que deseja adicionar (0 - Livro e 1 - DVD)");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1) {
                    System.err.println("Selecione uma opção válida!");
                }
            }
            in.nextLine();
            if (escolha == 0) {
                i = new Livro();
            } else {
                i = new DVD();
            }
            System.out.print("Informe o titulo: ");
            i.setTitulo(in.nextLine());
            System.out.print("Informe o genero: ");
            i.setGenero(in.nextLine());
            System.out.print("Informe o valor: R$");
            i.setValor(in.nextDouble());
            in.nextLine();

            if (i instanceof Livro) {
                Livro l = ((Livro) i);
                System.out.print("Informe o nome do autor: ");
                l.setAutor(in.nextLine());
                System.out.print("Informe a quantidade de páginas: ");
                l.setQtdePaginas(in.nextInt());
                in.nextLine();
                System.out.print("Informe o ano de publicação: ");
                l.setAnoPublicacao(in.nextInt());
                in.nextLine();
                System.out.print("Informe a edição: ");
                l.setEdicao(in.nextInt());
                in.nextLine();
            } else {
                DVD d = ((DVD) i);
                System.out.print("Informe o nome do diretor: ");
                d.setDiretor(in.nextLine());
                System.out.print("Informe o ano de lançamento: ");
                d.setAnoLancamento(in.nextInt());
                System.out.print("Informe a duração: ");
                d.setDuração(in.nextDouble());
            }
            if (!e.adicionarItem(i)) {
                System.err.println("Não foi possível adicionar o item na estante!");
            } else {
                System.out.println("Item adicionado com sucesso!");
            }
        }
    }
    public static void buscarItem(Estante e){
        System.out.print("Informe o título para busca: ");
        Item i = e.buscarItem(in.nextLine());
        if (i == null) {
            System.err.println("O título buscado não existe na estante!");
        } else {
            int escolha = -1;
            while (escolha < 0 || escolha > 2) {
                System.out.println(i.getTitulo()+ " encontrado! Ações disponíveis: ");
                System.out.println("(1) - Ver avaliações");
                System.out.println("(2) - Avaliar");
                System.out.println("(0) - Voltar");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 2) {
                    System.err.println("Selecione uma opção válida");
                }
            }
            in.nextLine();
            switch (escolha) {
                case 0:
                    System.out.println("Retornando...");
                    break;
                case 1:
                    mostarAvaliacoes(i);
                    break;
                case 2:
                    i.avaliar();
                    break;
            }
        }
    }

    public static void mostarAvaliacoes(Item i) {
        for (Avaliaçao a : i.getAvaliacoes()) {
            if (a != null) {
                System.out.println("Autor: "+a.getNome());
                System.out.println("avaliação: "+a.getRating());
                System.out.println("Comentário: ");
                System.out.println(a.getFeedback());
                System.out.println("--------------------");
            }
        }
        System.out.println("Classificação final: "+i.getTotalRanting());
    }
    public static void removerItem(Estante e){
        System.out.println("Informe a posição do item que deseja remover: ");
        int remover = in.nextInt();
        e.removerItem(remover);
        Item i = null;
        if (!e.getItens().equals(null)){
            System.out.println("Item removido com sucesso!");
        } else {
            System.out.println("Item não foi removido!");
        }
    }

    public static void mostrarEstante(Estante e){
        if (e.quantidadeItens() == 0) {
            System.out.println("Estante vazia!");
        } else {
            for (int i = 0; i < e.getCapMaxima(); i++) {
                Item item = e.getItens().get(i);
                if (item != null) {
                    System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");
                }
            }
        }
    }


}