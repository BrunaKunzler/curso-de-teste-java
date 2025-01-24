package Fundamentos.Operadores;

public class DesafiosAritieticos {
    public static void main(String[] args) {

        double parte1 = 6* (3+2);
        double parte1Potencia = Math.pow(parte1, 2);

        double parte2 = (1-5) * (2-7);
        double parte2Potencia = Math.pow(parte2, 2);

        double divParte1 = parte1Potencia / (3*2);

        double divParte2 = parte2Potencia / 2;

        double subtracao = divParte1 - divParte2;

        double potenciaMaior = Math.pow(subtracao, 3);

        double potenciaDivisao = Math.pow(10, 3);

        double divisao = potenciaMaior / potenciaDivisao;

        System.out.println(divisao);




    }
}
