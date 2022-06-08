package classes;

import java.util.Scanner;
import classes.Avaliaçao;

public abstract class Item {
    private String titulo;
    private String genero;
    private double valor;

    private Avaliaçao[] avaliacoes = new Avaliaçao[30];

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
        for (int i = 0; i < getAvaliacoes().length; i++){
            if (getAvaliacoes()[i] == null) {
                getAvaliacoes()[i] = a;
                break;
            }
        }
    }

    public double getTotalRanting(){
        double soma = 0;
        int contador = 0;
        for (Avaliaçao a : getAvaliacoes()){
            if (a != null){
                soma += a.getRating();
                contador++;
            }
        }
        return soma / contador;
    }

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
    public Avaliaçao[] getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(Avaliaçao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}