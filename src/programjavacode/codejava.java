package programjavacode;

public class codejava {

    public static void main (String[] args) {

        int mediaAluno = 70;
        String nome = "Edward";

        if (mediaAluno >= 70 && nome.equals("Edward")){
            System.out.println("Parabéns você foi aprovado");
        } else if (mediaAluno < 70) {
            System.out.println("Você foi reprovado!");
        }else {
            System.out.println("Não encontrado");
        }

    }

}
