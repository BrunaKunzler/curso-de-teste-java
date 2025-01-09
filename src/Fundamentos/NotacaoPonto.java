package Fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia Bruna";
        s = s.replace("Bruna", "Senhora"); //a ordem das funções altera o resultado final
        s = s.toUpperCase(); //é necessário guardar essa informação em uma nova variavel, senao a função não é aplicada
        s = s.concat("!!!");

        System.out.println(s);

        //outra forma de utilizar o notação ponto
        System.out.println("Bruna".toUpperCase());

        String x = "Bruna".toUpperCase();
        System.out.println(x);

        String y = ("Bruna A").replace("A", "Maria").toUpperCase();
        System.out.println(y);
    }
}
