import java.util.HashMap;
import java.util.Map;

public class ArmazemDeComida extends Armazen<Comida>{
    private Map<String, Comida> itens = new HashMap<>();

    @Override
    public void adicionar(Comida item) {
        itens.put(item.getNome(), item);
    }

    @Override
    public Comida obter(String nome) {
        return itens.get(nome);
    }
}
