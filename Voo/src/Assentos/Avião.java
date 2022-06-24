package Assentos;

import java.util.ArrayList;

public class Avião implements MaioTransporte {

    private ArrayList<AssentoVoo> assentos;

    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificarOcupacao(String assento) {
        if (getAssentos().isEmpty()){
            System.out.println("Não há assentos disponiveis!");
        } else {
            boolean encontrado = false;
            for (int i = 0; i < assentos.size(); i++){
                if (assentos.contains(assento)){
                    System.out.println("O assento"+assento+"foi encontrado!");
                    encontrado = true;
                }
                else {
                    System.out.println("Assento não está disponivel!");
                }
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int contador = 0;
        if (getAssentos().isEmpty()){
            System.out.println("Não há assentos disponiveis!");
        } else {
            for (int i = 0; i < assentos.size(); i++){
                contador++;
            }
        }
        return contador;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        return null;
    }
}
