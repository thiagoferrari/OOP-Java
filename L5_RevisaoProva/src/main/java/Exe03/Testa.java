package Exe03;

public class Testa {

    // usando de polimorfismo (objeto polimórfico):
    public static void poli(Imovel obj) {
        System.out.println(obj.mostra());
    }

    // fazer poimorfismo, criar um novo método na class Testa (Java Main Class)!
    public static void main(String[] args) {
        Ap obj1 = new Ap(5, true, "Clóvis", "Santa Cruz");
        Casa obj2 = new Casa(500, true, "Vane", "Pulicano");

        poli(obj1);
        poli(obj2);

    }

}
