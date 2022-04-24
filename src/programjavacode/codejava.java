package programjavacode;

import javax.swing.*;


public class codejava {

    public static void main(String[] args) {

        String carros = JOptionPane.showInputDialog("Quantos carros?");
        String pessoas = JOptionPane.showInputDialog("Quantas pessoas?");

        double carroNumero = Double.parseDouble(carros);
        double pessoaNumero = Double.parseDouble(pessoas);

        int divisao = (int) (carroNumero / pessoaNumero);

        double resto = carroNumero % pessoaNumero;

        JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros" +
                " e sobrou " + resto + "carro");
    }

}


