package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String s = "Boa Tarde";

        System.out.println(s.concat("!!!"));
        System.out.println(s +  "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));
        System.out.println(s.length());

        var nome = "Bruna";
        var sobrenome = "Kunzler";
        var idade = 27;
        var salario = 7500.14444;

        System.out.printf("Nome: %s %s, idade %d e ganha R$%.2f", nome, sobrenome, idade, salario);

        //é possivel colocar essa configuração dentro de uma variavel string

        String frase = String.format("\nNome: %s %s, idade %d e ganha R$%.2f", nome, sobrenome, idade, salario);

        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual")); //em qual posição começa a palavra qual
        System.out.println("Frase qualquer".substring(6,9));
    }
}
