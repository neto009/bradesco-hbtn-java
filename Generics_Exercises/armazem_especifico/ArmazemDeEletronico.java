import java.util.HashMap;
import java.util.Map;

public class ArmazemDeEletronico extends Armazem<Eletronico> {
    private Map<String, Eletronico> itens = new HashMap<>();

    @Override
    public void adicionar(Eletronico item) {
        itens.put(item.getNome(), item);
    }

    @Override
    public Eletronico obter(String nome) {
        return itens.get(nome);
    }
}
