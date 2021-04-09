package Exe01_REV;

public class Voo {

    // declarar variáveis
    private int cod;
    private String origem;
    private String destino;

    // START GETTERS + SETTERS
    public int getCod() {
        return cod;
    }

    public final void setCod(int cod) {
        this.cod = cod;
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

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Voo(int cod, String origem, String destino) {
        this.setCod(cod);
        this.setDestino(destino);
        this.setOrigem(origem);
    }

    public Voo() {

    }

    // END CONSTRUCTORS
    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Voo{" + "cod=" + cod + ", origem=" + origem + ", destino=" + destino + '}';
    }
}
