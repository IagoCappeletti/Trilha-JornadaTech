import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        /*
        Set representa um CONJUNTO de dados.
        NENHUM ELEMENTO PODE SER IGUAL nessa estrutura de dados.
        NÃO GARANTE UMA ORDEM ESPECÍFICA dos elementos, mas oferece uma boa performance de BUSCA e INSERÇÃO
         */

        java.util.Set<String> set = new HashSet<>(); //um conjunto de strings

        //principais métodos
        //set elemento
        set.add("Maçã");
        set.add("Laranja");

        //Removendo um elemento do set
        set.remove("Maçã");

        //Verificando se o set contém um elemento específico
        boolean contem = set.contains("Banana");

        //Imprimindo o set atualizado
        System.out.println(set);

        //Iterando sobre os elementos do set
        System.out.println("Elementos do set:");
        for (String elemento : set) {
            System.out.println(elemento);
        }
        //Limpando o set
        set.clear();

        //Verifica se o set está vazio
        System.out.println("O set está vazio? " + set.isEmpty());

    }
}