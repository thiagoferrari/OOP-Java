package Exe01;

public class Testa {

    public static void main(String[] args) {
        Passageiro pas1 = new Passageiro("Daniel", "RG789456");
        System.out.println(pas1.mostra());

        System.out.println("------");

        Reserva res1 = new Reserva(23, 50, pas1);
        System.out.println(res1.mostra());

        System.out.println("------");

        Voo voo1 = new Voo(737, "RJ, Copacabana", "BA, Salvador", res1);
        System.out.println(voo1.mostra());
    }

}
