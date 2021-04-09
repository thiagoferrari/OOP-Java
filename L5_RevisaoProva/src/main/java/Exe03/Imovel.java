package Exe03;

// colocar abstract não permite instâciar esta classe
public abstract class Imovel {

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
    public Imovel(String dono, String end) {
        this.setDono(dono);
        this.setEnd(end);
    }

    public Imovel() {
    }
    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Moradia{" + "dono=" + dono + ", end=" + end + '}';
    }
}
