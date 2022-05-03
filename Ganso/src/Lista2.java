import java.util.Scanner;

public class Lista2 {
    public static void main(String[] args) {

        exe10();
    }

    public static void exe1() {

        // Entrada

        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valor = in.nextInt();

        // Processamento
        if (valor > 10) {
            System.out.printf("É MAIOR QUE 10! ");
        } else {

            // Saída

            System.out.printf("NÃO É MAIOR QUE 10! ");
        }
    }

    public static void exe2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int valor = in.nextInt();

        if (valor >= 0) {
            System.out.println("É Positivo!");
        } else {
            System.out.println("É Negativo!");
        }
    }

    public static void exe3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o número de maçãs compradas:");
        int maçãscompradas = in.nextInt();
        if (maçãscompradas < 12) {
            System.out.printf("Valor da compra: R$%.2f", maçãscompradas * 1.30);

        } else {
            System.out.printf("Valor da compra: R$%.2f", maçãscompradas * 1.00);
        }
    }

    public static void exe4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o ano atual:");
        int anoatual = in.nextInt();
        System.out.println("Informe o seu ano de nascimento:");
        int anonascimento = in.nextInt();
        int idadeatual = anoatual - anonascimento;

        if (idadeatual >= 16) {
            System.out.printf("Pode votar");
        } else {
            System.out.printf("Não pode votar");
        }
    }

    public static void exe5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe valor1:");
        int valor1 = in.nextInt();
        System.out.println("Informe valor2:");
        int valor2 = in.nextInt();

        /*System.out.println(Math.max(valor1, valor2));*/

        if (valor1 > valor2) {
            System.out.println(valor1);
        } else {
            System.out.println(valor2);
        }
    }

    public static void exe6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe valor1:");
        int valor1 = in.nextInt();
        System.out.println("Informe valor2:");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.printf("%d, %d", valor2, valor1);

        } else {
            System.out.printf("%d, %d", valor1, valor2);
        }
    }

    public static void exe7() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe hora de início do jogo de xadez:");
        int início = in.nextInt();
        System.out.println("Informe hora do fim do jogo de xadez:");
        int fim = in.nextInt();

        if (início >= fim) {

            System.out.printf("Duração do jogo de xadez: %d", (24 - (início - fim)));

        } else {

            System.out.printf("Duração do jogo de xadez: %d", (fim - início));

        }


    }

    public static void exe8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o número de horas trabalhadas no mês:");
        Double horas = in.nextDouble();
        System.out.println("Informe o salário por hora:");
        Double salárioporhora = in.nextDouble();

        Double saláriototal;

        if (horas > 160) {

            saláriototal = (160 * salárioporhora) + ((horas - 160) * (salárioporhora +salárioporhora / 2));

        } else {
            saláriototal = (horas * salárioporhora);
        }

        System.out.printf("Salário atual: R$%.2f", saláriototal);
    }

    public static void exe9() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu nome");
        String nome = in.nextLine();
        System.out.println("Informe sua altura");
        double altura = in.nextDouble();

        System.out.println("Informe seu sexo (M ou F)");
        String sexo = in.next();

        double pesoideal;
        if (sexo.equals("M")) {

            pesoideal = (72.7 * altura) - 58;

        } else {
            pesoideal = (62.1 * altura) - 44.7;
        }

        System.out.printf("Peso ideal: %.2f", pesoideal);
    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu salário fixo ");
        Double salariofixo = in.nextDouble();
        System.out.println("Informe o valor das vendas");
        Double valorvendas = in.nextDouble();

        if (valorvendas <= 1500.00) {

            System.out.printf("Salário atual: R$%.2f",salariofixo + (valorvendas * 0.03));

        } else {
            System.out.printf("Salário atual: R$%.2f",salariofixo + (1500.00 * 0.03) + ((valorvendas - 1500.00) * 0.05));
        }

    }
    public static void exe11() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe número da sua conta");
        Double númeroconta = in.nextDouble();
        System.out.println("Informe seu saldo");
        Double saldo = in.nextDouble();
        System.out.println("Informe seu débito");
        Double débito = in.nextDouble();
        System.out.println("Informe seu crédito");
        Double crédito = in.nextDouble();

        Double saldoatual = saldo - débito + crédito;

        System.out.printf("Saldo atual: R$%.2f\n", saldoatual);

        if (saldoatual >= 0) {

            System.out.println("Saldo Positivo");

        } else {

            System.out.println("Saldo Negativo");
        }


    }


    public static void exe12() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade atual em estoque");
        Double atual = in.nextDouble();
        System.out.println("Informe a quantidade máxima em estoque");
        Double máxima = in.nextDouble();
        System.out.println("Informe a quantidade mínima em estoque");
        Double mímima = in.nextDouble();

        Double quantidademédia = (máxima + mímima) / 2;

        if (atual >= quantidademédia) {

            System.out.println("Não efetuar compra");

        } else {

            System.out.println("Efetuar compra");
        }

    }




    //private
    //protected

}
