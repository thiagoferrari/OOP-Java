package Exe03;

public abstract class Imovel {

    // declarar variáveis
    private String endereco;

    // START GETTERS + SETTERS
    public String getEndereco() {
        return endereco;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Imovel(String endereco) {
        this.setEndereco(endereco);
    }

    public Imovel() {
    }
    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Imovel{" + "endereco=" + endereco + '}';
    }

}
