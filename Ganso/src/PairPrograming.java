import java.util.Scanner;

public class PairPrograming {

    public static void main(String[] args) {
        exe1();
    }

    public static void exe1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos da turma: ");
        int alunos = in.nextInt();
        in.nextLine();
        System.out.println("Informe o número de questões da prova: ");
        int questoes = in.nextInt();
        in.nextLine();
        String[] gabarito = new String[questoes];



        for (int i = 0; i < questoes; i++) {
            System.out.println("Informe o gabarito da questão");
            gabarito[i] = in.nextLine();}


        String[] nomes = new String[alunos];
        String[][] respostas = new String[alunos][questoes];


        for (int j = 0; j < alunos; j++) {
            System.out.println("Informe o nome do aluno " + (j+1) + ": ");
            nomes[j] = in.nextLine();
            for (int i = 0; i < questoes; i++) {
                System.out.print("informe a resposta da questão " + (i + 1));
                respostas[j][i] = in.nextLine();

            }
        }




        double[] notas = new double[alunos];

        for (int i = 0; i < alunos; i++) {
            double peso = 10.0 / questoes;
            for (int j = 0; j < questoes; j++) {
                if (gabarito[j].equals(respostas[i][j])) {

                    notas[i] += peso;
                }
            }

        }
        for (int i = 0; i < alunos; i++) {
            System.out.printf("A nota do aluno %s: %.2f\n", nomes[i], notas[i]);


        }}


    public static void exe2() {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira algo: ");
        String algo = in.nextLine().toLowerCase();
        String algoCodificado = algo.replace(".","#")
                .replace("-", "@")

                .replace("a", ".-|")
                .replace("b", "-...|")
                .replace("c", "-.-.|")
                .replace("d", "-..|")
                .replace("e", ".|")
                .replace("f", "..-.|")
                .replace("g", "--.|")
                .replace("h", "....|")
                .replace("i", "..|")
                .replace("j", ".---|")
                .replace("k", "-.-|")
                .replace("l", ".-..|")
                .replace("m", "--|")
                .replace("n", "-.|")
                .replace("o", "---|")
                .replace("p", ".--.|")
                .replace("q", "--.-|")
                .replace("r", ".-.|")
                .replace("s", "...|")
                .replace("t", "-|")
                .replace("v", "...-|")
                .replace("w", ".--|")
                .replace("x", "-..-|")
                .replace("y", "-.--|")
                .replace("z", "--..|")
                .replace(" ", "*|")

                .replace("0", "-----|")
                .replace("1", ".----|")
                .replace("2", "..---|")
                .replace("3", "...--|")
                .replace("4", "....-|")
                .replace("5", ".....|")
                .replace("6", "-....|")
                .replace("7", "--...|")
                .replace("8", "---..|")
                .replace("9", "----.|")

                .replace(",", "--..--|")
                .replace(":", "---...|")
                .replace("/", "-..-.|")
                .replace("+", ".-.-.|")
                .replace(";", "-.-.-.|")
                .replace("!", "-.-.--|")
                .replace("?", "..--..|")
                .replace("'", ".----.|")
                .replace("\"", ".-..-.|")
                .replace("=", "-...-|")
                .replace("#", ".-.-.-|")
                .replace("@", "-....-|");


        System.out.println(algoCodificado);


    }

    public static void exe3 () {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira a mensagem codificada em morse: ");
        String codificado = in.nextLine();
        String descodificado = codificado

                .replace(".-.-.-|", "#")
                .replace("-....-|", "@")

                .replace("---...|", ":")
                .replace("-.-.-.|", ";")
                .replace("-.-.--|", "!")
                .replace("..--..|", "?")
                .replace(".----.|", "'")
                .replace(".-..-.|", "\"")
                .replace("--..--|", ",")

                .replace("-----|", "0")
                .replace(".----|", "1")
                .replace("..---|", "2")
                .replace("...--|", "3")
                .replace("....-|", "4")
                .replace(".....|", "5")
                .replace("-....|", "6")
                .replace("--...|", "7")
                .replace("---..|", "8")
                .replace("----.|", "9")
                .replace("-...-|", "=")
                .replace(".-.-.|", "+")
                .replace("-..-.|", "/")

                .replace("-...|", "b")
                .replace("-.-.|", "c")
                .replace("..-.|", "f")
                .replace("....|", "h")
                .replace(".---|", "j")
                .replace(".-..|", "l")
                .replace(".--.|", "p")
                .replace("--.-|", "q")
                .replace("...-|", "v")
                .replace("-..-|", "x")
                .replace("-.--|", "y")
                .replace("--..|", "z")


                .replace("-..|", "d")
                .replace("--.|", "g")
                .replace("-.-|", "k")
                .replace("---|", "o")
                .replace(".-.|", "r")
                .replace("...|", "s")
                .replace("..-|", "u")
                .replace(".--|", "w")


                .replace(".-|", "a")
                .replace("..|", "i")
                .replace("--|", "m")
                .replace("-.|", "n")


                .replace(".|", "e")
                .replace("-|", "t")
                .replace("*|", " ")

                .replace("#", ".")
                .replace("@", "-");

        System.out.println(descodificado);

    }

    static void teste() {

    }
}
