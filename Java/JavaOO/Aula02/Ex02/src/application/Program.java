package application;

public class Program {
    public static void main(String[] args) {

        int[] numerosInt = {1, 3, 7 ,9};
        double[] listaDouble = {2.5, 5.5, 7.3, 9.9};
        Calculadora calculadora = new Calculadora();
        System.out.println("Calculando números inteiros: ");
        System.out.println(calculadora.somar(+1, 3));
        System.out.println(calculadora.somar(numerosInt));
        System.out.println("Calculando números double: ");
        System.out.println(calculadora.somar(5.5, 7.3));
        System.out.println(calculadora.somar(listaDouble));


    }
}
