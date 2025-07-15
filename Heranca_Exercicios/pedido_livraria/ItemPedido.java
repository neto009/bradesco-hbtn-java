import Heranca_Exercicios.pedido_livraria.produtos.Produto;

public class ItemPedido {
    private int quantidade;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}
