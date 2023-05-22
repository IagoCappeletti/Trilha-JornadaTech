package entities;

public class Triangulo extends FiguraGeometrica{
    double base;double altura;
    public Triangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void calcularArea() {
        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
    }
}
