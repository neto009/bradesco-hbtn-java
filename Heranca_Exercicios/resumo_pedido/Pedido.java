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

    public String apresentarResumoPedido() {
        StringBuilder resumo = new StringBuilder();
        BigDecimal subtotal = BigDecimal.ZERO;

        resumo.append("------- RESUMO PEDIDO -------\n");

        for (ItemPedido item : itens) {
            BigDecimal precoUnitario = BigDecimal.valueOf(item.getProduto().obterPrecoLiquido());
            BigDecimal quantidade = BigDecimal.valueOf(item.getQuantidade());
            BigDecimal totalItem = precoUnitario.multiply(quantidade);

            resumo.append("Tipo: ").append(item.getProduto().getTipo())
                    .append("  Titulo: ").append(item.getProduto().getNome())
                    .append("  Preco: ").append(String.format("%.2f", precoUnitario))
                    .append("  Quant: ").append(item.getQuantidade())
                    .append("  Total: ").append(String.format("%.2f", totalItem))
                    .append("\n");

            subtotal = subtotal.add(totalItem);
        }

        BigDecimal valorDesconto = subtotal.multiply(BigDecimal.valueOf(percentualDesconto)).divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP);
        BigDecimal totalComDesconto = subtotal.subtract(valorDesconto);

        resumo.append("----------------------------\n");
        resumo.append("DESCONTO: ").append(String.format("%.2f", valorDesconto)).append("\n");
        resumo.append("TOTAL PRODUTOS: ").append(String.format("%.2f", subtotal)).append("\n");
        resumo.append("----------------------------\n");
        resumo.append("TOTAL PEDIDO: ").append(String.format("%.2f", totalComDesconto)).append("\n");
        resumo.append("----------------------------");

        return resumo.toString();
    }
}
