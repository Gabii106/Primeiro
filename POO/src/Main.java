import classes.cliente.Cliente;
import classes.lanches.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.println("Insira o nome do cliente: ");
        cl.setNome(in.nextLine());
        while (true){
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.println("Deseja mais um lanche: (S/N)");
            if (in.nextLine().equalsIgnoreCase("N")) {
                    break;
            }
        }
        System.out.println("Cliente: " + cl.getNome());
        cl.getPedido().imprimirComanda();
    }

    private static Lanche montarLanche(){
        Lanche lanche = null;
        while (lanche == null) {
            System.out.println("-MENU: escolha uma opção-");
            ETipoLanche escolha = ETipoLanche;

           // int escolha = 0;
            try {
                escolha = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escolha um lanche válido!");
            } finally {
                in.nextLine();
            }
            switch (escolha) {
                case X_SALADA -> lanche = new XSalada();
                case X_BURGUER -> lanche = new XBurguer();
                case MISTO_QUENTE -> lanche = new MistoQuente();
                case HOT_DOG -> lanche = new HotDog();
                case MINI_PIZZA -> lanche = new MiniPizza();
                case PIZZA -> lanche = new Pizza();
                default -> System.out.println("Escolha uma opção válida!");
            }
        }
        lanche.montarDetalhesLanche(in);
        System.out.print("Informe o valor do(a) "+lanche.getTipo()+": R$");
        lanche.setValor(in.nextDouble());
        in.nextLine();
        return lanche;
    }
}