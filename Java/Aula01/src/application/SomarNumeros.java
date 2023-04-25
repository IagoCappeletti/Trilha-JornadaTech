package application;

import java.util.Random;

public class SomarNumeros {

    Integer primeiroNumero = new Random().nextInt(100);
    Integer segundoNumero = new Random().nextInt(100);

    Integer soma = primeiroNumero + segundoNumero;

    @Override
    public String toString() {
        return "soma = " + soma;
    }
}
