import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ExerciciosRecap {
    // 16/05
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        exe10();
    }

    public static void exe01() {
        System.out.println("Informe um número: ");
        String numero = String.valueOf(in.nextInt());
        //String inverso = "";
        for (int i = numero.length()-1; i >= 0; i--) {
       //     inverso = inverso + String.valueOf(numero.charAt(i));
            System.out.print(numero.charAt(i));
        }
        //System.out.println(inverso);
    }

    public static void exe02() {
        int maior=0;int menor = 0;
        int parada = -1;
        boolean primeiro = true;
        while (true) {
            System.out.println("Informe um número (0 para sair): ");
            parada = in.nextInt();
            if (parada == 0 ){
                break;
            }

            if (primeiro){
                menor = parada;
                maior = parada;
                primeiro = false;
            } else {
                if (parada>maior){
                    maior=parada;
                }
                if (parada<menor) {
                    menor = parada;
                }
            }
        }
        System.out.println("Menor valor informado: "+menor);
        System.out.println("Maior valor informado: "+maior);
    }

    public static void exe03() {
        Random r = new Random();
        int randomico = r.nextInt(101);
        int chutes=0;
        while (true) {
            System.out.println("Informe um número: ");
            int valorInformado = in.nextInt();
            chutes++;
            if (valorInformado == randomico){
                System.out.println("VOCÊ ACERTOU!!!");
                break;
            } else if (valorInformado>randomico) {
                System.out.println("Chutou muito alto, tente novamente!");
            } else {
                System.out.println("Chutou muito baixo, tente novamente!");
            }
        }
        System.out.println("Você tentou " +chutes+" vezes");
    }

    public static void exe04() {

            for(int i = 0; i < 4 ; i++) {
                for (int j = 0; j < 10; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        System.out.println("");
            for (int i = 0; i < 5; i++){
                for (int j = 0; j < i + 1; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        System.out.println("");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i + j < 4){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j < 4 || j-i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
            }
        }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j < 4 || j-i > 4) {
                    System.out.print(" ");
                } else {
                    System.out.print(i+1);
                }
            }
            System.out.println("");
    }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j < 4 || j-i > 4) {
                    System.out.print(" ");
                } else if (j>4) {
                    System.out.print(Math.abs(j-3));
                } else {
                    System.out.print(Math.abs(j-5));
                }
            }
            System.out.println("");
        }}

    // 17/05

    public static void exe1() {
        System.out.println("Digite algo: ");
        String algo = in.nextLine();
        System.out.println("Length: " + algo.length());
        System.out.println("Empty: " + algo.isEmpty());
        System.out.println("Uppercase: " + algo.toUpperCase());
        System.out.println("Lowercase: " + algo.toLowerCase());
    }

    public static void exe2() {
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();

        if (algumaCoisa.equals(algumaOutraCoisa)){
            System.out.println("São totalmente iguais");
        } else if (algumaCoisa.equalsIgnoreCase(algumaOutraCoisa)) {
            System.out.println("São iguais independente de case");
        } else {
            System.out.println("São diferentes");
        }

    }

    public static void exe3() {
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();

        if (algumaCoisa.contains(algumaOutraCoisa)){
            System.out.println(algumaOutraCoisa+" faz parte de "+algumaCoisa);
        } else if (algumaOutraCoisa.contains(algumaCoisa)) {
            System.out.println(algumaCoisa +" faz parte de "+ algumaOutraCoisa);
        } else {
            System.out.println("Nenhuma string faz parte da outra");
        }
    }

    public static void exe4() {
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();

        if(algumaCoisa.startsWith(algumaOutraCoisa)){
            System.out.println(algumaOutraCoisa+" é prefixo de "+algumaCoisa);
        } else if (algumaOutraCoisa.startsWith(algumaCoisa)) {
            System.out.println(algumaCoisa+" é prefixo de "+algumaOutraCoisa);
        } else {
            System.out.println("Nenhuma string é prefixo da outra");
        }

    }
    public static void exe5() {
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();

        if (algumaCoisa.endsWith(algumaOutraCoisa)){
            System.out.println(algumaOutraCoisa+" é sufixo de "+algumaCoisa);
        } else if (algumaOutraCoisa.endsWith(algumaCoisa)) {
            System.out.println(algumaCoisa+" é sufixo de "+algumaOutraCoisa);
        } else {
            System.out.println("Nenhuma string é sufixo da outra");
        }
    }
    public static void exe6() {
        System.out.println("Digite alguma coisa: ");
        String algumaCoisa = in.nextLine();
        System.out.println("Digite alguma coisa (de novo): ");
        String algumaOutraCoisa = in.nextLine();
        int posição = algumaCoisa.indexOf(algumaOutraCoisa);
        System.out.println("A posição de "+algumaOutraCoisa+" em "+algumaCoisa+" é "+ posição);
    }

    public static void exe7() {
       String cyphered = "lala#lwve#-rwgra22lalang!#<3";
       String decypheed = cyphered.replace("w","o");
       decypheed = decypheed.replace("#"," ");
        decypheed = decypheed.replace("2","m");
        decypheed = decypheed.replace("lala","i");
        decypheed = decypheed.replace("-","p");
        System.out.println(decypheed);
    }

    public static void exe8() {
        System.out.println("Informe a quantidade de números: ");
        int nums = in.nextInt();
        int[] numeros = new int[nums];

        for (int i = 0;i < nums;i++) {
            System.out.println("Informe um número");
            numeros[i] = in.nextInt();
        }
        int somaPar = 0, somaImpar = 0;
        for (int valor : numeros) {
            if (valor % 2 == 0) {
                somaPar+=valor;
            }else {
                somaImpar+=valor;
            }
        }
        System.out.println("Soma dos valores pares: "+somaPar);
        System.out.println("Soma dos valores impares: "+somaImpar);
    }

    public static void exe9() {
        System.out.println("Informe a quantidade de palavras: ");
        int nums = in.nextInt();
        String[] palavras = new String[nums];
        in.nextLine();
        for (int i = 0; i<nums;i++) {
            System.out.println("Informe uma palavra: ");
            palavras[i] = in.nextLine();
        }
        System.out.println("Informe um número > 0: ");
        int numeroCorte = in.nextInt();
        for (int i = 0; i < nums ; i++) {
            if (palavras[i].length() < numeroCorte) {
                palavras[i] = null;
            } //else {
            // System.out.println(palavras[i]);
            //}
        }
            for (String palavra : palavras){
                if (palavra != null) {
                    System.out.println(palavra);
                }
            }
        }

    public static void exe10() {
        System.out.println("Informe a quantidade de números (lista 1): ");
        int nums1 = in.nextInt();
        int[] numeros1 = new int[nums1];
        for (int i = 0; i < nums1; i++) {
            System.out.println("Informe um número: ");
            numeros1[i] = in.nextInt();
        }

        System.out.println("Informe a quantidade de números (lista 2): ");
        int nums2 = in.nextInt();
        int[] numeros2 = new int[nums2];
        for (int i = 0; i < nums2; i++) {
            System.out.println("Informe um número: ");
            numeros2[i] = in.nextInt();
        }

        for (int valor1 : numeros1) {
            boolean achou = false;
            for (int valor2 : numeros2) {
                if (valor1 == valor2) {
                    achou = true;
                    break;
                }
            }
            if (!achou){
                System.out.println(valor1);
            }
        }}

}

