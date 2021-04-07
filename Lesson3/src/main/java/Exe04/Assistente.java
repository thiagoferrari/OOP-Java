package Exe04;

public class Assistente extends Funcionario {

    // declarar variáveis
    private float auxTransporte;

    // START GETTERS + SETTERS
    public float getAuxTransporte() {
        return auxTransporte;
    }

    public final void setAuxTransporte(float auxTransporte) {
        this.auxTransporte = auxTransporte;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Assistente() {
        super();
    }

    public Assistente(float auxTransporte, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        this.auxTransporte = auxTransporte;
    }
    // END CONSTRUCTORS

    /*-----*/
    // OTHER METHODS
    @Override
    public String mostra() {
        return "Assistente{" + "auxTransporte=" + this.auxTransporte + "-" + super.mostra() + '-' + "salarioTotal: " +  salarioTotal() + '}';
    }

    public float salarioTotal() {
        return super.salario + this.getAuxTransporte();
    }
}
