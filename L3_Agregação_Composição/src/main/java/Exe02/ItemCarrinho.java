package l3.exe2;

public class ItemCarrinho {
  private String produto;
  private int qtde;
  private float preco;

  public ItemCarrinho() {
  }

  public ItemCarrinho(String produto, int qtde, float preco) {
    this.setProduto(produto);
    this.setQtde(qtde);;
    this.setPreco(preco);
  }

  public String getProduto() {
    return produto;
  }

  public final void setProduto(String produto) {
    this.produto = produto;
  }

  public int getQtde() {
    return qtde;
  }

  public final void setQtde(int qtde) {
    this.qtde = qtde;
  }

  public float getPreco() {
    return preco;
  }

  public final void setPreco(float preco) {
    this.preco = preco;
  }
}
