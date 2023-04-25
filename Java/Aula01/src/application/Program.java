package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SomarNumeros somarNumeros = new SomarNumeros();
        ConversorCelsius conversorCelsius = new ConversorCelsius();
        AreaDoRetangulo areaDoRetangulo = new AreaDoRetangulo();
        LetrasSeparadas separador = new LetrasSeparadas();

        System.out.println("Olá, Mundo!");
        System.out.println(somarNumeros);
        System.out.println(conversorCelsius + "\n");
        System.out.printf("Calculos possiveis de um retangulo:\nAREA: %.2f%n", areaDoRetangulo.area());
        System.out.printf("PERIMETRO: %.2f%n",areaDoRetangulo.perimetro());
        System.out.printf("DIAGONAL: %.2f%n", areaDoRetangulo.diagonal());
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        separador.separar(palavra);

        sc.close();
    }
}