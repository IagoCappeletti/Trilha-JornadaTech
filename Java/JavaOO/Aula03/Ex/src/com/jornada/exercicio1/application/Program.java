package com.jornada.exercicio1.application;

import com.jornada.exercicio1.entities.Retangulo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.print("Digite o valor da altura do retângulo: ");
        retangulo.setAltura(sc.nextDouble());
        System.out.print("Digite o valor da largura do retângulo: ");
        retangulo.setLargura(sc.nextDouble());

        System.out.println(retangulo);
        System.out.println(retangulo.validaNumeros());
    }
}
