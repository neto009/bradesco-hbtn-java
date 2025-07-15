import provedores.*;

public class ProcessadorPedido {
    private ProvedorFrete provedorFrete;

    public ProcessadorPedido(ProvedorFrete provedorFrete) {
        this.provedorFrete = provedorFrete;
    }

    public void processar(Pedido pedido) {
        Frete frete = provedorFrete.calcularFrete(pedido.getPeso(), pedido.getValor());
        pedido.setFrete(frete);
    }
}
