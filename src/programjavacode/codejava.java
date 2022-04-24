package programjavacode;

import javax.swing.*;


public class codejava {

    public static void main(String[] args) {

        String numero = JOptionPane.showInputDialog("Qual o valor?");

        double carroNumero = Double.parseDouble(numero);

        int divisao = (int) (carroNumero / 2);

        JOptionPane.showMessageDialog(null, divisao);


    }

}


