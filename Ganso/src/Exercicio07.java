import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        exe3();
    }

    public static void exe1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = in.nextLine();
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        System.out.println("Quantidade de espaços é: " + contador);

    }

    public static void exe2() {

        Scanner in = new Scanner(System.in);
        System.out.print("Informe o número de linhas: ");
        int linhas = in.nextInt();
        System.out.print("Informe o número de colunas: ");
        int colunas = in.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("#");
            }

            System.out.println("");
        }
    }

    public static void exe3() {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 5 ; i++) {
            System.out.print("Informer um número: ");
            soma += in.nextInt();
        }

        System.out.print("A soma é: " + soma);

    }

    public static void exe4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a linha escolida");
        int linha = in.nextInt();
        System.out.println("Informe a coluna escolida");
        String coluna = in.nextLine();

        int[][] mapa = {
                {0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        //System.out.print(mapa[linha][coluna]);
       // if (mapa[linha][coluna] = '1') {

        }
    }






