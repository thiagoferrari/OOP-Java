package Exe01;

public class Computador {

    // declarar variáveis
    private boolean modo;
    private int RAM;

    // START GETTERS + SETTERS
    public String getModo() {
        if (modo == true) {
            return "O Computador está ligado";
        } else {
            return "O Computador está desligado";
        }
    }

    public final void setModo(boolean modo) {
        this.modo = modo;
        this.getModo();
    }

    public String getRAM() {
        if (this.modo == true) {
            return "mem. RAM deste PC: " + RAM + "GB";
        } else {
            return "O PC está desligado! Não é possível ver a RAM!";
        }
    }

    public final void setRAM(int RAM) {
        if (RAM == 8 || RAM == 16 || RAM == 4 || RAM == 32) {
            this.RAM = RAM;
        } else {
            System.out.println("o computador pode possuir apenas 4 tipos de capacidade de memória RAM (4, 8, 16, 32)!");
        }
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS (aproveitando os encapsulamentos dos setters)
    public Computador(boolean modo, int RAM) {
        this.setModo(modo);
        this.setRAM(RAM);
    }

    public Computador() {
    }
    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Computador{" + "modo=" + this.getModo() + ", RAM=" + this.getRAM() + '}';
    }

    public void ligar() {
        setModo(true);
    }

    public void desligar() {
        setModo(false);
    }

}
