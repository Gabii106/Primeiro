package classes;

import java.util.ArrayList;
import java.util.Scanner;
import classes.Avaliaçao;

public abstract class Item {
    private String titulo;
    private String genero;
    private double valor;

    private ArrayList<Avaliaçao> avaliacoes = new ArrayList<>();

    // Metodos

    public void avaliar(){
        Scanner in = new Scanner(System.in);
        Avaliaçao a = new Avaliaçao();
        System.out.print("Inforne o nome do avaliador: ");
        a.setNome(in.nextLine());
        System.out.println("Informe uma nota de 0 a 10: ");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.print("Informe algum feedback (opicional): ");
        a.setFeedback(in.nextLine());
        this.avaliacoes.add(a);
    }

    public double getTotalRanting(){
        Double valor = this.avaliacoes.stream().mapToDouble(Avaliaçao:: getRating).sum() / this.avaliacoes.size();
        return valor.isNaN() ? 0 : valor;
    }

    public abstract void montarDetalhes(Scanner in);
    public abstract void mostrarDetalhes();

    // GETTER & SETTER

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public ArrayList<Avaliaçao> getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(ArrayList<Avaliaçao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
