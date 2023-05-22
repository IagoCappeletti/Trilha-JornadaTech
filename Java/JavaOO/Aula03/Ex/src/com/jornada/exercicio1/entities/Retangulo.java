package com.jornada.exercicio1.entities;

public class Retangulo {
    private Double largura;
    private Double altura;

    public Double calcularArea() {
        return altura * largura;
    }
    public double calcularPerimetro() {
        return (altura * 2) + (largura * 2);
    }
    public void setLargura(Double largura) {
        this.largura = largura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "--- Retangulo ---\n" +
                "A área do retângulo é " + calcularArea() +
                "\nO perímetro do retângulo é " + calcularPerimetro();
    }

    public String validaNumeros() {
        if (largura.equals(altura)){
            return "Os números são iguais";
        }
        else {
            return "Os números não são iguais";
        }
    }
}
