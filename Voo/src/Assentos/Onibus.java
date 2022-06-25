package Assentos;

import java.util.ArrayList;

public class Onibus implements MaioTransporte {

    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();
    private boolean leito;

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    public Onibus(int linhaCadeira) {
        for (int i = 1; i <= (linhaCadeira * 4); i++) {
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            assentos.add(a);
        }
    }

    @Override
    public boolean verificarOcupacao(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int assentosLivres = 0;
        for (AssentoOnibus a : this.assentos) {
            if (!a.isOcupado()) {
                assentosLivres++;
            }
        }
        return assentosLivres;
    }

    @Override
    public void mostrarAssentos() {
        for (int i = 0; i < assentos.size(); i++) {
            if (assentos.get(i).isOcupado()){
                System.out.print("[XX] ");
            } else {
                if (i < 9) {
                        System.out.print("[0" + assentos.get(i).getLugar() + "] ");

                } else {
                        System.out.print("[" + assentos.get(i).getLugar() + "] ");
                    }
                }
                if ((i + 1) % 4 == 0) {
                    System.out.println();
                }
                if ((i + 1) % 2 == 0 && (i + 1) % 4 != 0) {
                    System.out.print("|| ");
                }
    }
}

    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }
}
