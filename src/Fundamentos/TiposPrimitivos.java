package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informação funcionário

        //Tipos numericos inteiros
        byte anosDeEmpresa = 23;
        short numeroVoos = 500;
        int id = 56789;
        long pontosAcumulados = 3_134_557_223L; //Colocamos o L para deferir que é de fato um long, caso coloque um número maior (ex: 3bi) seria maior que inteiro, então preciso adicionar o L//podemos usar _ para facilitar a leitura, sem afetar o código.

        //Tipos numéricos reais
        float salario = (float) 11_445.4; //ou float sálario = 11_445.4F;
        double vendasAcumuladas = 2_991_169_103.10; //esse não precisa descever com letra pois java reconhece como proprio double

        //Tipo booleano
        boolean estaDeFerias = true; //false

        //Tipo caractere
        char status = 'a'; //aceita apenas um caracter e não aceita "" apenas ''

        //Dias de Empresa
        System.out.println(anosDeEmpresa * 365);

        //Números de viagens
        System.out.println(numeroVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);

        //Ferias
        System.out.println("Férias? -> " + estaDeFerias);

        //Status
        System.out.println("Status -> " + status);


    }
}
