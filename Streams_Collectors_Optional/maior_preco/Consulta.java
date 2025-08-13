import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {
    
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos()
            .stream()
            .sorted(Comparator.comparing(Produto::getPreco).reversed())
            .collect(Collectors.toList());
    }
}
