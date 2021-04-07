package Exe04;

public class Testa {

    public static void main(String[] args) {
        Assistente obj1 = new Assistente(250, "Thiago", "123", 2000);

        Diretor obj2 = new Diretor(2000, "João", "456", 3000);

        Gerente obj3 = new Gerente(20, "Carlos", "789", 3000);

        System.out.println(obj1.mostra());
        System.out.println(obj2.mostra());
        System.out.println(obj3.mostra());

    }

}
