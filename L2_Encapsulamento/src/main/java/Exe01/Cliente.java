package Exe01;

public class Cliente {

    private String numeroConta;
    private String numeroAgencia;
    private String nome;
    private float saldo;

    // START CONSTRUCTORS
    Cliente() {
    }

    Cliente(String numeroConta,
            String numeroAgencia,
            String nome,
            float saldo) {
        this.setNConta(numeroConta);
        this.setNAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    // END CONSTRUCTORS
    /*-----*/
    // START SETTERS
    void setNConta(String v) {
        if ((v.length() == 8) && (v.charAt(6) == '-')) {
            this.numeroConta = v;
        } else {
            System.out.println("NConta inserida incorreta (insira por exemplo 012345-6)");
        }
    }

    void setNAgencia(String v) {
        if ((v.length() == 6) && (v.charAt(4) == '-')) {
            this.numeroAgencia = v;
        } else {
            System.out.println("NAgencia inserida incorreta (insira por exemplo 0123-4)");
        }
    }

    void setNome(String v) {

        if (v.length() <= 30) {
            this.nome = v;
        } else {
            System.out.println("Nome inserido incorreto (precisa ter menos que 30 carac.)");
        }

    }

    void setSaldo(float v) {
        this.saldo = v;
    }

    // END SETTERS
    /*-----*/
    // START GETTERS
    public String getNConta() {
        return this.numeroConta;
    }

    public String getNAgencia() {
        return this.numeroAgencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    // END GETTERS
    /*-----*/
    // OUTROS MÉTODOS
    public void realizarDeposito(float v) {
        this.saldo += v;
    }

    public void realizarSaque(float v) {
        this.saldo -= v;
    }

    public void buscaDados() {
        System.out.println("NConta: " + getNConta());
        System.out.println("NAgencia: " + getNAgencia());
        System.out.println("Nome: " + getNome());
        System.out.println("Saldo: " + getSaldo());
    }
}
