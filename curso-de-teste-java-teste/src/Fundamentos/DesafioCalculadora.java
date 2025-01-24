package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double valor1 = Entrada.nextDouble();

        System.out.println("Informe o segundo número: ");
        double valor2 = Entrada.nextDouble();

        System.out.println("Informe o tipo de operação: ");
        String sinal = Entrada.next();

        System.out.printf("O resultado é: %f %s %f", valor1, sinal, valor2);

        Entrada.close();
    }
}
