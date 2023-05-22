package entities;

public class Gato extends Aninal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gato: " + "Miaauuuuuu");;
    }
}
