import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex5();
    }

    public static void ex1(){
        //Pedir pro usuário informar n números inteiros até ele digitar 0
        //Quando ele digitar 0, mostrar a lista dos números digitados por ele
        ArrayList inteiros = new ArrayList();
        while (true){
            System.out.print("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0){
                break;
            }
        }
        System.out.println("Valores informados: ");
        System.out.println(inteiros);
   }

   public static void ex2(){
        //Pedir pro usuário informar valores inteitos até que seja informado 0
       //Quando for informado 0, mostrar os valores que o usuário digitou
       //mostrar a soma dos números pares e dos números impares informados
       //mostrar a média de todos os valores informados
       ArrayList<Integer> inteiros = new ArrayList<>();
       int somaPar = 0, somaImpar = 0;
       double somaTotal = 0.0;
       while (true){
           System.out.print("Informe um valor inteiro: ");
           int escolha = in.nextInt();
           if (escolha % 2 == 0){
               somaPar += escolha;
           } else {
               somaImpar += escolha;
           }
           somaTotal += escolha;
           inteiros.add(escolha);
           if (escolha == 0) {
               break;
           }
       }
       System.out.println("Valores informados: "+inteiros);
       System.out.print("A soma dos números pares: "+somaPar);
       System.out.print("A soma dos números impares: "+somaImpar);
       System.out.print("Média dos valores informados: "+(somaTotal/inteiros.size()));

   }
    public static void ex3(){
        ArrayList<String> palavras = new ArrayList<>();
        while (true) {
            System.out.print("Informe uma palavra ou SAIR para parar: ");
           String input = in.nextLine();
           if (input.equalsIgnoreCase("sair")){
               break;
           }
            palavras.add(input);
        }
            System.out.println("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            for (int i = 0; i < palavras.size(); i++){
            if (palavras.get(i).length() < escolha) {
                palavras.remove(i);
                i--;
            }
            }
        System.out.println(palavras);
    }
    public static void ex4(){
//        LocalDateTime datetime = LocalDateTime.now();
//        System.out.println(datetime.getYear());
//        System.out.println(datetime.getMonth().getValue());
//        System.out.println(datetime.getDayOfMonth());
//        System.out.println(datetime.getHour());
//        System.out.println(datetime.getMinute());
//        System.out.println(datetime.getSecond());
//        System.out.println(datetime.getNano());
//        System.out.println(datetime.getDayOfYear());
//        System.out.println(datetime.toLocalDate().isLeapYear());
//        System.out.println(datetime);

        LocalDateTime inicio = LocalDateTime.of(2022, 7, 7, 8, 3,21);
        LocalDateTime fim = LocalDateTime.of(2022, 7, 7, 18, 25,21);

        Duration bet = Duration.between(inicio, fim).minusHours(1).minusMinutes(30);

        System.out.println(bet);
        System.out.printf("%d:%d:%d\n", bet.toHoursPart(), bet.toMinutesPart(), bet.toSecondsPart());


        System.out.println(LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH 'horas', mm 'minutos e' ss 'segundos'")
        ));

    }

    public static void ex5(){
        while (true) {
            try {
                System.out.print("Informe um número: ");
                System.out.println(in.nextInt());
            } catch (InputMismatchException e) {
                in.nextLine();
                System.err.println("não é um número!");
            } catch (NoSuchElementException e2) {

            } finally {

            }
        }
    }

}
