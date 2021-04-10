package Exe03;

public class Testa {

    // usando de polimorfismo (objeto polimórfico):
    public static void poli(Imovel obj) {
        System.out.println(obj.mostra());
    }

    // fazer poimorfismo, criar um novo método na class Testa (Java Main Class)!
    public static void main(String[] args) {
        Apto obj1 = new Apto(77, "Copacabana");
        Casa obj2 = new Casa(70,"Itaquera");

        poli(obj1);
        poli(obj2);
        
        

    }

}
