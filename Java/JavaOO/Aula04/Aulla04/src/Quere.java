import java.util.LinkedList;
import java.util.Queue;

public class Quere {
    public static void main(String[] args) {
        /*
            Queue representa uma FILA de dados
            A ordem que os ELEMENTOS ENTRAM NA FILA é A MESMA ORDEM QUE OS ELEMENTOS SAEM da fila
         */

        //Criando um objeto LinkedList que implementa a interface Queue
        Queue<String> queue = new LinkedList<>();

        //Adicionando elementos à fila
        queue.add("João");
        queue.add("Maria");
        queue.add("Carlos");

        //imprimindo a fila
        System.out.println("Fila: " + queue);

        //Obtendo e temovendo o elemento da frente da fila
        String primeiroElemento = queue.poll();
        System.out.println("Elemento removido: " + primeiroElemento);

        //Imprimindo a fila atualizada
        System.out.println("Fila atualizada: " + queue);

        //Obtendo, mas não removendo, o elemento da frente da fila
        String elementroFrente = queue.peek();
        System.out.println("Elemento da frente: " + elementroFrente);

        //Verificando o tamanho da fila
        System.out.println("Tamanho da fila: " + queue.size());

        //Verificando se a fila está vazia
        System.out.println("A fila está vazia? " + queue.isEmpty());
    }
}
