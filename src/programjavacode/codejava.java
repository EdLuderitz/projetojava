package programjavacode;

import java.util.Scanner;

public class codejava {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int mediaAluno;
        System.out.println("Qual o valor?");
        mediaAluno = ler.nextInt();

        switch (mediaAluno) {
            case 70:
                System.out.println("Aluno Aprovado");
                break;

            default: System.out.println("Outro valor inserido: " + mediaAluno);
            break;
        }

    }

}
