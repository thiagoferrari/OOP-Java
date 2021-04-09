package Exe01_REV;

import java.util.Date;

public class Testa {

    public static void main(String[] args) {
        Passageiro pas1 = new Passageiro("thiago", "12345678");
        Voo voo1 = new Voo(123, "Santos", "Sampa");
        Reserva res1 = new Reserva(1234, new Date(), 600, pas1, voo1);

        System.out.println(res1.mostra());
    }

}
