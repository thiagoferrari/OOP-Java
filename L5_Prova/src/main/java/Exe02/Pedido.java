package Exe02;

import java.util.Date;

public class Pedido {

    // declarar variáveis
    private int codigo;
    private Date data;
    // associação:
    private Cliente cliente;
    private Unidade unidade;

    // START GETTERS + SETTERS
    public int getCodigo() {
        return codigo;
    }

    public final void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public final void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public final void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public final void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    // END GETTERS + SETTERS
    /*-----*/
    // START CONSTRUCTORS
    public Pedido(int codigo, Date data, Cliente cliente, Unidade unidade) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setCliente(cliente);
        this.setUnidade(unidade);
    }

    public Pedido() {
    }

    // END CONSTRUCTORS
    /*-----*/
    // OTHER METHODS
    public String mostra() {
        return "Pedido{" + "codigo=" + codigo + ", data=" + data + ", \n cliente=" + cliente.mostra() + ", \n unidade=" + unidade.mostra() + '}';
    }

}
