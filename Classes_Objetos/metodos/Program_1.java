package Classes_Objetos.metodos;

public class Program_1 {
    public static void main(String[] args) {
        PersonagemGame personagem1 = new PersonagemGame();

        personagem1.setNome("Sonic");
        personagem1.setSaudeAtual(10);

        personagem1.receberCura(91);

        personagem1.tomarDano(25);

        System.out.printf("%d\n", personagem1.getSaudeAtual());
    }
}
