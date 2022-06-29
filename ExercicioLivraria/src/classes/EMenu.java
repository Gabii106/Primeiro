package classes;

public enum EMenu {
    SAIR(0),
    ADICIONAR_ITEM(1),
    REMOVER_ITEM(3),
    MOSTRAR_ITENS(4),
    BUSCAR_ITEM(2);

    private int valorOpcao;
    EMenu(int valor) {
        valorOpcao = valor;
    }

    public int getValorOpcao(){
        return this.valorOpcao;
    }
}
