package Exe01;

public class Reserva {

    private int codigo;
    private float valor;
    private Passageiro passageiro;

    // START GETTERS + SETTERS
    public int getCodigo() {
        return codigo;
    }

    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public final void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public float getValor() {
        return valor;
    }

    public final void setValor(float valor) {
        this.valor = valor;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Reserva() {
        // valores default:
        this.codigo = 0;
        this.valor = 0;
        this.passageiro = new Passageiro();
    }

    public Reserva(int codigo, float valor, Passageiro passageiro) {
        this.setCodigo(codigo);
        this.setValor(valor);
        this.setPassageiro(passageiro);

    }

    // END CONSTRUCTORS
    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Reserva{" + "codigo=" + codigo + ", valor=" + valor + ", passageiro=" + passageiro.mostra() + '}';
    }
}
