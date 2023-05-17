package entities;

public class Moto extends Veiculo{

    int velocidadeMoto = 0;
    @Override
    public void acelerar() {
        velocidadeMoto =  velocidadeMoto + 50;
        System.out.println("A moto é uma " + modelo + " da marca " + marca + " e está á " + velocidadeMoto + "km/h");
    }

}
