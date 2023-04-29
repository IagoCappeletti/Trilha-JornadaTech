package entities;

import java.util.Scanner;

public class MediaAritmetica {
    public static void media(){
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Calculadora de média ====");
        System.out.print("Quantos números quer digitar ? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o º" + (i+1) + " número: ");
            numeros[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < n ; i++) {
            soma += numeros[i];
        }

        double media = (double) soma / n;

        System.out.printf("A media entre os números digitados foi de: %.2f", media);
        System.out.println();
    }
}
