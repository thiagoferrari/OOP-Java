package Exe00;

public class Teste {

    public static void main(String[] args) {

        Pessoa obj = new Pessoa();

        obj.tiraCPF();
        obj.tiraRG();
        obj.tiraTitulo();
        obj.votar();
        System.out.println(obj.toString());

    }
}
