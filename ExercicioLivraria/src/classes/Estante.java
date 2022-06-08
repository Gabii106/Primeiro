package classes;

public class Estante {
    private int capMaxima;
    private Item[] itens;

    public Estante (int capMaxima){
        setCapMaxima(capMaxima);
        setItens(new Item[capMaxima]);
    }

    public boolean estanteCheia() {
        if (quantidadeItens() == capMaxima) {
            return true;
        }
        return true;
    }

    public int quantidadeItens(){
        int contador = 0;
        for (int i = 0; i < capMaxima; i++){
            if (itens != null){
                contador++;
            }
        }
        return contador;
    }

    public Item buscarItem(String titulo){
       // for (Item i : getItens()) {
          //  if (buscarItem().equalsIgnoreCase(titulo)) {
        //    }
       // }
return null;
    }

    public boolean adicionarItem(Item item){
        //todo
        return false;
    }

    public Item removerItem(int posicao){
        //todo
        return null;
    }

    // SETTER & GETTER

    public int getCapMaxima() {
        return capMaxima;
    }
    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }
    public Item[] getItens() {
        return itens;
    }
    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}
