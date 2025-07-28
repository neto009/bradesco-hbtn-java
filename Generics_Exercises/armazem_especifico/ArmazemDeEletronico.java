import java.util.HashMap;
import java.util.Map;

public class ArmazemDeEletronico extends Armazem<Eletronico> {
    private Map<String, Eletronico> itens = new HashMap<>();

    public void adicionarAoInventario(String nome, Eletronico item) {
        itens.put(nome, item);
    }

    public Eletronico obterDoInventario(String nome) {
        return itens.get(nome);
    }
}
