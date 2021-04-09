package Exe00;

public class Diretor extends Funcionario {

    // declarar variáveis
    private float bonus;

    public Diretor(float bonus) {
        this.bonus = bonus;
    }

    // START GETTERS + SETTERS
    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Diretor(float bonus, String nome, String cpf, float salario) {
        super(nome, cpf, salario);
        this.setBonus(bonus);
    }

    public Diretor() {
        super();
    }

    // END CONSTRUCTORS
    /*-----*/
    // OTHER METHODS
    @Override
    public String mostra() {
        return "Diretor{" + "bonus=" + this.bonus + "-" + super.mostra() + '-' + "salarioTotal: " +  salarioTotal() + '}';
    }

    public float salarioTotal() {
        return super.salario + this.getBonus();
    }
}
