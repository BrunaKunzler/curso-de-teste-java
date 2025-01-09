package Fundamentos;

public class PrimitivoVsObjetos {
    public static void main(String[] args) {

        //Tudo em java é objeto, menos os tipos primitivos

        String s = ("Texto"); //é a mesma coisa que:

        String g = new String("texto");
        g.toUpperCase();

        //Wrappers são a versão objeto dos tipos primitivos!

        int a = 123;
        System.out.println(a);

    }
}
