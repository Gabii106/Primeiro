import classes.Livro;

public class Main {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.setTitulo("Harry Potter e a Autora Transfobica");
        l.avaliar();
        l.avaliar();
        l.avaliar();
        System.out.println(l.getTotalRanting());
    }
}
