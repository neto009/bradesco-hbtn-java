public class Gerente extends Empregado{
    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double salarioBase = super.getSalarioFixo();
        if (departamento.alcancouMeta()) {
            double diferencaMeta = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            return (salarioBase * 0.20) + (diferencaMeta * 0.01);
        }
        return 0;
    }
}
