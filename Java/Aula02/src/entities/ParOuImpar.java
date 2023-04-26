package entities;

import java.util.Random;

public class ParOuImpar {

    int numeroParOuImpar = new Random().nextInt(1000);

    @Override
    public String toString() {
        return "O número escolhido foi: "+numeroParOuImpar + "\n"
                + calculo() + "\n==============================================";

    }

    public String calculo() {
        if (numeroParOuImpar % 2 == 0) {
            return "Este número é par !!!";
        } else {
            return "Este número é impar !!!";
        }
    }
}
