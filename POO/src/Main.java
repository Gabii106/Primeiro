import classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza");
        int escolha = in.nextInt();
        in.nextLine();
        Lanche lanche = null;
        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;
            case 2:
                lanche = new XBurguer();
                break;
            case 3:
                lanche = new MistoQuente();
                break;
            case 4:
                lanche = new HotDog();
                break;
            case 5:
                lanche = new MiniPizza();
                break;
            default:
                System.err.println("Escolha uma opção válida!");
        }
        if (lanche instanceof Sanduiche) {
            System.out.println("Deseja adicionais? (S/N)");
            String adicionais = in.nextLine();

            if (adicionais.equalsIgnoreCase("S")) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Informe o adicional: ");
                    ((Sanduiche) lanche).adicionarAdicional(in.nextLine());
                    System.out.println("Deseja adicionar mais adicionais? (S/N)");
                    String parada = in.nextLine();
                    if (parada.equalsIgnoreCase("N")){
                        break;
                    }
                }
            }

        if (lanche instanceof XBurguer) {
            System.out.println("Lanche aberto? (S/N)");
            String aberto = in.nextLine();
            ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
        }
        } else {
            System.out.println("Com borda recheada? (S/N)");
            String aberto = in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            miniPizza.bordaRecheada = aberto.equalsIgnoreCase("S");
            if (miniPizza.bordaRecheada) {
                System.out.println("Qual sabor da borda?");
                ((MiniPizza) lanche).saborBorda = in.nextLine();
            }
        }
        System.out.print("Informe o valor do(a) " + lanche.tipo + ": R$");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();
    }

}