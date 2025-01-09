package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom"); //sem quebra de linha após o fim
        System.out.println("  dia\n\n"); //sem quebra de linha automatica, mas com o \n\n irá quebrar duas linhas

        System.out.println("Bom"); //quebra de linha autmática
        System.out.printf("Megasena: %d %d %d %d %d %d", 2, 14, 59, 42, 10, 7);
        System.out.printf("Sálario %.1f%n", 1000.984);

        Scanner entrada = new Scanner(System.in);  //Aqui apenas inicializo o scanner

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();         //Aqui de fato uso ele

        System.out.println("\nNome: " + nome);

        System.out.println("\nDigite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("\n Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos. %n", nome, sobrenome, idade);

        entrada.close();
    }
}
