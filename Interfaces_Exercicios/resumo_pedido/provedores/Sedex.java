package provedores;

public class Sedex implements ProvedorFrete {

    public Sedex() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso > 1.0) {
            double valorFrete = valor * 0.10;
            return new Frete(valorFrete, obterTipoProvedorFrete());
        }
        double valorFrete = valor * 0.05;
        return new Frete(valorFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
