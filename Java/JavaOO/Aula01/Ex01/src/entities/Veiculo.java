package entities;

public class Veiculo {
    public String nome;
    public String cor;
    public int rodas = 0;
    public double velocidade;

    public void mover(){
        velocidade+=50;
        System.out.println(velocidade);
    }

    public void frear() {
        velocidade-=25;
        System.out.println( velocidade);
    }

    public void informacaoVeiculo() {
        System.out.println("O nome do Veículo é: " + nome + " da cor: " + cor + "com " + rodas +
                " rodas" + " e está a " + velocidade + "km/h");
    }
}
