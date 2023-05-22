import java.util.ArrayList;
import java.util.List;

public class Listass {
    public static void main(String[] args) {

        /*
        É uma coleção do tipo LISTA(vetor dinâmico)
        Respeita a ORDEM DE INSERÇÃO
        Recupera os valores pelo ÍNDICE
         */

        List<String> lista = new ArrayList<>();

        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Laranja");

        System.out.println("Lista" + lista);

        String fruta1 = lista.get(0);
        String fruta2 = lista.get(1);
        System.out.println("Elemento 1 " + fruta1);
        System.out.println("Elemento 2 " + fruta2);

        int tamanho = lista.size();
        System.out.println("Tamanho " + tamanho);

        //Verifica se a lsita contém um elemento específico
        boolean contemBanana = lista.contains("Banana");
        System.out.println("A lista contém a palavra 'Banana'? " + contemBanana);

        lista.remove("Laranja");

        System.out.println("Lista att: " + lista);

        //Iterando sobre os elementos da lista
        System.out.println("Elementos da lista");
        for (String fruta : lista) {
            System.out.println(fruta);
        }

        boolean listaVazia = lista.isEmpty();
        System.out.println(listaVazia);
    }
}
