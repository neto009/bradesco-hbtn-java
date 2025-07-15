package provedores;

public enum TipoProvedorFrete {
    JADLOG("JadLog"),
    SEDEX("Sedex"),
    LOGGI("Loggi");

    private final String nome;

    TipoProvedorFrete(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
