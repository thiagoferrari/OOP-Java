package Introd;

public class TestaAluno {

    public static void main(String[] args) {
        Aluno obj1 = new Aluno(10, 22, "Fulano", 6, 8);
        obj1.dadosAluno();
        System.out.println("Situação do Aluno: " + obj1.verifAprovacao());

        Aluno obj2 = new Aluno(10, 22, "Fulano", 6.5f, 8.45f);
        obj2.dadosAluno();
        System.out.println("Situação do Aluno: " + obj2.verifAprovacao());

    }

}