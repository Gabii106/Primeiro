import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        exe7();
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
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número: ");
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

    public static void exe5() {

        // 09/05

        Scanner in = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int fatorial = in.nextInt();
        int valorfinal = 1;

        if (fatorial == 0) {
            valorfinal = 0;
        } else {

            for (int i = fatorial; i > 0; i--) {
                valorfinal *= i;
            }

        }

        System.out.print("O fatorial de " + fatorial + " é: " + valorfinal);
    }

    public static void exe6() {
        Scanner in = new Scanner(System.in);
        int pincorreto = 91352;

        for (int n = 0; n < 1; n++) {
            System.out.print("Informe um pin: ");
            int pin = in.nextInt();


            if (pin == pincorreto) {
                System.out.println("Você acertou");
                break;

            } else {
                for (int i = 0; i < 2; i++) {

                    System.out.println("Tente de novo: ");
                    pin = in.nextInt();


                }
                System.out.println("Alcançou o número máximo de tentativas");

            }
        }
    }

    public static void exe06() {
        Scanner in = new Scanner(System.in);
        int tentativas = 3;
        while (tentativas > 0) {
            System.out.println("Informe seu pin: ");
            int pin = in.nextInt();

            if (pin == 91352) {
                System.out.println("Acesso liberado");
                break;
            }
            tentativas--;
            if (tentativas == 0) {
                System.out.println("Acesso bloqueado");
            } else {
                System.out.println("PIN incorreto, tente novamente: ");
            }
        }
    }

    public static void exe7() {
        //AHHHHHHHHHH!!!!!


        Scanner in = new Scanner(System.in);
        String[][] tabuleiro = {
                {" - ", " - ", " - "},
                {" - ", " - ", " - "},
                {" - ", " - ", " - "}
        };

        for (int i = 0; i < tabuleiro.length; i++) {

            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println("");
        }


            System.out.println("Informe um lugar para O: ");
            String O = in.nextLine();

            if (O.equals(" - ")) {
                for (int o = 0; o < 9; o++) {

                    switch (O) {
                        case "1":
                            System.out.println(tabuleiro[1][1] = O);
                        case "2":
                            System.out.println(tabuleiro[1][2] = O);
                        case "3":
                            System.out.println(tabuleiro[1][3] = O);
                        case "4":
                            System.out.println(tabuleiro[2][1] = O);
                        case "5":
                            System.out.println(tabuleiro[2][2] = O);
                        case "6":
                            System.out.println(tabuleiro[2][3] = O);
                        case "7":
                            System.out.println(tabuleiro[3][1] = O);
                        case "8":
                            System.out.println(tabuleiro[3][2] = O);
                        case "9":
                            System.out.println(tabuleiro[3][3] = O);
                        default:
                            System.out.println("Número inválido");
                            break;
                    }
                    System.out.println(tabuleiro);
                }

            }
            System.out.println("Informe um lugar para X: ");
            String X = in.nextLine();

            if (X.equals(" - ")) {
                for (int x = 0; x < 9; x++) {

                    switch (X) {
                        case "1":
                            System.out.println(tabuleiro[1][1] = X);
                        case "2":
                            System.out.println(tabuleiro[1][2] = X);
                        case "3":
                            System.out.println(tabuleiro[1][3] = X);
                        case "4":
                            System.out.println(tabuleiro[2][1] = X);
                        case "5":
                            System.out.println(tabuleiro[2][2] = X);
                        case "6":
                            System.out.println(tabuleiro[2][3] = X);
                        case "7":
                            System.out.println(tabuleiro[3][1] = X);
                        case "8":
                            System.out.println(tabuleiro[3][2] = X);
                        case "9":
                            System.out.println(tabuleiro[3][3] = X);
                        default:
                            System.out.println("Número inválido");
                            break;
                    }
                    System.out.println(tabuleiro);
                }


            }}

        public static void exe8() {
            Scanner in = new Scanner(System.in);
            System.out.println("Informe um número: ");
            int numero = in.nextInt();
            int soma = 0;

            for (int i = 1; i <= numero; i++) {

                soma += i;
            }

            System.out.println(soma);
        }

    public static void exe9() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu nome completo: ");
        String nome = in.nextLine();

        String[] nomes = nome.split(" ");
        String out = "";

        for (String n : nomes) {

            out += n.charAt(0)+".";

        }

        System.out.println(out);

    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma palavra: ");
        String palavra = in.nextLine();

        String reverse = "";
        for(int i = palavra.length()-1; i >= 0; i--) {
           reverse += palavra.charAt(i);
        }

            if (reverse.equals(palavra)) {
                System.out.println("É palíndromo");
            } else {
                System.out.println("Náo é palíndromo");
            }
        }

    }