package wsb.c3.prtest;

public class Klasa {

    private String string = "Hello";

    public Klasa() {
    }

    public Klasa(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "string='" + string + '\'' +
                '}';
    }
}
