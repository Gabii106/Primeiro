package classes;

import java.util.Scanner;

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

    @Override
    public void montarDetalhes(Scanner in) {
        System.out.print("Informe o nome do diretor: ");
        this.setDiretor(in.nextLine());
        System.out.print("Informe o ano de lançamento: ");
        this.setAnoLancamento(in.nextInt());
        System.out.print("Informe a duração: ");
        this.setDuração(in.nextDouble());
        in.nextLine();
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Diretor: "+this.getDiretor());
        System.out.println("Ano de lançamento: "+this.getAnoLancamento());
        System.out.println("Duração: "+this.getDuração());
    }
}
