import PacoteVoo.Voo;

import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int linhas = 27;
            int colunas= 11;
            boolean partindo = false;
            int opção;
            String codigo;
             while (linhas > 26 || colunas > 10) {
                 System.out.print("Informe a quantidade de linhas de cadeiras: ");
                  linhas = in.nextInt();
                 System.out.print("Informe a quantidade de cadeiras por linha:");
                  colunas= in.nextInt();
                 System.out.println("--------------------------------------");
             }
            Voo v = new Voo(linhas,colunas);
            while(!partindo){
                System.out.println("Opções disponiveis: ");
                System.out.println("1 - Mostrar assentos");
                System.out.println("2 - Verifivar Quantidade de Assentos Livres");
                System.out.println("3 - Verificar Ocupação do assento");
                System.out.println("4 - Ocupar assento");
                System.out.println("5 - Iniciar voo");
                System.out.print("Escolha uma das opções acima: ");
                opção = in.nextInt();
                if (opção == 1){
                    v.mostrarAssentos();
                } else if (opção == 2) {
                    System.out.println("A quantidade de assentos livres no avião são de: "+v.quantidadeLivre());
                } else if (opção == 3) {
                    System.out.print("Digite a posição que deseja verificar: ");
                    codigo = in.next();
                    if (v.verificaOcupação(codigo)){
                        System.err.println("O assento escolhido já está ocupado");
                    }
                    else{
                        System.out.println("O assento escolhido está livre");
                    }
                } else if (opção == 4) {
                    System.out.print("Digite a posição que deseja ocupar: ");
                    codigo = in.next();
                    v.ocupar(codigo);
                }
                if (v.quantidadeLivre() == 0 || opção == 5){
                    partindo = true;
                    break;
                }
                System.out.println("--------------------------------------");
            }
            System.out.println("O voo está partindo!");
        }
}
