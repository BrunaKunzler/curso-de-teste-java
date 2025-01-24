package Fundamentos.Operadores;

public class DesafiosLogicos {
    public static void main(String[] args) {

        boolean serviço1 = true;
        boolean serviço2 = true;

        boolean TV50 = serviço1 && serviço2;
        System.out.println("A Familia vai ao shopping comprar a TV50¨ e tomar sorvete " + TV50);

        boolean TV30 = serviço1 ^ serviço2;
        System.out.println("A Familia vai ao shopping comptar a TV30¨ e tomar sorvete " + TV30);

        boolean semTV = serviço1 || serviço2;
        System.out.println("A familia nao foi ao shopping comprar a TV e ficou sem sorvete " + semTV);

    }
}
