import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jogo j = new Jogo();
        j.firstRound();
        boolean ex = true;
        while (ex) {
            PlayerOption opt = null;
        }
        ArrayList<Carta> baralho = new ArrayList<>();

        for (Naipe n : Naipe.values()){
            for (ValorCarta vc : ValorCarta.values()){
                Carta c = new Carta();
                c.setValor(vc);
                c.setNaipe(n);
                baralho.add(c);

            }
        }
        for (Carta c : baralho){
            System.out.println(c.getNaipe().getNaipe()+" "+c.getValor().getValor()+" "+c.getNaipe().getNaipe());
        }

    }
}
