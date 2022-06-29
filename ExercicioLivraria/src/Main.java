import classes.*;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Estante e = new Estante(5);
        boolean loop = true;
        while (loop) {
            EMenu escolhido = escolherOpção();

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
    public static EMenu escolherOpção () {
        System.out.println("Escolha uma opção: ");
        for (EMenu menu : EMenu.values()){
            System.out.printf("(%i) - ");
        }
        System.out.println("(1) - Adicionar um item");
        System.out.println("(2) - Buscar um item");
        System.out.println("(3) - Remover um item");
        System.out.println("(4) - Mostrar itens da estante");
        System.out.println("(0) - Sair");

        return EMenu.;
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
        in.nextLine();
        System.out.println("Qual item deseja buscar?");
        String buscando = in.nextLine();
        Item it = e.buscarItem(buscando);
        if (it == null) {
            System.out.println("Item não encontrado!");
        } else {
            System.out.println("Item encontrado!");
            for (int i = 0; i < 1; i++) {
                System.out.println("Escolha uma opção: ");
                System.out.println("(1) - Avaliar item");
                System.out.println("(2) - Ver as avaliações do item");
                int opção = in.nextInt();
                in.nextLine();
                switch (opção) {
                    case 1:
                        it.avaliar();
                        break;
                    case 2:
                        for (int r = 0; r < it.getAvaliacoes().length; r++) {
                            if (it.getAvaliacoes()[r] != null) {
                                it.getAvaliacoes()[r] = it.getAvaliacoes()[r];
                            }
                        }
                        System.out.println("O raking é " + it.getTotalRanting());
                        break;
                }
            }
        }
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
        for (int c = 0; c < 5; c++) {
            if (e.getItens()[c] != null) {
                System.out.println(e.getItens()[c].getTitulo()+"("+e.getItens()[c].getGenero()+")");
            }
        }

    }


}