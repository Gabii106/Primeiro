package classes.lanches;

public enum ETipoLanche {
    X_SALADA("(1) - ", "- X-Salada"),
    X_BURGUER("(2) - ","X-Burguer"),
    MISTO_QUENTE("(3) - ","Misto Quente"),
    HOT_DOG("(4) - ","Hot Dog"),
    MINI_PIZZA("(5) - ","Mini Pizza"),
    PIZZA("(6) - ","Pizza");

    private String valor;
    private String descrição;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    ETipoLanche(String valor, String descrição) {
        this.valor = valor;
        this.descrição = descrição;
    }
}
