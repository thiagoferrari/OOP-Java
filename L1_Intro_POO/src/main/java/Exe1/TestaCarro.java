package Exe1;

public class TestaCarro {

    public static void main(String[] args) {
        // como criar um objeto
        // tipo_objeto nome_objeto = new tipo_objeto()

        // vamos instânciar o obj1
        Carro obj1 = new Carro();
        obj1.ano = 2018;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.motor = true;
        obj1.velAtual = 0;

        // vamos instânciar o obj2
        Carro obj2 = new Carro();
        obj2.ano = 2020;
        obj2.marca = "BMW";
        obj2.modelo = "M3";
        obj2.motor = false;
        obj2.velAtual = 0;

        // vamos instânciar o obj3
        // mas já vamos passar os dados direto no instânciamento
        // (Para isso ser possível é necessário ter construtor na Classe Carro)
        Carro obj3 = new Carro(2019, "Ford", "Mustang", false, 50);

        obj1.mostra();
        obj2.mostra();
        obj3.mostra();

        obj1.ligar();

        obj1.acelerar(80);
        obj1.frear(30);

        obj2.desligar();
        obj3.acelerar(40);

        obj1.mostra();
        obj2.mostra();
        obj3.mostra();

    }

}
