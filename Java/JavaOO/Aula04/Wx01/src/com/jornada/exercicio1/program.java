package com.jornada.exercicio1;

import java.util.List;

import static com.jornada.exercicio1.StreamExemplo.somaNumerosPares;

public class program {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int somaPares = somaNumerosPares(numeros);
        System.out.println("A soma dos números pares é: " + somaPares);
    }
}

