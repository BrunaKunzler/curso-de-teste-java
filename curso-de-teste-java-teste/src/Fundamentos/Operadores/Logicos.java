package Fundamentos.Operadores;


public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true; //true
        boolean condicao2 = 3 > 7; //false

        System.out.println(condicao1 && condicao2); //condição E, precisa de dois TRUEs para ser verdadeira.
        System.out.println(condicao1 || condicao2); //condição OU, precisa de apenas um TRUE para ser verdadeira;
        System.out.println(condicao1 ^ condicao2); //condição exclusiva OU,apenas um pode ser escolhido.

        //TABELA VERDADE

        System.out.println("Tabela Verdade && (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Tabela Verdade || (OU)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Tabela Verdade ^ (OU EXCLUSIVO XOR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("Tabela Verdade  NOT !");
        System.out.println(!true);
        System.out.println(!false);
    }
}
