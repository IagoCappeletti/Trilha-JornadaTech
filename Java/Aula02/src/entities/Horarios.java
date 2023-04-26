package entities;

import java.util.Random;

public class Horarios {
     Integer hora = new Random().nextInt(23);

    @Override
    public String toString() {
        return "Hora escolhida: " + horas();
    }

    public Integer horas(){
         if (hora >= 0 && hora <= 6) {
             System.out.println("Boa Madrugada");
         } else if (hora >= 7 && hora <= 11) {
             System.out.println("Bom Dia");
         } else if (hora >= 12 && hora <= 18) {
             System.out.println("Boa Tarde");
         } else {
             System.out.println("Boa noite");
         }

         return hora;
     }
}
