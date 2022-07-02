import classes.*;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Estante e = new Estante(5);
        boolean loop = true;
        while (loop) {
            EMenu opcao = (EMenu) escolherOpcao(null);
            switch (opcao) {
                case SAIR -> loop = false;
                case ADICIONAR_ITEM -> adicionarItem(e);
                case BUSCAR_ITEM -> buscarItem(e);
                case REMOVER_ITEM -> removerItem(e);
                case MOSTRAR_ITENS -> mostrarEstante(e);
                default -> System.out.println("Selecione uma opção válida!");
            }
        }
        System.out.println("Programa finalizado!");
    }
    public static IMenu escolherOpcao(Item item) {
        IMenu escolha = null;
        while (escolha == null) {
            if (item != null) {
                while (escolha == null) {
                    System.out.println(item.getTitulo()+ " encontrado! Ações disponíveis: ");
                    for(EMenuItem i : EMenuItem.values()) {
                        System.out.printf("(%d) %s\n", i.getValorOpcao(), i.getDescricao());
                    }
                    escolha = EMenuItem.getByValorOpcao(in.nextInt());
                    if (escolha == null) {
                        System.err.println("Selecione uma opção válida");
                    }
                }
            } else {
                System.out.println("Selecione uma opção");
                for (EMenu menu : EMenu.values()) {
                    System.out.printf("(%d) - %s\n", menu.getValorOpcao(), menu.getDescricao());
                }
                escolha = EMenu.getByValorOpcao(in.nextInt());
            }
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
            i.montarDetalhes(in);
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
            EMenuItem escolha = (EMenuItem) escolherOpcao(i);
            while (escolha == null) {
                System.out.println(i.getTitulo()+ " encontrado! Ações disponíveis: ");
               for (EMenuItem item : EMenuItem.values()){
                   System.out.printf("(%d) - %s\n", item.getValorOpcao(), item.getDescricao());
               }
                escolha = EMenuItem.getByValorOpcao(in.nextInt());
                if (escolha == null) {
                    System.err.println("Selecione uma opção válida");
                }
            }
            switch (escolha) {
                case VOLTAR -> System.out.println("Retornando...");
                case VER_AVALIAÇÕES -> mostarAvaliacoes(i);
                case AVALIAR_ITEM -> i.avaliar();
                case MOSTRAR_DETALHES -> {
                    System.out.println("Título: "+ i.getTitulo());
                    System.out.println("Genero: "+i.getGenero());
                    i.mostrarDetalhes();
                    System.out.printf("Valor: R$%.2f\n", i.getValor());
                }
                default -> System.out.println("Não implemntado");
            }
        }
    }
    public static void mostarAvaliacoes(Item i) {
        i.getAvaliacoes().forEach(a -> {
            System.out.println("Autor: "+a.getNome());
            System.out.println("avaliação: "+a.getRating());
            System.out.println("Comentário: ");
            System.out.println(a.getFeedback());
            System.out.println("--------------------");
        });
        System.out.println("Classificação final: "+i.getTotalRanting());
    }
    public static void removerItem(Estante e){
        if (e.quantidadeItens() == 0) {
            System.err.println("Não é possível remover itens de uma estante vazia!");
        } else {
            int posicao = -1;
            while(posicao < 0 || posicao > e.quantidadeItens()) {
                System.out.print("Informe a posição do item para remover: ");
                posicao = in.nextInt();
                if (posicao < 0 || posicao > e.quantidadeItens()) {
                    System.err.println("Selecione uma opção válida!");
                }
            }
            in.nextLine();
            Item i = e.removerItem(posicao);
            System.out.println("Item "+i.getTitulo()+" removido!");
        }
    }

    public static void mostrarEstante(Estante e){
        if (e.quantidadeItens() == 0) {
            System.out.println("Estante vazia!");
        } else {
            for (int i = 0; i < e.quantidadeItens(); i++) {
                Item item = e.getItens().get(i);
                System.out.println("[" + i + "] " + item.getTitulo() + " (" + item.getGenero() + ")");

            }
        }
    }


}