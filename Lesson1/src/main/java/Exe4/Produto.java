package Exe4;

public class Produto {

    int id;
    String descricao;
    int qtde;
    float preco;

    /* -- construtores -- */
    Produto() {
    }

    Produto(int id,
            String descricao,
            int qtde,
            float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    /* -- fim construtores -- */
    void comprar(int x) { // compra um produto aumentando em x a quantidade em estoque;
        this.qtde += x;
        System.out.println("Compra realizada com sucesso!");
    }

    void vender(int x) { // vende um produto diminuindo em x a quantidade em estoque;
        if (this.qtde >= x) {
            this.qtde -= x;
            System.out.println("venda realizada com sucesso!");
        } else {
            System.out.println("Não temos estoque suficiente para realizar esta venda!");
        }
    }

    void subir(float x) { //aumenta o preço do produto em x unidades
        this.preco += x;
        System.out.println("preco aumentado sucesso!");

    }

    void descer(float x) { //diminui o preço do produto em x unidades;
        if (this.preco >= x) {
            this.preco -= x;
            System.out.println("preco diminuido com sucesso!");

        } else {
            System.out.println("o valor desejado a descer é maior que o preço atual!");
        }

    }

    void mostra() { //mostra todas as informações do produto
        System.out.println("descricao: " + this.descricao + ", preco: "
                + this.preco + ", qtde: " + this.qtde);
    }

}
