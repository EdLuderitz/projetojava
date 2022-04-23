package programjavacode;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class codejava {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mediaAluno;
        int mediaAluno2;
        System.out.println("Qual o valor?");
        mediaAluno = ler.nextInt();
        System.out.println("Qual o valor?");
        mediaAluno2 = ler.nextInt();

        if (mediaAluno == mediaAluno2 ){
            System.out.println("As notas são iguais");
        } else {
            System.out.println("As notas não são iguais");
        }

    }

}
