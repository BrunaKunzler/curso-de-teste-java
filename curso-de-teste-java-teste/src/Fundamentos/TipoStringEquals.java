package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        System.out.println("2" == "2"); //resultado é TRUE

        String s1 = new String("2");
        System.out.println("2" == s1); //resultado foi false, mas por causa da forçação de barra do new string

        System.out.println("2".equals(s1)); //aqui ele verifica se 2 é igual a s1

        Scanner Entrada = new Scanner(System.in);

        String s2 = Entrada.next();  //.next() tambem retira todos espaços em branco, ja o .nextLine() nao retira os espaços3
        System.out.println("2".equals(s2.trim()));  //.trim() remove todos espaços em branco da linha


        Entrada.close();



    }
}
