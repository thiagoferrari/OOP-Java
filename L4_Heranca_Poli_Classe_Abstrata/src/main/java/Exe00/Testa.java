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

        //System.out.println(obj1.mostra());
        //System.out.println(obj2.mostra());
        //System.out.println(obj3.mostra());
        /*-----*/
        // usando de polimorfismo (objeto polimórfico):
        //exemplo(obj1);
        //exemplo(obj2);
        //exemplo(obj3);

        /*-----*/
        // EXEMPLO USANDO FOR E ARRAYLIST (não cai na prova):
        // criando um vetor do tipo funcionário:
        ArrayList<Funcionario> vetor = new ArrayList();

        // adicionando objetos ao array list:
        vetor.add(obj1);
        vetor.add(obj2);
        vetor.add(obj3);

        // percorrendo com for e usando objeto polimórfico (não cai na prova):
        vetor.forEach(f -> {
            exemplo(f);
        });
    }

}
