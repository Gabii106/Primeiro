package PacoteListaDeTarefas;

import java.util.UUID;

public class ChecklistItem {
    private String uuid;
    private String nome;
    private String descricao;
    private boolean completa;
    private int ordem;

    public ChecklistItem() {
        this.setUuid(UUID.randomUUID().toString());
    }

    public void completar(){
        setCompleta(true);
    }

    //Setters e Getters

    public void setNome(String nome){ this.nome = nome; }
    public String getNome(){ return this.nome;}

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getDescricao() { return descricao; }

    public void setCompleta(boolean completa) { this.completa = completa; }
    public boolean isCompleta() { return completa; }

    public void setOrdem(int ordem) { this.ordem = ordem; }
    public int getOrdem() { return ordem; }

    public void setUuid(String uuid) { this.uuid = uuid; }
    public String getUuid() { return uuid; }
}
