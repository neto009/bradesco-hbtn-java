package provedores;

public class Sedex implements ProvedorFrete {

    public Sedex() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = (peso > 1.0) ? valor * 0.10 : valor * 0.05;
        return new Frete(valorFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
