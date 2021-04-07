package Exe01_REV;

import java.util.Date;

public class Reserva {

    // declarar variáveis
    private int cod;
    private Date date;
    private float valor;
    // associações:
    private Passageiro passageiro;
    private Voo voo;

    // START GETTERS + SETTERS
    public int getCod() {
        return cod;
    }

    public final void setCod(int cod) {
        this.cod = cod;
    }

    public Date getDate() {
        return date;
    }

    public final void setDate(Date date) {
        this.date = date;
    }

    public float getValor() {
        return valor;
    }

    public final void setValor(float valor) {
        this.valor = valor;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public final void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public final void setVoo(Voo voo) {
        this.voo = voo;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Reserva(int cod, Date date, float valor, Passageiro passageiro, Voo voo) {
        this.setCod(cod);
        this.setDate(date);
        this.setValor(valor);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }

    public Reserva() {
    }

    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Reserva{" + "cod=" + cod + ", date=" + date + ", valor=" + valor + ", passageiro=" + passageiro.mostra() + ", voo=" + voo.mostra() + '}';
    }

}
