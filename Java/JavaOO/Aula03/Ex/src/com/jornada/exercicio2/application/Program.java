package com.jornada.exercicio2.application;

import com.jornada.exercicio2.entities.ContaBancaria;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        ContaBancaria contaBancaria = new ContaBancaria(777, "Iago", 1000.0);

        contaBancaria.exibirSaldo();

        contaBancaria.sacar(500.0);
        contaBancaria.exibirSaldo();
        System.out.println();

        contaBancaria.sacar(650.0);
        contaBancaria.exibirSaldo();
        System.out.println();

        contaBancaria.depositar(200.0);
        contaBancaria.exibirSaldo();
        System.out.println();

        contaBancaria.depositar(100.0);
        System.out.println(contaBancaria);
    }
}
