package Exe2;

public class Cliente {

    int nmrConta;
    int nmrAgencia;
    String nome;
    float Saldo;

    public Cliente() {
    }

    public Cliente(int nmrConta, int nmrAgencia, String nome, float Saldo) {
        this.nmrConta = nmrConta;
        this.nmrAgencia = nmrAgencia;
        this.nome = nome;
        this.Saldo = Saldo;
    }

    public void realizarDeposito(float valor) {
        this.Saldo += valor;
        System.out.println("Depósito feito com sucesso");

    }

    public void realizarSaque(float valor) {
        if (this.Saldo >= valor) {
            this.Saldo -= valor;
            System.out.println("Saque feito com sucesso");
        } else {
            System.out.println("O saldo é menor que o valor à sacar requerido");
        }

    }

    public void exibeSaldo() {
        System.out.println(this.Saldo);
    }

    public void dadosCliente(float Conta) {
        System.out.println("Número conta: " + this.nmrConta + ", " + this.nome + ", Saldo:" + this.Saldo);
    }

}
