package classes.lanches;

public abstract class Sanduiche extends Lanche {

    private String[] adicionais = new String[10];


    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < 10; i++) {
            if (this.getAdicionais()[i] == null) {
                this.getAdicionais()[i] = adicional;
                break;
            }
        }
    }
    public void setAdicionais(String[] adicionais){
        this.adicionais = adicionais;
    }

    public String[] getAdicionais(){
        return this.adicionais;
    }

}