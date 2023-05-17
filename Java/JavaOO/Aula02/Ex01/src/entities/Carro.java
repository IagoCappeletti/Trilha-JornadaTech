package entities;

public class Carro extends Veiculo {
    int velocidade;

    @Override
    public void acelerar() {
        velocidade = velocidade + 20;
        System.out.println("O carro é um " + modelo + " da marca " + marca + "e está á " + velocidade + "km/h");
    }
}
