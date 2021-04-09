package Exe02;

public class Cliente {

    // declarar variáveis
    private String RG, nome;

    // START GETTERS + SETTERS
    public String getRG() {
        return RG;
    }

    public final void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Cliente(String RG, String nome) {
        this.setNome(nome);
        this.setRG(RG);
    }

    public Cliente() {
    }
    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Cliente{" + "RG=" + RG + ", nome=" + nome + '}';
    }

}
