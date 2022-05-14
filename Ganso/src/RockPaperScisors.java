import java.util.Random;
import java.util.Scanner;
public class RockPaperScisors {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);


        int pontuaçãoJ1 = 0;
        int pontuaçãoJ2 = 0;
        while (pontuaçãoJ1 < 10 && pontuaçãoJ2 < 10) {
            //usuario
            int escolhaUsuario = -1;
            boolean valida = escolhaValida(escolhaUsuario);
            while (!valida) {
                System.out.println("Escolha (0) Pedra, (1) Papel, (2) Tesoura ou (3) Lava : ");
                escolhaUsuario = in.nextInt();
                valida = escolhaValida(escolhaUsuario);
                if (!valida) {
                    System.out.println("Escolha inválida");
                }
            }
           String escolhaUsuarioString = escolhaString(escolhaUsuario);
            //computador
            int escolhaComputador = r.nextInt(3); // ele é exclusivo
            String escolhaComputadorString = escolhaString(escolhaComputador);
            System.out.println("Jogador "+escolhaUsuarioString+" X "+escolhaComputadorString);
            int vencedor = checarVencedor (escolhaUsuario, escolhaComputador);
          switch (vencedor) {
              case 0:
                  System.out.println("EMPATE");
                  break;
              case 1:
                  System.out.println("JOGADOR VENCEU");
                  break;
              case 2:
                  System.out.println("COMPUTADOR VENCEU");
                  break;

          }
            System.out.println("===== Pontuação =====");
            System.out.println("Usuario: "+ pontuaçãoJ1);
            System.out.println("Computador "+ pontuaçãoJ2);

        }


    }


    public static boolean escolhaValida(int escolha) {
        return escolha > -1 && escolha < 4;
    }

    public static String escolhaString(int escolha) {
        switch (escolha) {
            case 0:
                return "Pedra";
            case 1:
                return "Papel";
            case 2:
                return "Tesoura";
            case 3:
                return "Lava";
            default:
                return "";
        }
    }

    public static int checarVencedor(int escolha1,int escolha2){

        //0 - empate
        //1 - escolha1 vence
        //2 - escolha2 vence
        if( escolha1 == escolha2){
            return 0;
        }

        if(escolha1 == 3 ) {
            return 1;
        } else if(escolha2 == 3) {
            return 2;
        }

         if (
                (escolha1 == 0 && escolha2 == 1) ||
                (escolha1 == 1 && escolha2 == 2) ||
                (escolha1 == 2 && escolha2 == 0)) {
            return 2;
        }

         return 1;
    }
}



   //public static int soma(int valor1, int valor2) {
  //     return valor1+valor2;
  // }




