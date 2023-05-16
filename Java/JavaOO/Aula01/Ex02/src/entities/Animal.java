package entities;

public class Animal {

    public String nome;
    public int idade;
    public String som;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String emitirSom(String som) {
        this.som = som;
        return som;
    }
}
