package classes;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Avaliaçao {

    private double rating;
    private String nome;
    private String feedback;
    private LocalDateTime dataAvaliação = LocalDateTime.now();

    // GETTER & SETTER

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public LocalDateTime getDataAvaliação() {
        return dataAvaliação;
    }

    public void setDataAvaliação(LocalDateTime dataAvaliação) {
        this.dataAvaliação = dataAvaliação;
    }
}
