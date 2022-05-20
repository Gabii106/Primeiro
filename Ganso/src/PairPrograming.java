import java.util.Scanner;

public class PairPrograming {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos da turma: ");
        int alunos = in.nextInt();
        in.nextLine();
        System.out.println("Informe o número de questões da prova: ");
        int questoes = in.nextInt();
        in.nextLine();
        String[][] gabarito = new String[questoes][1];

        for (int i = 0; i < questoes; i++) {
            System.out.println("Informe o gabarito da questão");
            gabarito[1][i] = in.nextLine();

        } String[] nomes = new String[alunos];
        String[][] respostas = new String[alunos][questoes];

        for (int j = 0; j < alunos; j++) {
            System.out.println("Informe o nome do aluno: ");
            nomes[j]= in.nextLine();
            for (int i = 0; i < questoes; i++){
                System.out.println("informe a resposta da questão "+ (i+1));
                respostas[j][i] = in.nextLine();
            }
        }

        double[] notas = new double[alunos];

        for (int i = 0; i < alunos; i ++){
            for (int j = 0; j < questoes; j++) {
                if (respostas[i][j].equals(gabarito[1][j])) ;

            }
        }


        for (int l = 0; l < respostas.length; l++) {
            for (int c = 0; c < respostas[l].length; c++) {
                System.out.print(respostas[l][c]);
            }
            System.out.println("");
        }




}
}
