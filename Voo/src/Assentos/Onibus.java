package Assentos;

import java.util.ArrayList;

public class Onibus implements MaioTransporte {

    private ArrayList<AssentoOnibus> assentos;

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificarOcupacao(String assento) {
        return false;
    }

    @Override
    public int quantidadeLivre() {
        return 0;
    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        return null;
    }
}
