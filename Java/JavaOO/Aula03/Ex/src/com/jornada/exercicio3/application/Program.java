package com.jornada.exercicio3.application;

import com.jornada.exercicio3.entities.Esportes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Lista com nome dos esportes esportes");
        for (int i = 0; i < Esportes.values().length; i++) {
            Esportes esporte = Esportes.values()[i]; //Retorna o esporte em um Array
            System.out.println(i + " - " + esporte.getNome()); //Imprime o Nº ordinal e o nome do esporte
        }
        System.out.print("Escolha um número correspondente do esporte: ");
        int numeroEscolhido = sc.nextInt();

        if (numeroEscolhido >= 0 && numeroEscolhido < Esportes.values().length) {
            Esportes esporte = Esportes.values()[numeroEscolhido];

            switch (esporte) {
                case FUTEBOL:
                case BASQUETE:
                case VOLEI:
                    System.out.println("O esporte utiliza bola");
                    break;
                default:
                    System.out.println("O esporte NÃO utiliza bola");
                    break;
            }
            System.out.println(esporte.getDescricao());
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
