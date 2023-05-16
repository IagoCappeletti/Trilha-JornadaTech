package entities;

import java.util.Scanner;

public class Caracteres {
    public static void caracter (){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma String: ");
        String str = sc.nextLine();

        boolean contemApenasLetras = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) {
                contemApenasLetras = false;
                break;
            }
        }

        if (contemApenasLetras) {
            System.out.println("A string contém apenas caracteres alfabéticos.");
        } else {
            System.out.println("A string não contém apenas caracteres alfabéticos.");
        }
    }
}


