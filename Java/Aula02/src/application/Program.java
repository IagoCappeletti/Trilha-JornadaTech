package application;

import entities.Usuario;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.printf("A soma entre %d + %d = %d\n\n", num1, num2, soma);

        System.out.print("Digite o número para saber se é Par ou Impar: ");
        int parImpar = sc.nextInt();
        if (parImpar % 2 ==0){
            System.out.println("O número digitado é PAR\n");
        } else {
            System.out.println("O número digitado é IMPAR\n");
        }

        System.out.print("Digite um número de 1 a 7 para descobrir o dia da semana: ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Digite um número entre 1 e 7.");
                break;
        }
        System.out.println();


        System.out.print("Digite seu nome completo: ");
        sc.nextLine();
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
        System.out.println();

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = sc.nextInt();

        int menor = numero1;

        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor){
            menor = numero3;
        }
        System.out.println("O menor númedo digitado é: " + menor);
        System.out.println();


        System.out.print("Digite uma hora do dia: ");
        int hora = sc.nextInt();
        if (hora >= 0 && hora <= 6) {
            System.out.println("Boa Madrugada");
        } else if (hora >= 7 && hora <= 11) {
            System.out.println("Bom Dia");
        } else if (hora >= 12 && hora <= 18) {
            System.out.println("Boa Tarde");
        } else {
            System.out.println("Boa noite");
        }

        sc.close();
    }
}
