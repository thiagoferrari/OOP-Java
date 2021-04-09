package Exe00;

public class Professor {

    private String nome, CPF, titulacao;

    // START CONSTRUCTORS
    public Professor() {
        this.CPF = null;
        this.nome = null;
        this.titulacao = null;
    }

    public Professor(String nome, String CPF, String titulacao) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setTitulacao(titulacao);
    }

    // END CONSTRUCTORS
    /*-----*/
    // START GETTERS + SETTERS
    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public final void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public final void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Professor{" + "nome=" + nome + ", CPF=" + CPF + ", titulacao=" + titulacao + '}';
    }

}
