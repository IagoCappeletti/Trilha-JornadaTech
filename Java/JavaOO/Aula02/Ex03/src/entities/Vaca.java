package entities;

public class Vaca extends Aninal{
    public Vaca(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Vaca: " + "Muuuuuuuuuu");
    }
}
