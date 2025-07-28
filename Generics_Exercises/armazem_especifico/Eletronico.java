public class Eletronico {
    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Comida(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        String precoFormatado = String.format("%.6f", valor).replace('.', ',');
        return "[" + descricao + "] R$ " + precoFormatado;
    }
}