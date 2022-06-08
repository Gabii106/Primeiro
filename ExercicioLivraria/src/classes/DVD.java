package classes;

public class DVD extends Item {

    private String diretor;
    private double duração;
    private int anoLancamento;

    // GETTER & SETTER

    public String getDiretor() { return diretor; }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getDuração() {
        return duração;
    }

    public void setDuração(double duração) {
        this.duração = duração;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
