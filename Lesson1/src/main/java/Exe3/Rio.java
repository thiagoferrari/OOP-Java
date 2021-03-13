package Exe3;

public class Rio {

    String nome;
    float nivel;
    boolean poluido;

    /* ---- constructors ---- */
    Rio() {
    }

    Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;

    }

    /* ---- fim constructors ---- */
//  chover(float): que aumenta o nível atual do rio;
    void chover(float x) {
        this.nivel += x;
        System.out.println("aumentado o nível do rio");
    }

//  ensolarar(float): que diminui o nível atual do rio;
    void ensolarar(float x) {
        if (this.nivel >= x) {
            this.nivel -= x;
            System.out.println("diminuido o nível do rio..");
        } else {
            this.nivel = 0;
            System.out.println("nivel zerado, o rio está seco :(");
        }

    }

//  limpar(): que limpa o rio;
    void limpar() {
        this.poluido = false;
        System.out.println("rio limpo");
    }

//  sujar(): que polui o rio;
    void sujar() {
        this.poluido = true;
        System.out.println("rio sujo");
    }

//  mostra(): que mostra todas as informações do rio.
    void mostrarInfo() {
        String poluicao = this.poluido ? "Sim" : "Não";
        System.out.println("Nome do rio: " + this.nome + ", Nível: "
                + this.nivel + ", Poluído: " + poluicao);

    }
}
