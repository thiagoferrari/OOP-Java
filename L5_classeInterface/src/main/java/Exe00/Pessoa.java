package Exe00;

import java.util.Random;

// implements
public class Pessoa implements Cidadao, Eleitor {

    private String rg, cpf;
    private int titulo;
    private boolean votou;

    @Override
    public String tiraRG() {
        // gera um numero aleatorio
        Random random = new Random();
        this.rg = String.valueOf(random.nextInt(1000));
        return "RG gerado com sucesso";
    }

    @Override
    public String tiraCPF() {
        // gera um numero aleatorio
        Random random = new Random();
        this.cpf = String.valueOf(random.nextInt(1000));
        return "CPF gerado com sucesso";
    }

    @Override
    public String tiraTitulo() {
        // gera um numero aleatorio
        Random random = new Random();
        this.titulo = random.nextInt(1000);
        return "Titulo gerado com sucesso";
    }

    @Override
    public String votar() {
        this.votou = true;
        return "Votou som sucesso";
    }

    @Override
    public String toString() {
        return "Pessoa{"
                + "rg='" + rg + '\''
                + ", cpf='" + cpf + '\''
                + ", titulo=" + titulo
                + ", votou=" + votou
                + '}';
    }
}
