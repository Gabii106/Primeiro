import java.util.ArrayList;

public class Carta {
private Naipe naipe;
private ValorCarta valor;
private int valorReal;

//private ArrayList<Baralho> baralhos = new ArrayList<>();

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public ValorCarta getValor() {
        return valor;
    }

    public void setValor(ValorCarta valor) {
        this.valor = valor;
    }

    public int getValorReal() {
        return valorReal;
    }

    public void setValorReal(int valorReal) {
        this.valorReal = valorReal;
    }
}
