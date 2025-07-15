import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        BigDecimal subtotal = BigDecimal.ZERO;
        for (ItemPedido item : itens) {
            BigDecimal precoBruto = BigDecimal.valueOf(item.getProduto().obterPrecoLiquido());
            BigDecimal quantidade = BigDecimal.valueOf(item.getQuantidade());
            subtotal = subtotal.add(precoBruto.multiply(quantidade));
        }
        BigDecimal valorDesconto = subtotal.multiply(BigDecimal.valueOf(percentualDesconto)).divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);
        BigDecimal totalComDesconto = subtotal.subtract(valorDesconto);

        return totalComDesconto.doubleValue();
    }
}
