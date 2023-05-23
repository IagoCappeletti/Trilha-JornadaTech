package com.jornada.exercicio1;

import java.util.List;

public class StreamExemplo {
    public static int somaNumerosPares(List<Integer> numeros) {
        int soma = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra apenas os números pares
                .mapToInt(Integer::intValue) // Converte para um stream de inteiros
                .sum(); // Soma todos os números
        return soma;
    }
}
