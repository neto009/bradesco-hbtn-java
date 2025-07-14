public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getStatus() {
        if (saudeAtual <= 0) {
            return "morto";
        }
        return "vivo";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void tomarDano(int quantidadeDeDano) {
        this.saudeAtual -= quantidadeDeDano;
        if (this.saudeAtual < 0) {
            setSaudeAtual(0);
        }
    }
    
    public void receberCura(int quantidadeDeCura) {
        this.saudeAtual += quantidadeDeCura;
        if (this.saudeAtual > 100) {
            setSaudeAtual(100);
        }
    }
}