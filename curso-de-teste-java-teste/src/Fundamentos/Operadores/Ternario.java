package Fundamentos.Operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 3.6;
        String resultadoParcial = media >= 5 ? "em recuperação" : "reprovado";

        //double media = 7.6;
        String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;

        //Os operadores ternarios são, ? que separa a expressão do calculo dos resultados
        //E o outro operador ternario é :, que separa os resultados.

        System.out.println("O Aluno esta " + resultadoFinal);


        double media1 = 8.6;
        //Tambem é possivel colocar uma operação ternaria dentro de outra.
        String resultadoFinal1 = media1 >= 7.0 ? "aprovado." : media1 >= 5 ? "em recuperação" : "reprovado";
        System.out.println("O Aluno esta " + resultadoFinal1);
    }
}
