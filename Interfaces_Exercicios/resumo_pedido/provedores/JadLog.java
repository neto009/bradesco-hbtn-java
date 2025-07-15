package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso > 2) {
            double valorFrete = valor * 0.07;
            return new Frete(valorFrete, obterTipoProvedorFrete());
        }
        double valorFrete = valor * 0.045;
        return new Frete(valorFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
