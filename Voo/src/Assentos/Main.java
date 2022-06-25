package Assentos;

public class Main {
    public static void main(String[] args) {
      Onibus onibus = new Onibus(3);
      onibus.getAssento("3").ocupar();
      onibus.mostrarAssentos();

    }
}
