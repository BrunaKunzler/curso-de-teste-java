package Fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite o primeiro número: ");

        String num2 = JOptionPane.showInputDialog("Digite o segundo número: ");

        System.out.println(num1 + num2);

        double numero1 = Double.parseDouble(num1);
        double numero2 = Double.parseDouble(num2);

        double soma = numero1 + numero2;



    }
}
