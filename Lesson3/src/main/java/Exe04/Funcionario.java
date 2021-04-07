package Exe04;

public class Funcionario {

    // declarar variáveis (protected é private + compartilhével com filhas)
    protected String nome, cpf;
    protected float salario;

    // codar agregações/composições
    // START GETTERS + SETTERS
    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public final void setSalario(float salario) {
        this.salario = salario;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, float salario) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalario(salario);
    }

    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
}
