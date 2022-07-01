public enum Naipe {
    COPAS("♥"),
    OURO("♦"),
    ESPADA("♠"),
    PAUS("♣");

private final String naipe;

Naipe (String naipe){
    this.naipe = naipe;
}
public String getNaipe(){
    return this.naipe;
}
}
