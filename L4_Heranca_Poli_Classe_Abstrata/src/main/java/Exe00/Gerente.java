package Exe00;

public class Gerente extends Funcionario {

    // declarar variáveis
    private float comissao;

    // START GETTERS + SETTERS
    public float getComissao() {
        return comissao;
    }

    public final void setComissao(float comissao) {
        this.comissao = comissao;
    }
    // END GETTERS + SETTERS
    // START CONSTRUCTORS

    public Gerente() {
        super();
    }

    public Gerente(float comissao, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        this.setComissao(comissao);
    }

    // END CONSTRUCTORS
    // OTHER METHODS
    @Override
    public String mostra() {
        return "Gerente{" + "comissao=" + this.comissao + "-" + super.mostra() + '-' + "salarioTotal: " +  salarioTotal() + '}';
    }

    public float salarioTotal() {
        return super.salario + this.getComissao();
    }
}
