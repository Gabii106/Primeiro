public enum ValorCarta {
    ÁS("Ás"),
    DOIS("2"),
    TRÊS("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    DEZ("10"),
    VALETE("J"),
    DAMA("Q"),
    REI("K");

    private String valor;
    ValorCarta (String valor){
       this.valor = valor;
    }
    public String getValor(){
        return this.valor;
    }

}
