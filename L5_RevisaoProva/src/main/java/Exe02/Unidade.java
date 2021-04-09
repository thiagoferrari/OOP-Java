package Exe02;

public class Unidade {

    // declarar variáveis
    private String cidade, estado;

    // START GETTERS + SETTERS
    public String getCidade() {
        return cidade;
    }

    public final void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public final void setEstado(String estado) {
        this.estado = estado;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Unidade(String cidade, String estado) {
        this.setCidade(cidade);
        this.setEstado(estado);
    }

    public Unidade() {
    }
    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Unidade{" + "cidade=" + cidade + ", estado=" + estado + '}';
    }

}
