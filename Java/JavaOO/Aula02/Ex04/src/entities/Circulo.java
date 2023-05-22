package entities;

public class Circulo extends FiguraGeometrica{
    double raio;
    final double PI = 3.14;
    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double areaCirculo = PI*(raio*raio);
        System.out.printf("Área do circulo: %.2f", areaCirculo);
    }
}
