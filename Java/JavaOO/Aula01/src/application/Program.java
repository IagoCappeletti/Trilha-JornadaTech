package application;

import entities.Veiculo;

public class Program {
    public static void main(String[] args) {
        Veiculo Carro = new Veiculo();

        Veiculo moto = new Veiculo();

        moto.nome = "R1";
        moto.cor = "Preta";
        moto.rodas = 2;
        moto.mover();
        moto.frear();
        moto.informacaoVeiculo();
        System.out.println();

        Carro.nome = "Fusca";
        Carro.cor = "Azul";
        Carro.rodas = 4;
        Carro.mover();
        Carro.mover();
        Carro.frear();
        Carro.informacaoVeiculo();

    }
}
