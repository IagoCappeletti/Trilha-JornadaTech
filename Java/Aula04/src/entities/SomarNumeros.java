package entities;

import java.util.Scanner;

public class SomarNumeros {
    public static void somarNumeros(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.printf("A soma de %d e %d é: %d%n\n", num1, num2, sum);
    }
}
