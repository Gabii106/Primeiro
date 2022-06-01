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
    @Override
    public void montarComanda(){
        super.montarComanda();
        if (this.getAdicionais()[0] != null) {
            System.out.println("-- ADICIONAIS --");
            for (String adicional : this.getAdicionais()) {
                if (adicional != null) {
                    System.out.println(adicional);
                }
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