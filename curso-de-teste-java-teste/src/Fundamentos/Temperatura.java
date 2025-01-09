package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {

        final double AJSUTE = 32;
        final double FATOR = 5.0/9.0; //sempre deixar variaveis iguais juntas;

        int fahrenheit = 100;

        double celsius = (fahrenheit - AJSUTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C.");
    }
}
