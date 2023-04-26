package entities;

import java.util.Random;

public class DiaDaSemana {

    public Integer numero = new Random(0).nextInt(10);

    @Override
    public String toString(){
        return "Número de escolhido de 1 a 7 foi: " + numero +
                "\nQue equilave ao dia " + semana() +
                "\n==============================================";
    }

    public String semana() {
        return switch (numero) {
            case 1 -> "Domingo";
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            case 7 -> "Sábado";
            default -> "Dia inválido!";
        };
    }
}
