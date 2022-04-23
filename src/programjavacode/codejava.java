package programjavacode;

import java.util.Scanner;

public class codejava {

    public static void main(String[] args) {

        for (int numero = 10; numero >= 0; numero--) {

            if (numero == 7 || numero == 3 || numero == 9) {
                System.out.println("Chegou no número: " + numero);
                continue;
            }
            System.out.println("Processando laço de repetição");
        }

    }

}


