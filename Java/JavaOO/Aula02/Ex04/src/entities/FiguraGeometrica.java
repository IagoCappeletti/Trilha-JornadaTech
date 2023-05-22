package entities;

public abstract class FiguraGeometrica {
    String nome;
    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }
    abstract void calcularArea();
}
