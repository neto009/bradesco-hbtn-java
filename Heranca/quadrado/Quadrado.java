public class Quadrado extends Retangulo{
    private double lado;

    public Quadrado(double lado) {
        super();
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
        this.lado = lado;
        this.largura = lado;
        this.altura = lado;
    }

    public String toString() {
        return String.format("[Quadrado] %.2f", lado);
    }
}
