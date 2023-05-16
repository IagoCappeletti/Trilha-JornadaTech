package entities;

import java.util.Scanner;

public class NumeroPrimo {
    public static String number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n==== Digite um número para descobrir se ele é Primo ====");
        System.out.print("Nº: ");
        int n = sc.nextInt();
        if (NumeroPrimo.ehPrimo(n)) {
            System.out.println(n + " é um número primo");
        } else {
            System.out.println(n + " não é um número primo");
        }
        return null;
    }
        public static boolean ehPrimo(int numero01) {
            if (numero01 <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero01); i++) {
                if (numero01 % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

