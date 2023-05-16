package application;

import entities.Caracteres;
import entities.MediaAritmetica;
import entities.NumeroPrimo;
import entities.SomarNumeros;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SomarNumeros.somarNumeros();
        MediaAritmetica.media();
        NumeroPrimo.number();
        Caracteres.caracter();

        sc.close();    }
}
