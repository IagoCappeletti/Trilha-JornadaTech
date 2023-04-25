package application;

import java.util.Random;

public class ConversorCelsius {

    Double celsius = new Random().nextDouble(45.0);

    Double fahrenheit = celsius * 1.8 + 32;
    Double kelvin = celsius + 273;

    @Override
    public String toString() {
        return "celsius = " + String.format("%.2fCº", celsius) +
                " fahrenheit = " + String.format("%.2fFª" ,fahrenheit) +
                " kelvin = " + String.format("%.2fk", kelvin) ;
    }
}
