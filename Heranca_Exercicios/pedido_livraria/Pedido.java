public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double subtotal = 0.0;
        for (ItemPedido item : itens) {
            subtotal += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }
        double totalComDesconto = subtotal * (1 - percentualDesconto / 100);

        double totalFinal = totalComDesconto * 1.17;
        
        return totalFinal;
    }
}
