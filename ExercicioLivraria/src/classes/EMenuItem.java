package classes;
public enum EMenuItem implements IMenu{
    VOLTAR(0,"Voltar"),
    VER_AVALIAÇÕES(1, "Ver avaliações"),
    AVALIAR_ITEM(2,"Avaliar"),
    MOSTRAR_DETALHES(3,"Mostrar detalhes");

    private int valorOpcao;
    private String descricao;
    EMenuItem(int valor, String descricao) {
        valorOpcao = valor;
        this.descricao = descricao;
    }

    public static EMenuItem getByValorOpcao(int escolha){
        for (EMenuItem e : EMenuItem.values()){
            if (e.getValorOpcao() == escolha){
                return e;
            }
        }
        throw new RuntimeException("Não encontrado!");
    }
    public int getValorOpcao() {
        return valorOpcao;
    }
    public String getDescricao() {
        return descricao;
    }
}
