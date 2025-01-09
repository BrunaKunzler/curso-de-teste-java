package Fundamentos;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Wrapper {
    public static void main(String[] args) {

        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Integer j = Integer.parseInt("10000");
        Long l = 100000L;

        //não podemos usar notação ponto direto nos valores primitivos, mas sim em suas variaveis

        System.out.println(b.byteValue());
        System.out.println(s.toString()); //toString
        System.out.println(j);

        Float f = 123.10F;
        System.out.println(f);

        Double d = 1234.5674;
        System.out.println(d);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        Character ch = '#';
        System.out.println(ch + "...");



    }
}
