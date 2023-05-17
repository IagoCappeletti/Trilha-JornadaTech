package application;

import entities.Animal;

public class Program {
    public static void main(String[] args) {

        Animal cachorro = new Animal("bob", 7);
        System.out.print("O cachorro faz: ");
        System.out.println(cachorro.emitirSom("AUU AU AU"));

        Animal gato = new Animal("Kusca", 5);
        System.out.print("O gato faz: ");
        System.out.println(gato.emitirSom("Miauuuu"));

        Animal passaro = new Animal("Amarelão", 2);
        System.out.print("O passarinho faz: ");
        System.out.println(passaro.emitirSom("Piuuu"));
    }
}
