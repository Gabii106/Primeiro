package classes.lanches;

public class HotDog extends Sanduiche {

    public HotDog(){
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Purê de batata");
        this.adicionarIngrediente("Batata palha");
        this.adicionarIngrediente("Vinagrete");
        this.adicionarIngrediente("Queijo cheddar");
        this.adicionarIngrediente("Milho");
        this.adicionarIngrediente("Ervilha");
        this.setTipo("Hot Dog");
    }

}
