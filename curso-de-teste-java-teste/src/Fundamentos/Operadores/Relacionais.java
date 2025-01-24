package Fundamentos.Operadores;

public class Relacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b); // a resposta é TRUE pois cada letra tem um valor na tabela hexadecimal

        System.out.println(3 > 4);  //maior que
        System.out.println( 3 >= 3); //maior ou igual que
        System.out.println( 3 < 7 ); //menor que
        System.out.println(30 <= 7); //menor ou igual que
        System.out.println(30 != 7); //diferente de
    }
}
