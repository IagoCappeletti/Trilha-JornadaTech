import java.util.HashMap;

public class Map {
    public static void main(String[] args) {

        /*
        É uma coleção do tipo MAPA, ou em outras linguagens chamada também de DICIONÁRIO
        Os objetos são armazenados na forma de CHAVE/VALOR
        NÃO PODE HAVER CHAVES DUPLICADAS dentro do mapa
         */

        //Criando um objeto HashMap que implementa a interface map
        java.util.Map<String, Integer> map = new HashMap<>();

        map.put("maçã", 2);
        map.put("banana", 4);
        map.put("Laranja", 6);

        System.out.println("Map" + map);

        int quantidadeDeBanana = map.get("banana");
        System.out.println("Quantidade de bananas: " + quantidadeDeBanana);

        boolean contagemLaranjas = map.containsKey("Laranja");
        System.out.println("O map contém a chave 'Laranja'?" +  contagemLaranjas);

        map.remove("maçã");

        System.out.println("Map att: " + map);

        //Interando sobre as chaves do Map
        System.out.println("Chaves do Map: ");
        for (String chave : map.keySet()) {
            System.out.println(chave);
        }

        //Iterando sobre os valores do Map
        for (int valor : map.values()) {
            System.out.println(valor);
        }

        //Tamanho
        System.out.println("Tamanho do Map " + map.size());

    }
}
