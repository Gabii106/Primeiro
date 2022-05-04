import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner qualquercoisa = new Scanner(System.in);
        System.out.println("Qual tabuada deseja saber?");
        int valor = qualquercoisa.nextInt();


        while (valor != 0 ) {

            for (int algo = 0; algo <= 10; algo++) {
                System.out.println(algo * valor);
            }

            System.out.println("Qual tabuada deseja saber?");
             valor = qualquercoisa.nextInt();


        }
    }
}
