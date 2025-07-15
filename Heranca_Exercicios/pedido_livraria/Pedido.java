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
            subtotal += item.getProduto().getPrecoBruto() * item.getQuantidade();
        }
        double valorDesconto = subtotal * percentualDesconto / 100;
        double totalComDesconto = subtotal - valorDesconto;
        double totalFinal = totalComDesconto * 1.1667;
        
        return totalFinal;
    }
}
