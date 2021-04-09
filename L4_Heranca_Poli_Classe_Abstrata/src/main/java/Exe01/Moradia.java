package Exe01;

// colocar abstract não permite instâciar esta classe
public abstract class Moradia {

    // declarar variáveis
    protected String dono;
    protected String end;

    // START GETTERS + SETTERS
    public String getDono() {
        return dono;
    }

    public final void setDono(String dono) {
        this.dono = dono;
    }

    public String getEnd() {
        return end;
    }

    public final void setEnd(String end) {
        this.end = end;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Moradia(String dono, String end) {
        this.setDono(dono);
        this.setEnd(end);
    }

    public Moradia() {
    }
    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Moradia{" + "dono=" + dono + ", end=" + end + '}';
    }
}
