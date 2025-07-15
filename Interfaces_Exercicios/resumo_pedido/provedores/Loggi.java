package provedores;

public class Loggi implements ProvedorFrete {

    public Loggi() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso > 5) {
            double valorFrete = valor * 0.12;
            return new Frete(valorFrete, obterTipoProvedorFrete());
        }
        double valorFrete = valor * 0.04;
        return new Frete(valorFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
