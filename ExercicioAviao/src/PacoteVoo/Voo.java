package PacoteVoo;

public class Voo {
    public String[][] codificaçãoAssento;
    public boolean[][] ocupaçãoAssento;

    public boolean  verificaOcupação(String codigo) {
        for (int i = 0; i < ocupaçãoAssento.length;i++){
            for (int d = 0; d < ocupaçãoAssento[i].length; d++) {
                if (codificaçãoAssento[i][d].equalsIgnoreCase(codigo.strip())){
                    if (ocupaçãoAssento[i][d]){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void ocupar(String codigo){
        boolean achou = false;
        loopDeBusca: for (int i = 0; i < ocupaçãoAssento.length;i++){
            for (int d = 0; d < ocupaçãoAssento[i].length; d++) {
                if (codificaçãoAssento[i][d].equalsIgnoreCase(codigo.strip())){
                    if (!ocupaçãoAssento[i][d]){
                        ocupaçãoAssento[i][d] = true;
                        codificaçãoAssento[i][d] = "XX";
                        System.out.println("Assento "+codigo+" foi reservado");
                        achou = true;
                        break loopDeBusca;
                    }
                    else {
                        System.err.println("Assento "+codigo+" já está reservado");
                        achou = true;
                        break loopDeBusca;
                    }
                }
            }
        }
        if (!achou){
            System.err.println("Assento "+codigo+" já está reservado ou não existe");
        }
    }

    public int quantidadeLivre(){
        int assentosLivres  = 0;
        for (int i = 0; i < ocupaçãoAssento.length;i++){
            for (int d = 0; d < ocupaçãoAssento[i].length; d++){
                if (ocupaçãoAssento[i][d] == false){
                    assentosLivres++;
                }
            }
        }
        return assentosLivres;
    }

    public void mostrarAssentos(){
        for (int i = 0; i < codificaçãoAssento.length; i++){
            for (int d = 0; d<codificaçãoAssento[i].length;d++){
                System.out.print(codificaçãoAssento[i][d]+" ");
    }
            System.out.println();
        }
    }

    public Voo(int linha, int coluna) {
        String codigo ="";
               this.codificaçãoAssento = new String[linha][coluna];
               this.ocupaçãoAssento = new boolean[linha][coluna];
               for (int i = 0; i < codificaçãoAssento.length; i++){
                   for (int d = 0; d<codificaçãoAssento[i].length;d++){
                       switch (i){
                           case 0: codigo = "A"; break;
                           case 1: codigo = "B"; break;
                           case 2: codigo = "C"; break;
                           case 3: codigo = "D"; break;
                           case 4: codigo = "E"; break;
                           case 5: codigo = "F"; break;
                           case 6: codigo = "G"; break;
                           case 7: codigo = "H"; break;
                           case 8: codigo = "I"; break;
                           case 9: codigo = "J"; break;
                           case 10: codigo = "K"; break;
                           case 11: codigo = "L"; break;
                           case 12: codigo = "M"; break;
                           case 13: codigo = "N"; break;
                           case 14: codigo = "O"; break;
                           case 15: codigo = "P"; break;
                           case 16: codigo = "Q"; break;
                           case 17: codigo = "R"; break;
                           case 18: codigo = "S"; break;
                           case 19: codigo = "T"; break;
                           case 20: codigo = "U"; break;
                           case 21: codigo = "V"; break;
                           case 22: codigo = "W"; break;
                           case 23: codigo = "X"; break;
                           case 24: codigo = "Y"; break;
                           case 25: codigo = "Z"; break;
                       }
                       codificaçãoAssento[i][d] = codigo+(d+1);
                   }
               }
           }
        }