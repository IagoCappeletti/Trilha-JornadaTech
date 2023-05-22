package application;

import entities.Aninal;
import entities.Cachorro;
import entities.Gato;
import entities.Vaca;

public class Program {
    public static void main(String[] args) {

        Aninal cachorro = new Cachorro("pipoca");
        cachorro.emitirSom();

        Aninal gato = new Gato("Mia");
        gato.emitirSom();

        Aninal vaca = new Vaca("Bet");
        vaca.emitirSom();
    }
}
