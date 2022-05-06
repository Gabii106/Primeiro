import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean IsHealer = true;
        while (IsHealer) {
            System.out.println("Informe a abreviação: ");
            String clazz = in.next();
            if (clazz.length() != 3) {
                System.err.println("Não é uma abreviação válida");
            } else {
                switch (clazz.toUpperCase()) {

                    case "PLD", "WAR", "DKN", "GNB":
                        System.out.println("É Tank");
                        break;

                    case "WHM", "SCH", "ARC", "SAG":
                        System.out.println("É Healer");
                        break;

                    case "MNR", "DRG", "NJA", "SMR", "RPR", "BRD", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                        System.out.println("É DPS");
                        break;

                    default:

                        System.err.println("Não é uma clase");
                        IsHealer = false;
                        break;
                }


            }
        }
    }
}


