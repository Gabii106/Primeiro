package classes.pedido;

import classes.lanches.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pedido {

    private ArrayList<Lanche> lanches = new ArrayList<>();
    private LocalDateTime dataPedido = LocalDateTime.now();

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void imprimirComanda(){
        System.out.println("Data do pedido: "+dataPedido.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        for (Lanche l: this.getLanches()){
            l.mostrarDetalhesComanda();
            System.out.println("-INGREDIENTES-");
            for (String ingrediente : l.getIngredientes()) {
                if (ingrediente != null) {
                    System.out.println(ingrediente);
                }
            }
            System.out.printf("Valor: R$%.2f\n", l.getValor());
        }
        System.out.printf("Valor total do pedido: R$%.2f\n", this.calcularValorTotal());
        System.out.println("-----------------------------------");
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Lanche l : this.getLanches()){
            valorTotal += l.getValor();
        }
        return valorTotal;
    }
    public void adicionarLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public ArrayList<Lanche> getLanches(){
        return this.lanches;
    }
}
