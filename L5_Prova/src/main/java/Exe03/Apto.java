package Exe03;

public class Apto extends Imovel {

    // declarar variáveis
    private int nro;

    // START GETTERS + SETTERS
    public int getNro() {
        return nro;
    }
    
    public final void setNro(int nro) {
        this.nro = nro;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Apto(int nro, String endereco) {
        super(endereco);
        this.setNro(nro);
    }
    
    public Apto() {
        super();
    }
    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    @Override
    public String mostra() {
        return "Apto{" + "nro=" + nro + ", Super(Imovel)=" + super.mostra() + '}';
    }
}
