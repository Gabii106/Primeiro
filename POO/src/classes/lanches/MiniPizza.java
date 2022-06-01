package classes.lanches;

public class MiniPizza extends Lanche{
    private boolean bordaRecheada;
    private String saborBorda;
    private String sabor;

    public MiniPizza() {
        this.adicionarIngrediente("Queijo Mozzarella");
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Massa de tomate");
        this.setTipo("Mini Pizza");
    }

    public void adicionarSaborEIngredientes(String sabor){
        this.setSabor(sabor);
        switch (sabor.toUpperCase()){
            case "4 QUEIJOS":
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
                break;
            case "CALABRESA":
                this.adicionarIngrediente("Calabresa");
                break;
            case "FRANGO C/ CATUPIRY":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");
                break;
            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Manjericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("ovo");
                break;
        }
    }
    @Override
    public void montarComanda(){
        super.montarComanda();
        if (this.isBordaRecheada()) {
            System.out.println("-- COM BORDA RECHEADA: "+this.getSaborBorda().toUpperCase()+" --");
        }
    }

    public void setBordaRecheada(boolean bordaRecheada){
        this.bordaRecheada = bordaRecheada;
    }

    public boolean isBordaRecheada(){
        return this.bordaRecheada;
    }

    public void setSaborBorda (String saborBorda) {
        this.saborBorda = saborBorda;
    }

    public String getSaborBorda(){
        return  this.saborBorda;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }

    public String getSabor(){
        return this.sabor;
    }

}
