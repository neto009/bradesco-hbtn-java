package provedores;

public class Loggi implements ProvedorFrete {

    public Loggi() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = (peso > 5.0) ? valor * 0.12 : valor * 0.04;
        return new Frete(valorFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
