package Introd;

public class Aluno {
// variáveis:

    public int nroAluno, idade;
    public String nome;
    float p1, p2;

    // método construtor sem parâmetro:
    public Aluno() {
    }

    // método construtor com parâmetro:
    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    void dadosAluno() {
        System.out.println("Número do Aluno:" + this.nroAluno + ", nome " + this.nome);
    }

    float calcMedia() {
        return (this.p1 + this.p2) / 2;
    }

    String verifAprovacao() {
        String resultado = (this.calcMedia() >= 6) ? "Aluno aprovado" : "Aluno reprovado";
        return resultado;
    }
}
