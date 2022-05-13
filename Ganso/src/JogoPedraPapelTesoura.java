import java.util.Scanner;

public class JogoPedraPapelTesoura {

        public static void main(String[] args) {
            System.out.println("Bem vindo ao jogo PEDRA, PAPEL OU TESOURA");
            int jogador,computador;
                Scanner in = new Scanner(System.in);
            System.out.println(" ⭓ Pedra = 0");
            System.out.println(" □ Papel = 1");
            System.out.println(" ✂ Tesoura = 2");

            int PontosComputador = 0;
            int PontosJogador = 0;



            while ( PontosComputador < 10 && PontosJogador < 10) {

                System.out.println("Jogador escolha uma opção: ");
                jogador = in.nextInt();

            switch (jogador) {
                case 0:
                    System.out.println(" ⭓ Jogador escolheu Pedra");
                    break;
                case 1:
                    System.out.println(" □ Jogador escolheu Papel");
                    break;
                case 2:
                    System.out.println(" ✂ Jogador escolheu Tesoura");
                    break;
                default:
                    System.err.println("Resposta inválida");
                    break;
            }


                 computador = (int) (Math.random()* 3);

                 switch (computador) {
                     case 0:
                         System.out.println(" ⭓ Computador escolheu Pedra");
                         break;
                     case 1:
                         System.out.println(" □ Computador escolheu Papel");
                         break;
                     case 2:
                         System.out.println(" ✂ Computador escolheu Tesoura");
                         break;
                 }


               switch (jogador){
                   case 0:
                       switch (computador) {
                           case 0:
                               System.out.println("Empate");
                               break;
                           case 1:
                               System.out.println("Computador venceu");
                               PontosComputador ++;
                               break;
                           case 2:
                               System.out.println("Jogador venceu");
                               PontosJogador++;
                               break;
                       } break;


                   case 1:
                       switch (computador) {
                           case 0:
                               System.out.println("Jogador venceu");
                               PontosJogador++;
                               break;
                           case 1:
                               System.out.println("Empate");

                               break;
                           case 2:
                               System.out.println("Computador veceu");
                               PontosComputador++;
                               break;
                       } break;
                   case 2:
                       switch (computador) {
                           case 0:
                               System.out.println("Computador venceu");
                               PontosComputador++;
                               break;
                           case 1:
                               System.out.println("Jogador venceu");
                               PontosJogador++;
                               break;
                           case 2:
                               System.out.println("Empate");
                               break;


               } break;

               default:
                       System.err.println("Resposta inválida");
                 }

        }
            if(PontosComputador == 10) {
            System.out.println("Vencedor final é o Computador");

        } else if (PontosJogador == 10) {
                System.out.println("Vencedor final é o Jogador");

            }
            System.out.println("Total de pontos do Computador: "+PontosComputador);
            System.out.println("Total de pontos do Jogador: " +PontosJogador);
        }
}