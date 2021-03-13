package Exe00;

public class Paciente {

    //Visibilidade privada (encapsuladas)
    private String nome;
    private int CPF;
    private int idade;
    private float peso, altura;

    /* -- start constructors -- */
    // abaixo vamos usar os costructors aproveitando os encapsulamentos dos setters
    public Paciente(String nome, int idade, float peso, float altura) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public Paciente() {
    }

    /* -- end constructors -- */

 /* -- start setters -- */
// final -> não permite alterações deste método em classes filhas
    public final void setNome(String nome) {
        this.nome = nome;
    }

// final -> não permite alterações deste método em classes filhas
    public final void setIdade(int idade) {
        // protegendo contra inputs irregulares:
        if ((idade <= 0) || (idade >= 130)) {
            System.out.println("Idade é invalida");
        } else {
            this.idade = idade;
        }
    }

// final -> não permite alterações deste método em classes filhas
    public final void setPeso(float peso) {
        // protegendo contra inputs irregulares:
        if ((peso <= 0) || (peso >= 300)) {
            System.out.println("peso é invalido");
        } else {
            this.peso = peso;
        }

    }

// final -> não permite alterações deste método em classes filhas
    public final void setAltura(float altura) {
        // protegendo contra inputs irregulares:
        if ((altura <= 0) || (altura >= 3)) {
            System.out.println("altura é invalida");
        } else {
            this.altura = altura;
        }

    }

    /* -- end setters -- */
 /* -- start getters -- */
    public String getNome() {
        return this.nome;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public int getIdade() {
        return this.idade;
    }

    /* -- end getters -- */
}
