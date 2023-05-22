package application;

import entities.Circulo;
import entities.Retangulo;
import entities.Triangulo;

public class Program {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("Circulo", 4.88);
        circulo.calcularArea();

        Retangulo retangulo = new Retangulo("Retangulo", 8, 2);
        retangulo.calcularArea();

        Triangulo triangulo = new Triangulo("Triângulo", 40, 20);
        triangulo.calcularArea();
    }
}
