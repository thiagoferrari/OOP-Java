package Exe01;

public class Computador {

    // declarar variáveis (protected, adim de que heranças possam usá-las)
    private boolean modo;
    private int RAM;

    // START GETTERS + SETTERS
    public boolean isModo() {
        return modo;
    }

    public final void setModo(boolean modo) {
        this.modo = modo;
    }

    public int getRAM() {
        return RAM;
    }

    public final void setRAM(int RAM) {
        if (this.RAM == 4 || this.RAM == 8 || this.RAM == 16 || this.RAM == 32) {
            this.RAM = RAM;
        }
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
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
        return "Computador{" + "modo=" + modo + ", RAM=" + RAM + '}';
    }

    public void ligar() {
        this.modo = true;
    }

    public void desligar() {
        this.modo = false;
    }

}
