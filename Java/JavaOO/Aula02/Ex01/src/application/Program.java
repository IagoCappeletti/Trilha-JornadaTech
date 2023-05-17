package application;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.marca = "volkswagen";
        carro.modelo = "Fusca";
        carro.acelerar();

        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "Hornet";
        moto.acelerar();

    }
}
