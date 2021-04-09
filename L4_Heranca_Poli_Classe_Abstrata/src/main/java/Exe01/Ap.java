package Exe01;

public class Ap extends Moradia {

    // declarar variáveis
    private int andar;
    private boolean sacada;

    // START GETTERS + SETTERS
    public int getAndar() {
        return andar;
    }

    public final void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isSacada() {
        return sacada;
    }

    public final void setSacada(boolean sacada) {
        this.sacada = sacada;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Ap() {
        super();
    }

    public Ap(int andar, boolean sacada, String dono, String end) {
        super(dono, end);
        this.setAndar(andar);
        this.setDono(dono);
    }

    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    @Override
    public String mostra() {
        return "Ap{" + "andar=" + andar + ", sacada=" + sacada + "-Super(Moradia):" + super.mostra() + '}';
    }
}
