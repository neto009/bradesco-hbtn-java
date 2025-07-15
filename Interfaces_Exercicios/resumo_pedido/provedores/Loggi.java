package provedores;

public class Loggi implements ProvedorFrete {

    public Loggi() {
    }

    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = (peso > 2.0) ? valor * 0.07 : valor * 0.045;
        return new Frete(valorFrete, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
