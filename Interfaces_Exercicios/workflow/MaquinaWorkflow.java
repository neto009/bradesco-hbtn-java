import atividades.Atividade;
import java.util.List;

public class MaquinaWorkflow {
    public void executar(Workflow workflow) {
        for (Atividade atividade : workflow.getAtividades()) {
            atividade.executar();
        }
    }
}
