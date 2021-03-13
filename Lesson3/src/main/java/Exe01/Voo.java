package Exe01;

public class Voo {

    private int codigo;
    private String origem;
    private String destino;
    private Reserva reserva;

    // START GETTERS + SETTERS
    public int getCodigo() {
        return codigo;
    }

    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public final void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public final void setDestino(String destino) {
        this.destino = destino;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public final void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Voo() {
        this.codigo = 0;
        this.origem = null;
        this.destino = null;
        this.reserva = new Reserva();
    }

    public Voo(int codigo, String origem, String destino, Reserva reserva) {
        this.setCodigo(codigo);
        this.setDestino(destino);
        this.setOrigem(origem);
        this.setReserva(reserva);
    }

    // END CONSTRUCTORS
    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Voo{" + "codigo=" + codigo + ", origem=" + origem + ", destino=" + destino + ", \n reserva=" + reserva.mostra() + '}';
    }

}
