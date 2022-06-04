package PacoteListaDeTarefas;

public class ListaTarefas {
    private int tamanhoLista;
    private String nomeLista;

    private Tarefa[] tarefas;

    public ListaTarefas(int tamanhoLista){
        //todo
    }

    public boolean adicionarTarefa(Tarefa tarefa){
        //todo
        return false;
    }

    public Tarefa buscarTarefa(int posicao){
        //todo
        return null;
    }

    public boolean alterarOrdemTarefa(Tarefa tarefa, int novaPosicao){
        //todo
        return false;
    }

    // GETTER & SETTER

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int tamanhoLista) {
        this.tamanhoLista = tamanhoLista;
    }

    public String getNomeLista() {
        return nomeLista;
    }

    public void setNomeLista(String nomeLista) {
        this.nomeLista = nomeLista;
    }

    public Tarefa[] getTarefas() {
        return tarefas;
    }

    public void setTarefas(Tarefa[] tarefas) {
        this.tarefas = tarefas;
    }
}
