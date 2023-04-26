package entities;

import java.util.Random;

public class MenorNumero {

    Double num1 = new Random().nextDouble(100);
    Double num2 = new Random().nextDouble(150);
    Double num3 = new Random().nextDouble(200);


    @Override
    public String toString() {
        return "O Menor Número é "+ String.format("%.2f%n",NuMenor()) + "Num1: " + String.format("%.2f%n", num1)
                + "Num2: " + String.format("%.2f%n", num2) + "Num3: " +String.format("%.2f%n", num3)
                + "\n==============================================";
    }

    public  Double NuMenor() {
        Double menor = num1;

        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor){
            menor = num3;
        }

        return menor;
    }
}
