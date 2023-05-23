public class TesteLambda {
    public static void main(String[] args) {

        Operacao soma = (a, b) -> a + b;
        int resultado = soma.executar(5,3);
        System.out.println(resultado);
    }
}
