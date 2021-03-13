package Exe4;

public class TestaProduto {

    public static void main(String[] args) {
        Produto prod1 = new Produto(123, "Gilete", 50, 2.50f);
        prod1.mostra();
        prod1.comprar(60);
        prod1.subir(0.50f);
        prod1.descer(0.25f);
        prod1.vender(200);
        prod1.vender(25);
        prod1.mostra();

        System.out.println("-*------------------*-");
        
        Produto prod2 = new Produto(123, "Gilete", 50, 2.50f);
        prod2.mostra();
        prod2.comprar(60);
        prod2.subir(0.50f);
        prod2.descer(50);
        prod2.vender(60);
        prod2.vender(25);
        prod2.mostra();

    }

}
