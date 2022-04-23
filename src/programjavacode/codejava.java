package programjavacode;

import java.util.Scanner;

public class codejava {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mediaAluno;
        System.out.println("Qual o valor?");
        mediaAluno = ler.nextInt();

        if(mediaAluno >= 50){
            if(mediaAluno >= 70){
                System.out.println("Você foi aprovado");
            } else {
                System.out.println("Você está em recuperaçãp");
            }
        } else {
            System.out.println("Você foi reprovado");
        }
    }

}
