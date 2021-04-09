package l3.exe2;

public class Carrinho {
  private int codigo;
  private float valor;
  // associação
  private ItemCarrinho item;

  public Carrinho() {
  }

  // composição => ItemCarrinho deve ser criado aqui
  public Carrinho(int codigo, float valor, String produto, int qtde, float preco) {
    this.setCodigo(codigo);
    this.setValor(valor);
    this.item = new ItemCarrinho(produto, qtde, preco);
  }

  public int getCodigo() {
    return codigo;
  }

  public final void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public float getValor() {
    return valor;
  }

  public final void setValor(float valor) {
    this.valor = valor;
  }

  public ItemCarrinho getItem() {
    return item;
  }

  public final void setItem(String produto, int qtde, float preco) {
    this.item = new ItemCarrinho(produto, qtde, preco);
  }
}
