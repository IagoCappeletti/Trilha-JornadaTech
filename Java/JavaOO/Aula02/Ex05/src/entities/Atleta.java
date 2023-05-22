package entities;

public class Atleta extends Pessoa {
    public String esporte;

    public Atleta(String nome, int idade, double altura, String esporte) {
        super(nome, idade);
        this.altura = altura;
        this.esporte = esporte;
    }
}
