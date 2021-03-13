package Exe02;

public class Aluno {

    private int id;
    private String nome;
    private int idade;
    private float p1;
    private float p2;

    // START GETTERS + SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        int numDigits = String.valueOf(id).length();

        if (numDigits == 6) {
            this.id = id;
        } else {
            System.out.println("nmrAluno precisa ter exatos 6 dígitos");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String v) {
        if (v.length() <= 30) {
            this.nome = v;
        } else {
            System.out.println("Nome inserido incorreto (precisa ter menos que 30 carac.)");
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Error: Idade inserida é negativa");
        }
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("Error: p1 inserida é negativa");
        }
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("Error: p2 inserida é negativa");
        }
    }
    // END GETTERS + SETTERS

    /*-----*/
    // OTHER METHODS
    public void notaFinal() {
        System.out.println("Média final deste aluno: " + ((this.p1 + this.p2) / 2));
    }

    public void dadosAluno() {
        System.out.println("Id Aluno: " + this.getId());
        System.out.println("Nome Aluno: " + this.getNome());
        System.out.println("Idade Aluno: " + this.getIdade());
    }

    /*-----*/
    // START CONSTRUCTORS
    Aluno() {
    }

    Aluno(int id, String nome, int idade, float p1, float p2) {
        this.setId(id);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    // END CONSTRUCTORS
}
