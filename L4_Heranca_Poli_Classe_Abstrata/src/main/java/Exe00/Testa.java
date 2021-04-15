package Exe00;

import java.util.ArrayList;

public class Testa {

    // usando de polimorfismo (objeto polimórfico):
    public static void exemplo(Funcionario obj) {
        System.out.println(obj.mostra());
    }

    public static void main(String[] args) {
        Assistente obj1 = new Assistente(250, "Thiago", "123", 2000);

        Diretor obj2 = new Diretor(2000, "João", "456", 3000);

        Gerente obj3 = new Gerente(20, "Carlos", "789", 3000);

        /*-----*/
        // EXEMPLO USANDO ARRAYLIST + FOR + objeto polimórfico:
        // criando um vetor do tipo funcionário:
        ArrayList<Funcionario> vetor = new ArrayList();

        // adicionando objetos ao array list:
        vetor.add(obj1);
        vetor.add(obj2);
        vetor.add(obj3);

        // percorrendo com for e usando objeto polimórfico:
        for (Funcionario f : vetor) {
            exemplo(f);
        }
    }

}
