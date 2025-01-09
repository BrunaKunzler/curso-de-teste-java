package Fundamentos;

public class ConversaoTipoPrimitivosNumericos {
    public static void main(String[] args) {
        double a = 1;  //aqui é conversão implicita do java, conversteu de double para inteiro
        System.out.println(a);

        float b = (float) 1.0;  //aqui é a conversão explicita do java. Tambem é possivel faezr isso colocanco apenas o F ao fim do numero.
        System.out.println(b);  //conversão explicita se chama CAST

        //caso coloque um valor acima do que o float suporta, ocorrera truncamento de informação
        //truncamento é um corte na informação

        float c = (float) 1.1234567898744444; //valor imprimido é 1.1234568
        System.out.println(c);

        double d = 1.1234567898744444;  //ja o double suporta esse valor
        System.out.println(d);

        int f = 4;  //valor maximo do byte é 127, caso passe um valor maior, ocorre truncamento
        byte g = (byte) f;
        System.out.println(g);

        int h = 130;
        byte i = (byte) h;
        System.out.println(i);   //imprimiu -126, pois 130 nao cabe no byte

        double j = 1.999999;
        int k = (int) j;
        System.out.println(k);


    }
}
