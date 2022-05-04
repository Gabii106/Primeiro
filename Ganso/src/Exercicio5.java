import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Quantas palavras deseja informar?");
        int quantas = in.nextInt();
        String[] palavras = new String[quantas];
        for (int i = 0; i < quantas; i++) {
            System.out.println("Informe a palavra");
            palavras[i] = in.next();
        }
        String palavraFinal = "";
        for (int i = 0; i < palavras.length; i++) {
            if (i == 0) {
                palavraFinal += palavras[i];
            } else {
                palavraFinal += " , " + palavras[i];
            }
            // 1.Pedir ao usuario quantas palavras ele deseja informar
            // 2. Pedir ao usuario cada palavra
            // 3. Informar em uma única linha as palavras que o usuario informaou separadas por vírgula;

        }
        System.out.println(palavraFinal);
    }

}