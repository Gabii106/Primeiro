import java.util.Scanner;

public class Cabra {

    //comentário de linha
    /* comentário de bloco
    block
    block
    block
     */

    // Inteiros
    int var1 = 10;
    // Decimais, números quebrados
    double var2 = 25.8;
    // Caractere único
    char var3 = 'a';
    // Texto
    String var4 = "abcdefghij";
    // Valor lógico
    boolean var5 = true;


    public static void main(String[] args) {
        exe16();

    }

    public static void exe1() {
        int varA = 10;
        int varB = 20;
        int varC = varA;
        varA = varB;
        varB = varC;
        System.out.println(varA);
        System.out.println(varB);

    }


    public static void exe2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor");
        int valor = in.nextInt();
        System.out.println(--valor);

    }

    public static void exe3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a base");
        double base = in.nextDouble();
        System.out.println("Informe a altura");
        double altura = in.nextDouble();
        double área = base * altura;
        double perimetro = base * 2 + altura * 2;
        System.out.printf("Área: %.2f\n", área);
        System.out.printf("Perimetro: %.2f", perimetro);
    }

    public static void exe4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite anos vividos");
        int anos = in.nextInt();
        System.out.println("Digite meses vividos");
        int meses = in.nextInt();
        System.out.println("Digite dias vividos");
        int dias = in.nextInt();
        System.out.printf("Você viveu %d dias", (anos * 365) + (meses * 30) + dias);
    }

    public static void exe5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe total de eleitores");
        Double total = in.nextDouble();
        System.out.println("Informe votos nulos");
        Double nulos = in.nextDouble();
        System.out.println("Informe votos brancos");
        Double brancos = in.nextDouble();
        Double validos = total - nulos - brancos;
        Double percentualnulos = nulos * 100 / total;
        Double percentualbrancos = brancos * 100 / total;
        Double percentualvalidos = validos * 100 / total;
        System.out.println(validos);
        System.out.printf("%.2f\n", percentualnulos);
        System.out.printf("%.2f\n", percentualbrancos);
        System.out.printf("%.2f\n", percentualvalidos);

    }

    public static void exea() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe total de eleitores");
        Double total = in.nextDouble();
        System.out.println("Informe votos nulos");
        Double nulos = in.nextDouble();
        System.out.println("Informe votos brancos");

        Double brancos = in.nextDouble();

        Double validos = total - nulos - brancos;

    /*
        10 --- 100
        05 --- x

        x = (validos * 100) / total
        total * x = validos * 100
        10 * x = 5 * 100
        10x = 500
        x = 500 / 10
        x = 50

     */
        double percentualvalidos = (validos * 100.0) / total;
        double percentualnulos = (nulos * 100.0) / total;
        double percentualbrancos = (brancos * 100.0) / total;

        System.out.printf("Total de votos validos: " + validos);
        System.out.printf("%% de votos validos %.2f\n", percentualvalidos);
        System.out.printf("%% de votos brandos %.2f\n", percentualbrancos);
        System.out.printf("%% de votos nulos %.2f\n", percentualnulos);

    }

    public static void exe6() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o salario atual");
        Double salarioatual = in.nextDouble();
        System.out.println("Informe percentual de reajuste");
        Double percentualreajuste = in.nextDouble();
        Double valorreajuste = salarioatual * percentualreajuste / 100;
        System.out.printf("Salario reajustado: R$ %.2f", salarioatual + valorreajuste);
    }

    public static void exe7() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o custo de fabrica");
        Double custofabrica = in.nextDouble();
        Double custofinal = custofabrica + ((custofabrica * 28) / 100) + ((custofabrica * 45) / 100);
        System.out.printf("Custo Final: R$%.2f", custofinal);

    }

    public static void exe8() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu salário fixo por mês");
        Double saláriofixo = in.nextDouble();
        System.out.println("Informe valor recebido por cada carro vendido");
        Double valorporcarro = in.nextDouble();
        System.out.println("Informe o valor total de suas vendas");
        Double valortotalvendas = in.nextDouble();
        System.out.println("Informe a quantidade de carros vendidos");
        int quantidadecarros = in.nextInt();

        Double saláriofinal = saláriofixo + valorporcarro * quantidadecarros + (valortotalvendas * 5) / 100;
        System.out.printf("Salário Final: R$%.2f", saláriofinal);
    }

    public static void exe9() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a temperatura em graus Fahrenheit");
        int temperaturafahrenheit = in.nextInt();
        int temperaturacelsius = (temperaturafahrenheit - 32) / 9 * 5;
        System.out.println(temperaturacelsius);
    }

    public static void exe10() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a primeira nota");
        Double primeiranota = in.nextDouble();
        System.out.println("Informe a segunda nota");
        Double segundanota = in.nextDouble();
        System.out.println("Informe a terceira nota");
        Double terceiranota = in.nextDouble();
        Double mediafinal = (primeiranota * 2 + segundanota * 3 + terceiranota * 5) / 10;
        System.out.println(mediafinal);
    }

    public static void exe11() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor");
        int valor = in.nextInt();
        if (valor > 10) {
            System.out.printf("É MAIOR QUE 10! ");
        }
        if (valor <= 10) {
            System.out.printf("NÃO É MAIOR QUE 10! ");
        }


    }


    public static void exe12() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor");
        int valor = in.nextInt();
        if (valor >= 0) {
            System.out.printf("Positivo");
        }
        if (valor < 0) {
            System.out.printf("Negativo");
        }
    }

    public static void exe13() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o número de maçãs compradas");
        int maçãscompradas = in.nextInt();
        if (maçãscompradas < 12) {
            System.out.println(maçãscompradas * 1.30);

        }
        if (maçãscompradas >= 12) {
            System.out.println(maçãscompradas * 1.00);
        }
    }

    public static void exe14() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o ano atual");
        int anoatual = in.nextInt();
        System.out.println("Informe o seu ano de nascimento");
        int anonascimento = in.nextInt();
        int idadeatual = anoatual - anonascimento;

        if (idadeatual >= 18) {
            System.out.printf("Pode votar");
        }

        if (idadeatual < 18) {
            System.out.printf("Não pode votar");
        }
    }

    public static void exe15() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe valor1");
        int valor1 = in.nextInt();
        System.out.println("Informe valor2");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor1);
        }

        if (valor1 < valor2) {
            System.out.println(valor2);
        }
    }

    public static void exe16() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe valor1");
        int valor1 = in.nextInt();
        System.out.println("Informe valor2");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.println(valor2);
            System.out.println(valor1);
        }

        if (valor1 < valor2) {
            System.out.println(valor1);
            System.out.println(valor2);
        }
    }

    public static void exe17() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe hora de início do jogo de xadez");
        int início = in.nextInt();
        System.out.println("Informe hora do fim do jogo de xadez");
        int fim = in.nextInt();


    }

    public static void exe18() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o número de horas trabalhadas no mês");
        Double horas = in.nextDouble();
        System.out.println("Informe o salário por hora");
        Double salárioporhora = in.nextDouble();

        if (horas > 160) {
            System.out.println((160 * salárioporhora) + (horas - 160 * salárioporhora * 0.50));
        } else {
            System.out.println(horas * salárioporhora);
        }

    }

    public static void exe19() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe ");
}

    //private
    //protected

}