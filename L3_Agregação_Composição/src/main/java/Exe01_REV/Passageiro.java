package Exe01_REV;

public class Passageiro {

    // declarar variáveis
    private String nome;
    private String RG;

    // START GETTERS + SETTERS
    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public final void setRG(String RG) {
        this.RG = RG;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Passageiro(String nome, String RG) {
        this.setNome(nome);
        this.setRG(RG);
    }

    public Passageiro() {
        this.nome = null;
        this.RG = null;
    }

    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Passageiro{" + "nome=" + nome + ", RG=" + RG + '}';
    }
}
