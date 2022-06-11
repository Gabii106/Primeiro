import classes.DVD;
import classes.Estante;
import classes.Item;
import classes.Livro;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Estante e = new Estante(5);
        boolean loop = true;
        while (loop) {
            int escolhido = escolherOpção();

        /*int escolhido = in.nextInt();
        in.nextLine();*/

            switch (escolhido) {
                case 1:
                    adicionarItem(e);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    loop = false;
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");
            }
            System.out.println("Programa finalizado!");
        }
    }
    public static int escolherOpção () {
        System.out.println("---MENU PRINCIPAL---");
        System.out.println("(1) - Adicionar um item");
        System.out.println("(2) - Buscar um item");
        System.out.println("(3) - Remover um item");
        System.out.println("(4) - Mostrar itens da estante");
        System.out.println("(0) - Sair");
        System.out.println("Escolha uma opção: ");
        return in.nextInt();
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
    /*
                         contadorLivro++;
                            item = new Livro();
                            e.adicionarItem(l);

                            contadorDVD++;
                            item = new DVD();
                            e.adicionarItem(d);
                        } else {
                            System.err.println("Escolha inválida!");
                            i--;
                            continue;
                        }
*/
                        /*

                        System.out.print("A quantidade de itens é " + e.quantidadeItens()
                                +"(Livros: "+contadorLivro+" - DVD: "+contadorDVD+")");
                    }}}

                case 2:
                    System.out.println("Qual item deseja buscar? ");
                    String itemBuscado = in.nextLine();
                    e.buscarItem(itemBuscado);

                    System.out.println("Opções:");
                    System.out.println("(1) - Avaliar item");
                    System.out.println("(2) - Ver as avaliações do item");
                    System.out.println("(3) - Voltar");
                    System.out.println("Escolha uma opção: ");
                    int opção = in.nextInt();

                    switch (opção){
                        case 1:
                            item.avaliar();
                            break;
                        case 2:
                            item.getTotalRanting();
                            break;
                    }

                    break;
                case 3:
                    System.out.println("Informe a posição do item que deseja remover: ");
                    int posição = in.nextInt();
                    e.removerItem(posição);
                    break;
                case 4:
                    for (int c = 0; c < 5; c++) {
                        if (e.getItens()[c] != null) {
                            System.out.println(e.getItens()[c].getTitulo()+"("+e.getItens()[c].getGenero()+")");
                        }
                    }
                    break;
            }
    }
}
*/
}