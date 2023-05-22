package application;
public class Calculadora {

    int somar(int num1, int num2) {
        return num1 + num2;
    }
    int somar(int[] numerosInteiros) {
        int calculo = 0;
        for (int i = 0; i < numerosInteiros.length; i++) {
            calculo += numerosInteiros[i];
        }
        return calculo;
    }
    double somar(double num1, double num2) {
        return num1 + num2;
    }

    double somar(double[] numerosDouble) {
        double calculo = 0;
        for (int i = 0; i < 1; i++) {
            calculo = numerosDouble[i] ;
        }
        return calculo;
    }
}

