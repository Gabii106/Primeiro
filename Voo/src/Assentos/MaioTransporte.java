package Assentos;

import Assentos.Assento;

public interface MaioTransporte {

     boolean verificarOcupacao(String assento);

     int quantidadeLivre();

     void mostrarAssentos();

     Assento getAssento(String assento);
}
