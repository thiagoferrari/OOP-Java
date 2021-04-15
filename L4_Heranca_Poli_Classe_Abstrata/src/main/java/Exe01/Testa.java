package Exe01;

import java.util.ArrayList;

public class Testa {

    // usando de polimorfismo (objeto polimórfico):
    public static void poli(Moradia obj) {
        System.out.println(obj.mostra());
    }

    // fazer poimorfismo, criar um novo método na class Testa (Java Main Class)!
    public static void main(String[] args) {
        Ap obj1 = new Ap(5, true, "Clóvis", "Santa Cruz");
        Casa obj2 = new Casa(500, true, "Vane", "Pulicano");

        //poli(obj1);
        // poli(obj2);

        /*-----*/
        // EXEMPLO USANDO ARRAYLIST + FOR + objeto polimórfico:
        // criando um vetor do tipo funcionário:
        ArrayList<Moradia> vetor = new ArrayList();

        // adicionando objetos ao array list:
        vetor.add(obj1);
        vetor.add(obj2);

        // percorrendo com for e usando objeto polimórfico:
        for (Moradia f : vetor) {
            poli(f);
        }

    }

}
