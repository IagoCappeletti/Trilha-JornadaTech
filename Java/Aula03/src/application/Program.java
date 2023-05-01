package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] nomesPaises = {"Alemanha", "Brasil", "Uruguai", "Chile", "Paraguai", ""};
        System.out.println("Listas de Países: ");
        for (int i = 0; i < nomesPaises.length; i++) {
            System.out.println(nomesPaises[i]);
        }
        System.out.println();

        System.out.print("Quantos itens deseja adicionar à lista de compras?");
        int numeroItens = sc.nextInt();

        String[] itensCompras = new String[numeroItens];
        for (int i = 0; i < numeroItens; i++) {
            System.out.print("Qual o nome do produto? ");
            itensCompras[i] = sc.next();
        }
        System.out.println();
        System.out.println("Lista de compras: ");
        for (int i = 0; i < numeroItens; i++) {
            System.out.println("#" + (i + 1) + itensCompras[i]);
        }
        System.out.println();

        String[] alimentos = {"arroz", "Feijão", "sal", "café", "macarrão", "milho", "leite", "ovos", "carne", "peixe" };
        String busca;

        // loop do-while para perguntar ao usuário quais alimentos ele deseja encontrar
        do {
            System.out.print("Digite o nome do alimento que você deseja encontrar (ou 'sair' para encerrar): ");
            busca = sc.next();

            // busca linear no vetor de alimentos
            int posicao = -1;
            for (int i = 0; i < alimentos.length; i++) {
                if (alimentos[i].equalsIgnoreCase(busca)) {
                    posicao = i;
                    break;
                }
            }

            // se o alimento for encontrado, imprimir a posição e o nome do alimento no vetor
            if (posicao != -1) {
                System.out.println("O alimento '" + alimentos[posicao] + "' foi encontrado na posição " + posicao + " do vetor.\n");
            }
            // caso contrário, informar ao usuário que o alimento não foi encontrado
            else if (!busca.equalsIgnoreCase("sair")) {
                System.out.println("O alimento '" + busca + "' não foi encontrado na lista .\n");
            }

        } while (!busca.equalsIgnoreCase("sair"));
        System.out.println();

        int[] numeros = {10, 20, 80, 40, 50};
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.print("O maior valor é: " + maior);
        System.out.println("\n");

        double[][] matriz = {
                {1.0, 2.5, 3.7},
                {1.0, 2.5, 3.7},
                {1.0, 2.5, 3.7}
        };
        double[] cpf = new double[];
        cpf[] = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) { //Percorre a coluna
                System.out.print(matriz[i][j] + " ");

            }
            double soma = 0.0;
            for (int b = 0; b < matriz.length; b++) { //Percorre a coluna
                soma += matriz[b][i];
            }
            System.out.println("Soma da coluna: #" + (i+1) + " " + soma);
        }

        sc.close();
    }
}
