package Fundamentos.Operadores;

public class Unarios {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; //a = a + 1;
        a--; //b = b - 1;

        ++b;
        --b;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini Desafio");
        System.out.println(++a == b--); //quando o incremento vem antes, o sistema o realiza com "pressa", porem, quando vem depois, primeiro é feita a comparação e depois o decrescimo
                                        //por isso esse resiltado deu TRUE, quando na verdade seria FALSE
        System.out.println(a == b);

        System.out.println(a);
        System.out.println(b);
    }
}
