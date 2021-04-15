package Exe03;

public class Casa extends Imovel {

    // declarar variáveis
    private float quintal;

    // START GETTERS + SETTERS
    public float getQuintal() {
        return quintal;
    }

    public final void setQuintal(float quintal) {
        this.quintal = quintal;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Casa() {
        super();
    }

    public Casa(float quintal, String endereco) {
        super(endereco);
        this.setQuintal(quintal);
    }
    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    @Override
    public String mostra() {
        return "Casa{" + "quintal=" + quintal + ", Super(Imovel)=" + super.mostra() + '}';
    }
}
