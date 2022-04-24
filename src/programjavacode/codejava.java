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

        int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

        if (resposta == 0) {
            JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros");
        }

        resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");

        if (resposta == 0) {
            JOptionPane.showMessageDialog(null, "Sobrou " + resto + " carro");
        }

    }

}


