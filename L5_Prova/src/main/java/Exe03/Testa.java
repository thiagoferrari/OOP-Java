package Exe03;

import java.util.ArrayList;

public class Testa {

    // usando de polimorfismo (objeto polimórfico):
    public static void poli(Imovel obj) {
        System.out.println(obj.mostra());
    }

    public static void main(String[] args) {
        Apto obj1 = new Apto(77, "Copacabana");
        Casa obj2 = new Casa(70, "Itaquera");

        // TRABALHANDO COM ARRAYLIST + FOR + objeto polimórfico:
        // criando um vetor do tipo funcionário:
        ArrayList<Imovel> vetor = new ArrayList();

        // adicionando objetos ao array list:
        vetor.add(obj1);
        vetor.add(obj2);

        // percorrendo com for e usando objeto polimórfico:
        for (Imovel i : vetor) {
            poli(i);
        }

    }

}
