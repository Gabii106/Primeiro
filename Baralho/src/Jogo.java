import java.util.ArrayList;

public class Jogo {
    private ArrayList<Carta> handPlayer = new ArrayList<>();
    private ArrayList<Carta> handCPU = new ArrayList<>();
    private Baralho deck;
    private int playerWins;

    public void firstRound(){
        //todo
    }
    public void handPlayerOption(PlayerOption option) {
        //todo
    }
    public void playerWin(){
        //todo
    }
    public void oneMore(){
        //todo
    }
    public void stop(){
        //todo
    }
    public void doubleCard(){
        //todo
    }

    public ArrayList<Carta> getHandPlayer() {
        return handPlayer;
    }

    public void setHandPlayer(ArrayList<Carta> handPlayer) {
        this.handPlayer = handPlayer;
    }

    public ArrayList<Carta> getHandCPU() {
        return handCPU;
    }

    public void setHandCPU(ArrayList<Carta> handCPU) {
        this.handCPU = handCPU;
    }

    public Baralho getDeck() {
        return deck;
    }

    public void setDeck(Baralho deck) {
        this.deck = deck;
    }

    public int getPlayerWins() {
        return playerWins;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }
}
