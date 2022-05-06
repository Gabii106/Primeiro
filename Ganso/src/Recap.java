import java.util.Locale;
import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isHealer = true;
        while (isHealer) {
            System.out.println("Informe a abreviação da Classe Healer: ");
            String clazz = in.next();
            switch (clazz) {
                case "WHM":
                    System.out.println("White mage");
                    break;
                case "SAG":
                    System.out.println("Sage");
                    break;
                case "SCH":
                    System.out.println("Schollar");
                    break;
                case "ARC":
                    System.out.println("Arcanist");
                    break;
                default:
                    System.out.println("Não é healer!!!!");
                    isHealer = false;
                    break;
            }
        }

   //     String var3 = "Did you know about the aclaimed MMO FFXIV?";
  //      int qtde = 0;
  //      for (int i = 0; i < var3.length( ); i++) {
  //          if (var3.charAt(i) == 'a') {
  //              qtde++;
  //          }
   //     }
   //     System.out.println(qtde);
    }


    public static void text(String[] args) {

        // Inteiros
        int var1 = 10;
        // Caractere único
        char var2 = 'a';
        // Texto
        String var3 = "abcdefghij";
        // Valor lógico
        boolean var4 = true;
        // Decimais, números quebrados
        double var5 = 5.6;

        //saída - mensagem de usuário

        System.out.println(); // exibe mensagem e quebra a linha
        System.out.print(""); // exibe mensagem sem quebra de linha
        System.out.printf("%d %.2f, %s", 10 ,4.67888, "texto"); // exibe mensagem

        // entrada - entrada de usuari pelo console
        Scanner in = new Scanner(System.in);
        in.next(); // espera o usuario digitar, pega tudo  o que foi digitado
        in.nextInt(); // espera o usuario digitar, pega valores inteiros
        in.nextDouble(); // espera o usuario digitar, pega valores decimais

        // operações aritméticas
        var1 = 10 + 10;
        var1 = 10 - 10;
        var1 = 10 / 10;
        var1 = 10 * 10;
        var1 = 10 % 10; // resto de divisão modulo

        // operações relacionais - sempre retornam valor boolean
        var4 = 10 > 10;
        var4 = 10 >= 10;
        var4 = 10 < 10;
        var4 = 10 <= 10;
        var4 = 10 == 10;
        var4 = 10 != 10;// diferença

        //operações lógicas - comparação entre valores booleanos

        var4 = true && false; // true E false - só verdade quando ambas as entradas forem verdadeiras
        var4 = true || false; // true OU false - só false quando ambas as entradas forem verdadeiras
        var4 = !true; // não false

        // comdicionais - estruturas de seleção
        // if - analisa uma condição e executar os determinados códigos

        if(var4) {
            // se a condição for verdade executa esse trecho do código
        } else {
            // senão executa esse
        }

        // if aninhado
        if (var1 <= 10) {
            // se a condição for verdade executa esse trecho do código
        } if(var4) {

        }

        // if encadeado
        if(var1 == 1) {
            // se a primeira for verdade executa esse trecho do código
        } else if (var1 == 2) {
            // senão se a segunda condição for verdade executa esse trecho do código
        } else if (var1 == 3) {

        } else if (var1 == 4) {

        }
        else {
            // senão executa esse
        }

        // switch espera um valor e compara esse valor com cada caso informado
        switch (var1) {
            case 1:
                System.out.println("um"); break;// se não tiver break, o código continua sendo executado na próxima linha a linha
            case 2:
                System.out.println("dois"); break;
            case 3:
                System.out.println("três"); break;
            case 4:
                System.out.println("quatro"); break;
            case 5:
                System.out.println("cinco"); break;

                // se o valor não for igual a nenhum caso, o padrão é executado
            default:
                System.out.println("não sei"); break;
        }

        // repetição
        // for - irá repetir um trecho do código por um determinado número de vezes
        // enquanto a condição for verdade
        if (var4) {
            for (int i = 0; i <= 10; i++) {
                //código repetido a cada iteração
                System.out.println(i);
            }
        }
        // while - irá repetir um trecho do código por um número de vezes desconhecido
        // enquanto a condição for verdade
        int i = 0;
        while (var1 != 0) {
            System.out.println("teste");
           var1 = in.nextInt(); // atualização da variável utilizada na
            // condição do while, caso esse valor não seja atualizado
            // irá gerar um loop infinito
        }

        // String - lista de char
        var3 = "  Did yuo know about yhe aclaimed MMO FFXIV?  ";
        System.out.println(var3.length()); // length() retorna a quantidade total
                                           // de caracteres no texto

        System.out.println( var3.charAt(0)); //charAt() retorna o caractere
                                             // na posição x do texto

        System.out.println(var3.equals("teste")); // equals() realiza comparações
                                                  // entre Strings

        System.out.println(var3.toLowerCase()); // toLowerCase() converte todos os caracteres da tring em minúsculos

        System.out.println(var3.toUpperCase()); // toUpperCase() converte todos os caracteres da tring em  maiusculos

        System.out.println(var3.contains("FFXIV"));  // contains() checa se o trexto
                                                     // informado contem
                                                     // a String do parâmetro

        System.out.println(var3.split("i")); // ["D", "d yuo know about yhe aclaimed MMO FFXIV?"]

        System.out.println(var3.strip()); // strip() remove espaços do começo e
                                          // do final do texto

        String[] splitted = var3.split(" "); // irá quebrar o texto
                                                  // no delimitador informado e
                                                  // retornar uma lista dos

        for(String word : splitted) {
            System.out.println(word);
        }

        System.out.println(var3.substring(5, 8));
    }
}