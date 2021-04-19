package Exe02;

import java.util.Date;

public class Testa {

    public static void main(String[] args) {
        Cliente cli1 = new Cliente("123", "Thiago");
        Unidade und1 = new Unidade("Franca", "SP");

        Pedido ped1 = new Pedido(1, new Date(), cli1, und1);
        System.out.println(ped1.mostra());

    }

}
