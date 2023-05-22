package entities;

public class Cachorro extends Aninal{

    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public void emitirSom(){
        System.out.println("Cachorro: " + "Au au auu");
    }
}
