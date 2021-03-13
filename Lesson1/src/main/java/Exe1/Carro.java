package Exe1;

public class Carro {

    String marca;
    String modelo;
    int ano;
    boolean motor;
    float velAtual;

    // declarando método constructor:
    // ele possui o mesmo nome da classe
    public Carro(int ano, String modelo, String marca, boolean motor, float velAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.velAtual = velAtual;
    }

    // abaixo criamos outro método para os devs que não quiserem usar o constructor:
    public Carro() {
    }

    /* ----- MÉTODOS: ----- */
    // void pois o método não retorna nada
    public void mostra() {
        // this representa o objeto que chama o método (this = obj2)
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo
                + ", motor: " + this.motor + ", velAtual: " + this.velAtual);
    }

    public void ligar() {
        this.motor = true;
    }

    public void desligar() {
        this.motor = false;
        this.velAtual = 0;
    }

    public void acelerar(float velo) {
        if (this.motor) {
            this.velAtual = this.velAtual + velo;
        } else {
            System.out.println("O carro está desligado!");
        }
    }

    public void frear(float frenagem) {
        if (this.motor) {

            if (this.velAtual <= frenagem) {
                this.velAtual = 0;
                System.out.println("Frenagem maior que velo. atual, deixando em 0 km/h..");
            } else {
                this.velAtual -= frenagem;
            }

        } else {
            System.out.println("O carro está desligado!");
        }

    }
}
