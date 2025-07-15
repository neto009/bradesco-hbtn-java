import provedores.*;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
        double pesoKg = pedido.getPeso() / 1000.0;
        Frete frete = provedorFrete.calcularFrete(pesoKg, pedido.getTotal());
        pedido.setFrete(frete);
    }
}
