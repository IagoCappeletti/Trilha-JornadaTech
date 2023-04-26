package entities;
import java.util.Random;
public class SomaNumerosInteiros {

    public Integer primeiroNumero = new Random().nextInt(500);
    public Integer segundoNumero = new Random().nextInt(500);

    Integer soma = primeiroNumero + segundoNumero;

    @Override
    public String toString() {
        return  "Números gerados automaticamente de 0 a 500" +
                "\nSomaNumerosInteiros" +
                "\nprimeiroNumero = " + primeiroNumero +
                "\nsegundoNumero = " + segundoNumero +
                "\nsoma = " + soma +
                "\n===========================================";
    }
}
