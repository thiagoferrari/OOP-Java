package Exe01;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente("012345-6", "0124-4", "thiago", 1000);

        cli1.buscaDados();
        cli1.realizarDeposito(500);
        cli1.realizarSaque(100);
    }

}
