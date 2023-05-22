package application;

import entities.Atleta;
import entities.Pessoa;

public class Program {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("iago", 22);
        System.out.println("Pessoa = Nome: " + pessoa.nome + " | Idade: " + pessoa.idade);

        Atleta atleta = new Atleta("Pedro", 18, 1.77, "Futebol");
        System.out.println("Atleta = Nome: " + atleta.nome + " | Idade: " + atleta.idade + " | Altura: " + atleta.altura +
                " | Esporte: " + atleta.esporte);
    }
}
