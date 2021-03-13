package Exe2;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente(1234, 45789, "Fulano", 350);
        obj1.realizarDeposito(150);
        obj1.exibeSaldo();

        obj1.realizarSaque(140);

        Cliente obj2 = new Cliente(1234, 45789, "Bertrano", 350);
        obj2.realizarDeposito(150);
        obj2.exibeSaldo();

        obj2.realizarSaque(140);

    }

}
