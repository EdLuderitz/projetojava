package programjavacode;

import java.util.Scanner;

public class codejava {

    public static void main(String[] args) {

        for (int numero = 10; numero >= 0; numero--) {

            if (numero == 7) {
                System.out.println("Chegou no número 7");
                break;
            } else{
                System.out.println("O número é: " + numero);
            }

        }

    }

}
