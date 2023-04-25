package application;

public class LetrasSeparadas {
    public void separar(String palavra) {

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
    }
}
