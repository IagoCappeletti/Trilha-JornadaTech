package application;

import entities.*;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SomaNumerosInteiros somaNumerosInteiros = new SomaNumerosInteiros();
        ParOuImpar parOuImpar = new ParOuImpar();
        DiaDaSemana diaDaSemana = new DiaDaSemana();
        MenorNumero menorNumero = new MenorNumero();
        Horarios horarios = new Horarios();

        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a cidade onde você mora: ");
        sc.nextLine();
        String cidade = sc.nextLine();

        System.out.print("Digite o estado onde você mora: ");
        String estado = sc.nextLine();
        Usuario usuario = new Usuario(nome, idade, cidade, estado);


        System.out.println(usuario);
        System.out.println(somaNumerosInteiros);
        System.out.println(parOuImpar);
        System.out.println(diaDaSemana);
        System.out.println(usuario);
        System.out.println(menorNumero);
        System.out.println(horarios);

        sc.close();
    }
}
