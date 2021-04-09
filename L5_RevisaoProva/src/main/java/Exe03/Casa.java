package Exe03;

public class Casa extends Imovel {

    // declarar variáveis
    private float volQuintal;
    private boolean churras;

    // START GETTERS + SETTERS
    public float getVolQuintal() {
        return volQuintal;
    }

    public final void setVolQuintal(float volQuintal) {
        this.volQuintal = volQuintal;
    }

    public boolean isChurras() {
        return churras;
    }

    public final void setChurras(boolean churras) {
        this.churras = churras;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Casa(float volQuintal, boolean churras, String dono, String end) {
        super(dono, end);
        this.setVolQuintal(volQuintal);
        this.setChurras(churras);
    }

    public Casa() {
        super();
    }

    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    @Override
    public String mostra() {
        return "Casa{" + "volQuintal=" + volQuintal + ", churras=" + churras + "-Super(Moradia):" + super.mostra() + '}';
    }
}
