package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        final int AJUSTE = -32;
        final double FATOR = 5.0 / 9;

        double fahrenheiht;
        double celsius;

        fahrenheiht = 27;
        celsius = (fahrenheiht + AJUSTE) * FATOR;
        System.out.println(celsius);
    }
}
