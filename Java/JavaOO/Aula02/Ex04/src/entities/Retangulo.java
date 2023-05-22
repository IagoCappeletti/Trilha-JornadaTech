package entities;

public class Retangulo extends FiguraGeometrica{
    double base; double altura;
    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("Área do retangulo: " + area);
    }
}
